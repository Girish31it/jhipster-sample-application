import { Moment } from 'moment';

export interface IHCBTModel {
    id?: number;
    projectedOthVolM1Tbp?: number;
    projectedOthVolM2Tbp?: number;
    projectedOthVolM3Tbp?: number;
    projectedVolM1Tbp?: number;
    projectedVolM2Tbp?: number;
    projectedVolM3Tbp?: number;
    qtrlyDiffActualProjection?: number;
    retrospectiveAdjM1?: number;
    retrospectiveAdjM2?: number;
    retrospectiveAdjM3?: number;
    serviceCategory?: string;
    serviceDrillDown?: string;
    servicePillar?: string;
    sowName?: string;
    sowNumber?: string;
    totalQtrlySpendUsd?: number;
    infTotalQtrlySpendNonUsd?: number;
    vendorName?: string;
    actualRetrospectiveCostM1?: number;
    actualRetrospectiveCostM2?: number;
    actualRetrospectiveCostM3?: number;
    totalQtrlyRetrospectiveCost?: number;
    changeImpact?: string;
    notes?: string;
    dataFlag?: string;
    loadDate?: Moment;
    ccaVendorDataSk?: number;
    ccaVendorDataPk?: string;
    hourlyRateDollarFte?: number;
    hourlyRateDollarPh?: number;
    dollarRatePerMinuteTbp?: number;
    deliveryPoc?: string;
    actualBillableHeadsM1Fte?: number;
    actualBillableHeadsM2Fte?: number;
    actualBillableHeadsM3Fte?: number;
    actBillableHoursM1Ph?: number;
    infActBillHoursM1Fte?: number;
    actBillableHoursM2Ph?: number;
    infActBillHoursM2Fte?: number;
    actBillableHoursM3Ph?: number;
    infActBillHoursM3Fte?: number;
    actualOtherVolumeM1Tbp?: number;
    actualOtherVolumeM2Tbp?: number;
    actualOtherVolumeM3Tbp?: number;
    actualSpendM1Usd?: number;
    infActSpendM1NonUsdCurr?: number;
    actualSpendM2Usd?: number;
    infActSpendM2NonUsdCurr?: number;
    actualSpendM3Usd?: number;
    infActSpendM3NonUsdCurr?: number;
    actualVolumeM1Tbp?: number;
    actualVolumeM2Tbp?: number;
    actualVolumeM3Tbp?: number;
    actualPoValueDiffPer?: number;
    ahtInMinutesTbp?: number;
    appOtHrsM1?: number;
    appOtHrsM2?: number;
    appOtHrsM3?: number;
    infBaseAht?: number;
    infBaseHeads?: string;
    cnxBaseRateTbp?: number;
    cnxBaseRateFte?: number;
    billingAdjHittingM1?: number;
    billingAdjHittingM2?: number;
    billingAdjHittingM3?: number;
    bufferUsd?: number;
    infBufferNonUsdCurr?: number;
    ciscoBusinessOwner?: string;
    infCurrency?: string;
    infCurrencyHrlyRateFte?: number;
    actualProjM1DiffUsd?: number;
    actualProjM2DiffUsd?: number;
    actualProjM3DiffUsd?: number;
    fiscalQuarterName?: string;
    vendorLocation?: string;
    method?: string;
    actualMilestoneM1Per?: number;
    actualMilestoneM2Per?: number;
    actualMilestoneM3Per?: number;
    milestoneValueM1Usd?: number;
    infMStonValM1NonUsdCur?: number;
    milestoneValueM2Usd?: number;
    infMStonValM2NonUsdCur?: number;
    milestoneValueM3Usd?: number;
    infMStonValM3NonUsdCur?: number;
    cnxChrAgentNumWdnmCases?: number;
    cnvChrStaffHrsWdnmCases?: number;
    otherVolumeRateTbp?: number;
    otRate?: number;
    otSpendM1?: number;
    otSpendM2?: number;
    otSpendM3?: number;
    poAmountUsd?: number;
    infPoAmountNonUsd?: number;
    poNumber?: string;
    projBillableHeadsM1Fte?: number;
    projBillableHeadsM2Fte?: number;
    projBillableHeadsM3Fte?: number;
    projectedBillableHrsM1Ph?: number;
    projectedBillableHrsM2Ph?: number;
    projectedBillableHrsM3Ph?: number;
}

export class HCBTModel implements IHCBTModel {
    constructor(
        public id?: number,
        public projectedOthVolM1Tbp?: number,
        public projectedOthVolM2Tbp?: number,
        public projectedOthVolM3Tbp?: number,
        public projectedVolM1Tbp?: number,
        public projectedVolM2Tbp?: number,
        public projectedVolM3Tbp?: number,
        public qtrlyDiffActualProjection?: number,
        public retrospectiveAdjM1?: number,
        public retrospectiveAdjM2?: number,
        public retrospectiveAdjM3?: number,
        public serviceCategory?: string,
        public serviceDrillDown?: string,
        public servicePillar?: string,
        public sowName?: string,
        public sowNumber?: string,
        public totalQtrlySpendUsd?: number,
        public infTotalQtrlySpendNonUsd?: number,
        public vendorName?: string,
        public actualRetrospectiveCostM1?: number,
        public actualRetrospectiveCostM2?: number,
        public actualRetrospectiveCostM3?: number,
        public totalQtrlyRetrospectiveCost?: number,
        public changeImpact?: string,
        public notes?: string,
        public dataFlag?: string,
        public loadDate?: Moment,
        public ccaVendorDataSk?: number,
        public ccaVendorDataPk?: string,
        public hourlyRateDollarFte?: number,
        public hourlyRateDollarPh?: number,
        public dollarRatePerMinuteTbp?: number,
        public deliveryPoc?: string,
        public actualBillableHeadsM1Fte?: number,
        public actualBillableHeadsM2Fte?: number,
        public actualBillableHeadsM3Fte?: number,
        public actBillableHoursM1Ph?: number,
        public infActBillHoursM1Fte?: number,
        public actBillableHoursM2Ph?: number,
        public infActBillHoursM2Fte?: number,
        public actBillableHoursM3Ph?: number,
        public infActBillHoursM3Fte?: number,
        public actualOtherVolumeM1Tbp?: number,
        public actualOtherVolumeM2Tbp?: number,
        public actualOtherVolumeM3Tbp?: number,
        public actualSpendM1Usd?: number,
        public infActSpendM1NonUsdCurr?: number,
        public actualSpendM2Usd?: number,
        public infActSpendM2NonUsdCurr?: number,
        public actualSpendM3Usd?: number,
        public infActSpendM3NonUsdCurr?: number,
        public actualVolumeM1Tbp?: number,
        public actualVolumeM2Tbp?: number,
        public actualVolumeM3Tbp?: number,
        public actualPoValueDiffPer?: number,
        public ahtInMinutesTbp?: number,
        public appOtHrsM1?: number,
        public appOtHrsM2?: number,
        public appOtHrsM3?: number,
        public infBaseAht?: number,
        public infBaseHeads?: string,
        public cnxBaseRateTbp?: number,
        public cnxBaseRateFte?: number,
        public billingAdjHittingM1?: number,
        public billingAdjHittingM2?: number,
        public billingAdjHittingM3?: number,
        public bufferUsd?: number,
        public infBufferNonUsdCurr?: number,
        public ciscoBusinessOwner?: string,
        public infCurrency?: string,
        public infCurrencyHrlyRateFte?: number,
        public actualProjM1DiffUsd?: number,
        public actualProjM2DiffUsd?: number,
        public actualProjM3DiffUsd?: number,
        public fiscalQuarterName?: string,
        public vendorLocation?: string,
        public method?: string,
        public actualMilestoneM1Per?: number,
        public actualMilestoneM2Per?: number,
        public actualMilestoneM3Per?: number,
        public milestoneValueM1Usd?: number,
        public infMStonValM1NonUsdCur?: number,
        public milestoneValueM2Usd?: number,
        public infMStonValM2NonUsdCur?: number,
        public milestoneValueM3Usd?: number,
        public infMStonValM3NonUsdCur?: number,
        public cnxChrAgentNumWdnmCases?: number,
        public cnvChrStaffHrsWdnmCases?: number,
        public otherVolumeRateTbp?: number,
        public otRate?: number,
        public otSpendM1?: number,
        public otSpendM2?: number,
        public otSpendM3?: number,
        public poAmountUsd?: number,
        public infPoAmountNonUsd?: number,
        public poNumber?: string,
        public projBillableHeadsM1Fte?: number,
        public projBillableHeadsM2Fte?: number,
        public projBillableHeadsM3Fte?: number,
        public projectedBillableHrsM1Ph?: number,
        public projectedBillableHrsM2Ph?: number,
        public projectedBillableHrsM3Ph?: number
    ) {}
}
