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
            hCBTModelUpdatePage.setProjectedOthVolM1TbpInput('5'),
            hCBTModelUpdatePage.setProjectedOthVolM2TbpInput('5'),
            hCBTModelUpdatePage.setProjectedOthVolM3TbpInput('5'),
            hCBTModelUpdatePage.setProjectedVolM1TbpInput('5'),
            hCBTModelUpdatePage.setProjectedVolM2TbpInput('5'),
            hCBTModelUpdatePage.setProjectedVolM3TbpInput('5'),
            hCBTModelUpdatePage.setQtrlyDiffActualProjectionInput('5'),
            hCBTModelUpdatePage.setRetrospectiveAdjM1Input('5'),
            hCBTModelUpdatePage.setRetrospectiveAdjM2Input('5'),
            hCBTModelUpdatePage.setRetrospectiveAdjM3Input('5'),
            hCBTModelUpdatePage.setServiceCategoryInput('serviceCategory'),
            hCBTModelUpdatePage.setServiceDrillDownInput('serviceDrillDown'),
            hCBTModelUpdatePage.setServicePillarInput('servicePillar'),
            hCBTModelUpdatePage.setSowNameInput('sowName'),
            hCBTModelUpdatePage.setSowNumberInput('sowNumber'),
            hCBTModelUpdatePage.setTotalQtrlySpendUsdInput('5'),
            hCBTModelUpdatePage.setInfTotalQtrlySpendNonUsdInput('5'),
            hCBTModelUpdatePage.setVendorNameInput('vendorName'),
            hCBTModelUpdatePage.setActualRetrospectiveCostM1Input('5'),
            hCBTModelUpdatePage.setActualRetrospectiveCostM2Input('5'),
            hCBTModelUpdatePage.setActualRetrospectiveCostM3Input('5'),
            hCBTModelUpdatePage.setTotalQtrlyRetrospectiveCostInput('5'),
            hCBTModelUpdatePage.setChangeImpactInput('changeImpact'),
            hCBTModelUpdatePage.setNotesInput('notes'),
            hCBTModelUpdatePage.setDataFlagInput('dataFlag'),
            hCBTModelUpdatePage.setLoadDateInput('2000-12-31'),
            hCBTModelUpdatePage.setCcaVendorDataSkInput('5'),
            hCBTModelUpdatePage.setCcaVendorDataPkInput('ccaVendorDataPk'),
            hCBTModelUpdatePage.setHourlyRateDollarFteInput('5'),
            hCBTModelUpdatePage.setHourlyRateDollarPhInput('5'),
            hCBTModelUpdatePage.setDollarRatePerMinuteTbpInput('5'),
            hCBTModelUpdatePage.setDeliveryPocInput('deliveryPoc'),
            hCBTModelUpdatePage.setActualBillableHeadsM1FteInput('5'),
            hCBTModelUpdatePage.setActualBillableHeadsM2FteInput('5'),
            hCBTModelUpdatePage.setActualBillableHeadsM3FteInput('5'),
            hCBTModelUpdatePage.setActBillableHoursM1PhInput('5'),
            hCBTModelUpdatePage.setInfActBillHoursM1FteInput('5'),
            hCBTModelUpdatePage.setActBillableHoursM2PhInput('5'),
            hCBTModelUpdatePage.setInfActBillHoursM2FteInput('5'),
            hCBTModelUpdatePage.setActBillableHoursM3PhInput('5'),
            hCBTModelUpdatePage.setInfActBillHoursM3FteInput('5'),
            hCBTModelUpdatePage.setActualOtherVolumeM1TbpInput('5'),
            hCBTModelUpdatePage.setActualOtherVolumeM2TbpInput('5'),
            hCBTModelUpdatePage.setActualOtherVolumeM3TbpInput('5'),
            hCBTModelUpdatePage.setActualSpendM1UsdInput('5'),
            hCBTModelUpdatePage.setInfActSpendM1NonUsdCurrInput('5'),
            hCBTModelUpdatePage.setActualSpendM2UsdInput('5'),
            hCBTModelUpdatePage.setInfActSpendM2NonUsdCurrInput('5'),
            hCBTModelUpdatePage.setActualSpendM3UsdInput('5'),
            hCBTModelUpdatePage.setInfActSpendM3NonUsdCurrInput('5'),
            hCBTModelUpdatePage.setActualVolumeM1TbpInput('5'),
            hCBTModelUpdatePage.setActualVolumeM2TbpInput('5'),
            hCBTModelUpdatePage.setActualVolumeM3TbpInput('5'),
            hCBTModelUpdatePage.setActualPoValueDiffPerInput('5'),
            hCBTModelUpdatePage.setAhtInMinutesTbpInput('5'),
            hCBTModelUpdatePage.setAppOtHrsM1Input('5'),
            hCBTModelUpdatePage.setAppOtHrsM2Input('5'),
            hCBTModelUpdatePage.setAppOtHrsM3Input('5'),
            hCBTModelUpdatePage.setInfBaseAhtInput('5'),
            hCBTModelUpdatePage.setInfBaseHeadsInput('infBaseHeads'),
            hCBTModelUpdatePage.setCnxBaseRateTbpInput('5'),
            hCBTModelUpdatePage.setCnxBaseRateFteInput('5'),
            hCBTModelUpdatePage.setBillingAdjHittingM1Input('5'),
            hCBTModelUpdatePage.setBillingAdjHittingM2Input('5'),
            hCBTModelUpdatePage.setBillingAdjHittingM3Input('5'),
            hCBTModelUpdatePage.setBufferUsdInput('5'),
            hCBTModelUpdatePage.setInfBufferNonUsdCurrInput('5'),
            hCBTModelUpdatePage.setCiscoBusinessOwnerInput('ciscoBusinessOwner'),
            hCBTModelUpdatePage.setInfCurrencyInput('infCurrency'),
            hCBTModelUpdatePage.setInfCurrencyHrlyRateFteInput('5'),
            hCBTModelUpdatePage.setActualProjM1DiffUsdInput('5'),
            hCBTModelUpdatePage.setActualProjM2DiffUsdInput('5'),
            hCBTModelUpdatePage.setActualProjM3DiffUsdInput('5'),
            hCBTModelUpdatePage.setFiscalQuarterNameInput('fiscalQuarterName'),
            hCBTModelUpdatePage.setVendorLocationInput('vendorLocation'),
            hCBTModelUpdatePage.setMethodInput('method'),
            hCBTModelUpdatePage.setActualMilestoneM1PerInput('5'),
            hCBTModelUpdatePage.setActualMilestoneM2PerInput('5'),
            hCBTModelUpdatePage.setActualMilestoneM3PerInput('5'),
            hCBTModelUpdatePage.setMilestoneValueM1UsdInput('5'),
            hCBTModelUpdatePage.setInfMStonValM1NonUsdCurInput('5'),
            hCBTModelUpdatePage.setMilestoneValueM2UsdInput('5'),
            hCBTModelUpdatePage.setInfMStonValM2NonUsdCurInput('5'),
            hCBTModelUpdatePage.setMilestoneValueM3UsdInput('5'),
            hCBTModelUpdatePage.setInfMStonValM3NonUsdCurInput('5'),
            hCBTModelUpdatePage.setCnxChrAgentNumWdnmCasesInput('5'),
            hCBTModelUpdatePage.setCnvChrStaffHrsWdnmCasesInput('5'),
            hCBTModelUpdatePage.setOtherVolumeRateTbpInput('5'),
            hCBTModelUpdatePage.setOtRateInput('5'),
            hCBTModelUpdatePage.setOtSpendM1Input('5'),
            hCBTModelUpdatePage.setOtSpendM2Input('5'),
            hCBTModelUpdatePage.setOtSpendM3Input('5'),
            hCBTModelUpdatePage.setPoAmountUsdInput('5'),
            hCBTModelUpdatePage.setInfPoAmountNonUsdInput('5'),
            hCBTModelUpdatePage.setPoNumberInput('poNumber'),
            hCBTModelUpdatePage.setProjBillableHeadsM1FteInput('5'),
            hCBTModelUpdatePage.setProjBillableHeadsM2FteInput('5'),
            hCBTModelUpdatePage.setProjBillableHeadsM3FteInput('5'),
            hCBTModelUpdatePage.setProjectedBillableHrsM1PhInput('5'),
            hCBTModelUpdatePage.setProjectedBillableHrsM2PhInput('5'),
            hCBTModelUpdatePage.setProjectedBillableHrsM3PhInput('5')
        ]);
        expect(await hCBTModelUpdatePage.getProjectedOthVolM1TbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedOthVolM2TbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedOthVolM3TbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedVolM1TbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedVolM2TbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedVolM3TbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getQtrlyDiffActualProjectionInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getRetrospectiveAdjM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getRetrospectiveAdjM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getRetrospectiveAdjM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getServiceCategoryInput()).to.eq('serviceCategory');
        expect(await hCBTModelUpdatePage.getServiceDrillDownInput()).to.eq('serviceDrillDown');
        expect(await hCBTModelUpdatePage.getServicePillarInput()).to.eq('servicePillar');
        expect(await hCBTModelUpdatePage.getSowNameInput()).to.eq('sowName');
        expect(await hCBTModelUpdatePage.getSowNumberInput()).to.eq('sowNumber');
        expect(await hCBTModelUpdatePage.getTotalQtrlySpendUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfTotalQtrlySpendNonUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getVendorNameInput()).to.eq('vendorName');
        expect(await hCBTModelUpdatePage.getActualRetrospectiveCostM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualRetrospectiveCostM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualRetrospectiveCostM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getTotalQtrlyRetrospectiveCostInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getChangeImpactInput()).to.eq('changeImpact');
        expect(await hCBTModelUpdatePage.getNotesInput()).to.eq('notes');
        expect(await hCBTModelUpdatePage.getDataFlagInput()).to.eq('dataFlag');
        expect(await hCBTModelUpdatePage.getLoadDateInput()).to.eq('2000-12-31');
        expect(await hCBTModelUpdatePage.getCcaVendorDataSkInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getCcaVendorDataPkInput()).to.eq('ccaVendorDataPk');
        expect(await hCBTModelUpdatePage.getHourlyRateDollarFteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getHourlyRateDollarPhInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getDollarRatePerMinuteTbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getDeliveryPocInput()).to.eq('deliveryPoc');
        expect(await hCBTModelUpdatePage.getActualBillableHeadsM1FteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualBillableHeadsM2FteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualBillableHeadsM3FteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActBillableHoursM1PhInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfActBillHoursM1FteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActBillableHoursM2PhInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfActBillHoursM2FteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActBillableHoursM3PhInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfActBillHoursM3FteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualOtherVolumeM1TbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualOtherVolumeM2TbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualOtherVolumeM3TbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualSpendM1UsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfActSpendM1NonUsdCurrInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualSpendM2UsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfActSpendM2NonUsdCurrInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualSpendM3UsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfActSpendM3NonUsdCurrInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualVolumeM1TbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualVolumeM2TbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualVolumeM3TbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualPoValueDiffPerInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getAhtInMinutesTbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getAppOtHrsM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getAppOtHrsM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getAppOtHrsM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfBaseAhtInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfBaseHeadsInput()).to.eq('infBaseHeads');
        expect(await hCBTModelUpdatePage.getCnxBaseRateTbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getCnxBaseRateFteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getBillingAdjHittingM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getBillingAdjHittingM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getBillingAdjHittingM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getBufferUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfBufferNonUsdCurrInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getCiscoBusinessOwnerInput()).to.eq('ciscoBusinessOwner');
        expect(await hCBTModelUpdatePage.getInfCurrencyInput()).to.eq('infCurrency');
        expect(await hCBTModelUpdatePage.getInfCurrencyHrlyRateFteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualProjM1DiffUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualProjM2DiffUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualProjM3DiffUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getFiscalQuarterNameInput()).to.eq('fiscalQuarterName');
        expect(await hCBTModelUpdatePage.getVendorLocationInput()).to.eq('vendorLocation');
        expect(await hCBTModelUpdatePage.getMethodInput()).to.eq('method');
        expect(await hCBTModelUpdatePage.getActualMilestoneM1PerInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualMilestoneM2PerInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getActualMilestoneM3PerInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getMilestoneValueM1UsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfMStonValM1NonUsdCurInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getMilestoneValueM2UsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfMStonValM2NonUsdCurInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getMilestoneValueM3UsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfMStonValM3NonUsdCurInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getCnxChrAgentNumWdnmCasesInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getCnvChrStaffHrsWdnmCasesInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getOtherVolumeRateTbpInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getOtRateInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getOtSpendM1Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getOtSpendM2Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getOtSpendM3Input()).to.eq('5');
        expect(await hCBTModelUpdatePage.getPoAmountUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getInfPoAmountNonUsdInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getPoNumberInput()).to.eq('poNumber');
        expect(await hCBTModelUpdatePage.getProjBillableHeadsM1FteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjBillableHeadsM2FteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjBillableHeadsM3FteInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedBillableHrsM1PhInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedBillableHrsM2PhInput()).to.eq('5');
        expect(await hCBTModelUpdatePage.getProjectedBillableHrsM3PhInput()).to.eq('5');
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
