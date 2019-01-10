package io.github.jhipster.application.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the HCBTModel entity.
 */
public class HCBTModelDTO implements Serializable {

    private Long id;

    private String vendorName;

    private String vendorLocation;

    private String servicePillar;

    private String serviceCategory;

    private String serviceDrilldown;

    private String sowName;

    private String sowNumber;

    private String poNumber;

    private String deliveryPoc;

    private String ciscoBusinessOwner;

    private Integer chrgbleAgentNumWdnmCases;

    private Integer projectedBillableHeadsM1;

    private Integer projectedBillableHeadsM2;

    private Integer projectedBillableHeadsM3;

    private Integer fteHourlyRateDollar;

    private Integer projectedTbpVolumeM1;

    private Integer projectedTbpVolumeM2;

    private Integer projectedTbpVolumeM3;

    private Integer projectedOtherVolM1;

    private Integer projectedOtherVolM2;

    private Integer projectedOtherVolM3;

    private Integer ahtInMinutes;

    private Integer dollarRatePerMinute;

    private Integer otherVolumeRate;

    private Integer infMilestoneValueM1NonUsd;

    private Integer infMilestoneValueM2NonUsd;

    private Integer infMilestoneValueM3NonUsd;

    private Integer infBufferNonUsd;

    private Integer infPoAmountNonUsd;

    private Integer milestoneValueM1Usd;

    private Integer milestoneValueM2Usd;

    private Integer milestoneValueM3Usd;

    private Integer bufferUsd;

    private Integer poAmountUsd;

    private Integer actualBillableHeadsM1;

    private Integer payActBillableHoursM1;

    private Integer actualBillableHeadsM2;

    private Integer payActBillableHoursM2;

    private Integer actualBillableHeadsM3;

    private Integer payActBillableHoursM3;

    private Integer actualTbpVolumeM1;

    private Integer actualTbpVolumeM2;

    private Integer actualTbpVolumeM3;

    private Integer actualOtherVolM1;

    private Integer actualOtherVolM2;

    private Integer actualOtherVolM3;

    private Integer billingAdjHittingM1;

    private Integer billingAdjHittingM2;

    private Integer billingAdjHittingM3;

    private Integer actualSpendM1Usd;

    private Integer actualSpendM2Usd;

    private Integer actualSpendM3Usd;

    private Integer totalQtrlySpendUsd;

    private Integer actualProjM1DiffUsd;

    private Integer actualProjM2DiffUsd;

    private Integer actualProjM3DiffUsd;

    private Integer actualMilestoneM3DiffPer;

    private Integer actualPoValueDiffPer;

    private Integer retrospectiveAdjM1;

    private Integer retrospectiveAdjM2;

    private Integer retrospectiveAdjM3;

    private Integer actualRetrospectiveCostM1;

    private Integer actualRetrospectiveCostM2;

    private Integer actualRetrospectiveCostM3;

    private Integer totalQtrlyRetrospectiveCost;

    private String changeImpact;

    private String method;

    private Integer otRate;

    private Integer appOtHrsM1;

    private Integer appOtHrsM2;

    private Integer appOtHrsM3;

    private Integer otSpendM1;

    private Integer otSpendM2;

    private Integer otSpendM3;

    private String notes;

    private Integer chrgbleStaffHrsWDNMCases;

    private Integer projectedBillableHrsM1;

    private Integer projectedBillableHrsM2;

    private Integer projectedBillableHrsM3;

    private String ccaVendorDataSk;

    private Integer payrollHourlyRateDollar;

    private Integer infActualBillableHoursM1;

    private Integer infActualBillableHoursM2;

    private Integer infActualBillableHoursM3;

    private Integer infActualSpendM1NonUsd;

    private Integer infActualSpendM2NonUsd;

    private Integer infActualSpendM3NonUsd;

    private Integer infBaseAht;

    private Integer infBaseHeads;

    private Integer cnxBaseRate;

    private Integer infCurrency;

    private Integer infCurrencyHourlyRate;

    private String fiscalQuaterName;

    private Integer actualMilestoneM1DiffPer;

    private Integer actualMilestoneM2DiffPer;

    private Integer qtrlyDiffActualProjection;

    private Integer infTotalQtrlySpendNonUsd;

    private String dataFlag;

    private Integer loadDate;

    private Integer cnxBaseRateFte;

    private Integer cnxbaseratetbp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorLocation() {
        return vendorLocation;
    }

    public void setVendorLocation(String vendorLocation) {
        this.vendorLocation = vendorLocation;
    }

    public String getServicePillar() {
        return servicePillar;
    }

    public void setServicePillar(String servicePillar) {
        this.servicePillar = servicePillar;
    }

    public String getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public String getServiceDrilldown() {
        return serviceDrilldown;
    }

    public void setServiceDrilldown(String serviceDrilldown) {
        this.serviceDrilldown = serviceDrilldown;
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

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getDeliveryPoc() {
        return deliveryPoc;
    }

    public void setDeliveryPoc(String deliveryPoc) {
        this.deliveryPoc = deliveryPoc;
    }

    public String getCiscoBusinessOwner() {
        return ciscoBusinessOwner;
    }

    public void setCiscoBusinessOwner(String ciscoBusinessOwner) {
        this.ciscoBusinessOwner = ciscoBusinessOwner;
    }

    public Integer getChrgbleAgentNumWdnmCases() {
        return chrgbleAgentNumWdnmCases;
    }

    public void setChrgbleAgentNumWdnmCases(Integer chrgbleAgentNumWdnmCases) {
        this.chrgbleAgentNumWdnmCases = chrgbleAgentNumWdnmCases;
    }

    public Integer getProjectedBillableHeadsM1() {
        return projectedBillableHeadsM1;
    }

    public void setProjectedBillableHeadsM1(Integer projectedBillableHeadsM1) {
        this.projectedBillableHeadsM1 = projectedBillableHeadsM1;
    }

    public Integer getProjectedBillableHeadsM2() {
        return projectedBillableHeadsM2;
    }

    public void setProjectedBillableHeadsM2(Integer projectedBillableHeadsM2) {
        this.projectedBillableHeadsM2 = projectedBillableHeadsM2;
    }

    public Integer getProjectedBillableHeadsM3() {
        return projectedBillableHeadsM3;
    }

    public void setProjectedBillableHeadsM3(Integer projectedBillableHeadsM3) {
        this.projectedBillableHeadsM3 = projectedBillableHeadsM3;
    }

    public Integer getFteHourlyRateDollar() {
        return fteHourlyRateDollar;
    }

    public void setFteHourlyRateDollar(Integer fteHourlyRateDollar) {
        this.fteHourlyRateDollar = fteHourlyRateDollar;
    }

    public Integer getProjectedTbpVolumeM1() {
        return projectedTbpVolumeM1;
    }

    public void setProjectedTbpVolumeM1(Integer projectedTbpVolumeM1) {
        this.projectedTbpVolumeM1 = projectedTbpVolumeM1;
    }

    public Integer getProjectedTbpVolumeM2() {
        return projectedTbpVolumeM2;
    }

    public void setProjectedTbpVolumeM2(Integer projectedTbpVolumeM2) {
        this.projectedTbpVolumeM2 = projectedTbpVolumeM2;
    }

    public Integer getProjectedTbpVolumeM3() {
        return projectedTbpVolumeM3;
    }

    public void setProjectedTbpVolumeM3(Integer projectedTbpVolumeM3) {
        this.projectedTbpVolumeM3 = projectedTbpVolumeM3;
    }

    public Integer getProjectedOtherVolM1() {
        return projectedOtherVolM1;
    }

    public void setProjectedOtherVolM1(Integer projectedOtherVolM1) {
        this.projectedOtherVolM1 = projectedOtherVolM1;
    }

    public Integer getProjectedOtherVolM2() {
        return projectedOtherVolM2;
    }

    public void setProjectedOtherVolM2(Integer projectedOtherVolM2) {
        this.projectedOtherVolM2 = projectedOtherVolM2;
    }

    public Integer getProjectedOtherVolM3() {
        return projectedOtherVolM3;
    }

    public void setProjectedOtherVolM3(Integer projectedOtherVolM3) {
        this.projectedOtherVolM3 = projectedOtherVolM3;
    }

    public Integer getAhtInMinutes() {
        return ahtInMinutes;
    }

    public void setAhtInMinutes(Integer ahtInMinutes) {
        this.ahtInMinutes = ahtInMinutes;
    }

    public Integer getDollarRatePerMinute() {
        return dollarRatePerMinute;
    }

    public void setDollarRatePerMinute(Integer dollarRatePerMinute) {
        this.dollarRatePerMinute = dollarRatePerMinute;
    }

    public Integer getOtherVolumeRate() {
        return otherVolumeRate;
    }

    public void setOtherVolumeRate(Integer otherVolumeRate) {
        this.otherVolumeRate = otherVolumeRate;
    }

    public Integer getInfMilestoneValueM1NonUsd() {
        return infMilestoneValueM1NonUsd;
    }

    public void setInfMilestoneValueM1NonUsd(Integer infMilestoneValueM1NonUsd) {
        this.infMilestoneValueM1NonUsd = infMilestoneValueM1NonUsd;
    }

    public Integer getInfMilestoneValueM2NonUsd() {
        return infMilestoneValueM2NonUsd;
    }

    public void setInfMilestoneValueM2NonUsd(Integer infMilestoneValueM2NonUsd) {
        this.infMilestoneValueM2NonUsd = infMilestoneValueM2NonUsd;
    }

    public Integer getInfMilestoneValueM3NonUsd() {
        return infMilestoneValueM3NonUsd;
    }

    public void setInfMilestoneValueM3NonUsd(Integer infMilestoneValueM3NonUsd) {
        this.infMilestoneValueM3NonUsd = infMilestoneValueM3NonUsd;
    }

    public Integer getInfBufferNonUsd() {
        return infBufferNonUsd;
    }

    public void setInfBufferNonUsd(Integer infBufferNonUsd) {
        this.infBufferNonUsd = infBufferNonUsd;
    }

    public Integer getInfPoAmountNonUsd() {
        return infPoAmountNonUsd;
    }

    public void setInfPoAmountNonUsd(Integer infPoAmountNonUsd) {
        this.infPoAmountNonUsd = infPoAmountNonUsd;
    }

    public Integer getMilestoneValueM1Usd() {
        return milestoneValueM1Usd;
    }

    public void setMilestoneValueM1Usd(Integer milestoneValueM1Usd) {
        this.milestoneValueM1Usd = milestoneValueM1Usd;
    }

    public Integer getMilestoneValueM2Usd() {
        return milestoneValueM2Usd;
    }

    public void setMilestoneValueM2Usd(Integer milestoneValueM2Usd) {
        this.milestoneValueM2Usd = milestoneValueM2Usd;
    }

    public Integer getMilestoneValueM3Usd() {
        return milestoneValueM3Usd;
    }

    public void setMilestoneValueM3Usd(Integer milestoneValueM3Usd) {
        this.milestoneValueM3Usd = milestoneValueM3Usd;
    }

    public Integer getBufferUsd() {
        return bufferUsd;
    }

    public void setBufferUsd(Integer bufferUsd) {
        this.bufferUsd = bufferUsd;
    }

    public Integer getPoAmountUsd() {
        return poAmountUsd;
    }

    public void setPoAmountUsd(Integer poAmountUsd) {
        this.poAmountUsd = poAmountUsd;
    }

    public Integer getActualBillableHeadsM1() {
        return actualBillableHeadsM1;
    }

    public void setActualBillableHeadsM1(Integer actualBillableHeadsM1) {
        this.actualBillableHeadsM1 = actualBillableHeadsM1;
    }

    public Integer getPayActBillableHoursM1() {
        return payActBillableHoursM1;
    }

    public void setPayActBillableHoursM1(Integer payActBillableHoursM1) {
        this.payActBillableHoursM1 = payActBillableHoursM1;
    }

    public Integer getActualBillableHeadsM2() {
        return actualBillableHeadsM2;
    }

    public void setActualBillableHeadsM2(Integer actualBillableHeadsM2) {
        this.actualBillableHeadsM2 = actualBillableHeadsM2;
    }

    public Integer getPayActBillableHoursM2() {
        return payActBillableHoursM2;
    }

    public void setPayActBillableHoursM2(Integer payActBillableHoursM2) {
        this.payActBillableHoursM2 = payActBillableHoursM2;
    }

    public Integer getActualBillableHeadsM3() {
        return actualBillableHeadsM3;
    }

    public void setActualBillableHeadsM3(Integer actualBillableHeadsM3) {
        this.actualBillableHeadsM3 = actualBillableHeadsM3;
    }

    public Integer getPayActBillableHoursM3() {
        return payActBillableHoursM3;
    }

    public void setPayActBillableHoursM3(Integer payActBillableHoursM3) {
        this.payActBillableHoursM3 = payActBillableHoursM3;
    }

    public Integer getActualTbpVolumeM1() {
        return actualTbpVolumeM1;
    }

    public void setActualTbpVolumeM1(Integer actualTbpVolumeM1) {
        this.actualTbpVolumeM1 = actualTbpVolumeM1;
    }

    public Integer getActualTbpVolumeM2() {
        return actualTbpVolumeM2;
    }

    public void setActualTbpVolumeM2(Integer actualTbpVolumeM2) {
        this.actualTbpVolumeM2 = actualTbpVolumeM2;
    }

    public Integer getActualTbpVolumeM3() {
        return actualTbpVolumeM3;
    }

    public void setActualTbpVolumeM3(Integer actualTbpVolumeM3) {
        this.actualTbpVolumeM3 = actualTbpVolumeM3;
    }

    public Integer getActualOtherVolM1() {
        return actualOtherVolM1;
    }

    public void setActualOtherVolM1(Integer actualOtherVolM1) {
        this.actualOtherVolM1 = actualOtherVolM1;
    }

    public Integer getActualOtherVolM2() {
        return actualOtherVolM2;
    }

    public void setActualOtherVolM2(Integer actualOtherVolM2) {
        this.actualOtherVolM2 = actualOtherVolM2;
    }

    public Integer getActualOtherVolM3() {
        return actualOtherVolM3;
    }

    public void setActualOtherVolM3(Integer actualOtherVolM3) {
        this.actualOtherVolM3 = actualOtherVolM3;
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

    public Integer getActualSpendM1Usd() {
        return actualSpendM1Usd;
    }

    public void setActualSpendM1Usd(Integer actualSpendM1Usd) {
        this.actualSpendM1Usd = actualSpendM1Usd;
    }

    public Integer getActualSpendM2Usd() {
        return actualSpendM2Usd;
    }

    public void setActualSpendM2Usd(Integer actualSpendM2Usd) {
        this.actualSpendM2Usd = actualSpendM2Usd;
    }

    public Integer getActualSpendM3Usd() {
        return actualSpendM3Usd;
    }

    public void setActualSpendM3Usd(Integer actualSpendM3Usd) {
        this.actualSpendM3Usd = actualSpendM3Usd;
    }

    public Integer getTotalQtrlySpendUsd() {
        return totalQtrlySpendUsd;
    }

    public void setTotalQtrlySpendUsd(Integer totalQtrlySpendUsd) {
        this.totalQtrlySpendUsd = totalQtrlySpendUsd;
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

    public Integer getActualMilestoneM3DiffPer() {
        return actualMilestoneM3DiffPer;
    }

    public void setActualMilestoneM3DiffPer(Integer actualMilestoneM3DiffPer) {
        this.actualMilestoneM3DiffPer = actualMilestoneM3DiffPer;
    }

    public Integer getActualPoValueDiffPer() {
        return actualPoValueDiffPer;
    }

    public void setActualPoValueDiffPer(Integer actualPoValueDiffPer) {
        this.actualPoValueDiffPer = actualPoValueDiffPer;
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

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getOtRate() {
        return otRate;
    }

    public void setOtRate(Integer otRate) {
        this.otRate = otRate;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getChrgbleStaffHrsWDNMCases() {
        return chrgbleStaffHrsWDNMCases;
    }

    public void setChrgbleStaffHrsWDNMCases(Integer chrgbleStaffHrsWDNMCases) {
        this.chrgbleStaffHrsWDNMCases = chrgbleStaffHrsWDNMCases;
    }

    public Integer getProjectedBillableHrsM1() {
        return projectedBillableHrsM1;
    }

    public void setProjectedBillableHrsM1(Integer projectedBillableHrsM1) {
        this.projectedBillableHrsM1 = projectedBillableHrsM1;
    }

    public Integer getProjectedBillableHrsM2() {
        return projectedBillableHrsM2;
    }

    public void setProjectedBillableHrsM2(Integer projectedBillableHrsM2) {
        this.projectedBillableHrsM2 = projectedBillableHrsM2;
    }

    public Integer getProjectedBillableHrsM3() {
        return projectedBillableHrsM3;
    }

    public void setProjectedBillableHrsM3(Integer projectedBillableHrsM3) {
        this.projectedBillableHrsM3 = projectedBillableHrsM3;
    }

    public String getCcaVendorDataSk() {
        return ccaVendorDataSk;
    }

    public void setCcaVendorDataSk(String ccaVendorDataSk) {
        this.ccaVendorDataSk = ccaVendorDataSk;
    }

    public Integer getPayrollHourlyRateDollar() {
        return payrollHourlyRateDollar;
    }

    public void setPayrollHourlyRateDollar(Integer payrollHourlyRateDollar) {
        this.payrollHourlyRateDollar = payrollHourlyRateDollar;
    }

    public Integer getInfActualBillableHoursM1() {
        return infActualBillableHoursM1;
    }

    public void setInfActualBillableHoursM1(Integer infActualBillableHoursM1) {
        this.infActualBillableHoursM1 = infActualBillableHoursM1;
    }

    public Integer getInfActualBillableHoursM2() {
        return infActualBillableHoursM2;
    }

    public void setInfActualBillableHoursM2(Integer infActualBillableHoursM2) {
        this.infActualBillableHoursM2 = infActualBillableHoursM2;
    }

    public Integer getInfActualBillableHoursM3() {
        return infActualBillableHoursM3;
    }

    public void setInfActualBillableHoursM3(Integer infActualBillableHoursM3) {
        this.infActualBillableHoursM3 = infActualBillableHoursM3;
    }

    public Integer getInfActualSpendM1NonUsd() {
        return infActualSpendM1NonUsd;
    }

    public void setInfActualSpendM1NonUsd(Integer infActualSpendM1NonUsd) {
        this.infActualSpendM1NonUsd = infActualSpendM1NonUsd;
    }

    public Integer getInfActualSpendM2NonUsd() {
        return infActualSpendM2NonUsd;
    }

    public void setInfActualSpendM2NonUsd(Integer infActualSpendM2NonUsd) {
        this.infActualSpendM2NonUsd = infActualSpendM2NonUsd;
    }

    public Integer getInfActualSpendM3NonUsd() {
        return infActualSpendM3NonUsd;
    }

    public void setInfActualSpendM3NonUsd(Integer infActualSpendM3NonUsd) {
        this.infActualSpendM3NonUsd = infActualSpendM3NonUsd;
    }

    public Integer getInfBaseAht() {
        return infBaseAht;
    }

    public void setInfBaseAht(Integer infBaseAht) {
        this.infBaseAht = infBaseAht;
    }

    public Integer getInfBaseHeads() {
        return infBaseHeads;
    }

    public void setInfBaseHeads(Integer infBaseHeads) {
        this.infBaseHeads = infBaseHeads;
    }

    public Integer getCnxBaseRate() {
        return cnxBaseRate;
    }

    public void setCnxBaseRate(Integer cnxBaseRate) {
        this.cnxBaseRate = cnxBaseRate;
    }

    public Integer getInfCurrency() {
        return infCurrency;
    }

    public void setInfCurrency(Integer infCurrency) {
        this.infCurrency = infCurrency;
    }

    public Integer getInfCurrencyHourlyRate() {
        return infCurrencyHourlyRate;
    }

    public void setInfCurrencyHourlyRate(Integer infCurrencyHourlyRate) {
        this.infCurrencyHourlyRate = infCurrencyHourlyRate;
    }

    public String getFiscalQuaterName() {
        return fiscalQuaterName;
    }

    public void setFiscalQuaterName(String fiscalQuaterName) {
        this.fiscalQuaterName = fiscalQuaterName;
    }

    public Integer getActualMilestoneM1DiffPer() {
        return actualMilestoneM1DiffPer;
    }

    public void setActualMilestoneM1DiffPer(Integer actualMilestoneM1DiffPer) {
        this.actualMilestoneM1DiffPer = actualMilestoneM1DiffPer;
    }

    public Integer getActualMilestoneM2DiffPer() {
        return actualMilestoneM2DiffPer;
    }

    public void setActualMilestoneM2DiffPer(Integer actualMilestoneM2DiffPer) {
        this.actualMilestoneM2DiffPer = actualMilestoneM2DiffPer;
    }

    public Integer getQtrlyDiffActualProjection() {
        return qtrlyDiffActualProjection;
    }

    public void setQtrlyDiffActualProjection(Integer qtrlyDiffActualProjection) {
        this.qtrlyDiffActualProjection = qtrlyDiffActualProjection;
    }

    public Integer getInfTotalQtrlySpendNonUsd() {
        return infTotalQtrlySpendNonUsd;
    }

    public void setInfTotalQtrlySpendNonUsd(Integer infTotalQtrlySpendNonUsd) {
        this.infTotalQtrlySpendNonUsd = infTotalQtrlySpendNonUsd;
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag;
    }

    public Integer getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(Integer loadDate) {
        this.loadDate = loadDate;
    }

    public Integer getCnxBaseRateFte() {
        return cnxBaseRateFte;
    }

    public void setCnxBaseRateFte(Integer cnxBaseRateFte) {
        this.cnxBaseRateFte = cnxBaseRateFte;
    }

    public Integer getCnxbaseratetbp() {
        return cnxbaseratetbp;
    }

    public void setCnxbaseratetbp(Integer cnxbaseratetbp) {
        this.cnxbaseratetbp = cnxbaseratetbp;
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
            ", vendorName='" + getVendorName() + "'" +
            ", vendorLocation='" + getVendorLocation() + "'" +
            ", servicePillar='" + getServicePillar() + "'" +
            ", serviceCategory='" + getServiceCategory() + "'" +
            ", serviceDrilldown='" + getServiceDrilldown() + "'" +
            ", sowName='" + getSowName() + "'" +
            ", sowNumber='" + getSowNumber() + "'" +
            ", poNumber='" + getPoNumber() + "'" +
            ", deliveryPoc='" + getDeliveryPoc() + "'" +
            ", ciscoBusinessOwner='" + getCiscoBusinessOwner() + "'" +
            ", chrgbleAgentNumWdnmCases=" + getChrgbleAgentNumWdnmCases() +
            ", projectedBillableHeadsM1=" + getProjectedBillableHeadsM1() +
            ", projectedBillableHeadsM2=" + getProjectedBillableHeadsM2() +
            ", projectedBillableHeadsM3=" + getProjectedBillableHeadsM3() +
            ", fteHourlyRateDollar=" + getFteHourlyRateDollar() +
            ", projectedTbpVolumeM1=" + getProjectedTbpVolumeM1() +
            ", projectedTbpVolumeM2=" + getProjectedTbpVolumeM2() +
            ", projectedTbpVolumeM3=" + getProjectedTbpVolumeM3() +
            ", projectedOtherVolM1=" + getProjectedOtherVolM1() +
            ", projectedOtherVolM2=" + getProjectedOtherVolM2() +
            ", projectedOtherVolM3=" + getProjectedOtherVolM3() +
            ", ahtInMinutes=" + getAhtInMinutes() +
            ", dollarRatePerMinute=" + getDollarRatePerMinute() +
            ", otherVolumeRate=" + getOtherVolumeRate() +
            ", infMilestoneValueM1NonUsd=" + getInfMilestoneValueM1NonUsd() +
            ", infMilestoneValueM2NonUsd=" + getInfMilestoneValueM2NonUsd() +
            ", infMilestoneValueM3NonUsd=" + getInfMilestoneValueM3NonUsd() +
            ", infBufferNonUsd=" + getInfBufferNonUsd() +
            ", infPoAmountNonUsd=" + getInfPoAmountNonUsd() +
            ", milestoneValueM1Usd=" + getMilestoneValueM1Usd() +
            ", milestoneValueM2Usd=" + getMilestoneValueM2Usd() +
            ", milestoneValueM3Usd=" + getMilestoneValueM3Usd() +
            ", bufferUsd=" + getBufferUsd() +
            ", poAmountUsd=" + getPoAmountUsd() +
            ", actualBillableHeadsM1=" + getActualBillableHeadsM1() +
            ", payActBillableHoursM1=" + getPayActBillableHoursM1() +
            ", actualBillableHeadsM2=" + getActualBillableHeadsM2() +
            ", payActBillableHoursM2=" + getPayActBillableHoursM2() +
            ", actualBillableHeadsM3=" + getActualBillableHeadsM3() +
            ", payActBillableHoursM3=" + getPayActBillableHoursM3() +
            ", actualTbpVolumeM1=" + getActualTbpVolumeM1() +
            ", actualTbpVolumeM2=" + getActualTbpVolumeM2() +
            ", actualTbpVolumeM3=" + getActualTbpVolumeM3() +
            ", actualOtherVolM1=" + getActualOtherVolM1() +
            ", actualOtherVolM2=" + getActualOtherVolM2() +
            ", actualOtherVolM3=" + getActualOtherVolM3() +
            ", billingAdjHittingM1=" + getBillingAdjHittingM1() +
            ", billingAdjHittingM2=" + getBillingAdjHittingM2() +
            ", billingAdjHittingM3=" + getBillingAdjHittingM3() +
            ", actualSpendM1Usd=" + getActualSpendM1Usd() +
            ", actualSpendM2Usd=" + getActualSpendM2Usd() +
            ", actualSpendM3Usd=" + getActualSpendM3Usd() +
            ", totalQtrlySpendUsd=" + getTotalQtrlySpendUsd() +
            ", actualProjM1DiffUsd=" + getActualProjM1DiffUsd() +
            ", actualProjM2DiffUsd=" + getActualProjM2DiffUsd() +
            ", actualProjM3DiffUsd=" + getActualProjM3DiffUsd() +
            ", actualMilestoneM3DiffPer=" + getActualMilestoneM3DiffPer() +
            ", actualPoValueDiffPer=" + getActualPoValueDiffPer() +
            ", retrospectiveAdjM1=" + getRetrospectiveAdjM1() +
            ", retrospectiveAdjM2=" + getRetrospectiveAdjM2() +
            ", retrospectiveAdjM3=" + getRetrospectiveAdjM3() +
            ", actualRetrospectiveCostM1=" + getActualRetrospectiveCostM1() +
            ", actualRetrospectiveCostM2=" + getActualRetrospectiveCostM2() +
            ", actualRetrospectiveCostM3=" + getActualRetrospectiveCostM3() +
            ", totalQtrlyRetrospectiveCost=" + getTotalQtrlyRetrospectiveCost() +
            ", changeImpact='" + getChangeImpact() + "'" +
            ", method='" + getMethod() + "'" +
            ", otRate=" + getOtRate() +
            ", appOtHrsM1=" + getAppOtHrsM1() +
            ", appOtHrsM2=" + getAppOtHrsM2() +
            ", appOtHrsM3=" + getAppOtHrsM3() +
            ", otSpendM1=" + getOtSpendM1() +
            ", otSpendM2=" + getOtSpendM2() +
            ", otSpendM3=" + getOtSpendM3() +
            ", notes='" + getNotes() + "'" +
            ", chrgbleStaffHrsWDNMCases=" + getChrgbleStaffHrsWDNMCases() +
            ", projectedBillableHrsM1=" + getProjectedBillableHrsM1() +
            ", projectedBillableHrsM2=" + getProjectedBillableHrsM2() +
            ", projectedBillableHrsM3=" + getProjectedBillableHrsM3() +
            ", ccaVendorDataSk='" + getCcaVendorDataSk() + "'" +
            ", payrollHourlyRateDollar=" + getPayrollHourlyRateDollar() +
            ", infActualBillableHoursM1=" + getInfActualBillableHoursM1() +
            ", infActualBillableHoursM2=" + getInfActualBillableHoursM2() +
            ", infActualBillableHoursM3=" + getInfActualBillableHoursM3() +
            ", infActualSpendM1NonUsd=" + getInfActualSpendM1NonUsd() +
            ", infActualSpendM2NonUsd=" + getInfActualSpendM2NonUsd() +
            ", infActualSpendM3NonUsd=" + getInfActualSpendM3NonUsd() +
            ", infBaseAht=" + getInfBaseAht() +
            ", infBaseHeads=" + getInfBaseHeads() +
            ", cnxBaseRate=" + getCnxBaseRate() +
            ", infCurrency=" + getInfCurrency() +
            ", infCurrencyHourlyRate=" + getInfCurrencyHourlyRate() +
            ", fiscalQuaterName='" + getFiscalQuaterName() + "'" +
            ", actualMilestoneM1DiffPer=" + getActualMilestoneM1DiffPer() +
            ", actualMilestoneM2DiffPer=" + getActualMilestoneM2DiffPer() +
            ", qtrlyDiffActualProjection=" + getQtrlyDiffActualProjection() +
            ", infTotalQtrlySpendNonUsd=" + getInfTotalQtrlySpendNonUsd() +
            ", dataFlag='" + getDataFlag() + "'" +
            ", loadDate=" + getLoadDate() +
            ", cnxBaseRateFte=" + getCnxBaseRateFte() +
            ", cnxbaseratetbp=" + getCnxbaseratetbp() +
            "}";
    }
}
