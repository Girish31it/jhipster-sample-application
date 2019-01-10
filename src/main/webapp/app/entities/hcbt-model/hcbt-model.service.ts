import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

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
        return this.http.post<IHCBTModel>(this.resourceUrl, hCBTModel, { observe: 'response' });
    }

    update(hCBTModel: IHCBTModel): Observable<EntityResponseType> {
        return this.http.put<IHCBTModel>(this.resourceUrl, hCBTModel, { observe: 'response' });
    }

    find(id: number): Observable<EntityResponseType> {
        return this.http.get<IHCBTModel>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    query(req?: any): Observable<EntityArrayResponseType> {
        const options = createRequestOption(req);
        return this.http.get<IHCBTModel[]>(this.resourceUrl, { params: options, observe: 'response' });
    }

    delete(id: number): Observable<HttpResponse<any>> {
        return this.http.delete<any>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }
}
