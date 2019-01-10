import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { NgbActiveModal, NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { IHCBTModel } from 'app/shared/model/hcbt-model.model';
import { HCBTModelService } from './hcbt-model.service';

@Component({
    selector: 'jhi-hcbt-model-delete-dialog',
    templateUrl: './hcbt-model-delete-dialog.component.html'
})
export class HCBTModelDeleteDialogComponent {
    hCBTModel: IHCBTModel;

    constructor(
        protected hCBTModelService: HCBTModelService,
        public activeModal: NgbActiveModal,
        protected eventManager: JhiEventManager
    ) {}

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.hCBTModelService.delete(id).subscribe(response => {
            this.eventManager.broadcast({
                name: 'hCBTModelListModification',
                content: 'Deleted an hCBTModel'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-hcbt-model-delete-popup',
    template: ''
})
export class HCBTModelDeletePopupComponent implements OnInit, OnDestroy {
    protected ngbModalRef: NgbModalRef;

    constructor(protected activatedRoute: ActivatedRoute, protected router: Router, protected modalService: NgbModal) {}

    ngOnInit() {
        this.activatedRoute.data.subscribe(({ hCBTModel }) => {
            setTimeout(() => {
                this.ngbModalRef = this.modalService.open(HCBTModelDeleteDialogComponent as Component, { size: 'lg', backdrop: 'static' });
                this.ngbModalRef.componentInstance.hCBTModel = hCBTModel;
                this.ngbModalRef.result.then(
                    result => {
                        this.router.navigate([{ outlets: { popup: null } }], { replaceUrl: true, queryParamsHandling: 'merge' });
                        this.ngbModalRef = null;
                    },
                    reason => {
                        this.router.navigate([{ outlets: { popup: null } }], { replaceUrl: true, queryParamsHandling: 'merge' });
                        this.ngbModalRef = null;
                    }
                );
            }, 0);
        });
    }

    ngOnDestroy() {
        this.ngbModalRef = null;
    }
}
