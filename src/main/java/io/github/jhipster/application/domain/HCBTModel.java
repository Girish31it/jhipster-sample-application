package io.github.jhipster.application.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A HCBTModel.
 */
@Entity
@Table(name = "hcbt_model")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class HCBTModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "projected_oth_vol_m_1_tbp")
    private Integer projectedOthVolM1Tbp;

    @Column(name = "projected_oth_vol_m_2_tbp")
    private Integer projectedOthVolM2Tbp;

    @Column(name = "projected_oth_vol_m_3_tbp")
    private Integer projectedOthVolM3Tbp;

    @Column(name = "projected_vol_m_1_tbp")
    private Integer projectedVolM1Tbp;

    @Column(name = "projected_vol_m_2_tbp")
    private Integer projectedVolM2Tbp;

    @Column(name = "projected_vol_m_3_tbp")
    private Integer projectedVolM3Tbp;

    @Column(name = "qtrly_diff_actual_projection")
    private Integer qtrlyDiffActualProjection;

    @Column(name = "retrospective_adj_m_1")
    private Integer retrospectiveAdjM1;

    @Column(name = "retrospective_adj_m_2")
    private Integer retrospectiveAdjM2;

    @Column(name = "retrospective_adj_m_3")
    private Integer retrospectiveAdjM3;

    @Column(name = "service_category")
    private String serviceCategory;

    @Column(name = "service_drill_down")
    private String serviceDrillDown;

    @Column(name = "service_pillar")
    private String servicePillar;

    @Column(name = "sow_name")
    private String sowName;

    @Column(name = "sow_number")
    private String sowNumber;

    @Column(name = "total_qtrly_spend_usd")
    private Integer totalQtrlySpendUsd;

    @Column(name = "inf_total_qtrly_spend_non_usd")
    private Integer infTotalQtrlySpendNonUsd;

    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "actual_retrospective_cost_m_1")
    private Integer actualRetrospectiveCostM1;

    @Column(name = "actual_retrospective_cost_m_2")
    private Integer actualRetrospectiveCostM2;

    @Column(name = "actual_retrospective_cost_m_3")
    private Integer actualRetrospectiveCostM3;

    @Column(name = "total_qtrly_retrospective_cost")
    private Integer totalQtrlyRetrospectiveCost;

    @Column(name = "change_impact")
    private String changeImpact;

    @Column(name = "notes")
    private String notes;

    @Column(name = "data_flag")
    private String dataFlag;

    @Column(name = "load_date")
    private LocalDate loadDate;

    @Column(name = "cca_vendor_data_sk")
    private Integer ccaVendorDataSk;

    @Column(name = "cca_vendor_data_pk")
    private String ccaVendorDataPk;

    @Column(name = "hourly_rate_dollar_fte")
    private Integer hourlyRateDollarFte;

    @Column(name = "hourly_rate_dollar_ph")
    private Integer hourlyRateDollarPh;

    @Column(name = "dollar_rate_per_minute_tbp")
    private Integer dollarRatePerMinuteTbp;

    @Column(name = "delivery_poc")
    private String deliveryPoc;

    @Column(name = "actual_billable_heads_m_1_fte")
    private Integer actualBillableHeadsM1Fte;

    @Column(name = "actual_billable_heads_m_2_fte")
    private Integer actualBillableHeadsM2Fte;

    @Column(name = "actual_billable_heads_m_3_fte")
    private Integer actualBillableHeadsM3Fte;

    @Column(name = "act_billable_hours_m_1_ph")
    private Integer actBillableHoursM1Ph;

    @Column(name = "inf_act_bill_hours_m_1_fte")
    private Integer infActBillHoursM1Fte;

    @Column(name = "act_billable_hours_m_2_ph")
    private Integer actBillableHoursM2Ph;

    @Column(name = "inf_act_bill_hours_m_2_fte")
    private Integer infActBillHoursM2Fte;

    @Column(name = "act_billable_hours_m_3_ph")
    private Integer actBillableHoursM3Ph;

    @Column(name = "inf_act_bill_hours_m_3_fte")
    private Integer infActBillHoursM3Fte;

    @Column(name = "actual_other_volume_m_1_tbp")
    private Integer actualOtherVolumeM1Tbp;

    @Column(name = "actual_other_volume_m_2_tbp")
    private Integer actualOtherVolumeM2Tbp;

    @Column(name = "actual_other_volume_m_3_tbp")
    private Integer actualOtherVolumeM3Tbp;

    @Column(name = "actual_spend_m_1_usd")
    private Integer actualSpendM1Usd;

    @Column(name = "inf_act_spend_m_1_non_usd_curr")
    private Double infActSpendM1NonUsdCurr;

    @Column(name = "actual_spend_m_2_usd")
    private Integer actualSpendM2Usd;

    @Column(name = "inf_act_spend_m_2_non_usd_curr")
    private Double infActSpendM2NonUsdCurr;

    @Column(name = "actual_spend_m_3_usd")
    private Integer actualSpendM3Usd;

    @Column(name = "inf_act_spend_m_3_non_usd_curr")
    private Double infActSpendM3NonUsdCurr;

    @Column(name = "actual_volume_m_1_tbp")
    private Integer actualVolumeM1Tbp;

    @Column(name = "actual_volume_m_2_tbp")
    private Integer actualVolumeM2Tbp;

    @Column(name = "actual_volume_m_3_tbp")
    private Integer actualVolumeM3Tbp;

    @Column(name = "actual_po_value_diff_per")
    private Integer actualPoValueDiffPer;

    @Column(name = "aht_in_minutes_tbp")
    private Integer ahtInMinutesTbp;

    @Column(name = "app_ot_hrs_m_1")
    private Integer appOtHrsM1;

    @Column(name = "app_ot_hrs_m_2")
    private Integer appOtHrsM2;

    @Column(name = "app_ot_hrs_m_3")
    private Integer appOtHrsM3;

    @Column(name = "inf_base_aht")
    private Integer infBaseAht;

    @Column(name = "inf_base_heads")
    private String infBaseHeads;

    @Column(name = "cnx_base_rate_tbp")
    private Integer cnxBaseRateTbp;

    @Column(name = "cnx_base_rate_fte")
    private Integer cnxBaseRateFte;

    @Column(name = "billing_adj_hitting_m_1")
    private Integer billingAdjHittingM1;

    @Column(name = "billing_adj_hitting_m_2")
    private Integer billingAdjHittingM2;

    @Column(name = "billing_adj_hitting_m_3")
    private Integer billingAdjHittingM3;

    @Column(name = "buffer_usd")
    private Integer bufferUsd;

    @Column(name = "inf_buffer_non_usd_curr")
    private Double infBufferNonUsdCurr;

    @Column(name = "cisco_business_owner")
    private String ciscoBusinessOwner;

    @Column(name = "inf_currency")
    private String infCurrency;

    @Column(name = "inf_currency_hrly_rate_fte")
    private Integer infCurrencyHrlyRateFte;

    @Column(name = "actual_proj_m_1_diff_usd")
    private Integer actualProjM1DiffUsd;

    @Column(name = "actual_proj_m_2_diff_usd")
    private Integer actualProjM2DiffUsd;

    @Column(name = "actual_proj_m_3_diff_usd")
    private Integer actualProjM3DiffUsd;

    @Column(name = "fiscal_quarter_name")
    private String fiscalQuarterName;

    @Column(name = "vendor_location")
    private String vendorLocation;

    @Column(name = "method")
    private String method;

    @Column(name = "actual_milestone_m_1_per")
    private Integer actualMilestoneM1Per;

    @Column(name = "actual_milestone_m_2_per")
    private Integer actualMilestoneM2Per;

    @Column(name = "actual_milestone_m_3_per")
    private Integer actualMilestoneM3Per;

    @Column(name = "milestone_value_m_1_usd")
    private Integer milestoneValueM1Usd;

    @Column(name = "inf_m_ston_val_m_1_non_usd_cur")
    private Double infMStonValM1NonUsdCur;

    @Column(name = "milestone_value_m_2_usd")
    private Integer milestoneValueM2Usd;

    @Column(name = "inf_m_ston_val_m_2_non_usd_cur")
    private Double infMStonValM2NonUsdCur;

    @Column(name = "milestone_value_m_3_usd")
    private Integer milestoneValueM3Usd;

    @Column(name = "inf_m_ston_val_m_3_non_usd_cur")
    private Double infMStonValM3NonUsdCur;

    @Column(name = "cnx_chr_agent_num_wdnm_cases")
    private Integer cnxChrAgentNumWdnmCases;

    @Column(name = "cnv_chr_staff_hrs_wdnm_cases")
    private Integer cnvChrStaffHrsWdnmCases;

    @Column(name = "other_volume_rate_tbp")
    private Integer otherVolumeRateTbp;

    @Column(name = "ot_rate")
    private Integer otRate;

    @Column(name = "ot_spend_m_1")
    private Integer otSpendM1;

    @Column(name = "ot_spend_m_2")
    private Integer otSpendM2;

    @Column(name = "ot_spend_m_3")
    private Integer otSpendM3;

    @Column(name = "po_amount_usd")
    private Integer poAmountUsd;

    @Column(name = "inf_po_amount_non_usd")
    private Integer infPoAmountNonUsd;

    @Column(name = "po_number")
    private String poNumber;

    @Column(name = "proj_billable_heads_m_1_fte")
    private Integer projBillableHeadsM1Fte;

    @Column(name = "proj_billable_heads_m_2_fte")
    private Integer projBillableHeadsM2Fte;

    @Column(name = "proj_billable_heads_m_3_fte")
    private Integer projBillableHeadsM3Fte;

    @Column(name = "projected_billable_hrs_m_1_ph")
    private Integer projectedBillableHrsM1Ph;

    @Column(name = "projected_billable_hrs_m_2_ph")
    private Integer projectedBillableHrsM2Ph;

    @Column(name = "projected_billable_hrs_m_3_ph")
    private Integer projectedBillableHrsM3Ph;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProjectedOthVolM1Tbp() {
        return projectedOthVolM1Tbp;
    }

    public HCBTModel projectedOthVolM1Tbp(Integer projectedOthVolM1Tbp) {
        this.projectedOthVolM1Tbp = projectedOthVolM1Tbp;
        return this;
    }

    public void setProjectedOthVolM1Tbp(Integer projectedOthVolM1Tbp) {
        this.projectedOthVolM1Tbp = projectedOthVolM1Tbp;
    }

    public Integer getProjectedOthVolM2Tbp() {
        return projectedOthVolM2Tbp;
    }

    public HCBTModel projectedOthVolM2Tbp(Integer projectedOthVolM2Tbp) {
        this.projectedOthVolM2Tbp = projectedOthVolM2Tbp;
        return this;
    }

    public void setProjectedOthVolM2Tbp(Integer projectedOthVolM2Tbp) {
        this.projectedOthVolM2Tbp = projectedOthVolM2Tbp;
    }

    public Integer getProjectedOthVolM3Tbp() {
        return projectedOthVolM3Tbp;
    }

    public HCBTModel projectedOthVolM3Tbp(Integer projectedOthVolM3Tbp) {
        this.projectedOthVolM3Tbp = projectedOthVolM3Tbp;
        return this;
    }

    public void setProjectedOthVolM3Tbp(Integer projectedOthVolM3Tbp) {
        this.projectedOthVolM3Tbp = projectedOthVolM3Tbp;
    }

    public Integer getProjectedVolM1Tbp() {
        return projectedVolM1Tbp;
    }

    public HCBTModel projectedVolM1Tbp(Integer projectedVolM1Tbp) {
        this.projectedVolM1Tbp = projectedVolM1Tbp;
        return this;
    }

    public void setProjectedVolM1Tbp(Integer projectedVolM1Tbp) {
        this.projectedVolM1Tbp = projectedVolM1Tbp;
    }

    public Integer getProjectedVolM2Tbp() {
        return projectedVolM2Tbp;
    }

    public HCBTModel projectedVolM2Tbp(Integer projectedVolM2Tbp) {
        this.projectedVolM2Tbp = projectedVolM2Tbp;
        return this;
    }

    public void setProjectedVolM2Tbp(Integer projectedVolM2Tbp) {
        this.projectedVolM2Tbp = projectedVolM2Tbp;
    }

    public Integer getProjectedVolM3Tbp() {
        return projectedVolM3Tbp;
    }

    public HCBTModel projectedVolM3Tbp(Integer projectedVolM3Tbp) {
        this.projectedVolM3Tbp = projectedVolM3Tbp;
        return this;
    }

    public void setProjectedVolM3Tbp(Integer projectedVolM3Tbp) {
        this.projectedVolM3Tbp = projectedVolM3Tbp;
    }

    public Integer getQtrlyDiffActualProjection() {
        return qtrlyDiffActualProjection;
    }

    public HCBTModel qtrlyDiffActualProjection(Integer qtrlyDiffActualProjection) {
        this.qtrlyDiffActualProjection = qtrlyDiffActualProjection;
        return this;
    }

    public void setQtrlyDiffActualProjection(Integer qtrlyDiffActualProjection) {
        this.qtrlyDiffActualProjection = qtrlyDiffActualProjection;
    }

    public Integer getRetrospectiveAdjM1() {
        return retrospectiveAdjM1;
    }

    public HCBTModel retrospectiveAdjM1(Integer retrospectiveAdjM1) {
        this.retrospectiveAdjM1 = retrospectiveAdjM1;
        return this;
    }

    public void setRetrospectiveAdjM1(Integer retrospectiveAdjM1) {
        this.retrospectiveAdjM1 = retrospectiveAdjM1;
    }

    public Integer getRetrospectiveAdjM2() {
        return retrospectiveAdjM2;
    }

    public HCBTModel retrospectiveAdjM2(Integer retrospectiveAdjM2) {
        this.retrospectiveAdjM2 = retrospectiveAdjM2;
        return this;
    }

    public void setRetrospectiveAdjM2(Integer retrospectiveAdjM2) {
        this.retrospectiveAdjM2 = retrospectiveAdjM2;
    }

    public Integer getRetrospectiveAdjM3() {
        return retrospectiveAdjM3;
    }

    public HCBTModel retrospectiveAdjM3(Integer retrospectiveAdjM3) {
        this.retrospectiveAdjM3 = retrospectiveAdjM3;
        return this;
    }

    public void setRetrospectiveAdjM3(Integer retrospectiveAdjM3) {
        this.retrospectiveAdjM3 = retrospectiveAdjM3;
    }

    public String getServiceCategory() {
        return serviceCategory;
    }

    public HCBTModel serviceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
        return this;
    }

    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public String getServiceDrillDown() {
        return serviceDrillDown;
    }

    public HCBTModel serviceDrillDown(String serviceDrillDown) {
        this.serviceDrillDown = serviceDrillDown;
        return this;
    }

    public void setServiceDrillDown(String serviceDrillDown) {
        this.serviceDrillDown = serviceDrillDown;
    }

    public String getServicePillar() {
        return servicePillar;
    }

    public HCBTModel servicePillar(String servicePillar) {
        this.servicePillar = servicePillar;
        return this;
    }

    public void setServicePillar(String servicePillar) {
        this.servicePillar = servicePillar;
    }

    public String getSowName() {
        return sowName;
    }

    public HCBTModel sowName(String sowName) {
        this.sowName = sowName;
        return this;
    }

    public void setSowName(String sowName) {
        this.sowName = sowName;
    }

    public String getSowNumber() {
        return sowNumber;
    }

    public HCBTModel sowNumber(String sowNumber) {
        this.sowNumber = sowNumber;
        return this;
    }

    public void setSowNumber(String sowNumber) {
        this.sowNumber = sowNumber;
    }

    public Integer getTotalQtrlySpendUsd() {
        return totalQtrlySpendUsd;
    }

    public HCBTModel totalQtrlySpendUsd(Integer totalQtrlySpendUsd) {
        this.totalQtrlySpendUsd = totalQtrlySpendUsd;
        return this;
    }

    public void setTotalQtrlySpendUsd(Integer totalQtrlySpendUsd) {
        this.totalQtrlySpendUsd = totalQtrlySpendUsd;
    }

    public Integer getInfTotalQtrlySpendNonUsd() {
        return infTotalQtrlySpendNonUsd;
    }

    public HCBTModel infTotalQtrlySpendNonUsd(Integer infTotalQtrlySpendNonUsd) {
        this.infTotalQtrlySpendNonUsd = infTotalQtrlySpendNonUsd;
        return this;
    }

    public void setInfTotalQtrlySpendNonUsd(Integer infTotalQtrlySpendNonUsd) {
        this.infTotalQtrlySpendNonUsd = infTotalQtrlySpendNonUsd;
    }

    public String getVendorName() {
        return vendorName;
    }

    public HCBTModel vendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Integer getActualRetrospectiveCostM1() {
        return actualRetrospectiveCostM1;
    }

    public HCBTModel actualRetrospectiveCostM1(Integer actualRetrospectiveCostM1) {
        this.actualRetrospectiveCostM1 = actualRetrospectiveCostM1;
        return this;
    }

    public void setActualRetrospectiveCostM1(Integer actualRetrospectiveCostM1) {
        this.actualRetrospectiveCostM1 = actualRetrospectiveCostM1;
    }

    public Integer getActualRetrospectiveCostM2() {
        return actualRetrospectiveCostM2;
    }

    public HCBTModel actualRetrospectiveCostM2(Integer actualRetrospectiveCostM2) {
        this.actualRetrospectiveCostM2 = actualRetrospectiveCostM2;
        return this;
    }

    public void setActualRetrospectiveCostM2(Integer actualRetrospectiveCostM2) {
        this.actualRetrospectiveCostM2 = actualRetrospectiveCostM2;
    }

    public Integer getActualRetrospectiveCostM3() {
        return actualRetrospectiveCostM3;
    }

    public HCBTModel actualRetrospectiveCostM3(Integer actualRetrospectiveCostM3) {
        this.actualRetrospectiveCostM3 = actualRetrospectiveCostM3;
        return this;
    }

    public void setActualRetrospectiveCostM3(Integer actualRetrospectiveCostM3) {
        this.actualRetrospectiveCostM3 = actualRetrospectiveCostM3;
    }

    public Integer getTotalQtrlyRetrospectiveCost() {
        return totalQtrlyRetrospectiveCost;
    }

    public HCBTModel totalQtrlyRetrospectiveCost(Integer totalQtrlyRetrospectiveCost) {
        this.totalQtrlyRetrospectiveCost = totalQtrlyRetrospectiveCost;
        return this;
    }

    public void setTotalQtrlyRetrospectiveCost(Integer totalQtrlyRetrospectiveCost) {
        this.totalQtrlyRetrospectiveCost = totalQtrlyRetrospectiveCost;
    }

    public String getChangeImpact() {
        return changeImpact;
    }

    public HCBTModel changeImpact(String changeImpact) {
        this.changeImpact = changeImpact;
        return this;
    }

    public void setChangeImpact(String changeImpact) {
        this.changeImpact = changeImpact;
    }

    public String getNotes() {
        return notes;
    }

    public HCBTModel notes(String notes) {
        this.notes = notes;
        return this;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public HCBTModel dataFlag(String dataFlag) {
        this.dataFlag = dataFlag;
        return this;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag;
    }

    public LocalDate getLoadDate() {
        return loadDate;
    }

    public HCBTModel loadDate(LocalDate loadDate) {
        this.loadDate = loadDate;
        return this;
    }

    public void setLoadDate(LocalDate loadDate) {
        this.loadDate = loadDate;
    }

    public Integer getCcaVendorDataSk() {
        return ccaVendorDataSk;
    }

    public HCBTModel ccaVendorDataSk(Integer ccaVendorDataSk) {
        this.ccaVendorDataSk = ccaVendorDataSk;
        return this;
    }

    public void setCcaVendorDataSk(Integer ccaVendorDataSk) {
        this.ccaVendorDataSk = ccaVendorDataSk;
    }

    public String getCcaVendorDataPk() {
        return ccaVendorDataPk;
    }

    public HCBTModel ccaVendorDataPk(String ccaVendorDataPk) {
        this.ccaVendorDataPk = ccaVendorDataPk;
        return this;
    }

    public void setCcaVendorDataPk(String ccaVendorDataPk) {
        this.ccaVendorDataPk = ccaVendorDataPk;
    }

    public Integer getHourlyRateDollarFte() {
        return hourlyRateDollarFte;
    }

    public HCBTModel hourlyRateDollarFte(Integer hourlyRateDollarFte) {
        this.hourlyRateDollarFte = hourlyRateDollarFte;
        return this;
    }

    public void setHourlyRateDollarFte(Integer hourlyRateDollarFte) {
        this.hourlyRateDollarFte = hourlyRateDollarFte;
    }

    public Integer getHourlyRateDollarPh() {
        return hourlyRateDollarPh;
    }

    public HCBTModel hourlyRateDollarPh(Integer hourlyRateDollarPh) {
        this.hourlyRateDollarPh = hourlyRateDollarPh;
        return this;
    }

    public void setHourlyRateDollarPh(Integer hourlyRateDollarPh) {
        this.hourlyRateDollarPh = hourlyRateDollarPh;
    }

    public Integer getDollarRatePerMinuteTbp() {
        return dollarRatePerMinuteTbp;
    }

    public HCBTModel dollarRatePerMinuteTbp(Integer dollarRatePerMinuteTbp) {
        this.dollarRatePerMinuteTbp = dollarRatePerMinuteTbp;
        return this;
    }

    public void setDollarRatePerMinuteTbp(Integer dollarRatePerMinuteTbp) {
        this.dollarRatePerMinuteTbp = dollarRatePerMinuteTbp;
    }

    public String getDeliveryPoc() {
        return deliveryPoc;
    }

    public HCBTModel deliveryPoc(String deliveryPoc) {
        this.deliveryPoc = deliveryPoc;
        return this;
    }

    public void setDeliveryPoc(String deliveryPoc) {
        this.deliveryPoc = deliveryPoc;
    }

    public Integer getActualBillableHeadsM1Fte() {
        return actualBillableHeadsM1Fte;
    }

    public HCBTModel actualBillableHeadsM1Fte(Integer actualBillableHeadsM1Fte) {
        this.actualBillableHeadsM1Fte = actualBillableHeadsM1Fte;
        return this;
    }

    public void setActualBillableHeadsM1Fte(Integer actualBillableHeadsM1Fte) {
        this.actualBillableHeadsM1Fte = actualBillableHeadsM1Fte;
    }

    public Integer getActualBillableHeadsM2Fte() {
        return actualBillableHeadsM2Fte;
    }

    public HCBTModel actualBillableHeadsM2Fte(Integer actualBillableHeadsM2Fte) {
        this.actualBillableHeadsM2Fte = actualBillableHeadsM2Fte;
        return this;
    }

    public void setActualBillableHeadsM2Fte(Integer actualBillableHeadsM2Fte) {
        this.actualBillableHeadsM2Fte = actualBillableHeadsM2Fte;
    }

    public Integer getActualBillableHeadsM3Fte() {
        return actualBillableHeadsM3Fte;
    }

    public HCBTModel actualBillableHeadsM3Fte(Integer actualBillableHeadsM3Fte) {
        this.actualBillableHeadsM3Fte = actualBillableHeadsM3Fte;
        return this;
    }

    public void setActualBillableHeadsM3Fte(Integer actualBillableHeadsM3Fte) {
        this.actualBillableHeadsM3Fte = actualBillableHeadsM3Fte;
    }

    public Integer getActBillableHoursM1Ph() {
        return actBillableHoursM1Ph;
    }

    public HCBTModel actBillableHoursM1Ph(Integer actBillableHoursM1Ph) {
        this.actBillableHoursM1Ph = actBillableHoursM1Ph;
        return this;
    }

    public void setActBillableHoursM1Ph(Integer actBillableHoursM1Ph) {
        this.actBillableHoursM1Ph = actBillableHoursM1Ph;
    }

    public Integer getInfActBillHoursM1Fte() {
        return infActBillHoursM1Fte;
    }

    public HCBTModel infActBillHoursM1Fte(Integer infActBillHoursM1Fte) {
        this.infActBillHoursM1Fte = infActBillHoursM1Fte;
        return this;
    }

    public void setInfActBillHoursM1Fte(Integer infActBillHoursM1Fte) {
        this.infActBillHoursM1Fte = infActBillHoursM1Fte;
    }

    public Integer getActBillableHoursM2Ph() {
        return actBillableHoursM2Ph;
    }

    public HCBTModel actBillableHoursM2Ph(Integer actBillableHoursM2Ph) {
        this.actBillableHoursM2Ph = actBillableHoursM2Ph;
        return this;
    }

    public void setActBillableHoursM2Ph(Integer actBillableHoursM2Ph) {
        this.actBillableHoursM2Ph = actBillableHoursM2Ph;
    }

    public Integer getInfActBillHoursM2Fte() {
        return infActBillHoursM2Fte;
    }

    public HCBTModel infActBillHoursM2Fte(Integer infActBillHoursM2Fte) {
        this.infActBillHoursM2Fte = infActBillHoursM2Fte;
        return this;
    }

    public void setInfActBillHoursM2Fte(Integer infActBillHoursM2Fte) {
        this.infActBillHoursM2Fte = infActBillHoursM2Fte;
    }

    public Integer getActBillableHoursM3Ph() {
        return actBillableHoursM3Ph;
    }

    public HCBTModel actBillableHoursM3Ph(Integer actBillableHoursM3Ph) {
        this.actBillableHoursM3Ph = actBillableHoursM3Ph;
        return this;
    }

    public void setActBillableHoursM3Ph(Integer actBillableHoursM3Ph) {
        this.actBillableHoursM3Ph = actBillableHoursM3Ph;
    }

    public Integer getInfActBillHoursM3Fte() {
        return infActBillHoursM3Fte;
    }

    public HCBTModel infActBillHoursM3Fte(Integer infActBillHoursM3Fte) {
        this.infActBillHoursM3Fte = infActBillHoursM3Fte;
        return this;
    }

    public void setInfActBillHoursM3Fte(Integer infActBillHoursM3Fte) {
        this.infActBillHoursM3Fte = infActBillHoursM3Fte;
    }

    public Integer getActualOtherVolumeM1Tbp() {
        return actualOtherVolumeM1Tbp;
    }

    public HCBTModel actualOtherVolumeM1Tbp(Integer actualOtherVolumeM1Tbp) {
        this.actualOtherVolumeM1Tbp = actualOtherVolumeM1Tbp;
        return this;
    }

    public void setActualOtherVolumeM1Tbp(Integer actualOtherVolumeM1Tbp) {
        this.actualOtherVolumeM1Tbp = actualOtherVolumeM1Tbp;
    }

    public Integer getActualOtherVolumeM2Tbp() {
        return actualOtherVolumeM2Tbp;
    }

    public HCBTModel actualOtherVolumeM2Tbp(Integer actualOtherVolumeM2Tbp) {
        this.actualOtherVolumeM2Tbp = actualOtherVolumeM2Tbp;
        return this;
    }

    public void setActualOtherVolumeM2Tbp(Integer actualOtherVolumeM2Tbp) {
        this.actualOtherVolumeM2Tbp = actualOtherVolumeM2Tbp;
    }

    public Integer getActualOtherVolumeM3Tbp() {
        return actualOtherVolumeM3Tbp;
    }

    public HCBTModel actualOtherVolumeM3Tbp(Integer actualOtherVolumeM3Tbp) {
        this.actualOtherVolumeM3Tbp = actualOtherVolumeM3Tbp;
        return this;
    }

    public void setActualOtherVolumeM3Tbp(Integer actualOtherVolumeM3Tbp) {
        this.actualOtherVolumeM3Tbp = actualOtherVolumeM3Tbp;
    }

    public Integer getActualSpendM1Usd() {
        return actualSpendM1Usd;
    }

    public HCBTModel actualSpendM1Usd(Integer actualSpendM1Usd) {
        this.actualSpendM1Usd = actualSpendM1Usd;
        return this;
    }

    public void setActualSpendM1Usd(Integer actualSpendM1Usd) {
        this.actualSpendM1Usd = actualSpendM1Usd;
    }

    public Double getInfActSpendM1NonUsdCurr() {
        return infActSpendM1NonUsdCurr;
    }

    public HCBTModel infActSpendM1NonUsdCurr(Double infActSpendM1NonUsdCurr) {
        this.infActSpendM1NonUsdCurr = infActSpendM1NonUsdCurr;
        return this;
    }

    public void setInfActSpendM1NonUsdCurr(Double infActSpendM1NonUsdCurr) {
        this.infActSpendM1NonUsdCurr = infActSpendM1NonUsdCurr;
    }

    public Integer getActualSpendM2Usd() {
        return actualSpendM2Usd;
    }

    public HCBTModel actualSpendM2Usd(Integer actualSpendM2Usd) {
        this.actualSpendM2Usd = actualSpendM2Usd;
        return this;
    }

    public void setActualSpendM2Usd(Integer actualSpendM2Usd) {
        this.actualSpendM2Usd = actualSpendM2Usd;
    }

    public Double getInfActSpendM2NonUsdCurr() {
        return infActSpendM2NonUsdCurr;
    }

    public HCBTModel infActSpendM2NonUsdCurr(Double infActSpendM2NonUsdCurr) {
        this.infActSpendM2NonUsdCurr = infActSpendM2NonUsdCurr;
        return this;
    }

    public void setInfActSpendM2NonUsdCurr(Double infActSpendM2NonUsdCurr) {
        this.infActSpendM2NonUsdCurr = infActSpendM2NonUsdCurr;
    }

    public Integer getActualSpendM3Usd() {
        return actualSpendM3Usd;
    }

    public HCBTModel actualSpendM3Usd(Integer actualSpendM3Usd) {
        this.actualSpendM3Usd = actualSpendM3Usd;
        return this;
    }

    public void setActualSpendM3Usd(Integer actualSpendM3Usd) {
        this.actualSpendM3Usd = actualSpendM3Usd;
    }

    public Double getInfActSpendM3NonUsdCurr() {
        return infActSpendM3NonUsdCurr;
    }

    public HCBTModel infActSpendM3NonUsdCurr(Double infActSpendM3NonUsdCurr) {
        this.infActSpendM3NonUsdCurr = infActSpendM3NonUsdCurr;
        return this;
    }

    public void setInfActSpendM3NonUsdCurr(Double infActSpendM3NonUsdCurr) {
        this.infActSpendM3NonUsdCurr = infActSpendM3NonUsdCurr;
    }

    public Integer getActualVolumeM1Tbp() {
        return actualVolumeM1Tbp;
    }

    public HCBTModel actualVolumeM1Tbp(Integer actualVolumeM1Tbp) {
        this.actualVolumeM1Tbp = actualVolumeM1Tbp;
        return this;
    }

    public void setActualVolumeM1Tbp(Integer actualVolumeM1Tbp) {
        this.actualVolumeM1Tbp = actualVolumeM1Tbp;
    }

    public Integer getActualVolumeM2Tbp() {
        return actualVolumeM2Tbp;
    }

    public HCBTModel actualVolumeM2Tbp(Integer actualVolumeM2Tbp) {
        this.actualVolumeM2Tbp = actualVolumeM2Tbp;
        return this;
    }

    public void setActualVolumeM2Tbp(Integer actualVolumeM2Tbp) {
        this.actualVolumeM2Tbp = actualVolumeM2Tbp;
    }

    public Integer getActualVolumeM3Tbp() {
        return actualVolumeM3Tbp;
    }

    public HCBTModel actualVolumeM3Tbp(Integer actualVolumeM3Tbp) {
        this.actualVolumeM3Tbp = actualVolumeM3Tbp;
        return this;
    }

    public void setActualVolumeM3Tbp(Integer actualVolumeM3Tbp) {
        this.actualVolumeM3Tbp = actualVolumeM3Tbp;
    }

    public Integer getActualPoValueDiffPer() {
        return actualPoValueDiffPer;
    }

    public HCBTModel actualPoValueDiffPer(Integer actualPoValueDiffPer) {
        this.actualPoValueDiffPer = actualPoValueDiffPer;
        return this;
    }

    public void setActualPoValueDiffPer(Integer actualPoValueDiffPer) {
        this.actualPoValueDiffPer = actualPoValueDiffPer;
    }

    public Integer getAhtInMinutesTbp() {
        return ahtInMinutesTbp;
    }

    public HCBTModel ahtInMinutesTbp(Integer ahtInMinutesTbp) {
        this.ahtInMinutesTbp = ahtInMinutesTbp;
        return this;
    }

    public void setAhtInMinutesTbp(Integer ahtInMinutesTbp) {
        this.ahtInMinutesTbp = ahtInMinutesTbp;
    }

    public Integer getAppOtHrsM1() {
        return appOtHrsM1;
    }

    public HCBTModel appOtHrsM1(Integer appOtHrsM1) {
        this.appOtHrsM1 = appOtHrsM1;
        return this;
    }

    public void setAppOtHrsM1(Integer appOtHrsM1) {
        this.appOtHrsM1 = appOtHrsM1;
    }

    public Integer getAppOtHrsM2() {
        return appOtHrsM2;
    }

    public HCBTModel appOtHrsM2(Integer appOtHrsM2) {
        this.appOtHrsM2 = appOtHrsM2;
        return this;
    }

    public void setAppOtHrsM2(Integer appOtHrsM2) {
        this.appOtHrsM2 = appOtHrsM2;
    }

    public Integer getAppOtHrsM3() {
        return appOtHrsM3;
    }

    public HCBTModel appOtHrsM3(Integer appOtHrsM3) {
        this.appOtHrsM3 = appOtHrsM3;
        return this;
    }

    public void setAppOtHrsM3(Integer appOtHrsM3) {
        this.appOtHrsM3 = appOtHrsM3;
    }

    public Integer getInfBaseAht() {
        return infBaseAht;
    }

    public HCBTModel infBaseAht(Integer infBaseAht) {
        this.infBaseAht = infBaseAht;
        return this;
    }

    public void setInfBaseAht(Integer infBaseAht) {
        this.infBaseAht = infBaseAht;
    }

    public String getInfBaseHeads() {
        return infBaseHeads;
    }

    public HCBTModel infBaseHeads(String infBaseHeads) {
        this.infBaseHeads = infBaseHeads;
        return this;
    }

    public void setInfBaseHeads(String infBaseHeads) {
        this.infBaseHeads = infBaseHeads;
    }

    public Integer getCnxBaseRateTbp() {
        return cnxBaseRateTbp;
    }

    public HCBTModel cnxBaseRateTbp(Integer cnxBaseRateTbp) {
        this.cnxBaseRateTbp = cnxBaseRateTbp;
        return this;
    }

    public void setCnxBaseRateTbp(Integer cnxBaseRateTbp) {
        this.cnxBaseRateTbp = cnxBaseRateTbp;
    }

    public Integer getCnxBaseRateFte() {
        return cnxBaseRateFte;
    }

    public HCBTModel cnxBaseRateFte(Integer cnxBaseRateFte) {
        this.cnxBaseRateFte = cnxBaseRateFte;
        return this;
    }

    public void setCnxBaseRateFte(Integer cnxBaseRateFte) {
        this.cnxBaseRateFte = cnxBaseRateFte;
    }

    public Integer getBillingAdjHittingM1() {
        return billingAdjHittingM1;
    }

    public HCBTModel billingAdjHittingM1(Integer billingAdjHittingM1) {
        this.billingAdjHittingM1 = billingAdjHittingM1;
        return this;
    }

    public void setBillingAdjHittingM1(Integer billingAdjHittingM1) {
        this.billingAdjHittingM1 = billingAdjHittingM1;
    }

    public Integer getBillingAdjHittingM2() {
        return billingAdjHittingM2;
    }

    public HCBTModel billingAdjHittingM2(Integer billingAdjHittingM2) {
        this.billingAdjHittingM2 = billingAdjHittingM2;
        return this;
    }

    public void setBillingAdjHittingM2(Integer billingAdjHittingM2) {
        this.billingAdjHittingM2 = billingAdjHittingM2;
    }

    public Integer getBillingAdjHittingM3() {
        return billingAdjHittingM3;
    }

    public HCBTModel billingAdjHittingM3(Integer billingAdjHittingM3) {
        this.billingAdjHittingM3 = billingAdjHittingM3;
        return this;
    }

    public void setBillingAdjHittingM3(Integer billingAdjHittingM3) {
        this.billingAdjHittingM3 = billingAdjHittingM3;
    }

    public Integer getBufferUsd() {
        return bufferUsd;
    }

    public HCBTModel bufferUsd(Integer bufferUsd) {
        this.bufferUsd = bufferUsd;
        return this;
    }

    public void setBufferUsd(Integer bufferUsd) {
        this.bufferUsd = bufferUsd;
    }

    public Double getInfBufferNonUsdCurr() {
        return infBufferNonUsdCurr;
    }

    public HCBTModel infBufferNonUsdCurr(Double infBufferNonUsdCurr) {
        this.infBufferNonUsdCurr = infBufferNonUsdCurr;
        return this;
    }

    public void setInfBufferNonUsdCurr(Double infBufferNonUsdCurr) {
        this.infBufferNonUsdCurr = infBufferNonUsdCurr;
    }

    public String getCiscoBusinessOwner() {
        return ciscoBusinessOwner;
    }

    public HCBTModel ciscoBusinessOwner(String ciscoBusinessOwner) {
        this.ciscoBusinessOwner = ciscoBusinessOwner;
        return this;
    }

    public void setCiscoBusinessOwner(String ciscoBusinessOwner) {
        this.ciscoBusinessOwner = ciscoBusinessOwner;
    }

    public String getInfCurrency() {
        return infCurrency;
    }

    public HCBTModel infCurrency(String infCurrency) {
        this.infCurrency = infCurrency;
        return this;
    }

    public void setInfCurrency(String infCurrency) {
        this.infCurrency = infCurrency;
    }

    public Integer getInfCurrencyHrlyRateFte() {
        return infCurrencyHrlyRateFte;
    }

    public HCBTModel infCurrencyHrlyRateFte(Integer infCurrencyHrlyRateFte) {
        this.infCurrencyHrlyRateFte = infCurrencyHrlyRateFte;
        return this;
    }

    public void setInfCurrencyHrlyRateFte(Integer infCurrencyHrlyRateFte) {
        this.infCurrencyHrlyRateFte = infCurrencyHrlyRateFte;
    }

    public Integer getActualProjM1DiffUsd() {
        return actualProjM1DiffUsd;
    }

    public HCBTModel actualProjM1DiffUsd(Integer actualProjM1DiffUsd) {
        this.actualProjM1DiffUsd = actualProjM1DiffUsd;
        return this;
    }

    public void setActualProjM1DiffUsd(Integer actualProjM1DiffUsd) {
        this.actualProjM1DiffUsd = actualProjM1DiffUsd;
    }

    public Integer getActualProjM2DiffUsd() {
        return actualProjM2DiffUsd;
    }

    public HCBTModel actualProjM2DiffUsd(Integer actualProjM2DiffUsd) {
        this.actualProjM2DiffUsd = actualProjM2DiffUsd;
        return this;
    }

    public void setActualProjM2DiffUsd(Integer actualProjM2DiffUsd) {
        this.actualProjM2DiffUsd = actualProjM2DiffUsd;
    }

    public Integer getActualProjM3DiffUsd() {
        return actualProjM3DiffUsd;
    }

    public HCBTModel actualProjM3DiffUsd(Integer actualProjM3DiffUsd) {
        this.actualProjM3DiffUsd = actualProjM3DiffUsd;
        return this;
    }

    public void setActualProjM3DiffUsd(Integer actualProjM3DiffUsd) {
        this.actualProjM3DiffUsd = actualProjM3DiffUsd;
    }

    public String getFiscalQuarterName() {
        return fiscalQuarterName;
    }

    public HCBTModel fiscalQuarterName(String fiscalQuarterName) {
        this.fiscalQuarterName = fiscalQuarterName;
        return this;
    }

    public void setFiscalQuarterName(String fiscalQuarterName) {
        this.fiscalQuarterName = fiscalQuarterName;
    }

    public String getVendorLocation() {
        return vendorLocation;
    }

    public HCBTModel vendorLocation(String vendorLocation) {
        this.vendorLocation = vendorLocation;
        return this;
    }

    public void setVendorLocation(String vendorLocation) {
        this.vendorLocation = vendorLocation;
    }

    public String getMethod() {
        return method;
    }

    public HCBTModel method(String method) {
        this.method = method;
        return this;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getActualMilestoneM1Per() {
        return actualMilestoneM1Per;
    }

    public HCBTModel actualMilestoneM1Per(Integer actualMilestoneM1Per) {
        this.actualMilestoneM1Per = actualMilestoneM1Per;
        return this;
    }

    public void setActualMilestoneM1Per(Integer actualMilestoneM1Per) {
        this.actualMilestoneM1Per = actualMilestoneM1Per;
    }

    public Integer getActualMilestoneM2Per() {
        return actualMilestoneM2Per;
    }

    public HCBTModel actualMilestoneM2Per(Integer actualMilestoneM2Per) {
        this.actualMilestoneM2Per = actualMilestoneM2Per;
        return this;
    }

    public void setActualMilestoneM2Per(Integer actualMilestoneM2Per) {
        this.actualMilestoneM2Per = actualMilestoneM2Per;
    }

    public Integer getActualMilestoneM3Per() {
        return actualMilestoneM3Per;
    }

    public HCBTModel actualMilestoneM3Per(Integer actualMilestoneM3Per) {
        this.actualMilestoneM3Per = actualMilestoneM3Per;
        return this;
    }

    public void setActualMilestoneM3Per(Integer actualMilestoneM3Per) {
        this.actualMilestoneM3Per = actualMilestoneM3Per;
    }

    public Integer getMilestoneValueM1Usd() {
        return milestoneValueM1Usd;
    }

    public HCBTModel milestoneValueM1Usd(Integer milestoneValueM1Usd) {
        this.milestoneValueM1Usd = milestoneValueM1Usd;
        return this;
    }

    public void setMilestoneValueM1Usd(Integer milestoneValueM1Usd) {
        this.milestoneValueM1Usd = milestoneValueM1Usd;
    }

    public Double getInfMStonValM1NonUsdCur() {
        return infMStonValM1NonUsdCur;
    }

    public HCBTModel infMStonValM1NonUsdCur(Double infMStonValM1NonUsdCur) {
        this.infMStonValM1NonUsdCur = infMStonValM1NonUsdCur;
        return this;
    }

    public void setInfMStonValM1NonUsdCur(Double infMStonValM1NonUsdCur) {
        this.infMStonValM1NonUsdCur = infMStonValM1NonUsdCur;
    }

    public Integer getMilestoneValueM2Usd() {
        return milestoneValueM2Usd;
    }

    public HCBTModel milestoneValueM2Usd(Integer milestoneValueM2Usd) {
        this.milestoneValueM2Usd = milestoneValueM2Usd;
        return this;
    }

    public void setMilestoneValueM2Usd(Integer milestoneValueM2Usd) {
        this.milestoneValueM2Usd = milestoneValueM2Usd;
    }

    public Double getInfMStonValM2NonUsdCur() {
        return infMStonValM2NonUsdCur;
    }

    public HCBTModel infMStonValM2NonUsdCur(Double infMStonValM2NonUsdCur) {
        this.infMStonValM2NonUsdCur = infMStonValM2NonUsdCur;
        return this;
    }

    public void setInfMStonValM2NonUsdCur(Double infMStonValM2NonUsdCur) {
        this.infMStonValM2NonUsdCur = infMStonValM2NonUsdCur;
    }

    public Integer getMilestoneValueM3Usd() {
        return milestoneValueM3Usd;
    }

    public HCBTModel milestoneValueM3Usd(Integer milestoneValueM3Usd) {
        this.milestoneValueM3Usd = milestoneValueM3Usd;
        return this;
    }

    public void setMilestoneValueM3Usd(Integer milestoneValueM3Usd) {
        this.milestoneValueM3Usd = milestoneValueM3Usd;
    }

    public Double getInfMStonValM3NonUsdCur() {
        return infMStonValM3NonUsdCur;
    }

    public HCBTModel infMStonValM3NonUsdCur(Double infMStonValM3NonUsdCur) {
        this.infMStonValM3NonUsdCur = infMStonValM3NonUsdCur;
        return this;
    }

    public void setInfMStonValM3NonUsdCur(Double infMStonValM3NonUsdCur) {
        this.infMStonValM3NonUsdCur = infMStonValM3NonUsdCur;
    }

    public Integer getCnxChrAgentNumWdnmCases() {
        return cnxChrAgentNumWdnmCases;
    }

    public HCBTModel cnxChrAgentNumWdnmCases(Integer cnxChrAgentNumWdnmCases) {
        this.cnxChrAgentNumWdnmCases = cnxChrAgentNumWdnmCases;
        return this;
    }

    public void setCnxChrAgentNumWdnmCases(Integer cnxChrAgentNumWdnmCases) {
        this.cnxChrAgentNumWdnmCases = cnxChrAgentNumWdnmCases;
    }

    public Integer getCnvChrStaffHrsWdnmCases() {
        return cnvChrStaffHrsWdnmCases;
    }

    public HCBTModel cnvChrStaffHrsWdnmCases(Integer cnvChrStaffHrsWdnmCases) {
        this.cnvChrStaffHrsWdnmCases = cnvChrStaffHrsWdnmCases;
        return this;
    }

    public void setCnvChrStaffHrsWdnmCases(Integer cnvChrStaffHrsWdnmCases) {
        this.cnvChrStaffHrsWdnmCases = cnvChrStaffHrsWdnmCases;
    }

    public Integer getOtherVolumeRateTbp() {
        return otherVolumeRateTbp;
    }

    public HCBTModel otherVolumeRateTbp(Integer otherVolumeRateTbp) {
        this.otherVolumeRateTbp = otherVolumeRateTbp;
        return this;
    }

    public void setOtherVolumeRateTbp(Integer otherVolumeRateTbp) {
        this.otherVolumeRateTbp = otherVolumeRateTbp;
    }

    public Integer getOtRate() {
        return otRate;
    }

    public HCBTModel otRate(Integer otRate) {
        this.otRate = otRate;
        return this;
    }

    public void setOtRate(Integer otRate) {
        this.otRate = otRate;
    }

    public Integer getOtSpendM1() {
        return otSpendM1;
    }

    public HCBTModel otSpendM1(Integer otSpendM1) {
        this.otSpendM1 = otSpendM1;
        return this;
    }

    public void setOtSpendM1(Integer otSpendM1) {
        this.otSpendM1 = otSpendM1;
    }

    public Integer getOtSpendM2() {
        return otSpendM2;
    }

    public HCBTModel otSpendM2(Integer otSpendM2) {
        this.otSpendM2 = otSpendM2;
        return this;
    }

    public void setOtSpendM2(Integer otSpendM2) {
        this.otSpendM2 = otSpendM2;
    }

    public Integer getOtSpendM3() {
        return otSpendM3;
    }

    public HCBTModel otSpendM3(Integer otSpendM3) {
        this.otSpendM3 = otSpendM3;
        return this;
    }

    public void setOtSpendM3(Integer otSpendM3) {
        this.otSpendM3 = otSpendM3;
    }

    public Integer getPoAmountUsd() {
        return poAmountUsd;
    }

    public HCBTModel poAmountUsd(Integer poAmountUsd) {
        this.poAmountUsd = poAmountUsd;
        return this;
    }

    public void setPoAmountUsd(Integer poAmountUsd) {
        this.poAmountUsd = poAmountUsd;
    }

    public Integer getInfPoAmountNonUsd() {
        return infPoAmountNonUsd;
    }

    public HCBTModel infPoAmountNonUsd(Integer infPoAmountNonUsd) {
        this.infPoAmountNonUsd = infPoAmountNonUsd;
        return this;
    }

    public void setInfPoAmountNonUsd(Integer infPoAmountNonUsd) {
        this.infPoAmountNonUsd = infPoAmountNonUsd;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public HCBTModel poNumber(String poNumber) {
        this.poNumber = poNumber;
        return this;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public Integer getProjBillableHeadsM1Fte() {
        return projBillableHeadsM1Fte;
    }

    public HCBTModel projBillableHeadsM1Fte(Integer projBillableHeadsM1Fte) {
        this.projBillableHeadsM1Fte = projBillableHeadsM1Fte;
        return this;
    }

    public void setProjBillableHeadsM1Fte(Integer projBillableHeadsM1Fte) {
        this.projBillableHeadsM1Fte = projBillableHeadsM1Fte;
    }

    public Integer getProjBillableHeadsM2Fte() {
        return projBillableHeadsM2Fte;
    }

    public HCBTModel projBillableHeadsM2Fte(Integer projBillableHeadsM2Fte) {
        this.projBillableHeadsM2Fte = projBillableHeadsM2Fte;
        return this;
    }

    public void setProjBillableHeadsM2Fte(Integer projBillableHeadsM2Fte) {
        this.projBillableHeadsM2Fte = projBillableHeadsM2Fte;
    }

    public Integer getProjBillableHeadsM3Fte() {
        return projBillableHeadsM3Fte;
    }

    public HCBTModel projBillableHeadsM3Fte(Integer projBillableHeadsM3Fte) {
        this.projBillableHeadsM3Fte = projBillableHeadsM3Fte;
        return this;
    }

    public void setProjBillableHeadsM3Fte(Integer projBillableHeadsM3Fte) {
        this.projBillableHeadsM3Fte = projBillableHeadsM3Fte;
    }

    public Integer getProjectedBillableHrsM1Ph() {
        return projectedBillableHrsM1Ph;
    }

    public HCBTModel projectedBillableHrsM1Ph(Integer projectedBillableHrsM1Ph) {
        this.projectedBillableHrsM1Ph = projectedBillableHrsM1Ph;
        return this;
    }

    public void setProjectedBillableHrsM1Ph(Integer projectedBillableHrsM1Ph) {
        this.projectedBillableHrsM1Ph = projectedBillableHrsM1Ph;
    }

    public Integer getProjectedBillableHrsM2Ph() {
        return projectedBillableHrsM2Ph;
    }

    public HCBTModel projectedBillableHrsM2Ph(Integer projectedBillableHrsM2Ph) {
        this.projectedBillableHrsM2Ph = projectedBillableHrsM2Ph;
        return this;
    }

    public void setProjectedBillableHrsM2Ph(Integer projectedBillableHrsM2Ph) {
        this.projectedBillableHrsM2Ph = projectedBillableHrsM2Ph;
    }

    public Integer getProjectedBillableHrsM3Ph() {
        return projectedBillableHrsM3Ph;
    }

    public HCBTModel projectedBillableHrsM3Ph(Integer projectedBillableHrsM3Ph) {
        this.projectedBillableHrsM3Ph = projectedBillableHrsM3Ph;
        return this;
    }

    public void setProjectedBillableHrsM3Ph(Integer projectedBillableHrsM3Ph) {
        this.projectedBillableHrsM3Ph = projectedBillableHrsM3Ph;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HCBTModel hCBTModel = (HCBTModel) o;
        if (hCBTModel.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), hCBTModel.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "HCBTModel{" +
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
