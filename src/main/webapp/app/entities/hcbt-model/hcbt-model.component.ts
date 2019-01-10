import { Component, OnInit, OnDestroy } from '@angular/core';
import { HttpErrorResponse, HttpResponse } from '@angular/common/http';
import { Subscription } from 'rxjs';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { IHCBTModel } from 'app/shared/model/hcbt-model.model';
import { AccountService } from 'app/core';
import { HCBTModelService } from './hcbt-model.service';

@Component({
    selector: 'jhi-hcbt-model',
    templateUrl: './hcbt-model.component.html'
})
export class HCBTModelComponent implements OnInit, OnDestroy {
    hCBTModels: IHCBTModel[];
    currentAccount: any;
    eventSubscriber: Subscription;

    constructor(
        protected hCBTModelService: HCBTModelService,
        protected jhiAlertService: JhiAlertService,
        protected eventManager: JhiEventManager,
        protected accountService: AccountService
    ) {}

    loadAll() {
        this.hCBTModelService.query().subscribe(
            (res: HttpResponse<IHCBTModel[]>) => {
                this.hCBTModels = res.body;
            },
            (res: HttpErrorResponse) => this.onError(res.message)
        );
    }

    ngOnInit() {
        this.loadAll();
        this.accountService.identity().then(account => {
            this.currentAccount = account;
        });
        this.registerChangeInHCBTModels();
    }

    ngOnDestroy() {
        this.eventManager.destroy(this.eventSubscriber);
    }

    trackId(index: number, item: IHCBTModel) {
        return item.id;
    }

    registerChangeInHCBTModels() {
        this.eventSubscriber = this.eventManager.subscribe('hCBTModelListModification', response => this.loadAll());
    }

    protected onError(errorMessage: string) {
        this.jhiAlertService.error(errorMessage, null, null);
    }
}
