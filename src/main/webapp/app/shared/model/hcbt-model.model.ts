export interface IHCBTModel {
    id?: number;
    vendorName?: string;
    vendorLocation?: string;
    servicePillar?: string;
    serviceCategory?: string;
    serviceDrilldown?: string;
    sowName?: string;
    sowNumber?: string;
    poNumber?: string;
    deliveryPoc?: string;
    ciscoBusinessOwner?: string;
    chrgbleAgentNumWdnmCases?: number;
    projectedBillableHeadsM1?: number;
    projectedBillableHeadsM2?: number;
    projectedBillableHeadsM3?: number;
    fteHourlyRateDollar?: number;
    projectedTbpVolumeM1?: number;
    projectedTbpVolumeM2?: number;
    projectedTbpVolumeM3?: number;
    projectedOtherVolM1?: number;
    projectedOtherVolM2?: number;
    projectedOtherVolM3?: number;
    ahtInMinutes?: number;
    dollarRatePerMinute?: number;
    otherVolumeRate?: number;
    infMilestoneValueM1NonUsd?: number;
    infMilestoneValueM2NonUsd?: number;
    infMilestoneValueM3NonUsd?: number;
    infBufferNonUsd?: number;
    infPoAmountNonUsd?: number;
    milestoneValueM1Usd?: number;
    milestoneValueM2Usd?: number;
    milestoneValueM3Usd?: number;
    bufferUsd?: number;
    poAmountUsd?: number;
    actualBillableHeadsM1?: number;
    payActBillableHoursM1?: number;
    actualBillableHeadsM2?: number;
    payActBillableHoursM2?: number;
    actualBillableHeadsM3?: number;
    payActBillableHoursM3?: number;
    actualTbpVolumeM1?: number;
    actualTbpVolumeM2?: number;
    actualTbpVolumeM3?: number;
    actualOtherVolM1?: number;
    actualOtherVolM2?: number;
    actualOtherVolM3?: number;
    billingAdjHittingM1?: number;
    billingAdjHittingM2?: number;
    billingAdjHittingM3?: number;
    actualSpendM1Usd?: number;
    actualSpendM2Usd?: number;
    actualSpendM3Usd?: number;
    totalQtrlySpendUsd?: number;
    actualProjM1DiffUsd?: number;
    actualProjM2DiffUsd?: number;
    actualProjM3DiffUsd?: number;
    actualMilestoneM3DiffPer?: number;
    actualPoValueDiffPer?: number;
    retrospectiveAdjM1?: number;
    retrospectiveAdjM2?: number;
    retrospectiveAdjM3?: number;
    actualRetrospectiveCostM1?: number;
    actualRetrospectiveCostM2?: number;
    actualRetrospectiveCostM3?: number;
    totalQtrlyRetrospectiveCost?: number;
    changeImpact?: string;
    method?: string;
    otRate?: number;
    appOtHrsM1?: number;
    appOtHrsM2?: number;
    appOtHrsM3?: number;
    otSpendM1?: number;
    otSpendM2?: number;
    otSpendM3?: number;
    notes?: string;
    chrgbleStaffHrsWDNMCases?: number;
    projectedBillableHrsM1?: number;
    projectedBillableHrsM2?: number;
    projectedBillableHrsM3?: number;
    ccaVendorDataSk?: string;
    payrollHourlyRateDollar?: number;
    infActualBillableHoursM1?: number;
    infActualBillableHoursM2?: number;
    infActualBillableHoursM3?: number;
    infActualSpendM1NonUsd?: number;
    infActualSpendM2NonUsd?: number;
    infActualSpendM3NonUsd?: number;
    infBaseAht?: number;
    infBaseHeads?: number;
    cnxBaseRate?: number;
    infCurrency?: number;
    infCurrencyHourlyRate?: number;
    fiscalQuaterName?: string;
    actualMilestoneM1DiffPer?: number;
    actualMilestoneM2DiffPer?: number;
    qtrlyDiffActualProjection?: number;
    infTotalQtrlySpendNonUsd?: number;
    dataFlag?: string;
    loadDate?: number;
    cnxBaseRateFte?: number;
    cnxbaseratetbp?: number;
}

export class HCBTModel implements IHCBTModel {
    constructor(
        public id?: number,
        public vendorName?: string,
        public vendorLocation?: string,
        public servicePillar?: string,
        public serviceCategory?: string,
        public serviceDrilldown?: string,
        public sowName?: string,
        public sowNumber?: string,
        public poNumber?: string,
        public deliveryPoc?: string,
        public ciscoBusinessOwner?: string,
        public chrgbleAgentNumWdnmCases?: number,
        public projectedBillableHeadsM1?: number,
        public projectedBillableHeadsM2?: number,
        public projectedBillableHeadsM3?: number,
        public fteHourlyRateDollar?: number,
        public projectedTbpVolumeM1?: number,
        public projectedTbpVolumeM2?: number,
        public projectedTbpVolumeM3?: number,
        public projectedOtherVolM1?: number,
        public projectedOtherVolM2?: number,
        public projectedOtherVolM3?: number,
        public ahtInMinutes?: number,
        public dollarRatePerMinute?: number,
        public otherVolumeRate?: number,
        public infMilestoneValueM1NonUsd?: number,
        public infMilestoneValueM2NonUsd?: number,
        public infMilestoneValueM3NonUsd?: number,
        public infBufferNonUsd?: number,
        public infPoAmountNonUsd?: number,
        public milestoneValueM1Usd?: number,
        public milestoneValueM2Usd?: number,
        public milestoneValueM3Usd?: number,
        public bufferUsd?: number,
        public poAmountUsd?: number,
        public actualBillableHeadsM1?: number,
        public payActBillableHoursM1?: number,
        public actualBillableHeadsM2?: number,
        public payActBillableHoursM2?: number,
        public actualBillableHeadsM3?: number,
        public payActBillableHoursM3?: number,
        public actualTbpVolumeM1?: number,
        public actualTbpVolumeM2?: number,
        public actualTbpVolumeM3?: number,
        public actualOtherVolM1?: number,
        public actualOtherVolM2?: number,
        public actualOtherVolM3?: number,
        public billingAdjHittingM1?: number,
        public billingAdjHittingM2?: number,
        public billingAdjHittingM3?: number,
        public actualSpendM1Usd?: number,
        public actualSpendM2Usd?: number,
        public actualSpendM3Usd?: number,
        public totalQtrlySpendUsd?: number,
        public actualProjM1DiffUsd?: number,
        public actualProjM2DiffUsd?: number,
        public actualProjM3DiffUsd?: number,
        public actualMilestoneM3DiffPer?: number,
        public actualPoValueDiffPer?: number,
        public retrospectiveAdjM1?: number,
        public retrospectiveAdjM2?: number,
        public retrospectiveAdjM3?: number,
        public actualRetrospectiveCostM1?: number,
        public actualRetrospectiveCostM2?: number,
        public actualRetrospectiveCostM3?: number,
        public totalQtrlyRetrospectiveCost?: number,
        public changeImpact?: string,
        public method?: string,
        public otRate?: number,
        public appOtHrsM1?: number,
        public appOtHrsM2?: number,
        public appOtHrsM3?: number,
        public otSpendM1?: number,
        public otSpendM2?: number,
        public otSpendM3?: number,
        public notes?: string,
        public chrgbleStaffHrsWDNMCases?: number,
        public projectedBillableHrsM1?: number,
        public projectedBillableHrsM2?: number,
        public projectedBillableHrsM3?: number,
        public ccaVendorDataSk?: string,
        public payrollHourlyRateDollar?: number,
        public infActualBillableHoursM1?: number,
        public infActualBillableHoursM2?: number,
        public infActualBillableHoursM3?: number,
        public infActualSpendM1NonUsd?: number,
        public infActualSpendM2NonUsd?: number,
        public infActualSpendM3NonUsd?: number,
        public infBaseAht?: number,
        public infBaseHeads?: number,
        public cnxBaseRate?: number,
        public infCurrency?: number,
        public infCurrencyHourlyRate?: number,
        public fiscalQuaterName?: string,
        public actualMilestoneM1DiffPer?: number,
        public actualMilestoneM2DiffPer?: number,
        public qtrlyDiffActualProjection?: number,
        public infTotalQtrlySpendNonUsd?: number,
        public dataFlag?: string,
        public loadDate?: number,
        public cnxBaseRateFte?: number,
        public cnxbaseratetbp?: number
    ) {}
}
