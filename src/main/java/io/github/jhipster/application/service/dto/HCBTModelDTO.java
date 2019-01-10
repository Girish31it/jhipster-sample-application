package io.github.jhipster.application.service.dto;

import java.time.LocalDate;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the HCBTModel entity.
 */
public class HCBTModelDTO implements Serializable {

    private Long id;

    private Integer projectedOthVolM1Tbp;

    private Integer projectedOthVolM2Tbp;

    private Integer projectedOthVolM3Tbp;

    private Integer projectedVolM1Tbp;

    private Integer projectedVolM2Tbp;

    private Integer projectedVolM3Tbp;

    private Integer qtrlyDiffActualProjection;

    private Integer retrospectiveAdjM1;

    private Integer retrospectiveAdjM2;

    private Integer retrospectiveAdjM3;

    private String serviceCategory;

    private String serviceDrillDown;

    private String servicePillar;

    private String sowName;

    private String sowNumber;

    private Integer totalQtrlySpendUsd;

    private Integer infTotalQtrlySpendNonUsd;

    private String vendorName;

    private Integer actualRetrospectiveCostM1;

    private Integer actualRetrospectiveCostM2;

    private Integer actualRetrospectiveCostM3;

    private Integer totalQtrlyRetrospectiveCost;

    private String changeImpact;

    private String notes;

    private String dataFlag;

    private LocalDate loadDate;

    private Integer ccaVendorDataSk;

    private String ccaVendorDataPk;

    private Integer hourlyRateDollarFte;

    private Integer hourlyRateDollarPh;

    private Integer dollarRatePerMinuteTbp;

    private String deliveryPoc;

    private Integer actualBillableHeadsM1Fte;

    private Integer actualBillableHeadsM2Fte;

    private Integer actualBillableHeadsM3Fte;

    private Integer actBillableHoursM1Ph;

    private Integer infActBillHoursM1Fte;

    private Integer actBillableHoursM2Ph;

    private Integer infActBillHoursM2Fte;

    private Integer actBillableHoursM3Ph;

    private Integer infActBillHoursM3Fte;

    private Integer actualOtherVolumeM1Tbp;

    private Integer actualOtherVolumeM2Tbp;

    private Integer actualOtherVolumeM3Tbp;

    private Integer actualSpendM1Usd;

    private Double infActSpendM1NonUsdCurr;

    private Integer actualSpendM2Usd;

    private Double infActSpendM2NonUsdCurr;

    private Integer actualSpendM3Usd;

    private Double infActSpendM3NonUsdCurr;

    private Integer actualVolumeM1Tbp;

    private Integer actualVolumeM2Tbp;

    private Integer actualVolumeM3Tbp;

    private Integer actualPoValueDiffPer;

    private Integer ahtInMinutesTbp;

    private Integer appOtHrsM1;

    private Integer appOtHrsM2;

    private Integer appOtHrsM3;

    private Integer infBaseAht;

    private String infBaseHeads;

    private Integer cnxBaseRateTbp;

    private Integer cnxBaseRateFte;

    private Integer billingAdjHittingM1;

    private Integer billingAdjHittingM2;

    private Integer billingAdjHittingM3;

    private Integer bufferUsd;

    private Double infBufferNonUsdCurr;

    private String ciscoBusinessOwner;

    private String infCurrency;

    private Integer infCurrencyHrlyRateFte;

    private Integer actualProjM1DiffUsd;

    private Integer actualProjM2DiffUsd;

    private Integer actualProjM3DiffUsd;

    private String fiscalQuarterName;

    private String vendorLocation;

    private String method;

    private Integer actualMilestoneM1Per;

    private Integer actualMilestoneM2Per;

    private Integer actualMilestoneM3Per;

    private Integer milestoneValueM1Usd;

    private Double infMStonValM1NonUsdCur;

    private Integer milestoneValueM2Usd;

    private Double infMStonValM2NonUsdCur;

    private Integer milestoneValueM3Usd;

    private Double infMStonValM3NonUsdCur;

    private Integer cnxChrAgentNumWdnmCases;

    private Integer cnvChrStaffHrsWdnmCases;

    private Integer otherVolumeRateTbp;

    private Integer otRate;

    private Integer otSpendM1;

    private Integer otSpendM2;

    private Integer otSpendM3;

    private Integer poAmountUsd;

    private Integer infPoAmountNonUsd;

    private String poNumber;

    private Integer projBillableHeadsM1Fte;

    private Integer projBillableHeadsM2Fte;

    private Integer projBillableHeadsM3Fte;

    private Integer projectedBillableHrsM1Ph;

    private Integer projectedBillableHrsM2Ph;

    private Integer projectedBillableHrsM3Ph;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProjectedOthVolM1Tbp() {
        return projectedOthVolM1Tbp;
    }

    public void setProjectedOthVolM1Tbp(Integer projectedOthVolM1Tbp) {
        this.projectedOthVolM1Tbp = projectedOthVolM1Tbp;
    }

    public Integer getProjectedOthVolM2Tbp() {
        return projectedOthVolM2Tbp;
    }

    public void setProjectedOthVolM2Tbp(Integer projectedOthVolM2Tbp) {
        this.projectedOthVolM2Tbp = projectedOthVolM2Tbp;
    }

    public Integer getProjectedOthVolM3Tbp() {
        return projectedOthVolM3Tbp;
    }

    public void setProjectedOthVolM3Tbp(Integer projectedOthVolM3Tbp) {
        this.projectedOthVolM3Tbp = projectedOthVolM3Tbp;
    }

    public Integer getProjectedVolM1Tbp() {
        return projectedVolM1Tbp;
    }

    public void setProjectedVolM1Tbp(Integer projectedVolM1Tbp) {
        this.projectedVolM1Tbp = projectedVolM1Tbp;
    }

    public Integer getProjectedVolM2Tbp() {
        return projectedVolM2Tbp;
    }

    public void setProjectedVolM2Tbp(Integer projectedVolM2Tbp) {
        this.projectedVolM2Tbp = projectedVolM2Tbp;
    }

    public Integer getProjectedVolM3Tbp() {
        return projectedVolM3Tbp;
    }

    public void setProjectedVolM3Tbp(Integer projectedVolM3Tbp) {
        this.projectedVolM3Tbp = projectedVolM3Tbp;
    }

    public Integer getQtrlyDiffActualProjection() {
        return qtrlyDiffActualProjection;
    }

    public void setQtrlyDiffActualProjection(Integer qtrlyDiffActualProjection) {
        this.qtrlyDiffActualProjection = qtrlyDiffActualProjection;
    }

    public Integer getRetrospectiveAdjM1() {
        return retrospectiveAdjM1;
    }

    public void setRetrospectiveAdjM1(Integer retrospectiveAdjM1) {
        this.retrospectiveAdjM1 = retrospectiveAdjM1;
    }

    public Integer getRetrospectiveAdjM2() {
        return retrospectiveAdjM2;
    }

    public void setRetrospectiveAdjM2(Integer retrospectiveAdjM2) {
        this.retrospectiveAdjM2 = retrospectiveAdjM2;
    }

    public Integer getRetrospectiveAdjM3() {
        return retrospectiveAdjM3;
    }

    public void setRetrospectiveAdjM3(Integer retrospectiveAdjM3) {
        this.retrospectiveAdjM3 = retrospectiveAdjM3;
    }

    public String getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public String getServiceDrillDown() {
        return serviceDrillDown;
    }

    public void setServiceDrillDown(String serviceDrillDown) {
        this.serviceDrillDown = serviceDrillDown;
    }

    public String getServicePillar() {
        return servicePillar;
    }

    public void setServicePillar(String servicePillar) {
        this.servicePillar = servicePillar;
    }

    public String getSowName() {
        return sowName;
    }

    public void setSowName(String sowName) {
        this.sowName = sowName;
    }

    public String getSowNumber() {
        return sowNumber;
    }

    public void setSowNumber(String sowNumber) {
        this.sowNumber = sowNumber;
    }

    public Integer getTotalQtrlySpendUsd() {
        return totalQtrlySpendUsd;
    }

    public void setTotalQtrlySpendUsd(Integer totalQtrlySpendUsd) {
        this.totalQtrlySpendUsd = totalQtrlySpendUsd;
    }

    public Integer getInfTotalQtrlySpendNonUsd() {
        return infTotalQtrlySpendNonUsd;
    }

    public void setInfTotalQtrlySpendNonUsd(Integer infTotalQtrlySpendNonUsd) {
        this.infTotalQtrlySpendNonUsd = infTotalQtrlySpendNonUsd;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Integer getActualRetrospectiveCostM1() {
        return actualRetrospectiveCostM1;
    }

    public void setActualRetrospectiveCostM1(Integer actualRetrospectiveCostM1) {
        this.actualRetrospectiveCostM1 = actualRetrospectiveCostM1;
    }

    public Integer getActualRetrospectiveCostM2() {
        return actualRetrospectiveCostM2;
    }

    public void setActualRetrospectiveCostM2(Integer actualRetrospectiveCostM2) {
        this.actualRetrospectiveCostM2 = actualRetrospectiveCostM2;
    }

    public Integer getActualRetrospectiveCostM3() {
        return actualRetrospectiveCostM3;
    }

    public void setActualRetrospectiveCostM3(Integer actualRetrospectiveCostM3) {
        this.actualRetrospectiveCostM3 = actualRetrospectiveCostM3;
    }

    public Integer getTotalQtrlyRetrospectiveCost() {
        return totalQtrlyRetrospectiveCost;
    }

    public void setTotalQtrlyRetrospectiveCost(Integer totalQtrlyRetrospectiveCost) {
        this.totalQtrlyRetrospectiveCost = totalQtrlyRetrospectiveCost;
    }

    public String getChangeImpact() {
        return changeImpact;
    }

    public void setChangeImpact(String changeImpact) {
        this.changeImpact = changeImpact;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag;
    }

    public LocalDate getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(LocalDate loadDate) {
        this.loadDate = loadDate;
    }

    public Integer getCcaVendorDataSk() {
        return ccaVendorDataSk;
    }

    public void setCcaVendorDataSk(Integer ccaVendorDataSk) {
        this.ccaVendorDataSk = ccaVendorDataSk;
    }

    public String getCcaVendorDataPk() {
        return ccaVendorDataPk;
    }

    public void setCcaVendorDataPk(String ccaVendorDataPk) {
        this.ccaVendorDataPk = ccaVendorDataPk;
    }

    public Integer getHourlyRateDollarFte() {
        return hourlyRateDollarFte;
    }

    public void setHourlyRateDollarFte(Integer hourlyRateDollarFte) {
        this.hourlyRateDollarFte = hourlyRateDollarFte;
    }

    public Integer getHourlyRateDollarPh() {
        return hourlyRateDollarPh;
    }

    public void setHourlyRateDollarPh(Integer hourlyRateDollarPh) {
        this.hourlyRateDollarPh = hourlyRateDollarPh;
    }

    public Integer getDollarRatePerMinuteTbp() {
        return dollarRatePerMinuteTbp;
    }

    public void setDollarRatePerMinuteTbp(Integer dollarRatePerMinuteTbp) {
        this.dollarRatePerMinuteTbp = dollarRatePerMinuteTbp;
    }

    public String getDeliveryPoc() {
        return deliveryPoc;
    }

    public void setDeliveryPoc(String deliveryPoc) {
        this.deliveryPoc = deliveryPoc;
    }

    public Integer getActualBillableHeadsM1Fte() {
        return actualBillableHeadsM1Fte;
    }

    public void setActualBillableHeadsM1Fte(Integer actualBillableHeadsM1Fte) {
        this.actualBillableHeadsM1Fte = actualBillableHeadsM1Fte;
    }

    public Integer getActualBillableHeadsM2Fte() {
        return actualBillableHeadsM2Fte;
    }

    public void setActualBillableHeadsM2Fte(Integer actualBillableHeadsM2Fte) {
        this.actualBillableHeadsM2Fte = actualBillableHeadsM2Fte;
    }

    public Integer getActualBillableHeadsM3Fte() {
        return actualBillableHeadsM3Fte;
    }

    public void setActualBillableHeadsM3Fte(Integer actualBillableHeadsM3Fte) {
        this.actualBillableHeadsM3Fte = actualBillableHeadsM3Fte;
    }

    public Integer getActBillableHoursM1Ph() {
        return actBillableHoursM1Ph;
    }

    public void setActBillableHoursM1Ph(Integer actBillableHoursM1Ph) {
        this.actBillableHoursM1Ph = actBillableHoursM1Ph;
    }

    public Integer getInfActBillHoursM1Fte() {
        return infActBillHoursM1Fte;
    }

    public void setInfActBillHoursM1Fte(Integer infActBillHoursM1Fte) {
        this.infActBillHoursM1Fte = infActBillHoursM1Fte;
    }

    public Integer getActBillableHoursM2Ph() {
        return actBillableHoursM2Ph;
    }

    public void setActBillableHoursM2Ph(Integer actBillableHoursM2Ph) {
        this.actBillableHoursM2Ph = actBillableHoursM2Ph;
    }

    public Integer getInfActBillHoursM2Fte() {
        return infActBillHoursM2Fte;
    }

    public void setInfActBillHoursM2Fte(Integer infActBillHoursM2Fte) {
        this.infActBillHoursM2Fte = infActBillHoursM2Fte;
    }

    public Integer getActBillableHoursM3Ph() {
        return actBillableHoursM3Ph;
    }

    public void setActBillableHoursM3Ph(Integer actBillableHoursM3Ph) {
        this.actBillableHoursM3Ph = actBillableHoursM3Ph;
    }

    public Integer getInfActBillHoursM3Fte() {
        return infActBillHoursM3Fte;
    }

    public void setInfActBillHoursM3Fte(Integer infActBillHoursM3Fte) {
        this.infActBillHoursM3Fte = infActBillHoursM3Fte;
    }

    public Integer getActualOtherVolumeM1Tbp() {
        return actualOtherVolumeM1Tbp;
    }

    public void setActualOtherVolumeM1Tbp(Integer actualOtherVolumeM1Tbp) {
        this.actualOtherVolumeM1Tbp = actualOtherVolumeM1Tbp;
    }

    public Integer getActualOtherVolumeM2Tbp() {
        return actualOtherVolumeM2Tbp;
    }

    public void setActualOtherVolumeM2Tbp(Integer actualOtherVolumeM2Tbp) {
        this.actualOtherVolumeM2Tbp = actualOtherVolumeM2Tbp;
    }

    public Integer getActualOtherVolumeM3Tbp() {
        return actualOtherVolumeM3Tbp;
    }

    public void setActualOtherVolumeM3Tbp(Integer actualOtherVolumeM3Tbp) {
        this.actualOtherVolumeM3Tbp = actualOtherVolumeM3Tbp;
    }

    public Integer getActualSpendM1Usd() {
        return actualSpendM1Usd;
    }

    public void setActualSpendM1Usd(Integer actualSpendM1Usd) {
        this.actualSpendM1Usd = actualSpendM1Usd;
    }

    public Double getInfActSpendM1NonUsdCurr() {
        return infActSpendM1NonUsdCurr;
    }

    public void setInfActSpendM1NonUsdCurr(Double infActSpendM1NonUsdCurr) {
        this.infActSpendM1NonUsdCurr = infActSpendM1NonUsdCurr;
    }

    public Integer getActualSpendM2Usd() {
        return actualSpendM2Usd;
    }

    public void setActualSpendM2Usd(Integer actualSpendM2Usd) {
        this.actualSpendM2Usd = actualSpendM2Usd;
    }

    public Double getInfActSpendM2NonUsdCurr() {
        return infActSpendM2NonUsdCurr;
    }

    public void setInfActSpendM2NonUsdCurr(Double infActSpendM2NonUsdCurr) {
        this.infActSpendM2NonUsdCurr = infActSpendM2NonUsdCurr;
    }

    public Integer getActualSpendM3Usd() {
        return actualSpendM3Usd;
    }

    public void setActualSpendM3Usd(Integer actualSpendM3Usd) {
        this.actualSpendM3Usd = actualSpendM3Usd;
    }

    public Double getInfActSpendM3NonUsdCurr() {
        return infActSpendM3NonUsdCurr;
    }

    public void setInfActSpendM3NonUsdCurr(Double infActSpendM3NonUsdCurr) {
        this.infActSpendM3NonUsdCurr = infActSpendM3NonUsdCurr;
    }

    public Integer getActualVolumeM1Tbp() {
        return actualVolumeM1Tbp;
    }

    public void setActualVolumeM1Tbp(Integer actualVolumeM1Tbp) {
        this.actualVolumeM1Tbp = actualVolumeM1Tbp;
    }

    public Integer getActualVolumeM2Tbp() {
        return actualVolumeM2Tbp;
    }

    public void setActualVolumeM2Tbp(Integer actualVolumeM2Tbp) {
        this.actualVolumeM2Tbp = actualVolumeM2Tbp;
    }

    public Integer getActualVolumeM3Tbp() {
        return actualVolumeM3Tbp;
    }

    public void setActualVolumeM3Tbp(Integer actualVolumeM3Tbp) {
        this.actualVolumeM3Tbp = actualVolumeM3Tbp;
    }

    public Integer getActualPoValueDiffPer() {
        return actualPoValueDiffPer;
    }

    public void setActualPoValueDiffPer(Integer actualPoValueDiffPer) {
        this.actualPoValueDiffPer = actualPoValueDiffPer;
    }

    public Integer getAhtInMinutesTbp() {
        return ahtInMinutesTbp;
    }

    public void setAhtInMinutesTbp(Integer ahtInMinutesTbp) {
        this.ahtInMinutesTbp = ahtInMinutesTbp;
    }

    public Integer getAppOtHrsM1() {
        return appOtHrsM1;
    }

    public void setAppOtHrsM1(Integer appOtHrsM1) {
        this.appOtHrsM1 = appOtHrsM1;
    }

    public Integer getAppOtHrsM2() {
        return appOtHrsM2;
    }

    public void setAppOtHrsM2(Integer appOtHrsM2) {
        this.appOtHrsM2 = appOtHrsM2;
    }

    public Integer getAppOtHrsM3() {
        return appOtHrsM3;
    }

    public void setAppOtHrsM3(Integer appOtHrsM3) {
        this.appOtHrsM3 = appOtHrsM3;
    }

    public Integer getInfBaseAht() {
        return infBaseAht;
    }

    public void setInfBaseAht(Integer infBaseAht) {
        this.infBaseAht = infBaseAht;
    }

    public String getInfBaseHeads() {
        return infBaseHeads;
    }

    public void setInfBaseHeads(String infBaseHeads) {
        this.infBaseHeads = infBaseHeads;
    }

    public Integer getCnxBaseRateTbp() {
        return cnxBaseRateTbp;
    }

    public void setCnxBaseRateTbp(Integer cnxBaseRateTbp) {
        this.cnxBaseRateTbp = cnxBaseRateTbp;
    }

    public Integer getCnxBaseRateFte() {
        return cnxBaseRateFte;
    }

    public void setCnxBaseRateFte(Integer cnxBaseRateFte) {
        this.cnxBaseRateFte = cnxBaseRateFte;
    }

    public Integer getBillingAdjHittingM1() {
        return billingAdjHittingM1;
    }

    public void setBillingAdjHittingM1(Integer billingAdjHittingM1) {
        this.billingAdjHittingM1 = billingAdjHittingM1;
    }

    public Integer getBillingAdjHittingM2() {
        return billingAdjHittingM2;
    }

    public void setBillingAdjHittingM2(Integer billingAdjHittingM2) {
        this.billingAdjHittingM2 = billingAdjHittingM2;
    }

    public Integer getBillingAdjHittingM3() {
        return billingAdjHittingM3;
    }

    public void setBillingAdjHittingM3(Integer billingAdjHittingM3) {
        this.billingAdjHittingM3 = billingAdjHittingM3;
    }

    public Integer getBufferUsd() {
        return bufferUsd;
    }

    public void setBufferUsd(Integer bufferUsd) {
        this.bufferUsd = bufferUsd;
    }

    public Double getInfBufferNonUsdCurr() {
        return infBufferNonUsdCurr;
    }

    public void setInfBufferNonUsdCurr(Double infBufferNonUsdCurr) {
        this.infBufferNonUsdCurr = infBufferNonUsdCurr;
    }

    public String getCiscoBusinessOwner() {
        return ciscoBusinessOwner;
    }

    public void setCiscoBusinessOwner(String ciscoBusinessOwner) {
        this.ciscoBusinessOwner = ciscoBusinessOwner;
    }

    public String getInfCurrency() {
        return infCurrency;
    }

    public void setInfCurrency(String infCurrency) {
        this.infCurrency = infCurrency;
    }

    public Integer getInfCurrencyHrlyRateFte() {
        return infCurrencyHrlyRateFte;
    }

    public void setInfCurrencyHrlyRateFte(Integer infCurrencyHrlyRateFte) {
        this.infCurrencyHrlyRateFte = infCurrencyHrlyRateFte;
    }

    public Integer getActualProjM1DiffUsd() {
        return actualProjM1DiffUsd;
    }

    public void setActualProjM1DiffUsd(Integer actualProjM1DiffUsd) {
        this.actualProjM1DiffUsd = actualProjM1DiffUsd;
    }

    public Integer getActualProjM2DiffUsd() {
        return actualProjM2DiffUsd;
    }

    public void setActualProjM2DiffUsd(Integer actualProjM2DiffUsd) {
        this.actualProjM2DiffUsd = actualProjM2DiffUsd;
    }

    public Integer getActualProjM3DiffUsd() {
        return actualProjM3DiffUsd;
    }

    public void setActualProjM3DiffUsd(Integer actualProjM3DiffUsd) {
        this.actualProjM3DiffUsd = actualProjM3DiffUsd;
    }

    public String getFiscalQuarterName() {
        return fiscalQuarterName;
    }

    public void setFiscalQuarterName(String fiscalQuarterName) {
        this.fiscalQuarterName = fiscalQuarterName;
    }

    public String getVendorLocation() {
        return vendorLocation;
    }

    public void setVendorLocation(String vendorLocation) {
        this.vendorLocation = vendorLocation;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getActualMilestoneM1Per() {
        return actualMilestoneM1Per;
    }

    public void setActualMilestoneM1Per(Integer actualMilestoneM1Per) {
        this.actualMilestoneM1Per = actualMilestoneM1Per;
    }

    public Integer getActualMilestoneM2Per() {
        return actualMilestoneM2Per;
    }

    public void setActualMilestoneM2Per(Integer actualMilestoneM2Per) {
        this.actualMilestoneM2Per = actualMilestoneM2Per;
    }

    public Integer getActualMilestoneM3Per() {
        return actualMilestoneM3Per;
    }

    public void setActualMilestoneM3Per(Integer actualMilestoneM3Per) {
        this.actualMilestoneM3Per = actualMilestoneM3Per;
    }

    public Integer getMilestoneValueM1Usd() {
        return milestoneValueM1Usd;
    }

    public void setMilestoneValueM1Usd(Integer milestoneValueM1Usd) {
        this.milestoneValueM1Usd = milestoneValueM1Usd;
    }

    public Double getInfMStonValM1NonUsdCur() {
        return infMStonValM1NonUsdCur;
    }

    public void setInfMStonValM1NonUsdCur(Double infMStonValM1NonUsdCur) {
        this.infMStonValM1NonUsdCur = infMStonValM1NonUsdCur;
    }

    public Integer getMilestoneValueM2Usd() {
        return milestoneValueM2Usd;
    }

    public void setMilestoneValueM2Usd(Integer milestoneValueM2Usd) {
        this.milestoneValueM2Usd = milestoneValueM2Usd;
    }

    public Double getInfMStonValM2NonUsdCur() {
        return infMStonValM2NonUsdCur;
    }

    public void setInfMStonValM2NonUsdCur(Double infMStonValM2NonUsdCur) {
        this.infMStonValM2NonUsdCur = infMStonValM2NonUsdCur;
    }

    public Integer getMilestoneValueM3Usd() {
        return milestoneValueM3Usd;
    }

    public void setMilestoneValueM3Usd(Integer milestoneValueM3Usd) {
        this.milestoneValueM3Usd = milestoneValueM3Usd;
    }

    public Double getInfMStonValM3NonUsdCur() {
        return infMStonValM3NonUsdCur;
    }

    public void setInfMStonValM3NonUsdCur(Double infMStonValM3NonUsdCur) {
        this.infMStonValM3NonUsdCur = infMStonValM3NonUsdCur;
    }

    public Integer getCnxChrAgentNumWdnmCases() {
        return cnxChrAgentNumWdnmCases;
    }

    public void setCnxChrAgentNumWdnmCases(Integer cnxChrAgentNumWdnmCases) {
        this.cnxChrAgentNumWdnmCases = cnxChrAgentNumWdnmCases;
    }

    public Integer getCnvChrStaffHrsWdnmCases() {
        return cnvChrStaffHrsWdnmCases;
    }

    public void setCnvChrStaffHrsWdnmCases(Integer cnvChrStaffHrsWdnmCases) {
        this.cnvChrStaffHrsWdnmCases = cnvChrStaffHrsWdnmCases;
    }

    public Integer getOtherVolumeRateTbp() {
        return otherVolumeRateTbp;
    }

    public void setOtherVolumeRateTbp(Integer otherVolumeRateTbp) {
        this.otherVolumeRateTbp = otherVolumeRateTbp;
    }

    public Integer getOtRate() {
        return otRate;
    }

    public void setOtRate(Integer otRate) {
        this.otRate = otRate;
    }

    public Integer getOtSpendM1() {
        return otSpendM1;
    }

    public void setOtSpendM1(Integer otSpendM1) {
        this.otSpendM1 = otSpendM1;
    }

    public Integer getOtSpendM2() {
        return otSpendM2;
    }

    public void setOtSpendM2(Integer otSpendM2) {
        this.otSpendM2 = otSpendM2;
    }

    public Integer getOtSpendM3() {
        return otSpendM3;
    }

    public void setOtSpendM3(Integer otSpendM3) {
        this.otSpendM3 = otSpendM3;
    }

    public Integer getPoAmountUsd() {
        return poAmountUsd;
    }

    public void setPoAmountUsd(Integer poAmountUsd) {
        this.poAmountUsd = poAmountUsd;
    }

    public Integer getInfPoAmountNonUsd() {
        return infPoAmountNonUsd;
    }

    public void setInfPoAmountNonUsd(Integer infPoAmountNonUsd) {
        this.infPoAmountNonUsd = infPoAmountNonUsd;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public Integer getProjBillableHeadsM1Fte() {
        return projBillableHeadsM1Fte;
    }

    public void setProjBillableHeadsM1Fte(Integer projBillableHeadsM1Fte) {
        this.projBillableHeadsM1Fte = projBillableHeadsM1Fte;
    }

    public Integer getProjBillableHeadsM2Fte() {
        return projBillableHeadsM2Fte;
    }

    public void setProjBillableHeadsM2Fte(Integer projBillableHeadsM2Fte) {
        this.projBillableHeadsM2Fte = projBillableHeadsM2Fte;
    }

    public Integer getProjBillableHeadsM3Fte() {
        return projBillableHeadsM3Fte;
    }

    public void setProjBillableHeadsM3Fte(Integer projBillableHeadsM3Fte) {
        this.projBillableHeadsM3Fte = projBillableHeadsM3Fte;
    }

    public Integer getProjectedBillableHrsM1Ph() {
        return projectedBillableHrsM1Ph;
    }

    public void setProjectedBillableHrsM1Ph(Integer projectedBillableHrsM1Ph) {
        this.projectedBillableHrsM1Ph = projectedBillableHrsM1Ph;
    }

    public Integer getProjectedBillableHrsM2Ph() {
        return projectedBillableHrsM2Ph;
    }

    public void setProjectedBillableHrsM2Ph(Integer projectedBillableHrsM2Ph) {
        this.projectedBillableHrsM2Ph = projectedBillableHrsM2Ph;
    }

    public Integer getProjectedBillableHrsM3Ph() {
        return projectedBillableHrsM3Ph;
    }

    public void setProjectedBillableHrsM3Ph(Integer projectedBillableHrsM3Ph) {
        this.projectedBillableHrsM3Ph = projectedBillableHrsM3Ph;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        HCBTModelDTO hCBTModelDTO = (HCBTModelDTO) o;
        if (hCBTModelDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), hCBTModelDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "HCBTModelDTO{" +
            "id=" + getId() +
            ", projectedOthVolM1Tbp=" + getProjectedOthVolM1Tbp() +
            ", projectedOthVolM2Tbp=" + getProjectedOthVolM2Tbp() +
            ", projectedOthVolM3Tbp=" + getProjectedOthVolM3Tbp() +
            ", projectedVolM1Tbp=" + getProjectedVolM1Tbp() +
            ", projectedVolM2Tbp=" + getProjectedVolM2Tbp() +
            ", projectedVolM3Tbp=" + getProjectedVolM3Tbp() +
            ", qtrlyDiffActualProjection=" + getQtrlyDiffActualProjection() +
            ", retrospectiveAdjM1=" + getRetrospectiveAdjM1() +
            ", retrospectiveAdjM2=" + getRetrospectiveAdjM2() +
            ", retrospectiveAdjM3=" + getRetrospectiveAdjM3() +
            ", serviceCategory='" + getServiceCategory() + "'" +
            ", serviceDrillDown='" + getServiceDrillDown() + "'" +
            ", servicePillar='" + getServicePillar() + "'" +
            ", sowName='" + getSowName() + "'" +
            ", sowNumber='" + getSowNumber() + "'" +
            ", totalQtrlySpendUsd=" + getTotalQtrlySpendUsd() +
            ", infTotalQtrlySpendNonUsd=" + getInfTotalQtrlySpendNonUsd() +
            ", vendorName='" + getVendorName() + "'" +
            ", actualRetrospectiveCostM1=" + getActualRetrospectiveCostM1() +
            ", actualRetrospectiveCostM2=" + getActualRetrospectiveCostM2() +
            ", actualRetrospectiveCostM3=" + getActualRetrospectiveCostM3() +
            ", totalQtrlyRetrospectiveCost=" + getTotalQtrlyRetrospectiveCost() +
            ", changeImpact='" + getChangeImpact() + "'" +
            ", notes='" + getNotes() + "'" +
            ", dataFlag='" + getDataFlag() + "'" +
            ", loadDate='" + getLoadDate() + "'" +
            ", ccaVendorDataSk=" + getCcaVendorDataSk() +
            ", ccaVendorDataPk='" + getCcaVendorDataPk() + "'" +
            ", hourlyRateDollarFte=" + getHourlyRateDollarFte() +
            ", hourlyRateDollarPh=" + getHourlyRateDollarPh() +
            ", dollarRatePerMinuteTbp=" + getDollarRatePerMinuteTbp() +
            ", deliveryPoc='" + getDeliveryPoc() + "'" +
            ", actualBillableHeadsM1Fte=" + getActualBillableHeadsM1Fte() +
            ", actualBillableHeadsM2Fte=" + getActualBillableHeadsM2Fte() +
            ", actualBillableHeadsM3Fte=" + getActualBillableHeadsM3Fte() +
            ", actBillableHoursM1Ph=" + getActBillableHoursM1Ph() +
            ", infActBillHoursM1Fte=" + getInfActBillHoursM1Fte() +
            ", actBillableHoursM2Ph=" + getActBillableHoursM2Ph() +
            ", infActBillHoursM2Fte=" + getInfActBillHoursM2Fte() +
            ", actBillableHoursM3Ph=" + getActBillableHoursM3Ph() +
            ", infActBillHoursM3Fte=" + getInfActBillHoursM3Fte() +
            ", actualOtherVolumeM1Tbp=" + getActualOtherVolumeM1Tbp() +
            ", actualOtherVolumeM2Tbp=" + getActualOtherVolumeM2Tbp() +
            ", actualOtherVolumeM3Tbp=" + getActualOtherVolumeM3Tbp() +
            ", actualSpendM1Usd=" + getActualSpendM1Usd() +
            ", infActSpendM1NonUsdCurr=" + getInfActSpendM1NonUsdCurr() +
            ", actualSpendM2Usd=" + getActualSpendM2Usd() +
            ", infActSpendM2NonUsdCurr=" + getInfActSpendM2NonUsdCurr() +
            ", actualSpendM3Usd=" + getActualSpendM3Usd() +
            ", infActSpendM3NonUsdCurr=" + getInfActSpendM3NonUsdCurr() +
            ", actualVolumeM1Tbp=" + getActualVolumeM1Tbp() +
            ", actualVolumeM2Tbp=" + getActualVolumeM2Tbp() +
            ", actualVolumeM3Tbp=" + getActualVolumeM3Tbp() +
            ", actualPoValueDiffPer=" + getActualPoValueDiffPer() +
            ", ahtInMinutesTbp=" + getAhtInMinutesTbp() +
            ", appOtHrsM1=" + getAppOtHrsM1() +
            ", appOtHrsM2=" + getAppOtHrsM2() +
            ", appOtHrsM3=" + getAppOtHrsM3() +
            ", infBaseAht=" + getInfBaseAht() +
            ", infBaseHeads='" + getInfBaseHeads() + "'" +
            ", cnxBaseRateTbp=" + getCnxBaseRateTbp() +
            ", cnxBaseRateFte=" + getCnxBaseRateFte() +
            ", billingAdjHittingM1=" + getBillingAdjHittingM1() +
            ", billingAdjHittingM2=" + getBillingAdjHittingM2() +
            ", billingAdjHittingM3=" + getBillingAdjHittingM3() +
            ", bufferUsd=" + getBufferUsd() +
            ", infBufferNonUsdCurr=" + getInfBufferNonUsdCurr() +
            ", ciscoBusinessOwner='" + getCiscoBusinessOwner() + "'" +
            ", infCurrency='" + getInfCurrency() + "'" +
            ", infCurrencyHrlyRateFte=" + getInfCurrencyHrlyRateFte() +
            ", actualProjM1DiffUsd=" + getActualProjM1DiffUsd() +
            ", actualProjM2DiffUsd=" + getActualProjM2DiffUsd() +
            ", actualProjM3DiffUsd=" + getActualProjM3DiffUsd() +
            ", fiscalQuarterName='" + getFiscalQuarterName() + "'" +
            ", vendorLocation='" + getVendorLocation() + "'" +
            ", method='" + getMethod() + "'" +
            ", actualMilestoneM1Per=" + getActualMilestoneM1Per() +
            ", actualMilestoneM2Per=" + getActualMilestoneM2Per() +
            ", actualMilestoneM3Per=" + getActualMilestoneM3Per() +
            ", milestoneValueM1Usd=" + getMilestoneValueM1Usd() +
            ", infMStonValM1NonUsdCur=" + getInfMStonValM1NonUsdCur() +
            ", milestoneValueM2Usd=" + getMilestoneValueM2Usd() +
            ", infMStonValM2NonUsdCur=" + getInfMStonValM2NonUsdCur() +
            ", milestoneValueM3Usd=" + getMilestoneValueM3Usd() +
            ", infMStonValM3NonUsdCur=" + getInfMStonValM3NonUsdCur() +
            ", cnxChrAgentNumWdnmCases=" + getCnxChrAgentNumWdnmCases() +
            ", cnvChrStaffHrsWdnmCases=" + getCnvChrStaffHrsWdnmCases() +
            ", otherVolumeRateTbp=" + getOtherVolumeRateTbp() +
            ", otRate=" + getOtRate() +
            ", otSpendM1=" + getOtSpendM1() +
            ", otSpendM2=" + getOtSpendM2() +
            ", otSpendM3=" + getOtSpendM3() +
            ", poAmountUsd=" + getPoAmountUsd() +
            ", infPoAmountNonUsd=" + getInfPoAmountNonUsd() +
            ", poNumber='" + getPoNumber() + "'" +
            ", projBillableHeadsM1Fte=" + getProjBillableHeadsM1Fte() +
            ", projBillableHeadsM2Fte=" + getProjBillableHeadsM2Fte() +
            ", projBillableHeadsM3Fte=" + getProjBillableHeadsM3Fte() +
            ", projectedBillableHrsM1Ph=" + getProjectedBillableHrsM1Ph() +
            ", projectedBillableHrsM2Ph=" + getProjectedBillableHrsM2Ph() +
            ", projectedBillableHrsM3Ph=" + getProjectedBillableHrsM3Ph() +
            "}";
    }
}
