import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { IHCBTModel } from 'app/shared/model/hcbt-model.model';

@Component({
    selector: 'jhi-hcbt-model-detail',
    templateUrl: './hcbt-model-detail.component.html'
})
export class HCBTModelDetailComponent implements OnInit {
    hCBTModel: IHCBTModel;

    constructor(protected activatedRoute: ActivatedRoute) {}

    ngOnInit() {
        this.activatedRoute.data.subscribe(({ hCBTModel }) => {
            this.hCBTModel = hCBTModel;
        });
    }

    previousState() {
        window.history.back();
    }
}
