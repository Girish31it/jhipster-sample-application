import { element, by, ElementFinder } from 'protractor';

export class HCBTModelComponentsPage {
    createButton = element(by.id('jh-create-entity'));
    deleteButtons = element.all(by.css('jhi-hcbt-model div table .btn-danger'));
    title = element.all(by.css('jhi-hcbt-model div h2#page-heading span')).first();

    async clickOnCreateButton() {
        await this.createButton.click();
    }

    async clickOnLastDeleteButton() {
        await this.deleteButtons.last().click();
    }

    async countDeleteButtons() {
        return this.deleteButtons.count();
    }

    async getTitle() {
        return this.title.getText();
    }
}

export class HCBTModelUpdatePage {
    pageTitle = element(by.id('jhi-hcbt-model-heading'));
    saveButton = element(by.id('save-entity'));
    cancelButton = element(by.id('cancel-save'));
    vendorNameInput = element(by.id('field_vendorName'));
    vendorLocationInput = element(by.id('field_vendorLocation'));
    servicePillarInput = element(by.id('field_servicePillar'));
    serviceCategoryInput = element(by.id('field_serviceCategory'));
    serviceDrilldownInput = element(by.id('field_serviceDrilldown'));
    sowNameInput = element(by.id('field_sowName'));
    sowNumberInput = element(by.id('field_sowNumber'));
    poNumberInput = element(by.id('field_poNumber'));
    deliveryPocInput = element(by.id('field_deliveryPoc'));
    ciscoBusinessOwnerInput = element(by.id('field_ciscoBusinessOwner'));
    chrgbleAgentNumWdnmCasesInput = element(by.id('field_chrgbleAgentNumWdnmCases'));
    projectedBillableHeadsM1Input = element(by.id('field_projectedBillableHeadsM1'));
    projectedBillableHeadsM2Input = element(by.id('field_projectedBillableHeadsM2'));
    projectedBillableHeadsM3Input = element(by.id('field_projectedBillableHeadsM3'));
    fteHourlyRateDollarInput = element(by.id('field_fteHourlyRateDollar'));
    projectedTbpVolumeM1Input = element(by.id('field_projectedTbpVolumeM1'));
    projectedTbpVolumeM2Input = element(by.id('field_projectedTbpVolumeM2'));
    projectedTbpVolumeM3Input = element(by.id('field_projectedTbpVolumeM3'));
    projectedOtherVolM1Input = element(by.id('field_projectedOtherVolM1'));
    projectedOtherVolM2Input = element(by.id('field_projectedOtherVolM2'));
    projectedOtherVolM3Input = element(by.id('field_projectedOtherVolM3'));
    ahtInMinutesInput = element(by.id('field_ahtInMinutes'));
    dollarRatePerMinuteInput = element(by.id('field_dollarRatePerMinute'));
    otherVolumeRateInput = element(by.id('field_otherVolumeRate'));
    infMilestoneValueM1NonUsdInput = element(by.id('field_infMilestoneValueM1NonUsd'));
    infMilestoneValueM2NonUsdInput = element(by.id('field_infMilestoneValueM2NonUsd'));
    infMilestoneValueM3NonUsdInput = element(by.id('field_infMilestoneValueM3NonUsd'));
    infBufferNonUsdInput = element(by.id('field_infBufferNonUsd'));
    infPoAmountNonUsdInput = element(by.id('field_infPoAmountNonUsd'));
    milestoneValueM1UsdInput = element(by.id('field_milestoneValueM1Usd'));
    milestoneValueM2UsdInput = element(by.id('field_milestoneValueM2Usd'));
    milestoneValueM3UsdInput = element(by.id('field_milestoneValueM3Usd'));
    bufferUsdInput = element(by.id('field_bufferUsd'));
    poAmountUsdInput = element(by.id('field_poAmountUsd'));
    actualBillableHeadsM1Input = element(by.id('field_actualBillableHeadsM1'));
    payActBillableHoursM1Input = element(by.id('field_payActBillableHoursM1'));
    actualBillableHeadsM2Input = element(by.id('field_actualBillableHeadsM2'));
    payActBillableHoursM2Input = element(by.id('field_payActBillableHoursM2'));
    actualBillableHeadsM3Input = element(by.id('field_actualBillableHeadsM3'));
    payActBillableHoursM3Input = element(by.id('field_payActBillableHoursM3'));
    actualTbpVolumeM1Input = element(by.id('field_actualTbpVolumeM1'));
    actualTbpVolumeM2Input = element(by.id('field_actualTbpVolumeM2'));
    actualTbpVolumeM3Input = element(by.id('field_actualTbpVolumeM3'));
    actualOtherVolM1Input = element(by.id('field_actualOtherVolM1'));
    actualOtherVolM2Input = element(by.id('field_actualOtherVolM2'));
    actualOtherVolM3Input = element(by.id('field_actualOtherVolM3'));
    billingAdjHittingM1Input = element(by.id('field_billingAdjHittingM1'));
    billingAdjHittingM2Input = element(by.id('field_billingAdjHittingM2'));
    billingAdjHittingM3Input = element(by.id('field_billingAdjHittingM3'));
    actualSpendM1UsdInput = element(by.id('field_actualSpendM1Usd'));
    actualSpendM2UsdInput = element(by.id('field_actualSpendM2Usd'));
    actualSpendM3UsdInput = element(by.id('field_actualSpendM3Usd'));
    totalQtrlySpendUsdInput = element(by.id('field_totalQtrlySpendUsd'));
    actualProjM1DiffUsdInput = element(by.id('field_actualProjM1DiffUsd'));
    actualProjM2DiffUsdInput = element(by.id('field_actualProjM2DiffUsd'));
    actualProjM3DiffUsdInput = element(by.id('field_actualProjM3DiffUsd'));
    actualMilestoneM3DiffPerInput = element(by.id('field_actualMilestoneM3DiffPer'));
    actualPoValueDiffPerInput = element(by.id('field_actualPoValueDiffPer'));
    retrospectiveAdjM1Input = element(by.id('field_retrospectiveAdjM1'));
    retrospectiveAdjM2Input = element(by.id('field_retrospectiveAdjM2'));
    retrospectiveAdjM3Input = element(by.id('field_retrospectiveAdjM3'));
    actualRetrospectiveCostM1Input = element(by.id('field_actualRetrospectiveCostM1'));
    actualRetrospectiveCostM2Input = element(by.id('field_actualRetrospectiveCostM2'));
    actualRetrospectiveCostM3Input = element(by.id('field_actualRetrospectiveCostM3'));
    totalQtrlyRetrospectiveCostInput = element(by.id('field_totalQtrlyRetrospectiveCost'));
    changeImpactInput = element(by.id('field_changeImpact'));
    methodInput = element(by.id('field_method'));
    otRateInput = element(by.id('field_otRate'));
    appOtHrsM1Input = element(by.id('field_appOtHrsM1'));
    appOtHrsM2Input = element(by.id('field_appOtHrsM2'));
    appOtHrsM3Input = element(by.id('field_appOtHrsM3'));
    otSpendM1Input = element(by.id('field_otSpendM1'));
    otSpendM2Input = element(by.id('field_otSpendM2'));
    otSpendM3Input = element(by.id('field_otSpendM3'));
    notesInput = element(by.id('field_notes'));
    chrgbleStaffHrsWDNMCasesInput = element(by.id('field_chrgbleStaffHrsWDNMCases'));
    projectedBillableHrsM1Input = element(by.id('field_projectedBillableHrsM1'));
    projectedBillableHrsM2Input = element(by.id('field_projectedBillableHrsM2'));
    projectedBillableHrsM3Input = element(by.id('field_projectedBillableHrsM3'));
    ccaVendorDataSkInput = element(by.id('field_ccaVendorDataSk'));
    payrollHourlyRateDollarInput = element(by.id('field_payrollHourlyRateDollar'));
    infActualBillableHoursM1Input = element(by.id('field_infActualBillableHoursM1'));
    infActualBillableHoursM2Input = element(by.id('field_infActualBillableHoursM2'));
    infActualBillableHoursM3Input = element(by.id('field_infActualBillableHoursM3'));
    infActualSpendM1NonUsdInput = element(by.id('field_infActualSpendM1NonUsd'));
    infActualSpendM2NonUsdInput = element(by.id('field_infActualSpendM2NonUsd'));
    infActualSpendM3NonUsdInput = element(by.id('field_infActualSpendM3NonUsd'));
    infBaseAhtInput = element(by.id('field_infBaseAht'));
    infBaseHeadsInput = element(by.id('field_infBaseHeads'));
    cnxBaseRateInput = element(by.id('field_cnxBaseRate'));
    infCurrencyInput = element(by.id('field_infCurrency'));
    infCurrencyHourlyRateInput = element(by.id('field_infCurrencyHourlyRate'));
    fiscalQuaterNameInput = element(by.id('field_fiscalQuaterName'));
    actualMilestoneM1DiffPerInput = element(by.id('field_actualMilestoneM1DiffPer'));
    actualMilestoneM2DiffPerInput = element(by.id('field_actualMilestoneM2DiffPer'));
    qtrlyDiffActualProjectionInput = element(by.id('field_qtrlyDiffActualProjection'));
    infTotalQtrlySpendNonUsdInput = element(by.id('field_infTotalQtrlySpendNonUsd'));
    dataFlagInput = element(by.id('field_dataFlag'));
    loadDateInput = element(by.id('field_loadDate'));
    cnxBaseRateFteInput = element(by.id('field_cnxBaseRateFte'));
    cnxbaseratetbpInput = element(by.id('field_cnxbaseratetbp'));

    async getPageTitle() {
        return this.pageTitle.getText();
    }

    async setVendorNameInput(vendorName) {
        await this.vendorNameInput.sendKeys(vendorName);
    }

    async getVendorNameInput() {
        return this.vendorNameInput.getAttribute('value');
    }

    async setVendorLocationInput(vendorLocation) {
        await this.vendorLocationInput.sendKeys(vendorLocation);
    }

    async getVendorLocationInput() {
        return this.vendorLocationInput.getAttribute('value');
    }

    async setServicePillarInput(servicePillar) {
        await this.servicePillarInput.sendKeys(servicePillar);
    }

    async getServicePillarInput() {
        return this.servicePillarInput.getAttribute('value');
    }

    async setServiceCategoryInput(serviceCategory) {
        await this.serviceCategoryInput.sendKeys(serviceCategory);
    }

    async getServiceCategoryInput() {
        return this.serviceCategoryInput.getAttribute('value');
    }

    async setServiceDrilldownInput(serviceDrilldown) {
        await this.serviceDrilldownInput.sendKeys(serviceDrilldown);
    }

    async getServiceDrilldownInput() {
        return this.serviceDrilldownInput.getAttribute('value');
    }

    async setSowNameInput(sowName) {
        await this.sowNameInput.sendKeys(sowName);
    }

    async getSowNameInput() {
        return this.sowNameInput.getAttribute('value');
    }

    async setSowNumberInput(sowNumber) {
        await this.sowNumberInput.sendKeys(sowNumber);
    }

    async getSowNumberInput() {
        return this.sowNumberInput.getAttribute('value');
    }

    async setPoNumberInput(poNumber) {
        await this.poNumberInput.sendKeys(poNumber);
    }

    async getPoNumberInput() {
        return this.poNumberInput.getAttribute('value');
    }

    async setDeliveryPocInput(deliveryPoc) {
        await this.deliveryPocInput.sendKeys(deliveryPoc);
    }

    async getDeliveryPocInput() {
        return this.deliveryPocInput.getAttribute('value');
    }

    async setCiscoBusinessOwnerInput(ciscoBusinessOwner) {
        await this.ciscoBusinessOwnerInput.sendKeys(ciscoBusinessOwner);
    }

    async getCiscoBusinessOwnerInput() {
        return this.ciscoBusinessOwnerInput.getAttribute('value');
    }

    async setChrgbleAgentNumWdnmCasesInput(chrgbleAgentNumWdnmCases) {
        await this.chrgbleAgentNumWdnmCasesInput.sendKeys(chrgbleAgentNumWdnmCases);
    }

    async getChrgbleAgentNumWdnmCasesInput() {
        return this.chrgbleAgentNumWdnmCasesInput.getAttribute('value');
    }

    async setProjectedBillableHeadsM1Input(projectedBillableHeadsM1) {
        await this.projectedBillableHeadsM1Input.sendKeys(projectedBillableHeadsM1);
    }

    async getProjectedBillableHeadsM1Input() {
        return this.projectedBillableHeadsM1Input.getAttribute('value');
    }

    async setProjectedBillableHeadsM2Input(projectedBillableHeadsM2) {
        await this.projectedBillableHeadsM2Input.sendKeys(projectedBillableHeadsM2);
    }

    async getProjectedBillableHeadsM2Input() {
        return this.projectedBillableHeadsM2Input.getAttribute('value');
    }

    async setProjectedBillableHeadsM3Input(projectedBillableHeadsM3) {
        await this.projectedBillableHeadsM3Input.sendKeys(projectedBillableHeadsM3);
    }

    async getProjectedBillableHeadsM3Input() {
        return this.projectedBillableHeadsM3Input.getAttribute('value');
    }

    async setFteHourlyRateDollarInput(fteHourlyRateDollar) {
        await this.fteHourlyRateDollarInput.sendKeys(fteHourlyRateDollar);
    }

    async getFteHourlyRateDollarInput() {
        return this.fteHourlyRateDollarInput.getAttribute('value');
    }

    async setProjectedTbpVolumeM1Input(projectedTbpVolumeM1) {
        await this.projectedTbpVolumeM1Input.sendKeys(projectedTbpVolumeM1);
    }

    async getProjectedTbpVolumeM1Input() {
        return this.projectedTbpVolumeM1Input.getAttribute('value');
    }

    async setProjectedTbpVolumeM2Input(projectedTbpVolumeM2) {
        await this.projectedTbpVolumeM2Input.sendKeys(projectedTbpVolumeM2);
    }

    async getProjectedTbpVolumeM2Input() {
        return this.projectedTbpVolumeM2Input.getAttribute('value');
    }

    async setProjectedTbpVolumeM3Input(projectedTbpVolumeM3) {
        await this.projectedTbpVolumeM3Input.sendKeys(projectedTbpVolumeM3);
    }

    async getProjectedTbpVolumeM3Input() {
        return this.projectedTbpVolumeM3Input.getAttribute('value');
    }

    async setProjectedOtherVolM1Input(projectedOtherVolM1) {
        await this.projectedOtherVolM1Input.sendKeys(projectedOtherVolM1);
    }

    async getProjectedOtherVolM1Input() {
        return this.projectedOtherVolM1Input.getAttribute('value');
    }

    async setProjectedOtherVolM2Input(projectedOtherVolM2) {
        await this.projectedOtherVolM2Input.sendKeys(projectedOtherVolM2);
    }

    async getProjectedOtherVolM2Input() {
        return this.projectedOtherVolM2Input.getAttribute('value');
    }

    async setProjectedOtherVolM3Input(projectedOtherVolM3) {
        await this.projectedOtherVolM3Input.sendKeys(projectedOtherVolM3);
    }

    async getProjectedOtherVolM3Input() {
        return this.projectedOtherVolM3Input.getAttribute('value');
    }

    async setAhtInMinutesInput(ahtInMinutes) {
        await this.ahtInMinutesInput.sendKeys(ahtInMinutes);
    }

    async getAhtInMinutesInput() {
        return this.ahtInMinutesInput.getAttribute('value');
    }

    async setDollarRatePerMinuteInput(dollarRatePerMinute) {
        await this.dollarRatePerMinuteInput.sendKeys(dollarRatePerMinute);
    }

    async getDollarRatePerMinuteInput() {
        return this.dollarRatePerMinuteInput.getAttribute('value');
    }

    async setOtherVolumeRateInput(otherVolumeRate) {
        await this.otherVolumeRateInput.sendKeys(otherVolumeRate);
    }

    async getOtherVolumeRateInput() {
        return this.otherVolumeRateInput.getAttribute('value');
    }

    async setInfMilestoneValueM1NonUsdInput(infMilestoneValueM1NonUsd) {
        await this.infMilestoneValueM1NonUsdInput.sendKeys(infMilestoneValueM1NonUsd);
    }

    async getInfMilestoneValueM1NonUsdInput() {
        return this.infMilestoneValueM1NonUsdInput.getAttribute('value');
    }

    async setInfMilestoneValueM2NonUsdInput(infMilestoneValueM2NonUsd) {
        await this.infMilestoneValueM2NonUsdInput.sendKeys(infMilestoneValueM2NonUsd);
    }

    async getInfMilestoneValueM2NonUsdInput() {
        return this.infMilestoneValueM2NonUsdInput.getAttribute('value');
    }

    async setInfMilestoneValueM3NonUsdInput(infMilestoneValueM3NonUsd) {
        await this.infMilestoneValueM3NonUsdInput.sendKeys(infMilestoneValueM3NonUsd);
    }

    async getInfMilestoneValueM3NonUsdInput() {
        return this.infMilestoneValueM3NonUsdInput.getAttribute('value');
    }

    async setInfBufferNonUsdInput(infBufferNonUsd) {
        await this.infBufferNonUsdInput.sendKeys(infBufferNonUsd);
    }

    async getInfBufferNonUsdInput() {
        return this.infBufferNonUsdInput.getAttribute('value');
    }

    async setInfPoAmountNonUsdInput(infPoAmountNonUsd) {
        await this.infPoAmountNonUsdInput.sendKeys(infPoAmountNonUsd);
    }

    async getInfPoAmountNonUsdInput() {
        return this.infPoAmountNonUsdInput.getAttribute('value');
    }

    async setMilestoneValueM1UsdInput(milestoneValueM1Usd) {
        await this.milestoneValueM1UsdInput.sendKeys(milestoneValueM1Usd);
    }

    async getMilestoneValueM1UsdInput() {
        return this.milestoneValueM1UsdInput.getAttribute('value');
    }

    async setMilestoneValueM2UsdInput(milestoneValueM2Usd) {
        await this.milestoneValueM2UsdInput.sendKeys(milestoneValueM2Usd);
    }

    async getMilestoneValueM2UsdInput() {
        return this.milestoneValueM2UsdInput.getAttribute('value');
    }

    async setMilestoneValueM3UsdInput(milestoneValueM3Usd) {
        await this.milestoneValueM3UsdInput.sendKeys(milestoneValueM3Usd);
    }

    async getMilestoneValueM3UsdInput() {
        return this.milestoneValueM3UsdInput.getAttribute('value');
    }

    async setBufferUsdInput(bufferUsd) {
        await this.bufferUsdInput.sendKeys(bufferUsd);
    }

    async getBufferUsdInput() {
        return this.bufferUsdInput.getAttribute('value');
    }

    async setPoAmountUsdInput(poAmountUsd) {
        await this.poAmountUsdInput.sendKeys(poAmountUsd);
    }

    async getPoAmountUsdInput() {
        return this.poAmountUsdInput.getAttribute('value');
    }

    async setActualBillableHeadsM1Input(actualBillableHeadsM1) {
        await this.actualBillableHeadsM1Input.sendKeys(actualBillableHeadsM1);
    }

    async getActualBillableHeadsM1Input() {
        return this.actualBillableHeadsM1Input.getAttribute('value');
    }

    async setPayActBillableHoursM1Input(payActBillableHoursM1) {
        await this.payActBillableHoursM1Input.sendKeys(payActBillableHoursM1);
    }

    async getPayActBillableHoursM1Input() {
        return this.payActBillableHoursM1Input.getAttribute('value');
    }

    async setActualBillableHeadsM2Input(actualBillableHeadsM2) {
        await this.actualBillableHeadsM2Input.sendKeys(actualBillableHeadsM2);
    }

    async getActualBillableHeadsM2Input() {
        return this.actualBillableHeadsM2Input.getAttribute('value');
    }

    async setPayActBillableHoursM2Input(payActBillableHoursM2) {
        await this.payActBillableHoursM2Input.sendKeys(payActBillableHoursM2);
    }

    async getPayActBillableHoursM2Input() {
        return this.payActBillableHoursM2Input.getAttribute('value');
    }

    async setActualBillableHeadsM3Input(actualBillableHeadsM3) {
        await this.actualBillableHeadsM3Input.sendKeys(actualBillableHeadsM3);
    }

    async getActualBillableHeadsM3Input() {
        return this.actualBillableHeadsM3Input.getAttribute('value');
    }

    async setPayActBillableHoursM3Input(payActBillableHoursM3) {
        await this.payActBillableHoursM3Input.sendKeys(payActBillableHoursM3);
    }

    async getPayActBillableHoursM3Input() {
        return this.payActBillableHoursM3Input.getAttribute('value');
    }

    async setActualTbpVolumeM1Input(actualTbpVolumeM1) {
        await this.actualTbpVolumeM1Input.sendKeys(actualTbpVolumeM1);
    }

    async getActualTbpVolumeM1Input() {
        return this.actualTbpVolumeM1Input.getAttribute('value');
    }

    async setActualTbpVolumeM2Input(actualTbpVolumeM2) {
        await this.actualTbpVolumeM2Input.sendKeys(actualTbpVolumeM2);
    }

    async getActualTbpVolumeM2Input() {
        return this.actualTbpVolumeM2Input.getAttribute('value');
    }

    async setActualTbpVolumeM3Input(actualTbpVolumeM3) {
        await this.actualTbpVolumeM3Input.sendKeys(actualTbpVolumeM3);
    }

    async getActualTbpVolumeM3Input() {
        return this.actualTbpVolumeM3Input.getAttribute('value');
    }

    async setActualOtherVolM1Input(actualOtherVolM1) {
        await this.actualOtherVolM1Input.sendKeys(actualOtherVolM1);
    }

    async getActualOtherVolM1Input() {
        return this.actualOtherVolM1Input.getAttribute('value');
    }

    async setActualOtherVolM2Input(actualOtherVolM2) {
        await this.actualOtherVolM2Input.sendKeys(actualOtherVolM2);
    }

    async getActualOtherVolM2Input() {
        return this.actualOtherVolM2Input.getAttribute('value');
    }

    async setActualOtherVolM3Input(actualOtherVolM3) {
        await this.actualOtherVolM3Input.sendKeys(actualOtherVolM3);
    }

    async getActualOtherVolM3Input() {
        return this.actualOtherVolM3Input.getAttribute('value');
    }

    async setBillingAdjHittingM1Input(billingAdjHittingM1) {
        await this.billingAdjHittingM1Input.sendKeys(billingAdjHittingM1);
    }

    async getBillingAdjHittingM1Input() {
        return this.billingAdjHittingM1Input.getAttribute('value');
    }

    async setBillingAdjHittingM2Input(billingAdjHittingM2) {
        await this.billingAdjHittingM2Input.sendKeys(billingAdjHittingM2);
    }

    async getBillingAdjHittingM2Input() {
        return this.billingAdjHittingM2Input.getAttribute('value');
    }

    async setBillingAdjHittingM3Input(billingAdjHittingM3) {
        await this.billingAdjHittingM3Input.sendKeys(billingAdjHittingM3);
    }

    async getBillingAdjHittingM3Input() {
        return this.billingAdjHittingM3Input.getAttribute('value');
    }

    async setActualSpendM1UsdInput(actualSpendM1Usd) {
        await this.actualSpendM1UsdInput.sendKeys(actualSpendM1Usd);
    }

    async getActualSpendM1UsdInput() {
        return this.actualSpendM1UsdInput.getAttribute('value');
    }

    async setActualSpendM2UsdInput(actualSpendM2Usd) {
        await this.actualSpendM2UsdInput.sendKeys(actualSpendM2Usd);
    }

    async getActualSpendM2UsdInput() {
        return this.actualSpendM2UsdInput.getAttribute('value');
    }

    async setActualSpendM3UsdInput(actualSpendM3Usd) {
        await this.actualSpendM3UsdInput.sendKeys(actualSpendM3Usd);
    }

    async getActualSpendM3UsdInput() {
        return this.actualSpendM3UsdInput.getAttribute('value');
    }

    async setTotalQtrlySpendUsdInput(totalQtrlySpendUsd) {
        await this.totalQtrlySpendUsdInput.sendKeys(totalQtrlySpendUsd);
    }

    async getTotalQtrlySpendUsdInput() {
        return this.totalQtrlySpendUsdInput.getAttribute('value');
    }

    async setActualProjM1DiffUsdInput(actualProjM1DiffUsd) {
        await this.actualProjM1DiffUsdInput.sendKeys(actualProjM1DiffUsd);
    }

    async getActualProjM1DiffUsdInput() {
        return this.actualProjM1DiffUsdInput.getAttribute('value');
    }

    async setActualProjM2DiffUsdInput(actualProjM2DiffUsd) {
        await this.actualProjM2DiffUsdInput.sendKeys(actualProjM2DiffUsd);
    }

    async getActualProjM2DiffUsdInput() {
        return this.actualProjM2DiffUsdInput.getAttribute('value');
    }

    async setActualProjM3DiffUsdInput(actualProjM3DiffUsd) {
        await this.actualProjM3DiffUsdInput.sendKeys(actualProjM3DiffUsd);
    }

    async getActualProjM3DiffUsdInput() {
        return this.actualProjM3DiffUsdInput.getAttribute('value');
    }

    async setActualMilestoneM3DiffPerInput(actualMilestoneM3DiffPer) {
        await this.actualMilestoneM3DiffPerInput.sendKeys(actualMilestoneM3DiffPer);
    }

    async getActualMilestoneM3DiffPerInput() {
        return this.actualMilestoneM3DiffPerInput.getAttribute('value');
    }

    async setActualPoValueDiffPerInput(actualPoValueDiffPer) {
        await this.actualPoValueDiffPerInput.sendKeys(actualPoValueDiffPer);
    }

    async getActualPoValueDiffPerInput() {
        return this.actualPoValueDiffPerInput.getAttribute('value');
    }

    async setRetrospectiveAdjM1Input(retrospectiveAdjM1) {
        await this.retrospectiveAdjM1Input.sendKeys(retrospectiveAdjM1);
    }

    async getRetrospectiveAdjM1Input() {
        return this.retrospectiveAdjM1Input.getAttribute('value');
    }

    async setRetrospectiveAdjM2Input(retrospectiveAdjM2) {
        await this.retrospectiveAdjM2Input.sendKeys(retrospectiveAdjM2);
    }

    async getRetrospectiveAdjM2Input() {
        return this.retrospectiveAdjM2Input.getAttribute('value');
    }

    async setRetrospectiveAdjM3Input(retrospectiveAdjM3) {
        await this.retrospectiveAdjM3Input.sendKeys(retrospectiveAdjM3);
    }

    async getRetrospectiveAdjM3Input() {
        return this.retrospectiveAdjM3Input.getAttribute('value');
    }

    async setActualRetrospectiveCostM1Input(actualRetrospectiveCostM1) {
        await this.actualRetrospectiveCostM1Input.sendKeys(actualRetrospectiveCostM1);
    }

    async getActualRetrospectiveCostM1Input() {
        return this.actualRetrospectiveCostM1Input.getAttribute('value');
    }

    async setActualRetrospectiveCostM2Input(actualRetrospectiveCostM2) {
        await this.actualRetrospectiveCostM2Input.sendKeys(actualRetrospectiveCostM2);
    }

    async getActualRetrospectiveCostM2Input() {
        return this.actualRetrospectiveCostM2Input.getAttribute('value');
    }

    async setActualRetrospectiveCostM3Input(actualRetrospectiveCostM3) {
        await this.actualRetrospectiveCostM3Input.sendKeys(actualRetrospectiveCostM3);
    }

    async getActualRetrospectiveCostM3Input() {
        return this.actualRetrospectiveCostM3Input.getAttribute('value');
    }

    async setTotalQtrlyRetrospectiveCostInput(totalQtrlyRetrospectiveCost) {
        await this.totalQtrlyRetrospectiveCostInput.sendKeys(totalQtrlyRetrospectiveCost);
    }

    async getTotalQtrlyRetrospectiveCostInput() {
        return this.totalQtrlyRetrospectiveCostInput.getAttribute('value');
    }

    async setChangeImpactInput(changeImpact) {
        await this.changeImpactInput.sendKeys(changeImpact);
    }

    async getChangeImpactInput() {
        return this.changeImpactInput.getAttribute('value');
    }

    async setMethodInput(method) {
        await this.methodInput.sendKeys(method);
    }

    async getMethodInput() {
        return this.methodInput.getAttribute('value');
    }

    async setOtRateInput(otRate) {
        await this.otRateInput.sendKeys(otRate);
    }

    async getOtRateInput() {
        return this.otRateInput.getAttribute('value');
    }

    async setAppOtHrsM1Input(appOtHrsM1) {
        await this.appOtHrsM1Input.sendKeys(appOtHrsM1);
    }

    async getAppOtHrsM1Input() {
        return this.appOtHrsM1Input.getAttribute('value');
    }

    async setAppOtHrsM2Input(appOtHrsM2) {
        await this.appOtHrsM2Input.sendKeys(appOtHrsM2);
    }

    async getAppOtHrsM2Input() {
        return this.appOtHrsM2Input.getAttribute('value');
    }

    async setAppOtHrsM3Input(appOtHrsM3) {
        await this.appOtHrsM3Input.sendKeys(appOtHrsM3);
    }

    async getAppOtHrsM3Input() {
        return this.appOtHrsM3Input.getAttribute('value');
    }

    async setOtSpendM1Input(otSpendM1) {
        await this.otSpendM1Input.sendKeys(otSpendM1);
    }

    async getOtSpendM1Input() {
        return this.otSpendM1Input.getAttribute('value');
    }

    async setOtSpendM2Input(otSpendM2) {
        await this.otSpendM2Input.sendKeys(otSpendM2);
    }

    async getOtSpendM2Input() {
        return this.otSpendM2Input.getAttribute('value');
    }

    async setOtSpendM3Input(otSpendM3) {
        await this.otSpendM3Input.sendKeys(otSpendM3);
    }

    async getOtSpendM3Input() {
        return this.otSpendM3Input.getAttribute('value');
    }

    async setNotesInput(notes) {
        await this.notesInput.sendKeys(notes);
    }

    async getNotesInput() {
        return this.notesInput.getAttribute('value');
    }

    async setChrgbleStaffHrsWDNMCasesInput(chrgbleStaffHrsWDNMCases) {
        await this.chrgbleStaffHrsWDNMCasesInput.sendKeys(chrgbleStaffHrsWDNMCases);
    }

    async getChrgbleStaffHrsWDNMCasesInput() {
        return this.chrgbleStaffHrsWDNMCasesInput.getAttribute('value');
    }

    async setProjectedBillableHrsM1Input(projectedBillableHrsM1) {
        await this.projectedBillableHrsM1Input.sendKeys(projectedBillableHrsM1);
    }

    async getProjectedBillableHrsM1Input() {
        return this.projectedBillableHrsM1Input.getAttribute('value');
    }

    async setProjectedBillableHrsM2Input(projectedBillableHrsM2) {
        await this.projectedBillableHrsM2Input.sendKeys(projectedBillableHrsM2);
    }

    async getProjectedBillableHrsM2Input() {
        return this.projectedBillableHrsM2Input.getAttribute('value');
    }

    async setProjectedBillableHrsM3Input(projectedBillableHrsM3) {
        await this.projectedBillableHrsM3Input.sendKeys(projectedBillableHrsM3);
    }

    async getProjectedBillableHrsM3Input() {
        return this.projectedBillableHrsM3Input.getAttribute('value');
    }

    async setCcaVendorDataSkInput(ccaVendorDataSk) {
        await this.ccaVendorDataSkInput.sendKeys(ccaVendorDataSk);
    }

    async getCcaVendorDataSkInput() {
        return this.ccaVendorDataSkInput.getAttribute('value');
    }

    async setPayrollHourlyRateDollarInput(payrollHourlyRateDollar) {
        await this.payrollHourlyRateDollarInput.sendKeys(payrollHourlyRateDollar);
    }

    async getPayrollHourlyRateDollarInput() {
        return this.payrollHourlyRateDollarInput.getAttribute('value');
    }

    async setInfActualBillableHoursM1Input(infActualBillableHoursM1) {
        await this.infActualBillableHoursM1Input.sendKeys(infActualBillableHoursM1);
    }

    async getInfActualBillableHoursM1Input() {
        return this.infActualBillableHoursM1Input.getAttribute('value');
    }

    async setInfActualBillableHoursM2Input(infActualBillableHoursM2) {
        await this.infActualBillableHoursM2Input.sendKeys(infActualBillableHoursM2);
    }

    async getInfActualBillableHoursM2Input() {
        return this.infActualBillableHoursM2Input.getAttribute('value');
    }

    async setInfActualBillableHoursM3Input(infActualBillableHoursM3) {
        await this.infActualBillableHoursM3Input.sendKeys(infActualBillableHoursM3);
    }

    async getInfActualBillableHoursM3Input() {
        return this.infActualBillableHoursM3Input.getAttribute('value');
    }

    async setInfActualSpendM1NonUsdInput(infActualSpendM1NonUsd) {
        await this.infActualSpendM1NonUsdInput.sendKeys(infActualSpendM1NonUsd);
    }

    async getInfActualSpendM1NonUsdInput() {
        return this.infActualSpendM1NonUsdInput.getAttribute('value');
    }

    async setInfActualSpendM2NonUsdInput(infActualSpendM2NonUsd) {
        await this.infActualSpendM2NonUsdInput.sendKeys(infActualSpendM2NonUsd);
    }

    async getInfActualSpendM2NonUsdInput() {
        return this.infActualSpendM2NonUsdInput.getAttribute('value');
    }

    async setInfActualSpendM3NonUsdInput(infActualSpendM3NonUsd) {
        await this.infActualSpendM3NonUsdInput.sendKeys(infActualSpendM3NonUsd);
    }

    async getInfActualSpendM3NonUsdInput() {
        return this.infActualSpendM3NonUsdInput.getAttribute('value');
    }

    async setInfBaseAhtInput(infBaseAht) {
        await this.infBaseAhtInput.sendKeys(infBaseAht);
    }

    async getInfBaseAhtInput() {
        return this.infBaseAhtInput.getAttribute('value');
    }

    async setInfBaseHeadsInput(infBaseHeads) {
        await this.infBaseHeadsInput.sendKeys(infBaseHeads);
    }

    async getInfBaseHeadsInput() {
        return this.infBaseHeadsInput.getAttribute('value');
    }

    async setCnxBaseRateInput(cnxBaseRate) {
        await this.cnxBaseRateInput.sendKeys(cnxBaseRate);
    }

    async getCnxBaseRateInput() {
        return this.cnxBaseRateInput.getAttribute('value');
    }

    async setInfCurrencyInput(infCurrency) {
        await this.infCurrencyInput.sendKeys(infCurrency);
    }

    async getInfCurrencyInput() {
        return this.infCurrencyInput.getAttribute('value');
    }

    async setInfCurrencyHourlyRateInput(infCurrencyHourlyRate) {
        await this.infCurrencyHourlyRateInput.sendKeys(infCurrencyHourlyRate);
    }

    async getInfCurrencyHourlyRateInput() {
        return this.infCurrencyHourlyRateInput.getAttribute('value');
    }

    async setFiscalQuaterNameInput(fiscalQuaterName) {
        await this.fiscalQuaterNameInput.sendKeys(fiscalQuaterName);
    }

    async getFiscalQuaterNameInput() {
        return this.fiscalQuaterNameInput.getAttribute('value');
    }

    async setActualMilestoneM1DiffPerInput(actualMilestoneM1DiffPer) {
        await this.actualMilestoneM1DiffPerInput.sendKeys(actualMilestoneM1DiffPer);
    }

    async getActualMilestoneM1DiffPerInput() {
        return this.actualMilestoneM1DiffPerInput.getAttribute('value');
    }

    async setActualMilestoneM2DiffPerInput(actualMilestoneM2DiffPer) {
        await this.actualMilestoneM2DiffPerInput.sendKeys(actualMilestoneM2DiffPer);
    }

    async getActualMilestoneM2DiffPerInput() {
        return this.actualMilestoneM2DiffPerInput.getAttribute('value');
    }

    async setQtrlyDiffActualProjectionInput(qtrlyDiffActualProjection) {
        await this.qtrlyDiffActualProjectionInput.sendKeys(qtrlyDiffActualProjection);
    }

    async getQtrlyDiffActualProjectionInput() {
        return this.qtrlyDiffActualProjectionInput.getAttribute('value');
    }

    async setInfTotalQtrlySpendNonUsdInput(infTotalQtrlySpendNonUsd) {
        await this.infTotalQtrlySpendNonUsdInput.sendKeys(infTotalQtrlySpendNonUsd);
    }

    async getInfTotalQtrlySpendNonUsdInput() {
        return this.infTotalQtrlySpendNonUsdInput.getAttribute('value');
    }

    async setDataFlagInput(dataFlag) {
        await this.dataFlagInput.sendKeys(dataFlag);
    }

    async getDataFlagInput() {
        return this.dataFlagInput.getAttribute('value');
    }

    async setLoadDateInput(loadDate) {
        await this.loadDateInput.sendKeys(loadDate);
    }

    async getLoadDateInput() {
        return this.loadDateInput.getAttribute('value');
    }

    async setCnxBaseRateFteInput(cnxBaseRateFte) {
        await this.cnxBaseRateFteInput.sendKeys(cnxBaseRateFte);
    }

    async getCnxBaseRateFteInput() {
        return this.cnxBaseRateFteInput.getAttribute('value');
    }

    async setCnxbaseratetbpInput(cnxbaseratetbp) {
        await this.cnxbaseratetbpInput.sendKeys(cnxbaseratetbp);
    }

    async getCnxbaseratetbpInput() {
        return this.cnxbaseratetbpInput.getAttribute('value');
    }

    async save() {
        await this.saveButton.click();
    }

    async cancel() {
        await this.cancelButton.click();
    }

    getSaveButton(): ElementFinder {
        return this.saveButton;
    }
}

export class HCBTModelDeleteDialog {
    private dialogTitle = element(by.id('jhi-delete-hCBTModel-heading'));
    private confirmButton = element(by.id('jhi-confirm-delete-hCBTModel'));

    async getDialogTitle() {
        return this.dialogTitle.getText();
    }

    async clickOnConfirmButton() {
        await this.confirmButton.click();
    }
}
