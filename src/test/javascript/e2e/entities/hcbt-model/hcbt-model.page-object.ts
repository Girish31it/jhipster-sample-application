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
    projectedOthVolM1TbpInput = element(by.id('field_projectedOthVolM1Tbp'));
    projectedOthVolM2TbpInput = element(by.id('field_projectedOthVolM2Tbp'));
    projectedOthVolM3TbpInput = element(by.id('field_projectedOthVolM3Tbp'));
    projectedVolM1TbpInput = element(by.id('field_projectedVolM1Tbp'));
    projectedVolM2TbpInput = element(by.id('field_projectedVolM2Tbp'));
    projectedVolM3TbpInput = element(by.id('field_projectedVolM3Tbp'));
    qtrlyDiffActualProjectionInput = element(by.id('field_qtrlyDiffActualProjection'));
    retrospectiveAdjM1Input = element(by.id('field_retrospectiveAdjM1'));
    retrospectiveAdjM2Input = element(by.id('field_retrospectiveAdjM2'));
    retrospectiveAdjM3Input = element(by.id('field_retrospectiveAdjM3'));
    serviceCategoryInput = element(by.id('field_serviceCategory'));
    serviceDrillDownInput = element(by.id('field_serviceDrillDown'));
    servicePillarInput = element(by.id('field_servicePillar'));
    sowNameInput = element(by.id('field_sowName'));
    sowNumberInput = element(by.id('field_sowNumber'));
    totalQtrlySpendUsdInput = element(by.id('field_totalQtrlySpendUsd'));
    infTotalQtrlySpendNonUsdInput = element(by.id('field_infTotalQtrlySpendNonUsd'));
    vendorNameInput = element(by.id('field_vendorName'));
    actualRetrospectiveCostM1Input = element(by.id('field_actualRetrospectiveCostM1'));
    actualRetrospectiveCostM2Input = element(by.id('field_actualRetrospectiveCostM2'));
    actualRetrospectiveCostM3Input = element(by.id('field_actualRetrospectiveCostM3'));
    totalQtrlyRetrospectiveCostInput = element(by.id('field_totalQtrlyRetrospectiveCost'));
    changeImpactInput = element(by.id('field_changeImpact'));
    notesInput = element(by.id('field_notes'));
    dataFlagInput = element(by.id('field_dataFlag'));
    loadDateInput = element(by.id('field_loadDate'));
    ccaVendorDataSkInput = element(by.id('field_ccaVendorDataSk'));
    ccaVendorDataPkInput = element(by.id('field_ccaVendorDataPk'));
    hourlyRateDollarFteInput = element(by.id('field_hourlyRateDollarFte'));
    hourlyRateDollarPhInput = element(by.id('field_hourlyRateDollarPh'));
    dollarRatePerMinuteTbpInput = element(by.id('field_dollarRatePerMinuteTbp'));
    deliveryPocInput = element(by.id('field_deliveryPoc'));
    actualBillableHeadsM1FteInput = element(by.id('field_actualBillableHeadsM1Fte'));
    actualBillableHeadsM2FteInput = element(by.id('field_actualBillableHeadsM2Fte'));
    actualBillableHeadsM3FteInput = element(by.id('field_actualBillableHeadsM3Fte'));
    actBillableHoursM1PhInput = element(by.id('field_actBillableHoursM1Ph'));
    infActBillHoursM1FteInput = element(by.id('field_infActBillHoursM1Fte'));
    actBillableHoursM2PhInput = element(by.id('field_actBillableHoursM2Ph'));
    infActBillHoursM2FteInput = element(by.id('field_infActBillHoursM2Fte'));
    actBillableHoursM3PhInput = element(by.id('field_actBillableHoursM3Ph'));
    infActBillHoursM3FteInput = element(by.id('field_infActBillHoursM3Fte'));
    actualOtherVolumeM1TbpInput = element(by.id('field_actualOtherVolumeM1Tbp'));
    actualOtherVolumeM2TbpInput = element(by.id('field_actualOtherVolumeM2Tbp'));
    actualOtherVolumeM3TbpInput = element(by.id('field_actualOtherVolumeM3Tbp'));
    actualSpendM1UsdInput = element(by.id('field_actualSpendM1Usd'));
    infActSpendM1NonUsdCurrInput = element(by.id('field_infActSpendM1NonUsdCurr'));
    actualSpendM2UsdInput = element(by.id('field_actualSpendM2Usd'));
    infActSpendM2NonUsdCurrInput = element(by.id('field_infActSpendM2NonUsdCurr'));
    actualSpendM3UsdInput = element(by.id('field_actualSpendM3Usd'));
    infActSpendM3NonUsdCurrInput = element(by.id('field_infActSpendM3NonUsdCurr'));
    actualVolumeM1TbpInput = element(by.id('field_actualVolumeM1Tbp'));
    actualVolumeM2TbpInput = element(by.id('field_actualVolumeM2Tbp'));
    actualVolumeM3TbpInput = element(by.id('field_actualVolumeM3Tbp'));
    actualPoValueDiffPerInput = element(by.id('field_actualPoValueDiffPer'));
    ahtInMinutesTbpInput = element(by.id('field_ahtInMinutesTbp'));
    appOtHrsM1Input = element(by.id('field_appOtHrsM1'));
    appOtHrsM2Input = element(by.id('field_appOtHrsM2'));
    appOtHrsM3Input = element(by.id('field_appOtHrsM3'));
    infBaseAhtInput = element(by.id('field_infBaseAht'));
    infBaseHeadsInput = element(by.id('field_infBaseHeads'));
    cnxBaseRateTbpInput = element(by.id('field_cnxBaseRateTbp'));
    cnxBaseRateFteInput = element(by.id('field_cnxBaseRateFte'));
    billingAdjHittingM1Input = element(by.id('field_billingAdjHittingM1'));
    billingAdjHittingM2Input = element(by.id('field_billingAdjHittingM2'));
    billingAdjHittingM3Input = element(by.id('field_billingAdjHittingM3'));
    bufferUsdInput = element(by.id('field_bufferUsd'));
    infBufferNonUsdCurrInput = element(by.id('field_infBufferNonUsdCurr'));
    ciscoBusinessOwnerInput = element(by.id('field_ciscoBusinessOwner'));
    infCurrencyInput = element(by.id('field_infCurrency'));
    infCurrencyHrlyRateFteInput = element(by.id('field_infCurrencyHrlyRateFte'));
    actualProjM1DiffUsdInput = element(by.id('field_actualProjM1DiffUsd'));
    actualProjM2DiffUsdInput = element(by.id('field_actualProjM2DiffUsd'));
    actualProjM3DiffUsdInput = element(by.id('field_actualProjM3DiffUsd'));
    fiscalQuarterNameInput = element(by.id('field_fiscalQuarterName'));
    vendorLocationInput = element(by.id('field_vendorLocation'));
    methodInput = element(by.id('field_method'));
    actualMilestoneM1PerInput = element(by.id('field_actualMilestoneM1Per'));
    actualMilestoneM2PerInput = element(by.id('field_actualMilestoneM2Per'));
    actualMilestoneM3PerInput = element(by.id('field_actualMilestoneM3Per'));
    milestoneValueM1UsdInput = element(by.id('field_milestoneValueM1Usd'));
    infMStonValM1NonUsdCurInput = element(by.id('field_infMStonValM1NonUsdCur'));
    milestoneValueM2UsdInput = element(by.id('field_milestoneValueM2Usd'));
    infMStonValM2NonUsdCurInput = element(by.id('field_infMStonValM2NonUsdCur'));
    milestoneValueM3UsdInput = element(by.id('field_milestoneValueM3Usd'));
    infMStonValM3NonUsdCurInput = element(by.id('field_infMStonValM3NonUsdCur'));
    cnxChrAgentNumWdnmCasesInput = element(by.id('field_cnxChrAgentNumWdnmCases'));
    cnvChrStaffHrsWdnmCasesInput = element(by.id('field_cnvChrStaffHrsWdnmCases'));
    otherVolumeRateTbpInput = element(by.id('field_otherVolumeRateTbp'));
    otRateInput = element(by.id('field_otRate'));
    otSpendM1Input = element(by.id('field_otSpendM1'));
    otSpendM2Input = element(by.id('field_otSpendM2'));
    otSpendM3Input = element(by.id('field_otSpendM3'));
    poAmountUsdInput = element(by.id('field_poAmountUsd'));
    infPoAmountNonUsdInput = element(by.id('field_infPoAmountNonUsd'));
    poNumberInput = element(by.id('field_poNumber'));
    projBillableHeadsM1FteInput = element(by.id('field_projBillableHeadsM1Fte'));
    projBillableHeadsM2FteInput = element(by.id('field_projBillableHeadsM2Fte'));
    projBillableHeadsM3FteInput = element(by.id('field_projBillableHeadsM3Fte'));
    projectedBillableHrsM1PhInput = element(by.id('field_projectedBillableHrsM1Ph'));
    projectedBillableHrsM2PhInput = element(by.id('field_projectedBillableHrsM2Ph'));
    projectedBillableHrsM3PhInput = element(by.id('field_projectedBillableHrsM3Ph'));

    async getPageTitle() {
        return this.pageTitle.getText();
    }

    async setProjectedOthVolM1TbpInput(projectedOthVolM1Tbp) {
        await this.projectedOthVolM1TbpInput.sendKeys(projectedOthVolM1Tbp);
    }

    async getProjectedOthVolM1TbpInput() {
        return this.projectedOthVolM1TbpInput.getAttribute('value');
    }

    async setProjectedOthVolM2TbpInput(projectedOthVolM2Tbp) {
        await this.projectedOthVolM2TbpInput.sendKeys(projectedOthVolM2Tbp);
    }

    async getProjectedOthVolM2TbpInput() {
        return this.projectedOthVolM2TbpInput.getAttribute('value');
    }

    async setProjectedOthVolM3TbpInput(projectedOthVolM3Tbp) {
        await this.projectedOthVolM3TbpInput.sendKeys(projectedOthVolM3Tbp);
    }

    async getProjectedOthVolM3TbpInput() {
        return this.projectedOthVolM3TbpInput.getAttribute('value');
    }

    async setProjectedVolM1TbpInput(projectedVolM1Tbp) {
        await this.projectedVolM1TbpInput.sendKeys(projectedVolM1Tbp);
    }

    async getProjectedVolM1TbpInput() {
        return this.projectedVolM1TbpInput.getAttribute('value');
    }

    async setProjectedVolM2TbpInput(projectedVolM2Tbp) {
        await this.projectedVolM2TbpInput.sendKeys(projectedVolM2Tbp);
    }

    async getProjectedVolM2TbpInput() {
        return this.projectedVolM2TbpInput.getAttribute('value');
    }

    async setProjectedVolM3TbpInput(projectedVolM3Tbp) {
        await this.projectedVolM3TbpInput.sendKeys(projectedVolM3Tbp);
    }

    async getProjectedVolM3TbpInput() {
        return this.projectedVolM3TbpInput.getAttribute('value');
    }

    async setQtrlyDiffActualProjectionInput(qtrlyDiffActualProjection) {
        await this.qtrlyDiffActualProjectionInput.sendKeys(qtrlyDiffActualProjection);
    }

    async getQtrlyDiffActualProjectionInput() {
        return this.qtrlyDiffActualProjectionInput.getAttribute('value');
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

    async setServiceCategoryInput(serviceCategory) {
        await this.serviceCategoryInput.sendKeys(serviceCategory);
    }

    async getServiceCategoryInput() {
        return this.serviceCategoryInput.getAttribute('value');
    }

    async setServiceDrillDownInput(serviceDrillDown) {
        await this.serviceDrillDownInput.sendKeys(serviceDrillDown);
    }

    async getServiceDrillDownInput() {
        return this.serviceDrillDownInput.getAttribute('value');
    }

    async setServicePillarInput(servicePillar) {
        await this.servicePillarInput.sendKeys(servicePillar);
    }

    async getServicePillarInput() {
        return this.servicePillarInput.getAttribute('value');
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

    async setTotalQtrlySpendUsdInput(totalQtrlySpendUsd) {
        await this.totalQtrlySpendUsdInput.sendKeys(totalQtrlySpendUsd);
    }

    async getTotalQtrlySpendUsdInput() {
        return this.totalQtrlySpendUsdInput.getAttribute('value');
    }

    async setInfTotalQtrlySpendNonUsdInput(infTotalQtrlySpendNonUsd) {
        await this.infTotalQtrlySpendNonUsdInput.sendKeys(infTotalQtrlySpendNonUsd);
    }

    async getInfTotalQtrlySpendNonUsdInput() {
        return this.infTotalQtrlySpendNonUsdInput.getAttribute('value');
    }

    async setVendorNameInput(vendorName) {
        await this.vendorNameInput.sendKeys(vendorName);
    }

    async getVendorNameInput() {
        return this.vendorNameInput.getAttribute('value');
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

    async setNotesInput(notes) {
        await this.notesInput.sendKeys(notes);
    }

    async getNotesInput() {
        return this.notesInput.getAttribute('value');
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

    async setCcaVendorDataSkInput(ccaVendorDataSk) {
        await this.ccaVendorDataSkInput.sendKeys(ccaVendorDataSk);
    }

    async getCcaVendorDataSkInput() {
        return this.ccaVendorDataSkInput.getAttribute('value');
    }

    async setCcaVendorDataPkInput(ccaVendorDataPk) {
        await this.ccaVendorDataPkInput.sendKeys(ccaVendorDataPk);
    }

    async getCcaVendorDataPkInput() {
        return this.ccaVendorDataPkInput.getAttribute('value');
    }

    async setHourlyRateDollarFteInput(hourlyRateDollarFte) {
        await this.hourlyRateDollarFteInput.sendKeys(hourlyRateDollarFte);
    }

    async getHourlyRateDollarFteInput() {
        return this.hourlyRateDollarFteInput.getAttribute('value');
    }

    async setHourlyRateDollarPhInput(hourlyRateDollarPh) {
        await this.hourlyRateDollarPhInput.sendKeys(hourlyRateDollarPh);
    }

    async getHourlyRateDollarPhInput() {
        return this.hourlyRateDollarPhInput.getAttribute('value');
    }

    async setDollarRatePerMinuteTbpInput(dollarRatePerMinuteTbp) {
        await this.dollarRatePerMinuteTbpInput.sendKeys(dollarRatePerMinuteTbp);
    }

    async getDollarRatePerMinuteTbpInput() {
        return this.dollarRatePerMinuteTbpInput.getAttribute('value');
    }

    async setDeliveryPocInput(deliveryPoc) {
        await this.deliveryPocInput.sendKeys(deliveryPoc);
    }

    async getDeliveryPocInput() {
        return this.deliveryPocInput.getAttribute('value');
    }

    async setActualBillableHeadsM1FteInput(actualBillableHeadsM1Fte) {
        await this.actualBillableHeadsM1FteInput.sendKeys(actualBillableHeadsM1Fte);
    }

    async getActualBillableHeadsM1FteInput() {
        return this.actualBillableHeadsM1FteInput.getAttribute('value');
    }

    async setActualBillableHeadsM2FteInput(actualBillableHeadsM2Fte) {
        await this.actualBillableHeadsM2FteInput.sendKeys(actualBillableHeadsM2Fte);
    }

    async getActualBillableHeadsM2FteInput() {
        return this.actualBillableHeadsM2FteInput.getAttribute('value');
    }

    async setActualBillableHeadsM3FteInput(actualBillableHeadsM3Fte) {
        await this.actualBillableHeadsM3FteInput.sendKeys(actualBillableHeadsM3Fte);
    }

    async getActualBillableHeadsM3FteInput() {
        return this.actualBillableHeadsM3FteInput.getAttribute('value');
    }

    async setActBillableHoursM1PhInput(actBillableHoursM1Ph) {
        await this.actBillableHoursM1PhInput.sendKeys(actBillableHoursM1Ph);
    }

    async getActBillableHoursM1PhInput() {
        return this.actBillableHoursM1PhInput.getAttribute('value');
    }

    async setInfActBillHoursM1FteInput(infActBillHoursM1Fte) {
        await this.infActBillHoursM1FteInput.sendKeys(infActBillHoursM1Fte);
    }

    async getInfActBillHoursM1FteInput() {
        return this.infActBillHoursM1FteInput.getAttribute('value');
    }

    async setActBillableHoursM2PhInput(actBillableHoursM2Ph) {
        await this.actBillableHoursM2PhInput.sendKeys(actBillableHoursM2Ph);
    }

    async getActBillableHoursM2PhInput() {
        return this.actBillableHoursM2PhInput.getAttribute('value');
    }

    async setInfActBillHoursM2FteInput(infActBillHoursM2Fte) {
        await this.infActBillHoursM2FteInput.sendKeys(infActBillHoursM2Fte);
    }

    async getInfActBillHoursM2FteInput() {
        return this.infActBillHoursM2FteInput.getAttribute('value');
    }

    async setActBillableHoursM3PhInput(actBillableHoursM3Ph) {
        await this.actBillableHoursM3PhInput.sendKeys(actBillableHoursM3Ph);
    }

    async getActBillableHoursM3PhInput() {
        return this.actBillableHoursM3PhInput.getAttribute('value');
    }

    async setInfActBillHoursM3FteInput(infActBillHoursM3Fte) {
        await this.infActBillHoursM3FteInput.sendKeys(infActBillHoursM3Fte);
    }

    async getInfActBillHoursM3FteInput() {
        return this.infActBillHoursM3FteInput.getAttribute('value');
    }

    async setActualOtherVolumeM1TbpInput(actualOtherVolumeM1Tbp) {
        await this.actualOtherVolumeM1TbpInput.sendKeys(actualOtherVolumeM1Tbp);
    }

    async getActualOtherVolumeM1TbpInput() {
        return this.actualOtherVolumeM1TbpInput.getAttribute('value');
    }

    async setActualOtherVolumeM2TbpInput(actualOtherVolumeM2Tbp) {
        await this.actualOtherVolumeM2TbpInput.sendKeys(actualOtherVolumeM2Tbp);
    }

    async getActualOtherVolumeM2TbpInput() {
        return this.actualOtherVolumeM2TbpInput.getAttribute('value');
    }

    async setActualOtherVolumeM3TbpInput(actualOtherVolumeM3Tbp) {
        await this.actualOtherVolumeM3TbpInput.sendKeys(actualOtherVolumeM3Tbp);
    }

    async getActualOtherVolumeM3TbpInput() {
        return this.actualOtherVolumeM3TbpInput.getAttribute('value');
    }

    async setActualSpendM1UsdInput(actualSpendM1Usd) {
        await this.actualSpendM1UsdInput.sendKeys(actualSpendM1Usd);
    }

    async getActualSpendM1UsdInput() {
        return this.actualSpendM1UsdInput.getAttribute('value');
    }

    async setInfActSpendM1NonUsdCurrInput(infActSpendM1NonUsdCurr) {
        await this.infActSpendM1NonUsdCurrInput.sendKeys(infActSpendM1NonUsdCurr);
    }

    async getInfActSpendM1NonUsdCurrInput() {
        return this.infActSpendM1NonUsdCurrInput.getAttribute('value');
    }

    async setActualSpendM2UsdInput(actualSpendM2Usd) {
        await this.actualSpendM2UsdInput.sendKeys(actualSpendM2Usd);
    }

    async getActualSpendM2UsdInput() {
        return this.actualSpendM2UsdInput.getAttribute('value');
    }

    async setInfActSpendM2NonUsdCurrInput(infActSpendM2NonUsdCurr) {
        await this.infActSpendM2NonUsdCurrInput.sendKeys(infActSpendM2NonUsdCurr);
    }

    async getInfActSpendM2NonUsdCurrInput() {
        return this.infActSpendM2NonUsdCurrInput.getAttribute('value');
    }

    async setActualSpendM3UsdInput(actualSpendM3Usd) {
        await this.actualSpendM3UsdInput.sendKeys(actualSpendM3Usd);
    }

    async getActualSpendM3UsdInput() {
        return this.actualSpendM3UsdInput.getAttribute('value');
    }

    async setInfActSpendM3NonUsdCurrInput(infActSpendM3NonUsdCurr) {
        await this.infActSpendM3NonUsdCurrInput.sendKeys(infActSpendM3NonUsdCurr);
    }

    async getInfActSpendM3NonUsdCurrInput() {
        return this.infActSpendM3NonUsdCurrInput.getAttribute('value');
    }

    async setActualVolumeM1TbpInput(actualVolumeM1Tbp) {
        await this.actualVolumeM1TbpInput.sendKeys(actualVolumeM1Tbp);
    }

    async getActualVolumeM1TbpInput() {
        return this.actualVolumeM1TbpInput.getAttribute('value');
    }

    async setActualVolumeM2TbpInput(actualVolumeM2Tbp) {
        await this.actualVolumeM2TbpInput.sendKeys(actualVolumeM2Tbp);
    }

    async getActualVolumeM2TbpInput() {
        return this.actualVolumeM2TbpInput.getAttribute('value');
    }

    async setActualVolumeM3TbpInput(actualVolumeM3Tbp) {
        await this.actualVolumeM3TbpInput.sendKeys(actualVolumeM3Tbp);
    }

    async getActualVolumeM3TbpInput() {
        return this.actualVolumeM3TbpInput.getAttribute('value');
    }

    async setActualPoValueDiffPerInput(actualPoValueDiffPer) {
        await this.actualPoValueDiffPerInput.sendKeys(actualPoValueDiffPer);
    }

    async getActualPoValueDiffPerInput() {
        return this.actualPoValueDiffPerInput.getAttribute('value');
    }

    async setAhtInMinutesTbpInput(ahtInMinutesTbp) {
        await this.ahtInMinutesTbpInput.sendKeys(ahtInMinutesTbp);
    }

    async getAhtInMinutesTbpInput() {
        return this.ahtInMinutesTbpInput.getAttribute('value');
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

    async setCnxBaseRateTbpInput(cnxBaseRateTbp) {
        await this.cnxBaseRateTbpInput.sendKeys(cnxBaseRateTbp);
    }

    async getCnxBaseRateTbpInput() {
        return this.cnxBaseRateTbpInput.getAttribute('value');
    }

    async setCnxBaseRateFteInput(cnxBaseRateFte) {
        await this.cnxBaseRateFteInput.sendKeys(cnxBaseRateFte);
    }

    async getCnxBaseRateFteInput() {
        return this.cnxBaseRateFteInput.getAttribute('value');
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

    async setBufferUsdInput(bufferUsd) {
        await this.bufferUsdInput.sendKeys(bufferUsd);
    }

    async getBufferUsdInput() {
        return this.bufferUsdInput.getAttribute('value');
    }

    async setInfBufferNonUsdCurrInput(infBufferNonUsdCurr) {
        await this.infBufferNonUsdCurrInput.sendKeys(infBufferNonUsdCurr);
    }

    async getInfBufferNonUsdCurrInput() {
        return this.infBufferNonUsdCurrInput.getAttribute('value');
    }

    async setCiscoBusinessOwnerInput(ciscoBusinessOwner) {
        await this.ciscoBusinessOwnerInput.sendKeys(ciscoBusinessOwner);
    }

    async getCiscoBusinessOwnerInput() {
        return this.ciscoBusinessOwnerInput.getAttribute('value');
    }

    async setInfCurrencyInput(infCurrency) {
        await this.infCurrencyInput.sendKeys(infCurrency);
    }

    async getInfCurrencyInput() {
        return this.infCurrencyInput.getAttribute('value');
    }

    async setInfCurrencyHrlyRateFteInput(infCurrencyHrlyRateFte) {
        await this.infCurrencyHrlyRateFteInput.sendKeys(infCurrencyHrlyRateFte);
    }

    async getInfCurrencyHrlyRateFteInput() {
        return this.infCurrencyHrlyRateFteInput.getAttribute('value');
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

    async setFiscalQuarterNameInput(fiscalQuarterName) {
        await this.fiscalQuarterNameInput.sendKeys(fiscalQuarterName);
    }

    async getFiscalQuarterNameInput() {
        return this.fiscalQuarterNameInput.getAttribute('value');
    }

    async setVendorLocationInput(vendorLocation) {
        await this.vendorLocationInput.sendKeys(vendorLocation);
    }

    async getVendorLocationInput() {
        return this.vendorLocationInput.getAttribute('value');
    }

    async setMethodInput(method) {
        await this.methodInput.sendKeys(method);
    }

    async getMethodInput() {
        return this.methodInput.getAttribute('value');
    }

    async setActualMilestoneM1PerInput(actualMilestoneM1Per) {
        await this.actualMilestoneM1PerInput.sendKeys(actualMilestoneM1Per);
    }

    async getActualMilestoneM1PerInput() {
        return this.actualMilestoneM1PerInput.getAttribute('value');
    }

    async setActualMilestoneM2PerInput(actualMilestoneM2Per) {
        await this.actualMilestoneM2PerInput.sendKeys(actualMilestoneM2Per);
    }

    async getActualMilestoneM2PerInput() {
        return this.actualMilestoneM2PerInput.getAttribute('value');
    }

    async setActualMilestoneM3PerInput(actualMilestoneM3Per) {
        await this.actualMilestoneM3PerInput.sendKeys(actualMilestoneM3Per);
    }

    async getActualMilestoneM3PerInput() {
        return this.actualMilestoneM3PerInput.getAttribute('value');
    }

    async setMilestoneValueM1UsdInput(milestoneValueM1Usd) {
        await this.milestoneValueM1UsdInput.sendKeys(milestoneValueM1Usd);
    }

    async getMilestoneValueM1UsdInput() {
        return this.milestoneValueM1UsdInput.getAttribute('value');
    }

    async setInfMStonValM1NonUsdCurInput(infMStonValM1NonUsdCur) {
        await this.infMStonValM1NonUsdCurInput.sendKeys(infMStonValM1NonUsdCur);
    }

    async getInfMStonValM1NonUsdCurInput() {
        return this.infMStonValM1NonUsdCurInput.getAttribute('value');
    }

    async setMilestoneValueM2UsdInput(milestoneValueM2Usd) {
        await this.milestoneValueM2UsdInput.sendKeys(milestoneValueM2Usd);
    }

    async getMilestoneValueM2UsdInput() {
        return this.milestoneValueM2UsdInput.getAttribute('value');
    }

    async setInfMStonValM2NonUsdCurInput(infMStonValM2NonUsdCur) {
        await this.infMStonValM2NonUsdCurInput.sendKeys(infMStonValM2NonUsdCur);
    }

    async getInfMStonValM2NonUsdCurInput() {
        return this.infMStonValM2NonUsdCurInput.getAttribute('value');
    }

    async setMilestoneValueM3UsdInput(milestoneValueM3Usd) {
        await this.milestoneValueM3UsdInput.sendKeys(milestoneValueM3Usd);
    }

    async getMilestoneValueM3UsdInput() {
        return this.milestoneValueM3UsdInput.getAttribute('value');
    }

    async setInfMStonValM3NonUsdCurInput(infMStonValM3NonUsdCur) {
        await this.infMStonValM3NonUsdCurInput.sendKeys(infMStonValM3NonUsdCur);
    }

    async getInfMStonValM3NonUsdCurInput() {
        return this.infMStonValM3NonUsdCurInput.getAttribute('value');
    }

    async setCnxChrAgentNumWdnmCasesInput(cnxChrAgentNumWdnmCases) {
        await this.cnxChrAgentNumWdnmCasesInput.sendKeys(cnxChrAgentNumWdnmCases);
    }

    async getCnxChrAgentNumWdnmCasesInput() {
        return this.cnxChrAgentNumWdnmCasesInput.getAttribute('value');
    }

    async setCnvChrStaffHrsWdnmCasesInput(cnvChrStaffHrsWdnmCases) {
        await this.cnvChrStaffHrsWdnmCasesInput.sendKeys(cnvChrStaffHrsWdnmCases);
    }

    async getCnvChrStaffHrsWdnmCasesInput() {
        return this.cnvChrStaffHrsWdnmCasesInput.getAttribute('value');
    }

    async setOtherVolumeRateTbpInput(otherVolumeRateTbp) {
        await this.otherVolumeRateTbpInput.sendKeys(otherVolumeRateTbp);
    }

    async getOtherVolumeRateTbpInput() {
        return this.otherVolumeRateTbpInput.getAttribute('value');
    }

    async setOtRateInput(otRate) {
        await this.otRateInput.sendKeys(otRate);
    }

    async getOtRateInput() {
        return this.otRateInput.getAttribute('value');
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

    async setPoAmountUsdInput(poAmountUsd) {
        await this.poAmountUsdInput.sendKeys(poAmountUsd);
    }

    async getPoAmountUsdInput() {
        return this.poAmountUsdInput.getAttribute('value');
    }

    async setInfPoAmountNonUsdInput(infPoAmountNonUsd) {
        await this.infPoAmountNonUsdInput.sendKeys(infPoAmountNonUsd);
    }

    async getInfPoAmountNonUsdInput() {
        return this.infPoAmountNonUsdInput.getAttribute('value');
    }

    async setPoNumberInput(poNumber) {
        await this.poNumberInput.sendKeys(poNumber);
    }

    async getPoNumberInput() {
        return this.poNumberInput.getAttribute('value');
    }

    async setProjBillableHeadsM1FteInput(projBillableHeadsM1Fte) {
        await this.projBillableHeadsM1FteInput.sendKeys(projBillableHeadsM1Fte);
    }

    async getProjBillableHeadsM1FteInput() {
        return this.projBillableHeadsM1FteInput.getAttribute('value');
    }

    async setProjBillableHeadsM2FteInput(projBillableHeadsM2Fte) {
        await this.projBillableHeadsM2FteInput.sendKeys(projBillableHeadsM2Fte);
    }

    async getProjBillableHeadsM2FteInput() {
        return this.projBillableHeadsM2FteInput.getAttribute('value');
    }

    async setProjBillableHeadsM3FteInput(projBillableHeadsM3Fte) {
        await this.projBillableHeadsM3FteInput.sendKeys(projBillableHeadsM3Fte);
    }

    async getProjBillableHeadsM3FteInput() {
        return this.projBillableHeadsM3FteInput.getAttribute('value');
    }

    async setProjectedBillableHrsM1PhInput(projectedBillableHrsM1Ph) {
        await this.projectedBillableHrsM1PhInput.sendKeys(projectedBillableHrsM1Ph);
    }

    async getProjectedBillableHrsM1PhInput() {
        return this.projectedBillableHrsM1PhInput.getAttribute('value');
    }

    async setProjectedBillableHrsM2PhInput(projectedBillableHrsM2Ph) {
        await this.projectedBillableHrsM2PhInput.sendKeys(projectedBillableHrsM2Ph);
    }

    async getProjectedBillableHrsM2PhInput() {
        return this.projectedBillableHrsM2PhInput.getAttribute('value');
    }

    async setProjectedBillableHrsM3PhInput(projectedBillableHrsM3Ph) {
        await this.projectedBillableHrsM3PhInput.sendKeys(projectedBillableHrsM3Ph);
    }

    async getProjectedBillableHrsM3PhInput() {
        return this.projectedBillableHrsM3PhInput.getAttribute('value');
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
