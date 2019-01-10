import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import * as moment from 'moment';
import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { map } from 'rxjs/operators';

import { SERVER_API_URL } from 'app/app.constants';
import { createRequestOption } from 'app/shared';
import { IHCBTModel } from 'app/shared/model/hcbt-model.model';

type EntityResponseType = HttpResponse<IHCBTModel>;
type EntityArrayResponseType = HttpResponse<IHCBTModel[]>;

@Injectable({ providedIn: 'root' })
export class HCBTModelService {
    public resourceUrl = SERVER_API_URL + 'api/hcbt-models';

    constructor(protected http: HttpClient) {}

    create(hCBTModel: IHCBTModel): Observable<EntityResponseType> {
        const copy = this.convertDateFromClient(hCBTModel);
        return this.http
            .post<IHCBTModel>(this.resourceUrl, copy, { observe: 'response' })
            .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    }

    update(hCBTModel: IHCBTModel): Observable<EntityResponseType> {
        const copy = this.convertDateFromClient(hCBTModel);
        return this.http
            .put<IHCBTModel>(this.resourceUrl, copy, { observe: 'response' })
            .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    }

    find(id: number): Observable<EntityResponseType> {
        return this.http
            .get<IHCBTModel>(`${this.resourceUrl}/${id}`, { observe: 'response' })
            .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    }

    query(req?: any): Observable<EntityArrayResponseType> {
        const options = createRequestOption(req);
        return this.http
            .get<IHCBTModel[]>(this.resourceUrl, { params: options, observe: 'response' })
            .pipe(map((res: EntityArrayResponseType) => this.convertDateArrayFromServer(res)));
    }

    delete(id: number): Observable<HttpResponse<any>> {
        return this.http.delete<any>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    protected convertDateFromClient(hCBTModel: IHCBTModel): IHCBTModel {
        const copy: IHCBTModel = Object.assign({}, hCBTModel, {
            loadDate: hCBTModel.loadDate != null && hCBTModel.loadDate.isValid() ? hCBTModel.loadDate.format(DATE_FORMAT) : null
        });
        return copy;
    }

    protected convertDateFromServer(res: EntityResponseType): EntityResponseType {
        if (res.body) {
            res.body.loadDate = res.body.loadDate != null ? moment(res.body.loadDate) : null;
        }
        return res;
    }

    protected convertDateArrayFromServer(res: EntityArrayResponseType): EntityArrayResponseType {
        if (res.body) {
            res.body.forEach((hCBTModel: IHCBTModel) => {
                hCBTModel.loadDate = hCBTModel.loadDate != null ? moment(hCBTModel.loadDate) : null;
            });
        }
        return res;
    }
}
