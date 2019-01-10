import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes } from '@angular/router';
import { UserRouteAccessService } from 'app/core';
import { Observable, of } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { HCBTModel } from 'app/shared/model/hcbt-model.model';
import { HCBTModelService } from './hcbt-model.service';
import { HCBTModelComponent } from './hcbt-model.component';
import { HCBTModelDetailComponent } from './hcbt-model-detail.component';
import { HCBTModelUpdateComponent } from './hcbt-model-update.component';
import { HCBTModelDeletePopupComponent } from './hcbt-model-delete-dialog.component';
import { IHCBTModel } from 'app/shared/model/hcbt-model.model';

@Injectable({ providedIn: 'root' })
export class HCBTModelResolve implements Resolve<IHCBTModel> {
    constructor(private service: HCBTModelService) {}

    resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<HCBTModel> {
        const id = route.params['id'] ? route.params['id'] : null;
        if (id) {
            return this.service.find(id).pipe(
                filter((response: HttpResponse<HCBTModel>) => response.ok),
                map((hCBTModel: HttpResponse<HCBTModel>) => hCBTModel.body)
            );
        }
        return of(new HCBTModel());
    }
}

export const hCBTModelRoute: Routes = [
    {
        path: 'hcbt-model',
        component: HCBTModelComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'HCBTModels'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: 'hcbt-model/:id/view',
        component: HCBTModelDetailComponent,
        resolve: {
            hCBTModel: HCBTModelResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'HCBTModels'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: 'hcbt-model/new',
        component: HCBTModelUpdateComponent,
        resolve: {
            hCBTModel: HCBTModelResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'HCBTModels'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: 'hcbt-model/:id/edit',
        component: HCBTModelUpdateComponent,
        resolve: {
            hCBTModel: HCBTModelResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'HCBTModels'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const hCBTModelPopupRoute: Routes = [
    {
        path: 'hcbt-model/:id/delete',
        component: HCBTModelDeletePopupComponent,
        resolve: {
            hCBTModel: HCBTModelResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'HCBTModels'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
