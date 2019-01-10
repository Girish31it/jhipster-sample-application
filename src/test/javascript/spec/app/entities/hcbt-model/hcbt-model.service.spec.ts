/* tslint:disable max-line-length */
import { TestBed, getTestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { of } from 'rxjs';
import { take, map } from 'rxjs/operators';
import * as moment from 'moment';
import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { HCBTModelService } from 'app/entities/hcbt-model/hcbt-model.service';
import { IHCBTModel, HCBTModel } from 'app/shared/model/hcbt-model.model';

describe('Service Tests', () => {
    describe('HCBTModel Service', () => {
        let injector: TestBed;
        let service: HCBTModelService;
        let httpMock: HttpTestingController;
        let elemDefault: IHCBTModel;
        let currentDate: moment.Moment;
        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [HttpClientTestingModule]
            });
            injector = getTestBed();
            service = injector.get(HCBTModelService);
            httpMock = injector.get(HttpTestingController);
            currentDate = moment();

            elemDefault = new HCBTModel(
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                0,
                0,
                'AAAAAAA',
                0,
                0,
                0,
                0,
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                currentDate,
                0,
                'AAAAAAA',
                0,
                0,
                0,
                'AAAAAAA',
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                'AAAAAAA',
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                'AAAAAAA',
                'AAAAAAA',
                0,
                0,
                0,
                0,
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                'AAAAAAA',
                0,
                0,
                0,
                0,
                0,
                0
            );
        });

        describe('Service methods', async () => {
            it('should find an element', async () => {
                const returnedFromService = Object.assign(
                    {
                        loadDate: currentDate.format(DATE_FORMAT)
                    },
                    elemDefault
                );
                service
                    .find(123)
                    .pipe(take(1))
                    .subscribe(resp => expect(resp).toMatchObject({ body: elemDefault }));

                const req = httpMock.expectOne({ method: 'GET' });
                req.flush(JSON.stringify(returnedFromService));
            });

            it('should create a HCBTModel', async () => {
                const returnedFromService = Object.assign(
                    {
                        id: 0,
                        loadDate: currentDate.format(DATE_FORMAT)
                    },
                    elemDefault
                );
                const expected = Object.assign(
                    {
                        loadDate: currentDate
                    },
                    returnedFromService
                );
                service
                    .create(new HCBTModel(null))
                    .pipe(take(1))
                    .subscribe(resp => expect(resp).toMatchObject({ body: expected }));
                const req = httpMock.expectOne({ method: 'POST' });
                req.flush(JSON.stringify(returnedFromService));
            });

            it('should update a HCBTModel', async () => {
                const returnedFromService = Object.assign(
                    {
                        projectedOthVolM1Tbp: 1,
                        projectedOthVolM2Tbp: 1,
                        projectedOthVolM3Tbp: 1,
                        projectedVolM1Tbp: 1,
                        projectedVolM2Tbp: 1,
                        projectedVolM3Tbp: 1,
                        qtrlyDiffActualProjection: 1,
                        retrospectiveAdjM1: 1,
                        retrospectiveAdjM2: 1,
                        retrospectiveAdjM3: 1,
                        serviceCategory: 'BBBBBB',
                        serviceDrillDown: 'BBBBBB',
                        servicePillar: 'BBBBBB',
                        sowName: 'BBBBBB',
                        sowNumber: 'BBBBBB',
                        totalQtrlySpendUsd: 1,
                        infTotalQtrlySpendNonUsd: 1,
                        vendorName: 'BBBBBB',
                        actualRetrospectiveCostM1: 1,
                        actualRetrospectiveCostM2: 1,
                        actualRetrospectiveCostM3: 1,
                        totalQtrlyRetrospectiveCost: 1,
                        changeImpact: 'BBBBBB',
                        notes: 'BBBBBB',
                        dataFlag: 'BBBBBB',
                        loadDate: currentDate.format(DATE_FORMAT),
                        ccaVendorDataSk: 1,
                        ccaVendorDataPk: 'BBBBBB',
                        hourlyRateDollarFte: 1,
                        hourlyRateDollarPh: 1,
                        dollarRatePerMinuteTbp: 1,
                        deliveryPoc: 'BBBBBB',
                        actualBillableHeadsM1Fte: 1,
                        actualBillableHeadsM2Fte: 1,
                        actualBillableHeadsM3Fte: 1,
                        actBillableHoursM1Ph: 1,
                        infActBillHoursM1Fte: 1,
                        actBillableHoursM2Ph: 1,
                        infActBillHoursM2Fte: 1,
                        actBillableHoursM3Ph: 1,
                        infActBillHoursM3Fte: 1,
                        actualOtherVolumeM1Tbp: 1,
                        actualOtherVolumeM2Tbp: 1,
                        actualOtherVolumeM3Tbp: 1,
                        actualSpendM1Usd: 1,
                        infActSpendM1NonUsdCurr: 1,
                        actualSpendM2Usd: 1,
                        infActSpendM2NonUsdCurr: 1,
                        actualSpendM3Usd: 1,
                        infActSpendM3NonUsdCurr: 1,
                        actualVolumeM1Tbp: 1,
                        actualVolumeM2Tbp: 1,
                        actualVolumeM3Tbp: 1,
                        actualPoValueDiffPer: 1,
                        ahtInMinutesTbp: 1,
                        appOtHrsM1: 1,
                        appOtHrsM2: 1,
                        appOtHrsM3: 1,
                        infBaseAht: 1,
                        infBaseHeads: 'BBBBBB',
                        cnxBaseRateTbp: 1,
                        cnxBaseRateFte: 1,
                        billingAdjHittingM1: 1,
                        billingAdjHittingM2: 1,
                        billingAdjHittingM3: 1,
                        bufferUsd: 1,
                        infBufferNonUsdCurr: 1,
                        ciscoBusinessOwner: 'BBBBBB',
                        infCurrency: 'BBBBBB',
                        infCurrencyHrlyRateFte: 1,
                        actualProjM1DiffUsd: 1,
                        actualProjM2DiffUsd: 1,
                        actualProjM3DiffUsd: 1,
                        fiscalQuarterName: 'BBBBBB',
                        vendorLocation: 'BBBBBB',
                        method: 'BBBBBB',
                        actualMilestoneM1Per: 1,
                        actualMilestoneM2Per: 1,
                        actualMilestoneM3Per: 1,
                        milestoneValueM1Usd: 1,
                        infMStonValM1NonUsdCur: 1,
                        milestoneValueM2Usd: 1,
                        infMStonValM2NonUsdCur: 1,
                        milestoneValueM3Usd: 1,
                        infMStonValM3NonUsdCur: 1,
                        cnxChrAgentNumWdnmCases: 1,
                        cnvChrStaffHrsWdnmCases: 1,
                        otherVolumeRateTbp: 1,
                        otRate: 1,
                        otSpendM1: 1,
                        otSpendM2: 1,
                        otSpendM3: 1,
                        poAmountUsd: 1,
                        infPoAmountNonUsd: 1,
                        poNumber: 'BBBBBB',
                        projBillableHeadsM1Fte: 1,
                        projBillableHeadsM2Fte: 1,
                        projBillableHeadsM3Fte: 1,
                        projectedBillableHrsM1Ph: 1,
                        projectedBillableHrsM2Ph: 1,
                        projectedBillableHrsM3Ph: 1
                    },
                    elemDefault
                );

                const expected = Object.assign(
                    {
                        loadDate: currentDate
                    },
                    returnedFromService
                );
                service
                    .update(expected)
                    .pipe(take(1))
                    .subscribe(resp => expect(resp).toMatchObject({ body: expected }));
                const req = httpMock.expectOne({ method: 'PUT' });
                req.flush(JSON.stringify(returnedFromService));
            });

            it('should return a list of HCBTModel', async () => {
                const returnedFromService = Object.assign(
                    {
                        projectedOthVolM1Tbp: 1,
                        projectedOthVolM2Tbp: 1,
                        projectedOthVolM3Tbp: 1,
                        projectedVolM1Tbp: 1,
                        projectedVolM2Tbp: 1,
                        projectedVolM3Tbp: 1,
                        qtrlyDiffActualProjection: 1,
                        retrospectiveAdjM1: 1,
                        retrospectiveAdjM2: 1,
                        retrospectiveAdjM3: 1,
                        serviceCategory: 'BBBBBB',
                        serviceDrillDown: 'BBBBBB',
                        servicePillar: 'BBBBBB',
                        sowName: 'BBBBBB',
                        sowNumber: 'BBBBBB',
                        totalQtrlySpendUsd: 1,
                        infTotalQtrlySpendNonUsd: 1,
                        vendorName: 'BBBBBB',
                        actualRetrospectiveCostM1: 1,
                        actualRetrospectiveCostM2: 1,
                        actualRetrospectiveCostM3: 1,
                        totalQtrlyRetrospectiveCost: 1,
                        changeImpact: 'BBBBBB',
                        notes: 'BBBBBB',
                        dataFlag: 'BBBBBB',
                        loadDate: currentDate.format(DATE_FORMAT),
                        ccaVendorDataSk: 1,
                        ccaVendorDataPk: 'BBBBBB',
                        hourlyRateDollarFte: 1,
                        hourlyRateDollarPh: 1,
                        dollarRatePerMinuteTbp: 1,
                        deliveryPoc: 'BBBBBB',
                        actualBillableHeadsM1Fte: 1,
                        actualBillableHeadsM2Fte: 1,
                        actualBillableHeadsM3Fte: 1,
                        actBillableHoursM1Ph: 1,
                        infActBillHoursM1Fte: 1,
                        actBillableHoursM2Ph: 1,
                        infActBillHoursM2Fte: 1,
                        actBillableHoursM3Ph: 1,
                        infActBillHoursM3Fte: 1,
                        actualOtherVolumeM1Tbp: 1,
                        actualOtherVolumeM2Tbp: 1,
                        actualOtherVolumeM3Tbp: 1,
                        actualSpendM1Usd: 1,
                        infActSpendM1NonUsdCurr: 1,
                        actualSpendM2Usd: 1,
                        infActSpendM2NonUsdCurr: 1,
                        actualSpendM3Usd: 1,
                        infActSpendM3NonUsdCurr: 1,
                        actualVolumeM1Tbp: 1,
                        actualVolumeM2Tbp: 1,
                        actualVolumeM3Tbp: 1,
                        actualPoValueDiffPer: 1,
                        ahtInMinutesTbp: 1,
                        appOtHrsM1: 1,
                        appOtHrsM2: 1,
                        appOtHrsM3: 1,
                        infBaseAht: 1,
                        infBaseHeads: 'BBBBBB',
                        cnxBaseRateTbp: 1,
                        cnxBaseRateFte: 1,
                        billingAdjHittingM1: 1,
                        billingAdjHittingM2: 1,
                        billingAdjHittingM3: 1,
                        bufferUsd: 1,
                        infBufferNonUsdCurr: 1,
                        ciscoBusinessOwner: 'BBBBBB',
                        infCurrency: 'BBBBBB',
                        infCurrencyHrlyRateFte: 1,
                        actualProjM1DiffUsd: 1,
                        actualProjM2DiffUsd: 1,
                        actualProjM3DiffUsd: 1,
                        fiscalQuarterName: 'BBBBBB',
                        vendorLocation: 'BBBBBB',
                        method: 'BBBBBB',
                        actualMilestoneM1Per: 1,
                        actualMilestoneM2Per: 1,
                        actualMilestoneM3Per: 1,
                        milestoneValueM1Usd: 1,
                        infMStonValM1NonUsdCur: 1,
                        milestoneValueM2Usd: 1,
                        infMStonValM2NonUsdCur: 1,
                        milestoneValueM3Usd: 1,
                        infMStonValM3NonUsdCur: 1,
                        cnxChrAgentNumWdnmCases: 1,
                        cnvChrStaffHrsWdnmCases: 1,
                        otherVolumeRateTbp: 1,
                        otRate: 1,
                        otSpendM1: 1,
                        otSpendM2: 1,
                        otSpendM3: 1,
                        poAmountUsd: 1,
                        infPoAmountNonUsd: 1,
                        poNumber: 'BBBBBB',
                        projBillableHeadsM1Fte: 1,
                        projBillableHeadsM2Fte: 1,
                        projBillableHeadsM3Fte: 1,
                        projectedBillableHrsM1Ph: 1,
                        projectedBillableHrsM2Ph: 1,
                        projectedBillableHrsM3Ph: 1
                    },
                    elemDefault
                );
                const expected = Object.assign(
                    {
                        loadDate: currentDate
                    },
                    returnedFromService
                );
                service
                    .query(expected)
                    .pipe(
                        take(1),
                        map(resp => resp.body)
                    )
                    .subscribe(body => expect(body).toContainEqual(expected));
                const req = httpMock.expectOne({ method: 'GET' });
                req.flush(JSON.stringify([returnedFromService]));
                httpMock.verify();
            });

            it('should delete a HCBTModel', async () => {
                const rxPromise = service.delete(123).subscribe(resp => expect(resp.ok));

                const req = httpMock.expectOne({ method: 'DELETE' });
                req.flush({ status: 200 });
            });
        });

        afterEach(() => {
            httpMock.verify();
        });
    });
});
