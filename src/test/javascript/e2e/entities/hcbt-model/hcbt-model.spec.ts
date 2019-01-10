/* tslint:disable no-unused-expression */
import { browser, ExpectedConditions as ec, promise } from 'protractor';
import { NavBarPage, SignInPage } from '../../page-objects/jhi-page-objects';

import { HCBTModelComponentsPage, HCBTModelDeleteDialog, HCBTModelUpdatePage } from './hcbt-model.page-object';

const expect = chai.expect;

describe('HCBTModel e2e test', () => {
    let navBarPage: NavBarPage;
    let signInPage: SignInPage;
    let hCBTModelUpdatePage: HCBTModelUpdatePage;
    let hCBTModelComponentsPage: HCBTModelComponentsPage;
    let hCBTModelDeleteDialog: HCBTModelDeleteDialog;

    before(async () => {
        await browser.get('/');
        navBarPage = new NavBarPage();
        signInPage = await navBarPage.getSignInPage();
        await signInPage.autoSignInUsing('admin', 'admin');
        await browser.wait(ec.visibilityOf(navBarPage.entityMenu), 5000);
    });

    it('should load HCBTModels', async () => {
        await navBarPage.goToEntity('hcbt-model');
        hCBTModelComponentsPage = new HCBTModelComponentsPage();
        expect(await hCBTModelComponentsPage.getTitle()).to.eq('HCBT Models');
    });

    it('should load create HCBTModel page', async () => {
        await hCBTModelComponentsPage.clickOnCreateButton();
        hCBTModelUpdatePage = new HCBTModelUpdatePage();
        expect(await hCBTModelUpdatePage.getPageTitle()).to.eq('Create or edit a HCBT Model');
        await hCBTModelUpdatePage.cancel();
    });

    it('should create and save HCBTModels', async () => {
        const nbButtonsBeforeCreate = await hCBTModelComponentsPage.countDeleteButtons();

        await hCBTModelComponentsPage.clickOnCreateButton();
        await promise.all([
            hCBTModelUpdatePage.setVendorNameInput('vendorName'),
            hCBTModelUpdatePage.setVendorLocationInput('vendorLocation'),
            hCBTModelUpdatePage.setServicePillarInput('servicePillar'),
            hCBTModelUpdatePage.setServiceCategoryInput('serviceCategory'),
            hCBTModelUpdatePage.setServiceDrilldownInput('serviceDrilldown'),
            hCBTModelUpdatePage.setSowNameInput('sowName'),
            hCBTModelUpdatePage.setSowNumberInput('sowNumber'),
            hCBTModelUpdatePage.setPoNumberInput('poNumber'),
            hCBTModelUpdatePage.setDeliveryPocInput('deliveryPoc'),
            hCBTModelUpdatePage.setCiscoBusinessOwnerInput('ciscoBusinessOwner'),
            hCBTModelUpdatePage.setChrgbleAgentNumWdnmCasesInput('5'),
            hCBTModelUpdatePage.setProjectedBillableHeadsM1Input('5'),
            hCBTModelUpdatePage.setProjectedBillableHeadsM2Input('5'),
            hCBTModelUpdatePage.setProjectedBillableHeadsM3Input('5'),
            hCBTModelUpdatePage.setFteHourlyRateDollarInput('5'),
            hCBTModelUpdatePage.setProjectedTbpVolumeM1Input('5'),
            hCBTModelUpdatePage.setProjectedTbpVolumeM2Input('5'),
            hCBTModelUpdatePage.setProjectedTbpVolumeM3Input('5'),
            hCBTModelUpdatePage.setProjectedOtherVolM1Input('5'),
            hCBTModelUpdatePage.setProjectedOtherVolM2Input('5'),
            hCBTModelUpdatePage.setProjectedOtherVolM3Input('5'),
            hCBTModelUpdatePage.setAhtInMinutesInput('5'),
            hCBTModelUpdatePage.setDollarRatePerMinuteInput('5'),
            hCBTModelUpdatePage.setOtherVolumeRateInput('5'),
            hCBTModelUpdatePage.setInfMilestoneValueM1NonUsdInput('5'),
            hCBTModelUpdatePage.setInfMilestoneValueM2NonUsdInput('5'),
            hCBTModelUpdatePage.setInfMilestoneValueM3NonUsdInput('5'),
            hCBTModelUpdatePage.setInfBufferNonUsdInput('5'),
            hCBTModelUpdatePage.setInfPoAmountNonUsdInput('5'),
            hCBTModelUpdatePage.setMilestoneValueM1UsdInput('5'),
            hCBTModelUpdatePage.setMilestoneValueM2UsdInput('5'),
            hCBTModelUpdatePage.setMilestoneValueM3UsdInput('5'),
            hCBTModelUpdatePage.setBufferUsdInput('5'),
            hCBTModelUpdatePage.setPoAmountUsdInput('5'),
            hCBTModelUpdatePage.setActualBillableHeadsM1Input('5'),
            hCBTModelUpdatePage.setPayActBillableHoursM1Input('5'),
            hCBTModelUpdatePage.setActualBillableHeadsM2Input('5'),
            hCBTModelUpdatePage.setPayActBillableHoursM2Input('5'),
            hCBTModelUpdatePage.setActualBillableHeadsM3Input('5'),
            hCBTModelUpdatePage.setPayActBillableHoursM3Input('5'),
            hCBTModelUpdatePage.setActualTbpVolumeM1Input('5'),
            hCBTModelUpdatePage.setActualTbpVolumeM2Input('5'),
            hCBTModelUpdatePage.setActualTbpVolumeM3Input('5'),
            hCBTModelUpdatePage.setActualOtherVolM1Input('5'),
            hCBTModelUpdatePage.setActualOtherVolM2Input('5'),
            hCBTModelUpdatePage.setActualOtherVolM3Input('5'),
            hCBTModelUpdatePage.setBillingAdjHittingM1Input('5'),
            hCBTModelUpdatePage.setBillingAdjHittingM2Input('5'),
            hCBTModelUpdatePage.setBillingAdjHittingM3Input('5'),
            hCBTModelUpdatePage.setActualSpendM1UsdInput('5'),
            hCBTModelUpdatePage.setActualSpendM2UsdInput('5'),
            hCBTModelUpdatePage.setActualSpendM3UsdInput('5'),
            hCBTModelUpdatePage.setTotalQtrlySpendUsdInput('5'),
            hCBTModelUpdatePage.setActualProjM1DiffUsdInput('5'),
            hCBTModelUpdatePage.setActualProjM2DiffUsdInput('5'),
            hCBTModelUpdatePage.setActualProjM3DiffUsdInput('5'),
            hCBTModelUpdatePage.setActualMilestoneM3DiffPerInput('5'),
            hCBTModelUpdatePage.setActualPoValueDiffPerInput('5'),
            hCBTModelUpdatePage.setRetrospectiveAdjM1Input('5'),
            hCBTModelUpdatePage.setRetrospectiveAdjM2Input('5'),
            hCBTModelUpdatePage.setRetrospectiveAdjM3Input('5'),
            hCBTModelUpdatePage.setActualRetrospectiveCostM1Input('5'),
            hCBTModelUpdatePage.setActualRetrospectiveCostM2Input('5'),
            hCBTModelUpdatePage.setActualRetrospectiveCostM3Input('5'),
            hCBTModelUpdatePage.setTotalQtrlyRetrospectiveCostInput('5'),
            hCBTModelUpdatePage.setChangeImpactInput('changeImpact'),
            hCBTModelUpdatePage.setMethodInput('method'),
            hCBTModelUpdatePage.setOtRateInput('5'),
            hCBTModelUpdatePage.setAppOtHrsM1Input('5'),
            hCBTModelUpdatePage.setAppOtHrsM2Input('5'),
            hCBTModelUpdatePage.setAppOtHrsM3Input('5'),
            hCBTModelUpdatePage.setOtSpendM1Input('5'),
            hCBTModelUpdatePage.setOtSpendM2Input('5'),
            hCBTModelUpdatePage.setOtSpendM3Input('5'),
            hCBTModelUpdatePage.setNotesInput('notes'),
            hCBTModelUpdatePage.setChrgbleStaffHrsWDNMCasesInput('5'),
            hCBTModelUpdatePage.setProjectedBillableHrsM1Input('5'),
            hCBTModelUpdatePage.setProjectedBillableHrsM2Input('5'),
            hCBTModelUpdatePage.setProjectedBillableHrsM3Input('5'),
            hCBTModelUpdatePage.setCcaVendorDataSkInput('ccaVendorDataSk'),
            hCBTModelUpdatePage.setPayrollHourlyRateDollarInput('5'),
            hCBTModelUpdatePage.setInfActualBillableHoursM1Input('5'),
            hCBTModelUpdatePage.setInfActualBillableHoursM2Input('5'),
            hCBTModelUpdatePage.setInfActualBillableHoursM3Input('5'),
            hCBTModelUpdatePage.setInfActualSpendM1NonUsdInput('5'),
            hCBTModelUpdatePage.setInfActualSpendM2NonUsdInput('5'),
            hCBTModelUpdatePage.setInfActualSpendM3NonUsdInput('5'),
            hCBTModelUpdatePage.setInfBaseAhtInput('5'),
            hCBTModelUpdatePage.setInfBaseHeadsInput('5'),
            hCBTModelUpdatePage.setCnxBaseRateInput('5'),
            hCBTModelUpdatePage.setInfCurrencyInput('5'),
            hCBTModelUpdatePage.setInfCurrencyHourlyRateInput('5'),
            hCBTModelUpdatePage.setFiscalQuaterNameInput('fiscalQuaterName'),
            hCBTModelUpdatePage.setActualMilestoneM1DiffPerInput('5'),
            hCBTModelUpdatePage.setActualMilestoneM2DiffPerInput('5'),
            hCBTModelUpdatePage.setQtrlyDiffActualProjectionInput('5'),
            hCBTModelUpdatePage.setInfTotalQtrlySpendNonUsdInput('5'),
            hCBTModelUpdatePage.setDataFlagInput('dataFlag'),
            hCBTModelUpdatePage.setLoadDateInput('5'),
            hCBTModelUpdatePage.setCnxBaseRateFteInput('5'),
            hCBTModelUpdatePage.setCnxbaseratetbpInput('5')
        ]);
        expect(await hCBTModelUpdatePage.getVendorNameInput()).to.eq('vendorName');
        expect(await hCBTModelUpdatePage.getVendorLocationInput()).to.eq('vendorLocation');
        expect(await hCBTModelUpdatePage.getServicePillarInput()).to.eq('servicePillar');
        expect(await hCBTModelUpdatePage.getServiceCategoryInput()).to.eq('serviceCategory');
        expect(await hCBTModelUpdatePage.getServiceDrilldownInput()).to.eq('serviceDrilldown');
        expect(await hCBTModelUpdatePage.getSowNameInput()).to.eq('sowName');
        expect(await hCBTModelUpdatePage.getSowNumberInput()).to.eq('sowNumber');
        expect(await hCBTModelUpdatePage.getPoNumberInput()).to.eq('poNumber');
        expect(await hCBTModelUpdatePage.getDeliveryPocInput()).to.eq('deliveryPoc');
        expect(await hCBTModelUpdatePage.getCiscoBusinessOwnerInput()).to.eq('ciscoBusinessOwner');
        expect(await hCBTModelUpdatePage.getChrgbleAgentNumWdnmCasesInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedBillableHeadsM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedBillableHeadsM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedBillableHeadsM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getFteHourlyRateDollarInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedTbpVolumeM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedTbpVolumeM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedTbpVolumeM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedOtherVolM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedOtherVolM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedOtherVolM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getAhtInMinutesInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getDollarRatePerMinuteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getOtherVolumeRateInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfMilestoneValueM1NonUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfMilestoneValueM2NonUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfMilestoneValueM3NonUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfBufferNonUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfPoAmountNonUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getMilestoneValueM1UsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getMilestoneValueM2UsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getMilestoneValueM3UsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getBufferUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getPoAmountUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualBillableHeadsM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getPayActBillableHoursM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualBillableHeadsM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getPayActBillableHoursM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualBillableHeadsM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getPayActBillableHoursM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualTbpVolumeM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualTbpVolumeM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualTbpVolumeM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualOtherVolM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualOtherVolM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualOtherVolM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getBillingAdjHittingM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getBillingAdjHittingM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getBillingAdjHittingM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualSpendM1UsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualSpendM2UsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualSpendM3UsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getTotalQtrlySpendUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualProjM1DiffUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualProjM2DiffUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualProjM3DiffUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualMilestoneM3DiffPerInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualPoValueDiffPerInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getRetrospectiveAdjM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getRetrospectiveAdjM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getRetrospectiveAdjM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualRetrospectiveCostM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualRetrospectiveCostM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualRetrospectiveCostM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getTotalQtrlyRetrospectiveCostInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getChangeImpactInput()).to.eq('changeImpact');
        expect(await hCBTModelUpdatePage.getMethodInput()).to.eq('method');
        expect(await hCBTModelUpdatePage.getOtRateInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getAppOtHrsM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getAppOtHrsM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getAppOtHrsM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getOtSpendM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getOtSpendM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getOtSpendM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getNotesInput()).to.eq('notes');
        expect(await hCBTModelUpdatePage.getChrgbleStaffHrsWDNMCasesInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedBillableHrsM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedBillableHrsM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedBillableHrsM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getCcaVendorDataSkInput()).to.eq('ccaVendorDataSk');
        expect(await hCBTModelUpdatePage.getPayrollHourlyRateDollarInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfActualBillableHoursM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfActualBillableHoursM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfActualBillableHoursM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfActualSpendM1NonUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfActualSpendM2NonUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfActualSpendM3NonUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfBaseAhtInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfBaseHeadsInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getCnxBaseRateInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfCurrencyInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfCurrencyHourlyRateInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getFiscalQuaterNameInput()).to.eq('fiscalQuaterName');
        expect(await hCBTModelUpdatePage.getActualMilestoneM1DiffPerInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualMilestoneM2DiffPerInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getQtrlyDiffActualProjectionInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfTotalQtrlySpendNonUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getDataFlagInput()).to.eq('dataFlag');
        expect(await hCBTModelUpdatePage.getLoadDateInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getCnxBaseRateFteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getCnxbaseratetbpInput()).to.eq('5');
        await hCBTModelUpdatePage.save();
        expect(await hCBTModelUpdatePage.getSaveButton().isPresent()).to.be.false;

        expect(await hCBTModelComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeCreate + 1);
    });

    it('should delete last HCBTModel', async () => {
        const nbButtonsBeforeDelete = await hCBTModelComponentsPage.countDeleteButtons();
        await hCBTModelComponentsPage.clickOnLastDeleteButton();

        hCBTModelDeleteDialog = new HCBTModelDeleteDialog();
        expect(await hCBTModelDeleteDialog.getDialogTitle()).to.eq('Are you sure you want to delete this HCBT Model?');
        await hCBTModelDeleteDialog.clickOnConfirmButton();

        expect(await hCBTModelComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeDelete - 1);
    });

    after(async () => {
        await navBarPage.autoSignOut();
    });
});
