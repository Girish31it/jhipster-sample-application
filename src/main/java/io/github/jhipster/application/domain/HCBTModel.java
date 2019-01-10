package io.github.jhipster.application.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
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

    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "vendor_location")
    private String vendorLocation;

    @Column(name = "service_pillar")
    private String servicePillar;

    @Column(name = "service_category")
    private String serviceCategory;

    @Column(name = "service_drilldown")
    private String serviceDrilldown;

    @Column(name = "sow_name")
    private String sowName;

    @Column(name = "sow_number")
    private String sowNumber;

    @Column(name = "po_number")
    private String poNumber;

    @Column(name = "delivery_poc")
    private String deliveryPoc;

    @Column(name = "cisco_business_owner")
    private String ciscoBusinessOwner;

    @Column(name = "chrgble_agent_num_wdnm_cases")
    private Integer chrgbleAgentNumWdnmCases;

    @Column(name = "projected_billable_heads_m_1")
    private Integer projectedBillableHeadsM1;

    @Column(name = "projected_billable_heads_m_2")
    private Integer projectedBillableHeadsM2;

    @Column(name = "projected_billable_heads_m_3")
    private Integer projectedBillableHeadsM3;

    @Column(name = "fte_hourly_rate_dollar")
    private Integer fteHourlyRateDollar;

    @Column(name = "projected_tbp_volume_m_1")
    private Integer projectedTbpVolumeM1;

    @Column(name = "projected_tbp_volume_m_2")
    private Integer projectedTbpVolumeM2;

    @Column(name = "projected_tbp_volume_m_3")
    private Integer projectedTbpVolumeM3;

    @Column(name = "projected_other_vol_m_1")
    private Integer projectedOtherVolM1;

    @Column(name = "projected_other_vol_m_2")
    private Integer projectedOtherVolM2;

    @Column(name = "projected_other_vol_m_3")
    private Integer projectedOtherVolM3;

    @Column(name = "aht_in_minutes")
    private Integer ahtInMinutes;

    @Column(name = "dollar_rate_per_minute")
    private Integer dollarRatePerMinute;

    @Column(name = "other_volume_rate")
    private Integer otherVolumeRate;

    @Column(name = "inf_milestone_value_m_1_non_usd")
    private Integer infMilestoneValueM1NonUsd;

    @Column(name = "inf_milestone_value_m_2_non_usd")
    private Integer infMilestoneValueM2NonUsd;

    @Column(name = "inf_milestone_value_m_3_non_usd")
    private Integer infMilestoneValueM3NonUsd;

    @Column(name = "inf_buffer_non_usd")
    private Integer infBufferNonUsd;

    @Column(name = "inf_po_amount_non_usd")
    private Integer infPoAmountNonUsd;

    @Column(name = "milestone_value_m_1_usd")
    private Integer milestoneValueM1Usd;

    @Column(name = "milestone_value_m_2_usd")
    private Integer milestoneValueM2Usd;

    @Column(name = "milestone_value_m_3_usd")
    private Integer milestoneValueM3Usd;

    @Column(name = "buffer_usd")
    private Integer bufferUsd;

    @Column(name = "po_amount_usd")
    private Integer poAmountUsd;

    @Column(name = "actual_billable_heads_m_1")
    private Integer actualBillableHeadsM1;

    @Column(name = "pay_act_billable_hours_m_1")
    private Integer payActBillableHoursM1;

    @Column(name = "actual_billable_heads_m_2")
    private Integer actualBillableHeadsM2;

    @Column(name = "pay_act_billable_hours_m_2")
    private Integer payActBillableHoursM2;

    @Column(name = "actual_billable_heads_m_3")
    private Integer actualBillableHeadsM3;

    @Column(name = "pay_act_billable_hours_m_3")
    private Integer payActBillableHoursM3;

    @Column(name = "actual_tbp_volume_m_1")
    private Integer actualTbpVolumeM1;

    @Column(name = "actual_tbp_volume_m_2")
    private Integer actualTbpVolumeM2;

    @Column(name = "actual_tbp_volume_m_3")
    private Integer actualTbpVolumeM3;

    @Column(name = "actual_other_vol_m_1")
    private Integer actualOtherVolM1;

    @Column(name = "actual_other_vol_m_2")
    private Integer actualOtherVolM2;

    @Column(name = "actual_other_vol_m_3")
    private Integer actualOtherVolM3;

    @Column(name = "billing_adj_hitting_m_1")
    private Integer billingAdjHittingM1;

    @Column(name = "billing_adj_hitting_m_2")
    private Integer billingAdjHittingM2;

    @Column(name = "billing_adj_hitting_m_3")
    private Integer billingAdjHittingM3;

    @Column(name = "actual_spend_m_1_usd")
    private Integer actualSpendM1Usd;

    @Column(name = "actual_spend_m_2_usd")
    private Integer actualSpendM2Usd;

    @Column(name = "actual_spend_m_3_usd")
    private Integer actualSpendM3Usd;

    @Column(name = "total_qtrly_spend_usd")
    private Integer totalQtrlySpendUsd;

    @Column(name = "actual_proj_m_1_diff_usd")
    private Integer actualProjM1DiffUsd;

    @Column(name = "actual_proj_m_2_diff_usd")
    private Integer actualProjM2DiffUsd;

    @Column(name = "actual_proj_m_3_diff_usd")
    private Integer actualProjM3DiffUsd;

    @Column(name = "actual_milestone_m_3_diff_per")
    private Integer actualMilestoneM3DiffPer;

    @Column(name = "actual_po_value_diff_per")
    private Integer actualPoValueDiffPer;

    @Column(name = "retrospective_adj_m_1")
    private Integer retrospectiveAdjM1;

    @Column(name = "retrospective_adj_m_2")
    private Integer retrospectiveAdjM2;

    @Column(name = "retrospective_adj_m_3")
    private Integer retrospectiveAdjM3;

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

    @Column(name = "method")
    private String method;

    @Column(name = "ot_rate")
    private Integer otRate;

    @Column(name = "app_ot_hrs_m_1")
    private Integer appOtHrsM1;

    @Column(name = "app_ot_hrs_m_2")
    private Integer appOtHrsM2;

    @Column(name = "app_ot_hrs_m_3")
    private Integer appOtHrsM3;

    @Column(name = "ot_spend_m_1")
    private Integer otSpendM1;

    @Column(name = "ot_spend_m_2")
    private Integer otSpendM2;

    @Column(name = "ot_spend_m_3")
    private Integer otSpendM3;

    @Column(name = "notes")
    private String notes;

    @Column(name = "chrgble_staff_hrs_wdnm_cases")
    private Integer chrgbleStaffHrsWDNMCases;

    @Column(name = "projected_billable_hrs_m_1")
    private Integer projectedBillableHrsM1;

    @Column(name = "projected_billable_hrs_m_2")
    private Integer projectedBillableHrsM2;

    @Column(name = "projected_billable_hrs_m_3")
    private Integer projectedBillableHrsM3;

    @Column(name = "cca_vendor_data_sk")
    private String ccaVendorDataSk;

    @Column(name = "payroll_hourly_rate_dollar")
    private Integer payrollHourlyRateDollar;

    @Column(name = "inf_actual_billable_hours_m_1")
    private Integer infActualBillableHoursM1;

    @Column(name = "inf_actual_billable_hours_m_2")
    private Integer infActualBillableHoursM2;

    @Column(name = "inf_actual_billable_hours_m_3")
    private Integer infActualBillableHoursM3;

    @Column(name = "inf_actual_spend_m_1_non_usd")
    private Integer infActualSpendM1NonUsd;

    @Column(name = "inf_actual_spend_m_2_non_usd")
    private Integer infActualSpendM2NonUsd;

    @Column(name = "inf_actual_spend_m_3_non_usd")
    private Integer infActualSpendM3NonUsd;

    @Column(name = "inf_base_aht")
    private Integer infBaseAht;

    @Column(name = "inf_base_heads")
    private Integer infBaseHeads;

    @Column(name = "cnx_base_rate")
    private Integer cnxBaseRate;

    @Column(name = "inf_currency")
    private Integer infCurrency;

    @Column(name = "inf_currency_hourly_rate")
    private Integer infCurrencyHourlyRate;

    @Column(name = "fiscal_quater_name")
    private String fiscalQuaterName;

    @Column(name = "actual_milestone_m_1_diff_per")
    private Integer actualMilestoneM1DiffPer;

    @Column(name = "actual_milestone_m_2_diff_per")
    private Integer actualMilestoneM2DiffPer;

    @Column(name = "qtrly_diff_actual_projection")
    private Integer qtrlyDiffActualProjection;

    @Column(name = "inf_total_qtrly_spend_non_usd")
    private Integer infTotalQtrlySpendNonUsd;

    @Column(name = "data_flag")
    private String dataFlag;

    @Column(name = "load_date")
    private Integer loadDate;

    @Column(name = "cnx_base_rate_fte")
    private Integer cnxBaseRateFte;

    @Column(name = "cnxbaseratetbp")
    private Integer cnxbaseratetbp;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getServiceDrilldown() {
        return serviceDrilldown;
    }

    public HCBTModel serviceDrilldown(String serviceDrilldown) {
        this.serviceDrilldown = serviceDrilldown;
        return this;
    }

    public void setServiceDrilldown(String serviceDrilldown) {
        this.serviceDrilldown = serviceDrilldown;
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

    public Integer getChrgbleAgentNumWdnmCases() {
        return chrgbleAgentNumWdnmCases;
    }

    public HCBTModel chrgbleAgentNumWdnmCases(Integer chrgbleAgentNumWdnmCases) {
        this.chrgbleAgentNumWdnmCases = chrgbleAgentNumWdnmCases;
        return this;
    }

    public void setChrgbleAgentNumWdnmCases(Integer chrgbleAgentNumWdnmCases) {
        this.chrgbleAgentNumWdnmCases = chrgbleAgentNumWdnmCases;
    }

    public Integer getProjectedBillableHeadsM1() {
        return projectedBillableHeadsM1;
    }

    public HCBTModel projectedBillableHeadsM1(Integer projectedBillableHeadsM1) {
        this.projectedBillableHeadsM1 = projectedBillableHeadsM1;
        return this;
    }

    public void setProjectedBillableHeadsM1(Integer projectedBillableHeadsM1) {
        this.projectedBillableHeadsM1 = projectedBillableHeadsM1;
    }

    public Integer getProjectedBillableHeadsM2() {
        return projectedBillableHeadsM2;
    }

    public HCBTModel projectedBillableHeadsM2(Integer projectedBillableHeadsM2) {
        this.projectedBillableHeadsM2 = projectedBillableHeadsM2;
        return this;
    }

    public void setProjectedBillableHeadsM2(Integer projectedBillableHeadsM2) {
        this.projectedBillableHeadsM2 = projectedBillableHeadsM2;
    }

    public Integer getProjectedBillableHeadsM3() {
        return projectedBillableHeadsM3;
    }

    public HCBTModel projectedBillableHeadsM3(Integer projectedBillableHeadsM3) {
        this.projectedBillableHeadsM3 = projectedBillableHeadsM3;
        return this;
    }

    public void setProjectedBillableHeadsM3(Integer projectedBillableHeadsM3) {
        this.projectedBillableHeadsM3 = projectedBillableHeadsM3;
    }

    public Integer getFteHourlyRateDollar() {
        return fteHourlyRateDollar;
    }

    public HCBTModel fteHourlyRateDollar(Integer fteHourlyRateDollar) {
        this.fteHourlyRateDollar = fteHourlyRateDollar;
        return this;
    }

    public void setFteHourlyRateDollar(Integer fteHourlyRateDollar) {
        this.fteHourlyRateDollar = fteHourlyRateDollar;
    }

    public Integer getProjectedTbpVolumeM1() {
        return projectedTbpVolumeM1;
    }

    public HCBTModel projectedTbpVolumeM1(Integer projectedTbpVolumeM1) {
        this.projectedTbpVolumeM1 = projectedTbpVolumeM1;
        return this;
    }

    public void setProjectedTbpVolumeM1(Integer projectedTbpVolumeM1) {
        this.projectedTbpVolumeM1 = projectedTbpVolumeM1;
    }

    public Integer getProjectedTbpVolumeM2() {
        return projectedTbpVolumeM2;
    }

    public HCBTModel projectedTbpVolumeM2(Integer projectedTbpVolumeM2) {
        this.projectedTbpVolumeM2 = projectedTbpVolumeM2;
        return this;
    }

    public void setProjectedTbpVolumeM2(Integer projectedTbpVolumeM2) {
        this.projectedTbpVolumeM2 = projectedTbpVolumeM2;
    }

    public Integer getProjectedTbpVolumeM3() {
        return projectedTbpVolumeM3;
    }

    public HCBTModel projectedTbpVolumeM3(Integer projectedTbpVolumeM3) {
        this.projectedTbpVolumeM3 = projectedTbpVolumeM3;
        return this;
    }

    public void setProjectedTbpVolumeM3(Integer projectedTbpVolumeM3) {
        this.projectedTbpVolumeM3 = projectedTbpVolumeM3;
    }

    public Integer getProjectedOtherVolM1() {
        return projectedOtherVolM1;
    }

    public HCBTModel projectedOtherVolM1(Integer projectedOtherVolM1) {
        this.projectedOtherVolM1 = projectedOtherVolM1;
        return this;
    }

    public void setProjectedOtherVolM1(Integer projectedOtherVolM1) {
        this.projectedOtherVolM1 = projectedOtherVolM1;
    }

    public Integer getProjectedOtherVolM2() {
        return projectedOtherVolM2;
    }

    public HCBTModel projectedOtherVolM2(Integer projectedOtherVolM2) {
        this.projectedOtherVolM2 = projectedOtherVolM2;
        return this;
    }

    public void setProjectedOtherVolM2(Integer projectedOtherVolM2) {
        this.projectedOtherVolM2 = projectedOtherVolM2;
    }

    public Integer getProjectedOtherVolM3() {
        return projectedOtherVolM3;
    }

    public HCBTModel projectedOtherVolM3(Integer projectedOtherVolM3) {
        this.projectedOtherVolM3 = projectedOtherVolM3;
        return this;
    }

    public void setProjectedOtherVolM3(Integer projectedOtherVolM3) {
        this.projectedOtherVolM3 = projectedOtherVolM3;
    }

    public Integer getAhtInMinutes() {
        return ahtInMinutes;
    }

    public HCBTModel ahtInMinutes(Integer ahtInMinutes) {
        this.ahtInMinutes = ahtInMinutes;
        return this;
    }

    public void setAhtInMinutes(Integer ahtInMinutes) {
        this.ahtInMinutes = ahtInMinutes;
    }

    public Integer getDollarRatePerMinute() {
        return dollarRatePerMinute;
    }

    public HCBTModel dollarRatePerMinute(Integer dollarRatePerMinute) {
        this.dollarRatePerMinute = dollarRatePerMinute;
        return this;
    }

    public void setDollarRatePerMinute(Integer dollarRatePerMinute) {
        this.dollarRatePerMinute = dollarRatePerMinute;
    }

    public Integer getOtherVolumeRate() {
        return otherVolumeRate;
    }

    public HCBTModel otherVolumeRate(Integer otherVolumeRate) {
        this.otherVolumeRate = otherVolumeRate;
        return this;
    }

    public void setOtherVolumeRate(Integer otherVolumeRate) {
        this.otherVolumeRate = otherVolumeRate;
    }

    public Integer getInfMilestoneValueM1NonUsd() {
        return infMilestoneValueM1NonUsd;
    }

    public HCBTModel infMilestoneValueM1NonUsd(Integer infMilestoneValueM1NonUsd) {
        this.infMilestoneValueM1NonUsd = infMilestoneValueM1NonUsd;
        return this;
    }

    public void setInfMilestoneValueM1NonUsd(Integer infMilestoneValueM1NonUsd) {
        this.infMilestoneValueM1NonUsd = infMilestoneValueM1NonUsd;
    }

    public Integer getInfMilestoneValueM2NonUsd() {
        return infMilestoneValueM2NonUsd;
    }

    public HCBTModel infMilestoneValueM2NonUsd(Integer infMilestoneValueM2NonUsd) {
        this.infMilestoneValueM2NonUsd = infMilestoneValueM2NonUsd;
        return this;
    }

    public void setInfMilestoneValueM2NonUsd(Integer infMilestoneValueM2NonUsd) {
        this.infMilestoneValueM2NonUsd = infMilestoneValueM2NonUsd;
    }

    public Integer getInfMilestoneValueM3NonUsd() {
        return infMilestoneValueM3NonUsd;
    }

    public HCBTModel infMilestoneValueM3NonUsd(Integer infMilestoneValueM3NonUsd) {
        this.infMilestoneValueM3NonUsd = infMilestoneValueM3NonUsd;
        return this;
    }

    public void setInfMilestoneValueM3NonUsd(Integer infMilestoneValueM3NonUsd) {
        this.infMilestoneValueM3NonUsd = infMilestoneValueM3NonUsd;
    }

    public Integer getInfBufferNonUsd() {
        return infBufferNonUsd;
    }

    public HCBTModel infBufferNonUsd(Integer infBufferNonUsd) {
        this.infBufferNonUsd = infBufferNonUsd;
        return this;
    }

    public void setInfBufferNonUsd(Integer infBufferNonUsd) {
        this.infBufferNonUsd = infBufferNonUsd;
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

    public Integer getActualBillableHeadsM1() {
        return actualBillableHeadsM1;
    }

    public HCBTModel actualBillableHeadsM1(Integer actualBillableHeadsM1) {
        this.actualBillableHeadsM1 = actualBillableHeadsM1;
        return this;
    }

    public void setActualBillableHeadsM1(Integer actualBillableHeadsM1) {
        this.actualBillableHeadsM1 = actualBillableHeadsM1;
    }

    public Integer getPayActBillableHoursM1() {
        return payActBillableHoursM1;
    }

    public HCBTModel payActBillableHoursM1(Integer payActBillableHoursM1) {
        this.payActBillableHoursM1 = payActBillableHoursM1;
        return this;
    }

    public void setPayActBillableHoursM1(Integer payActBillableHoursM1) {
        this.payActBillableHoursM1 = payActBillableHoursM1;
    }

    public Integer getActualBillableHeadsM2() {
        return actualBillableHeadsM2;
    }

    public HCBTModel actualBillableHeadsM2(Integer actualBillableHeadsM2) {
        this.actualBillableHeadsM2 = actualBillableHeadsM2;
        return this;
    }

    public void setActualBillableHeadsM2(Integer actualBillableHeadsM2) {
        this.actualBillableHeadsM2 = actualBillableHeadsM2;
    }

    public Integer getPayActBillableHoursM2() {
        return payActBillableHoursM2;
    }

    public HCBTModel payActBillableHoursM2(Integer payActBillableHoursM2) {
        this.payActBillableHoursM2 = payActBillableHoursM2;
        return this;
    }

    public void setPayActBillableHoursM2(Integer payActBillableHoursM2) {
        this.payActBillableHoursM2 = payActBillableHoursM2;
    }

    public Integer getActualBillableHeadsM3() {
        return actualBillableHeadsM3;
    }

    public HCBTModel actualBillableHeadsM3(Integer actualBillableHeadsM3) {
        this.actualBillableHeadsM3 = actualBillableHeadsM3;
        return this;
    }

    public void setActualBillableHeadsM3(Integer actualBillableHeadsM3) {
        this.actualBillableHeadsM3 = actualBillableHeadsM3;
    }

    public Integer getPayActBillableHoursM3() {
        return payActBillableHoursM3;
    }

    public HCBTModel payActBillableHoursM3(Integer payActBillableHoursM3) {
        this.payActBillableHoursM3 = payActBillableHoursM3;
        return this;
    }

    public void setPayActBillableHoursM3(Integer payActBillableHoursM3) {
        this.payActBillableHoursM3 = payActBillableHoursM3;
    }

    public Integer getActualTbpVolumeM1() {
        return actualTbpVolumeM1;
    }

    public HCBTModel actualTbpVolumeM1(Integer actualTbpVolumeM1) {
        this.actualTbpVolumeM1 = actualTbpVolumeM1;
        return this;
    }

    public void setActualTbpVolumeM1(Integer actualTbpVolumeM1) {
        this.actualTbpVolumeM1 = actualTbpVolumeM1;
    }

    public Integer getActualTbpVolumeM2() {
        return actualTbpVolumeM2;
    }

    public HCBTModel actualTbpVolumeM2(Integer actualTbpVolumeM2) {
        this.actualTbpVolumeM2 = actualTbpVolumeM2;
        return this;
    }

    public void setActualTbpVolumeM2(Integer actualTbpVolumeM2) {
        this.actualTbpVolumeM2 = actualTbpVolumeM2;
    }

    public Integer getActualTbpVolumeM3() {
        return actualTbpVolumeM3;
    }

    public HCBTModel actualTbpVolumeM3(Integer actualTbpVolumeM3) {
        this.actualTbpVolumeM3 = actualTbpVolumeM3;
        return this;
    }

    public void setActualTbpVolumeM3(Integer actualTbpVolumeM3) {
        this.actualTbpVolumeM3 = actualTbpVolumeM3;
    }

    public Integer getActualOtherVolM1() {
        return actualOtherVolM1;
    }

    public HCBTModel actualOtherVolM1(Integer actualOtherVolM1) {
        this.actualOtherVolM1 = actualOtherVolM1;
        return this;
    }

    public void setActualOtherVolM1(Integer actualOtherVolM1) {
        this.actualOtherVolM1 = actualOtherVolM1;
    }

    public Integer getActualOtherVolM2() {
        return actualOtherVolM2;
    }

    public HCBTModel actualOtherVolM2(Integer actualOtherVolM2) {
        this.actualOtherVolM2 = actualOtherVolM2;
        return this;
    }

    public void setActualOtherVolM2(Integer actualOtherVolM2) {
        this.actualOtherVolM2 = actualOtherVolM2;
    }

    public Integer getActualOtherVolM3() {
        return actualOtherVolM3;
    }

    public HCBTModel actualOtherVolM3(Integer actualOtherVolM3) {
        this.actualOtherVolM3 = actualOtherVolM3;
        return this;
    }

    public void setActualOtherVolM3(Integer actualOtherVolM3) {
        this.actualOtherVolM3 = actualOtherVolM3;
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

    public Integer getActualMilestoneM3DiffPer() {
        return actualMilestoneM3DiffPer;
    }

    public HCBTModel actualMilestoneM3DiffPer(Integer actualMilestoneM3DiffPer) {
        this.actualMilestoneM3DiffPer = actualMilestoneM3DiffPer;
        return this;
    }

    public void setActualMilestoneM3DiffPer(Integer actualMilestoneM3DiffPer) {
        this.actualMilestoneM3DiffPer = actualMilestoneM3DiffPer;
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

    public Integer getChrgbleStaffHrsWDNMCases() {
        return chrgbleStaffHrsWDNMCases;
    }

    public HCBTModel chrgbleStaffHrsWDNMCases(Integer chrgbleStaffHrsWDNMCases) {
        this.chrgbleStaffHrsWDNMCases = chrgbleStaffHrsWDNMCases;
        return this;
    }

    public void setChrgbleStaffHrsWDNMCases(Integer chrgbleStaffHrsWDNMCases) {
        this.chrgbleStaffHrsWDNMCases = chrgbleStaffHrsWDNMCases;
    }

    public Integer getProjectedBillableHrsM1() {
        return projectedBillableHrsM1;
    }

    public HCBTModel projectedBillableHrsM1(Integer projectedBillableHrsM1) {
        this.projectedBillableHrsM1 = projectedBillableHrsM1;
        return this;
    }

    public void setProjectedBillableHrsM1(Integer projectedBillableHrsM1) {
        this.projectedBillableHrsM1 = projectedBillableHrsM1;
    }

    public Integer getProjectedBillableHrsM2() {
        return projectedBillableHrsM2;
    }

    public HCBTModel projectedBillableHrsM2(Integer projectedBillableHrsM2) {
        this.projectedBillableHrsM2 = projectedBillableHrsM2;
        return this;
    }

    public void setProjectedBillableHrsM2(Integer projectedBillableHrsM2) {
        this.projectedBillableHrsM2 = projectedBillableHrsM2;
    }

    public Integer getProjectedBillableHrsM3() {
        return projectedBillableHrsM3;
    }

    public HCBTModel projectedBillableHrsM3(Integer projectedBillableHrsM3) {
        this.projectedBillableHrsM3 = projectedBillableHrsM3;
        return this;
    }

    public void setProjectedBillableHrsM3(Integer projectedBillableHrsM3) {
        this.projectedBillableHrsM3 = projectedBillableHrsM3;
    }

    public String getCcaVendorDataSk() {
        return ccaVendorDataSk;
    }

    public HCBTModel ccaVendorDataSk(String ccaVendorDataSk) {
        this.ccaVendorDataSk = ccaVendorDataSk;
        return this;
    }

    public void setCcaVendorDataSk(String ccaVendorDataSk) {
        this.ccaVendorDataSk = ccaVendorDataSk;
    }

    public Integer getPayrollHourlyRateDollar() {
        return payrollHourlyRateDollar;
    }

    public HCBTModel payrollHourlyRateDollar(Integer payrollHourlyRateDollar) {
        this.payrollHourlyRateDollar = payrollHourlyRateDollar;
        return this;
    }

    public void setPayrollHourlyRateDollar(Integer payrollHourlyRateDollar) {
        this.payrollHourlyRateDollar = payrollHourlyRateDollar;
    }

    public Integer getInfActualBillableHoursM1() {
        return infActualBillableHoursM1;
    }

    public HCBTModel infActualBillableHoursM1(Integer infActualBillableHoursM1) {
        this.infActualBillableHoursM1 = infActualBillableHoursM1;
        return this;
    }

    public void setInfActualBillableHoursM1(Integer infActualBillableHoursM1) {
        this.infActualBillableHoursM1 = infActualBillableHoursM1;
    }

    public Integer getInfActualBillableHoursM2() {
        return infActualBillableHoursM2;
    }

    public HCBTModel infActualBillableHoursM2(Integer infActualBillableHoursM2) {
        this.infActualBillableHoursM2 = infActualBillableHoursM2;
        return this;
    }

    public void setInfActualBillableHoursM2(Integer infActualBillableHoursM2) {
        this.infActualBillableHoursM2 = infActualBillableHoursM2;
    }

    public Integer getInfActualBillableHoursM3() {
        return infActualBillableHoursM3;
    }

    public HCBTModel infActualBillableHoursM3(Integer infActualBillableHoursM3) {
        this.infActualBillableHoursM3 = infActualBillableHoursM3;
        return this;
    }

    public void setInfActualBillableHoursM3(Integer infActualBillableHoursM3) {
        this.infActualBillableHoursM3 = infActualBillableHoursM3;
    }

    public Integer getInfActualSpendM1NonUsd() {
        return infActualSpendM1NonUsd;
    }

    public HCBTModel infActualSpendM1NonUsd(Integer infActualSpendM1NonUsd) {
        this.infActualSpendM1NonUsd = infActualSpendM1NonUsd;
        return this;
    }

    public void setInfActualSpendM1NonUsd(Integer infActualSpendM1NonUsd) {
        this.infActualSpendM1NonUsd = infActualSpendM1NonUsd;
    }

    public Integer getInfActualSpendM2NonUsd() {
        return infActualSpendM2NonUsd;
    }

    public HCBTModel infActualSpendM2NonUsd(Integer infActualSpendM2NonUsd) {
        this.infActualSpendM2NonUsd = infActualSpendM2NonUsd;
        return this;
    }

    public void setInfActualSpendM2NonUsd(Integer infActualSpendM2NonUsd) {
        this.infActualSpendM2NonUsd = infActualSpendM2NonUsd;
    }

    public Integer getInfActualSpendM3NonUsd() {
        return infActualSpendM3NonUsd;
    }

    public HCBTModel infActualSpendM3NonUsd(Integer infActualSpendM3NonUsd) {
        this.infActualSpendM3NonUsd = infActualSpendM3NonUsd;
        return this;
    }

    public void setInfActualSpendM3NonUsd(Integer infActualSpendM3NonUsd) {
        this.infActualSpendM3NonUsd = infActualSpendM3NonUsd;
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

    public Integer getInfBaseHeads() {
        return infBaseHeads;
    }

    public HCBTModel infBaseHeads(Integer infBaseHeads) {
        this.infBaseHeads = infBaseHeads;
        return this;
    }

    public void setInfBaseHeads(Integer infBaseHeads) {
        this.infBaseHeads = infBaseHeads;
    }

    public Integer getCnxBaseRate() {
        return cnxBaseRate;
    }

    public HCBTModel cnxBaseRate(Integer cnxBaseRate) {
        this.cnxBaseRate = cnxBaseRate;
        return this;
    }

    public void setCnxBaseRate(Integer cnxBaseRate) {
        this.cnxBaseRate = cnxBaseRate;
    }

    public Integer getInfCurrency() {
        return infCurrency;
    }

    public HCBTModel infCurrency(Integer infCurrency) {
        this.infCurrency = infCurrency;
        return this;
    }

    public void setInfCurrency(Integer infCurrency) {
        this.infCurrency = infCurrency;
    }

    public Integer getInfCurrencyHourlyRate() {
        return infCurrencyHourlyRate;
    }

    public HCBTModel infCurrencyHourlyRate(Integer infCurrencyHourlyRate) {
        this.infCurrencyHourlyRate = infCurrencyHourlyRate;
        return this;
    }

    public void setInfCurrencyHourlyRate(Integer infCurrencyHourlyRate) {
        this.infCurrencyHourlyRate = infCurrencyHourlyRate;
    }

    public String getFiscalQuaterName() {
        return fiscalQuaterName;
    }

    public HCBTModel fiscalQuaterName(String fiscalQuaterName) {
        this.fiscalQuaterName = fiscalQuaterName;
        return this;
    }

    public void setFiscalQuaterName(String fiscalQuaterName) {
        this.fiscalQuaterName = fiscalQuaterName;
    }

    public Integer getActualMilestoneM1DiffPer() {
        return actualMilestoneM1DiffPer;
    }

    public HCBTModel actualMilestoneM1DiffPer(Integer actualMilestoneM1DiffPer) {
        this.actualMilestoneM1DiffPer = actualMilestoneM1DiffPer;
        return this;
    }

    public void setActualMilestoneM1DiffPer(Integer actualMilestoneM1DiffPer) {
        this.actualMilestoneM1DiffPer = actualMilestoneM1DiffPer;
    }

    public Integer getActualMilestoneM2DiffPer() {
        return actualMilestoneM2DiffPer;
    }

    public HCBTModel actualMilestoneM2DiffPer(Integer actualMilestoneM2DiffPer) {
        this.actualMilestoneM2DiffPer = actualMilestoneM2DiffPer;
        return this;
    }

    public void setActualMilestoneM2DiffPer(Integer actualMilestoneM2DiffPer) {
        this.actualMilestoneM2DiffPer = actualMilestoneM2DiffPer;
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

    public Integer getLoadDate() {
        return loadDate;
    }

    public HCBTModel loadDate(Integer loadDate) {
        this.loadDate = loadDate;
        return this;
    }

    public void setLoadDate(Integer loadDate) {
        this.loadDate = loadDate;
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

    public Integer getCnxbaseratetbp() {
        return cnxbaseratetbp;
    }

    public HCBTModel cnxbaseratetbp(Integer cnxbaseratetbp) {
        this.cnxbaseratetbp = cnxbaseratetbp;
        return this;
    }

    public void setCnxbaseratetbp(Integer cnxbaseratetbp) {
        this.cnxbaseratetbp = cnxbaseratetbp;
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
