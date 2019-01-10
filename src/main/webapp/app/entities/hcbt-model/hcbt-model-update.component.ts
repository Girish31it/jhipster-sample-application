import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import * as moment from 'moment';

import { IHCBTModel } from 'app/shared/model/hcbt-model.model';
import { HCBTModelService } from './hcbt-model.service';

@Component({
    selector: 'jhi-hcbt-model-update',
    templateUrl: './hcbt-model-update.component.html'
})
export class HCBTModelUpdateComponent implements OnInit {
    hCBTModel: IHCBTModel;
    isSaving: boolean;
    loadDateDp: any;

    constructor(protected hCBTModelService: HCBTModelService, protected activatedRoute: ActivatedRoute) {}

    ngOnInit() {
        this.isSaving = false;
        this.activatedRoute.data.subscribe(({ hCBTModel }) => {
            this.hCBTModel = hCBTModel;
        });
    }

    previousState() {
        window.history.back();
    }

    save() {
        this.isSaving = true;
        if (this.hCBTModel.id !== undefined) {
            this.subscribeToSaveResponse(this.hCBTModelService.update(this.hCBTModel));
        } else {
            this.subscribeToSaveResponse(this.hCBTModelService.create(this.hCBTModel));
        }
    }

    protected subscribeToSaveResponse(result: Observable<HttpResponse<IHCBTModel>>) {
        result.subscribe((res: HttpResponse<IHCBTModel>) => this.onSaveSuccess(), (res: HttpErrorResponse) => this.onSaveError());
    }

    protected onSaveSuccess() {
        this.isSaving = false;
        this.previousState();
    }

    protected onSaveError() {
        this.isSaving = false;
    }
}
