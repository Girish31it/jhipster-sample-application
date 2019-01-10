import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { JhipsterSampleApplicationSharedModule } from 'app/shared';
import {
    HCBTModelComponent,
    HCBTModelDetailComponent,
    HCBTModelUpdateComponent,
    HCBTModelDeletePopupComponent,
    HCBTModelDeleteDialogComponent,
    hCBTModelRoute,
    hCBTModelPopupRoute
} from './';

const ENTITY_STATES = [...hCBTModelRoute, ...hCBTModelPopupRoute];

@NgModule({
    imports: [JhipsterSampleApplicationSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [
        HCBTModelComponent,
        HCBTModelDetailComponent,
        HCBTModelUpdateComponent,
        HCBTModelDeleteDialogComponent,
        HCBTModelDeletePopupComponent
    ],
    entryComponents: [HCBTModelComponent, HCBTModelUpdateComponent, HCBTModelDeleteDialogComponent, HCBTModelDeletePopupComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JhipsterSampleApplicationHCBTModelModule {}
