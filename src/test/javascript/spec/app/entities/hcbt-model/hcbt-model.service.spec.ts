/* tslint:disable max-line-length */
import { TestBed, getTestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { of } from 'rxjs';
import { take, map } from 'rxjs/operators';
import { HCBTModelService } from 'app/entities/hcbt-model/hcbt-model.service';
import { IHCBTModel, HCBTModel } from 'app/shared/model/hcbt-model.model';

describe('Service Tests', () => {
    describe('HCBTModel Service', () => {
        let injector: TestBed;
        let service: HCBTModelService;
        let httpMock: HttpTestingController;
        let elemDefault: IHCBTModel;
        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [HttpClientTestingModule]
            });
            injector = getTestBed();
            service = injector.get(HCBTModelService);
            httpMock = injector.get(HttpTestingController);

            elemDefault = new HCBTModel(
                0,
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
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
                'AAAAAAA',
                0,
                0,
                0,
                0,
                'AAAAAAA',
                0,
                0,
                0
            );
        });

        describe('Service methods', async () => {
            it('should find an element', async () => {
                const returnedFromService = Object.assign({}, elemDefault);
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
                        id: 0
                    },
                    elemDefault
                );
                const expected = Object.assign({}, returnedFromService);
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
                        vendorName: 'BBBBBB',
                        vendorLocation: 'BBBBBB',
                        servicePillar: 'BBBBBB',
                        serviceCategory: 'BBBBBB',
                        serviceDrilldown: 'BBBBBB',
                        sowName: 'BBBBBB',
                        sowNumber: 'BBBBBB',
                        poNumber: 'BBBBBB',
                        deliveryPoc: 'BBBBBB',
                        ciscoBusinessOwner: 'BBBBBB',
                        chrgbleAgentNumWdnmCases: 1,
                        projectedBillableHeadsM1: 1,
                        projectedBillableHeadsM2: 1,
                        projectedBillableHeadsM3: 1,
                        fteHourlyRateDollar: 1,
                        projectedTbpVolumeM1: 1,
                        projectedTbpVolumeM2: 1,
                        projectedTbpVolumeM3: 1,
                        projectedOtherVolM1: 1,
                        projectedOtherVolM2: 1,
                        projectedOtherVolM3: 1,
                        ahtInMinutes: 1,
                        dollarRatePerMinute: 1,
                        otherVolumeRate: 1,
                        infMilestoneValueM1NonUsd: 1,
                        infMilestoneValueM2NonUsd: 1,
                        infMilestoneValueM3NonUsd: 1,
                        infBufferNonUsd: 1,
                        infPoAmountNonUsd: 1,
                        milestoneValueM1Usd: 1,
                        milestoneValueM2Usd: 1,
                        milestoneValueM3Usd: 1,
                        bufferUsd: 1,
                        poAmountUsd: 1,
                        actualBillableHeadsM1: 1,
                        payActBillableHoursM1: 1,
                        actualBillableHeadsM2: 1,
                        payActBillableHoursM2: 1,
                        actualBillableHeadsM3: 1,
                        payActBillableHoursM3: 1,
                        actualTbpVolumeM1: 1,
                        actualTbpVolumeM2: 1,
                        actualTbpVolumeM3: 1,
                        actualOtherVolM1: 1,
                        actualOtherVolM2: 1,
                        actualOtherVolM3: 1,
                        billingAdjHittingM1: 1,
                        billingAdjHittingM2: 1,
                        billingAdjHittingM3: 1,
                        actualSpendM1Usd: 1,
                        actualSpendM2Usd: 1,
                        actualSpendM3Usd: 1,
                        totalQtrlySpendUsd: 1,
                        actualProjM1DiffUsd: 1,
                        actualProjM2DiffUsd: 1,
                        actualProjM3DiffUsd: 1,
                        actualMilestoneM3DiffPer: 1,
                        actualPoValueDiffPer: 1,
                        retrospectiveAdjM1: 1,
                        retrospectiveAdjM2: 1,
                        retrospectiveAdjM3: 1,
                        actualRetrospectiveCostM1: 1,
                        actualRetrospectiveCostM2: 1,
                        actualRetrospectiveCostM3: 1,
                        totalQtrlyRetrospectiveCost: 1,
                        changeImpact: 'BBBBBB',
                        method: 'BBBBBB',
                        otRate: 1,
                        appOtHrsM1: 1,
                        appOtHrsM2: 1,
                        appOtHrsM3: 1,
                        otSpendM1: 1,
                        otSpendM2: 1,
                        otSpendM3: 1,
                        notes: 'BBBBBB',
                        chrgbleStaffHrsWDNMCases: 1,
                        projectedBillableHrsM1: 1,
                        projectedBillableHrsM2: 1,
                        projectedBillableHrsM3: 1,
                        ccaVendorDataSk: 'BBBBBB',
                        payrollHourlyRateDollar: 1,
                        infActualBillableHoursM1: 1,
                        infActualBillableHoursM2: 1,
                        infActualBillableHoursM3: 1,
                        infActualSpendM1NonUsd: 1,
                        infActualSpendM2NonUsd: 1,
                        infActualSpendM3NonUsd: 1,
                        infBaseAht: 1,
                        infBaseHeads: 1,
                        cnxBaseRate: 1,
                        infCurrency: 1,
                        infCurrencyHourlyRate: 1,
                        fiscalQuaterName: 'BBBBBB',
                        actualMilestoneM1DiffPer: 1,
                        actualMilestoneM2DiffPer: 1,
                        qtrlyDiffActualProjection: 1,
                        infTotalQtrlySpendNonUsd: 1,
                        dataFlag: 'BBBBBB',
                        loadDate: 1,
                        cnxBaseRateFte: 1,
                        cnxbaseratetbp: 1
                    },
                    elemDefault
                );

                const expected = Object.assign({}, returnedFromService);
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
                        vendorName: 'BBBBBB',
                        vendorLocation: 'BBBBBB',
                        servicePillar: 'BBBBBB',
                        serviceCategory: 'BBBBBB',
                        serviceDrilldown: 'BBBBBB',
                        sowName: 'BBBBBB',
                        sowNumber: 'BBBBBB',
                        poNumber: 'BBBBBB',
                        deliveryPoc: 'BBBBBB',
                        ciscoBusinessOwner: 'BBBBBB',
                        chrgbleAgentNumWdnmCases: 1,
                        projectedBillableHeadsM1: 1,
                        projectedBillableHeadsM2: 1,
                        projectedBillableHeadsM3: 1,
                        fteHourlyRateDollar: 1,
                        projectedTbpVolumeM1: 1,
                        projectedTbpVolumeM2: 1,
                        projectedTbpVolumeM3: 1,
                        projectedOtherVolM1: 1,
                        projectedOtherVolM2: 1,
                        projectedOtherVolM3: 1,
                        ahtInMinutes: 1,
                        dollarRatePerMinute: 1,
                        otherVolumeRate: 1,
                        infMilestoneValueM1NonUsd: 1,
                        infMilestoneValueM2NonUsd: 1,
                        infMilestoneValueM3NonUsd: 1,
                        infBufferNonUsd: 1,
                        infPoAmountNonUsd: 1,
                        milestoneValueM1Usd: 1,
                        milestoneValueM2Usd: 1,
                        milestoneValueM3Usd: 1,
                        bufferUsd: 1,
                        poAmountUsd: 1,
                        actualBillableHeadsM1: 1,
                        payActBillableHoursM1: 1,
                        actualBillableHeadsM2: 1,
                        payActBillableHoursM2: 1,
                        actualBillableHeadsM3: 1,
                        payActBillableHoursM3: 1,
                        actualTbpVolumeM1: 1,
                        actualTbpVolumeM2: 1,
                        actualTbpVolumeM3: 1,
                        actualOtherVolM1: 1,
                        actualOtherVolM2: 1,
                        actualOtherVolM3: 1,
                        billingAdjHittingM1: 1,
                        billingAdjHittingM2: 1,
                        billingAdjHittingM3: 1,
                        actualSpendM1Usd: 1,
                        actualSpendM2Usd: 1,
                        actualSpendM3Usd: 1,
                        totalQtrlySpendUsd: 1,
                        actualProjM1DiffUsd: 1,
                        actualProjM2DiffUsd: 1,
                        actualProjM3DiffUsd: 1,
                        actualMilestoneM3DiffPer: 1,
                        actualPoValueDiffPer: 1,
                        retrospectiveAdjM1: 1,
                        retrospectiveAdjM2: 1,
                        retrospectiveAdjM3: 1,
                        actualRetrospectiveCostM1: 1,
                        actualRetrospectiveCostM2: 1,
                        actualRetrospectiveCostM3: 1,
                        totalQtrlyRetrospectiveCost: 1,
                        changeImpact: 'BBBBBB',
                        method: 'BBBBBB',
                        otRate: 1,
                        appOtHrsM1: 1,
                        appOtHrsM2: 1,
                        appOtHrsM3: 1,
                        otSpendM1: 1,
                        otSpendM2: 1,
                        otSpendM3: 1,
                        notes: 'BBBBBB',
                        chrgbleStaffHrsWDNMCases: 1,
                        projectedBillableHrsM1: 1,
                        projectedBillableHrsM2: 1,
                        projectedBillableHrsM3: 1,
                        ccaVendorDataSk: 'BBBBBB',
                        payrollHourlyRateDollar: 1,
                        infActualBillableHoursM1: 1,
                        infActualBillableHoursM2: 1,
                        infActualBillableHoursM3: 1,
                        infActualSpendM1NonUsd: 1,
                        infActualSpendM2NonUsd: 1,
                        infActualSpendM3NonUsd: 1,
                        infBaseAht: 1,
                        infBaseHeads: 1,
                        cnxBaseRate: 1,
                        infCurrency: 1,
                        infCurrencyHourlyRate: 1,
                        fiscalQuaterName: 'BBBBBB',
                        actualMilestoneM1DiffPer: 1,
                        actualMilestoneM2DiffPer: 1,
                        qtrlyDiffActualProjection: 1,
                        infTotalQtrlySpendNonUsd: 1,
                        dataFlag: 'BBBBBB',
                        loadDate: 1,
                        cnxBaseRateFte: 1,
                        cnxbaseratetbp: 1
                    },
                    elemDefault
                );
                const expected = Object.assign({}, returnedFromService);
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
