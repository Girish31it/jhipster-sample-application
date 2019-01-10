package io.github.jhipster.application.web.rest;

import io.github.jhipster.application.JhipsterSampleApplicationApp;

import io.github.jhipster.application.domain.HCBTModel;
import io.github.jhipster.application.repository.HCBTModelRepository;
import io.github.jhipster.application.service.HCBTModelService;
import io.github.jhipster.application.service.dto.HCBTModelDTO;
import io.github.jhipster.application.service.mapper.HCBTModelMapper;
import io.github.jhipster.application.web.rest.errors.ExceptionTranslator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Validator;

import javax.persistence.EntityManager;
import java.util.List;


import static io.github.jhipster.application.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the HCBTModelResource REST controller.
 *
 * @see HCBTModelResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JhipsterSampleApplicationApp.class)
public class HCBTModelResourceIntTest {

    private static final String DEFAULT_VENDOR_NAME = "AAAAAAAAAA";
    private static final String UPDATED_VENDOR_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_VENDOR_LOCATION = "AAAAAAAAAA";
    private static final String UPDATED_VENDOR_LOCATION = "BBBBBBBBBB";

    private static final String DEFAULT_SERVICE_PILLAR = "AAAAAAAAAA";
    private static final String UPDATED_SERVICE_PILLAR = "BBBBBBBBBB";

    private static final String DEFAULT_SERVICE_CATEGORY = "AAAAAAAAAA";
    private static final String UPDATED_SERVICE_CATEGORY = "BBBBBBBBBB";

    private static final String DEFAULT_SERVICE_DRILLDOWN = "AAAAAAAAAA";
    private static final String UPDATED_SERVICE_DRILLDOWN = "BBBBBBBBBB";

    private static final String DEFAULT_SOW_NAME = "AAAAAAAAAA";
    private static final String UPDATED_SOW_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_SOW_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_SOW_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_PO_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_PO_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_DELIVERY_POC = "AAAAAAAAAA";
    private static final String UPDATED_DELIVERY_POC = "BBBBBBBBBB";

    private static final String DEFAULT_CISCO_BUSINESS_OWNER = "AAAAAAAAAA";
    private static final String UPDATED_CISCO_BUSINESS_OWNER = "BBBBBBBBBB";

    private static final Integer DEFAULT_CHRGBLE_AGENT_NUM_WDNM_CASES = 1;
    private static final Integer UPDATED_CHRGBLE_AGENT_NUM_WDNM_CASES = 2;

    private static final Integer DEFAULT_PROJECTED_BILLABLE_HEADS_M_1 = 1;
    private static final Integer UPDATED_PROJECTED_BILLABLE_HEADS_M_1 = 2;

    private static final Integer DEFAULT_PROJECTED_BILLABLE_HEADS_M_2 = 1;
    private static final Integer UPDATED_PROJECTED_BILLABLE_HEADS_M_2 = 2;

    private static final Integer DEFAULT_PROJECTED_BILLABLE_HEADS_M_3 = 1;
    private static final Integer UPDATED_PROJECTED_BILLABLE_HEADS_M_3 = 2;

    private static final Integer DEFAULT_FTE_HOURLY_RATE_DOLLAR = 1;
    private static final Integer UPDATED_FTE_HOURLY_RATE_DOLLAR = 2;

    private static final Integer DEFAULT_PROJECTED_TBP_VOLUME_M_1 = 1;
    private static final Integer UPDATED_PROJECTED_TBP_VOLUME_M_1 = 2;

    private static final Integer DEFAULT_PROJECTED_TBP_VOLUME_M_2 = 1;
    private static final Integer UPDATED_PROJECTED_TBP_VOLUME_M_2 = 2;

    private static final Integer DEFAULT_PROJECTED_TBP_VOLUME_M_3 = 1;
    private static final Integer UPDATED_PROJECTED_TBP_VOLUME_M_3 = 2;

    private static final Integer DEFAULT_PROJECTED_OTHER_VOL_M_1 = 1;
    private static final Integer UPDATED_PROJECTED_OTHER_VOL_M_1 = 2;

    private static final Integer DEFAULT_PROJECTED_OTHER_VOL_M_2 = 1;
    private static final Integer UPDATED_PROJECTED_OTHER_VOL_M_2 = 2;

    private static final Integer DEFAULT_PROJECTED_OTHER_VOL_M_3 = 1;
    private static final Integer UPDATED_PROJECTED_OTHER_VOL_M_3 = 2;

    private static final Integer DEFAULT_AHT_IN_MINUTES = 1;
    private static final Integer UPDATED_AHT_IN_MINUTES = 2;

    private static final Integer DEFAULT_DOLLAR_RATE_PER_MINUTE = 1;
    private static final Integer UPDATED_DOLLAR_RATE_PER_MINUTE = 2;

    private static final Integer DEFAULT_OTHER_VOLUME_RATE = 1;
    private static final Integer UPDATED_OTHER_VOLUME_RATE = 2;

    private static final Integer DEFAULT_INF_MILESTONE_VALUE_M_1_NON_USD = 1;
    private static final Integer UPDATED_INF_MILESTONE_VALUE_M_1_NON_USD = 2;

    private static final Integer DEFAULT_INF_MILESTONE_VALUE_M_2_NON_USD = 1;
    private static final Integer UPDATED_INF_MILESTONE_VALUE_M_2_NON_USD = 2;

    private static final Integer DEFAULT_INF_MILESTONE_VALUE_M_3_NON_USD = 1;
    private static final Integer UPDATED_INF_MILESTONE_VALUE_M_3_NON_USD = 2;

    private static final Integer DEFAULT_INF_BUFFER_NON_USD = 1;
    private static final Integer UPDATED_INF_BUFFER_NON_USD = 2;

    private static final Integer DEFAULT_INF_PO_AMOUNT_NON_USD = 1;
    private static final Integer UPDATED_INF_PO_AMOUNT_NON_USD = 2;

    private static final Integer DEFAULT_MILESTONE_VALUE_M_1_USD = 1;
    private static final Integer UPDATED_MILESTONE_VALUE_M_1_USD = 2;

    private static final Integer DEFAULT_MILESTONE_VALUE_M_2_USD = 1;
    private static final Integer UPDATED_MILESTONE_VALUE_M_2_USD = 2;

    private static final Integer DEFAULT_MILESTONE_VALUE_M_3_USD = 1;
    private static final Integer UPDATED_MILESTONE_VALUE_M_3_USD = 2;

    private static final Integer DEFAULT_BUFFER_USD = 1;
    private static final Integer UPDATED_BUFFER_USD = 2;

    private static final Integer DEFAULT_PO_AMOUNT_USD = 1;
    private static final Integer UPDATED_PO_AMOUNT_USD = 2;

    private static final Integer DEFAULT_ACTUAL_BILLABLE_HEADS_M_1 = 1;
    private static final Integer UPDATED_ACTUAL_BILLABLE_HEADS_M_1 = 2;

    private static final Integer DEFAULT_PAY_ACT_BILLABLE_HOURS_M_1 = 1;
    private static final Integer UPDATED_PAY_ACT_BILLABLE_HOURS_M_1 = 2;

    private static final Integer DEFAULT_ACTUAL_BILLABLE_HEADS_M_2 = 1;
    private static final Integer UPDATED_ACTUAL_BILLABLE_HEADS_M_2 = 2;

    private static final Integer DEFAULT_PAY_ACT_BILLABLE_HOURS_M_2 = 1;
    private static final Integer UPDATED_PAY_ACT_BILLABLE_HOURS_M_2 = 2;

    private static final Integer DEFAULT_ACTUAL_BILLABLE_HEADS_M_3 = 1;
    private static final Integer UPDATED_ACTUAL_BILLABLE_HEADS_M_3 = 2;

    private static final Integer DEFAULT_PAY_ACT_BILLABLE_HOURS_M_3 = 1;
    private static final Integer UPDATED_PAY_ACT_BILLABLE_HOURS_M_3 = 2;

    private static final Integer DEFAULT_ACTUAL_TBP_VOLUME_M_1 = 1;
    private static final Integer UPDATED_ACTUAL_TBP_VOLUME_M_1 = 2;

    private static final Integer DEFAULT_ACTUAL_TBP_VOLUME_M_2 = 1;
    private static final Integer UPDATED_ACTUAL_TBP_VOLUME_M_2 = 2;

    private static final Integer DEFAULT_ACTUAL_TBP_VOLUME_M_3 = 1;
    private static final Integer UPDATED_ACTUAL_TBP_VOLUME_M_3 = 2;

    private static final Integer DEFAULT_ACTUAL_OTHER_VOL_M_1 = 1;
    private static final Integer UPDATED_ACTUAL_OTHER_VOL_M_1 = 2;

    private static final Integer DEFAULT_ACTUAL_OTHER_VOL_M_2 = 1;
    private static final Integer UPDATED_ACTUAL_OTHER_VOL_M_2 = 2;

    private static final Integer DEFAULT_ACTUAL_OTHER_VOL_M_3 = 1;
    private static final Integer UPDATED_ACTUAL_OTHER_VOL_M_3 = 2;

    private static final Integer DEFAULT_BILLING_ADJ_HITTING_M_1 = 1;
    private static final Integer UPDATED_BILLING_ADJ_HITTING_M_1 = 2;

    private static final Integer DEFAULT_BILLING_ADJ_HITTING_M_2 = 1;
    private static final Integer UPDATED_BILLING_ADJ_HITTING_M_2 = 2;

    private static final Integer DEFAULT_BILLING_ADJ_HITTING_M_3 = 1;
    private static final Integer UPDATED_BILLING_ADJ_HITTING_M_3 = 2;

    private static final Integer DEFAULT_ACTUAL_SPEND_M_1_USD = 1;
    private static final Integer UPDATED_ACTUAL_SPEND_M_1_USD = 2;

    private static final Integer DEFAULT_ACTUAL_SPEND_M_2_USD = 1;
    private static final Integer UPDATED_ACTUAL_SPEND_M_2_USD = 2;

    private static final Integer DEFAULT_ACTUAL_SPEND_M_3_USD = 1;
    private static final Integer UPDATED_ACTUAL_SPEND_M_3_USD = 2;

    private static final Integer DEFAULT_TOTAL_QTRLY_SPEND_USD = 1;
    private static final Integer UPDATED_TOTAL_QTRLY_SPEND_USD = 2;

    private static final Integer DEFAULT_ACTUAL_PROJ_M_1_DIFF_USD = 1;
    private static final Integer UPDATED_ACTUAL_PROJ_M_1_DIFF_USD = 2;

    private static final Integer DEFAULT_ACTUAL_PROJ_M_2_DIFF_USD = 1;
    private static final Integer UPDATED_ACTUAL_PROJ_M_2_DIFF_USD = 2;

    private static final Integer DEFAULT_ACTUAL_PROJ_M_3_DIFF_USD = 1;
    private static final Integer UPDATED_ACTUAL_PROJ_M_3_DIFF_USD = 2;

    private static final Integer DEFAULT_ACTUAL_MILESTONE_M_3_DIFF_PER = 1;
    private static final Integer UPDATED_ACTUAL_MILESTONE_M_3_DIFF_PER = 2;

    private static final Integer DEFAULT_ACTUAL_PO_VALUE_DIFF_PER = 1;
    private static final Integer UPDATED_ACTUAL_PO_VALUE_DIFF_PER = 2;

    private static final Integer DEFAULT_RETROSPECTIVE_ADJ_M_1 = 1;
    private static final Integer UPDATED_RETROSPECTIVE_ADJ_M_1 = 2;

    private static final Integer DEFAULT_RETROSPECTIVE_ADJ_M_2 = 1;
    private static final Integer UPDATED_RETROSPECTIVE_ADJ_M_2 = 2;

    private static final Integer DEFAULT_RETROSPECTIVE_ADJ_M_3 = 1;
    private static final Integer UPDATED_RETROSPECTIVE_ADJ_M_3 = 2;

    private static final Integer DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_1 = 1;
    private static final Integer UPDATED_ACTUAL_RETROSPECTIVE_COST_M_1 = 2;

    private static final Integer DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_2 = 1;
    private static final Integer UPDATED_ACTUAL_RETROSPECTIVE_COST_M_2 = 2;

    private static final Integer DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_3 = 1;
    private static final Integer UPDATED_ACTUAL_RETROSPECTIVE_COST_M_3 = 2;

    private static final Integer DEFAULT_TOTAL_QTRLY_RETROSPECTIVE_COST = 1;
    private static final Integer UPDATED_TOTAL_QTRLY_RETROSPECTIVE_COST = 2;

    private static final String DEFAULT_CHANGE_IMPACT = "AAAAAAAAAA";
    private static final String UPDATED_CHANGE_IMPACT = "BBBBBBBBBB";

    private static final String DEFAULT_METHOD = "AAAAAAAAAA";
    private static final String UPDATED_METHOD = "BBBBBBBBBB";

    private static final Integer DEFAULT_OT_RATE = 1;
    private static final Integer UPDATED_OT_RATE = 2;

    private static final Integer DEFAULT_APP_OT_HRS_M_1 = 1;
    private static final Integer UPDATED_APP_OT_HRS_M_1 = 2;

    private static final Integer DEFAULT_APP_OT_HRS_M_2 = 1;
    private static final Integer UPDATED_APP_OT_HRS_M_2 = 2;

    private static final Integer DEFAULT_APP_OT_HRS_M_3 = 1;
    private static final Integer UPDATED_APP_OT_HRS_M_3 = 2;

    private static final Integer DEFAULT_OT_SPEND_M_1 = 1;
    private static final Integer UPDATED_OT_SPEND_M_1 = 2;

    private static final Integer DEFAULT_OT_SPEND_M_2 = 1;
    private static final Integer UPDATED_OT_SPEND_M_2 = 2;

    private static final Integer DEFAULT_OT_SPEND_M_3 = 1;
    private static final Integer UPDATED_OT_SPEND_M_3 = 2;

    private static final String DEFAULT_NOTES = "AAAAAAAAAA";
    private static final String UPDATED_NOTES = "BBBBBBBBBB";

    private static final Integer DEFAULT_CHRGBLE_STAFF_HRS_WDNM_CASES = 1;
    private static final Integer UPDATED_CHRGBLE_STAFF_HRS_WDNM_CASES = 2;

    private static final Integer DEFAULT_PROJECTED_BILLABLE_HRS_M_1 = 1;
    private static final Integer UPDATED_PROJECTED_BILLABLE_HRS_M_1 = 2;

    private static final Integer DEFAULT_PROJECTED_BILLABLE_HRS_M_2 = 1;
    private static final Integer UPDATED_PROJECTED_BILLABLE_HRS_M_2 = 2;

    private static final Integer DEFAULT_PROJECTED_BILLABLE_HRS_M_3 = 1;
    private static final Integer UPDATED_PROJECTED_BILLABLE_HRS_M_3 = 2;

    private static final String DEFAULT_CCA_VENDOR_DATA_SK = "AAAAAAAAAA";
    private static final String UPDATED_CCA_VENDOR_DATA_SK = "BBBBBBBBBB";

    private static final Integer DEFAULT_PAYROLL_HOURLY_RATE_DOLLAR = 1;
    private static final Integer UPDATED_PAYROLL_HOURLY_RATE_DOLLAR = 2;

    private static final Integer DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_1 = 1;
    private static final Integer UPDATED_INF_ACTUAL_BILLABLE_HOURS_M_1 = 2;

    private static final Integer DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_2 = 1;
    private static final Integer UPDATED_INF_ACTUAL_BILLABLE_HOURS_M_2 = 2;

    private static final Integer DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_3 = 1;
    private static final Integer UPDATED_INF_ACTUAL_BILLABLE_HOURS_M_3 = 2;

    private static final Integer DEFAULT_INF_ACTUAL_SPEND_M_1_NON_USD = 1;
    private static final Integer UPDATED_INF_ACTUAL_SPEND_M_1_NON_USD = 2;

    private static final Integer DEFAULT_INF_ACTUAL_SPEND_M_2_NON_USD = 1;
    private static final Integer UPDATED_INF_ACTUAL_SPEND_M_2_NON_USD = 2;

    private static final Integer DEFAULT_INF_ACTUAL_SPEND_M_3_NON_USD = 1;
    private static final Integer UPDATED_INF_ACTUAL_SPEND_M_3_NON_USD = 2;

    private static final Integer DEFAULT_INF_BASE_AHT = 1;
    private static final Integer UPDATED_INF_BASE_AHT = 2;

    private static final Integer DEFAULT_INF_BASE_HEADS = 1;
    private static final Integer UPDATED_INF_BASE_HEADS = 2;

    private static final Integer DEFAULT_CNX_BASE_RATE = 1;
    private static final Integer UPDATED_CNX_BASE_RATE = 2;

    private static final Integer DEFAULT_INF_CURRENCY = 1;
    private static final Integer UPDATED_INF_CURRENCY = 2;

    private static final Integer DEFAULT_INF_CURRENCY_HOURLY_RATE = 1;
    private static final Integer UPDATED_INF_CURRENCY_HOURLY_RATE = 2;

    private static final String DEFAULT_FISCAL_QUATER_NAME = "AAAAAAAAAA";
    private static final String UPDATED_FISCAL_QUATER_NAME = "BBBBBBBBBB";

    private static final Integer DEFAULT_ACTUAL_MILESTONE_M_1_DIFF_PER = 1;
    private static final Integer UPDATED_ACTUAL_MILESTONE_M_1_DIFF_PER = 2;

    private static final Integer DEFAULT_ACTUAL_MILESTONE_M_2_DIFF_PER = 1;
    private static final Integer UPDATED_ACTUAL_MILESTONE_M_2_DIFF_PER = 2;

    private static final Integer DEFAULT_QTRLY_DIFF_ACTUAL_PROJECTION = 1;
    private static final Integer UPDATED_QTRLY_DIFF_ACTUAL_PROJECTION = 2;

    private static final Integer DEFAULT_INF_TOTAL_QTRLY_SPEND_NON_USD = 1;
    private static final Integer UPDATED_INF_TOTAL_QTRLY_SPEND_NON_USD = 2;

    private static final String DEFAULT_DATA_FLAG = "AAAAAAAAAA";
    private static final String UPDATED_DATA_FLAG = "BBBBBBBBBB";

    private static final Integer DEFAULT_LOAD_DATE = 1;
    private static final Integer UPDATED_LOAD_DATE = 2;

    private static final Integer DEFAULT_CNX_BASE_RATE_FTE = 1;
    private static final Integer UPDATED_CNX_BASE_RATE_FTE = 2;

    private static final Integer DEFAULT_CNXBASERATETBP = 1;
    private static final Integer UPDATED_CNXBASERATETBP = 2;

    @Autowired
    private HCBTModelRepository hCBTModelRepository;

    @Autowired
    private HCBTModelMapper hCBTModelMapper;

    @Autowired
    private HCBTModelService hCBTModelService;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    @Autowired
    private Validator validator;

    private MockMvc restHCBTModelMockMvc;

    private HCBTModel hCBTModel;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final HCBTModelResource hCBTModelResource = new HCBTModelResource(hCBTModelService);
        this.restHCBTModelMockMvc = MockMvcBuilders.standaloneSetup(hCBTModelResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter)
            .setValidator(validator).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static HCBTModel createEntity(EntityManager em) {
        HCBTModel hCBTModel = new HCBTModel()
            .vendorName(DEFAULT_VENDOR_NAME)
            .vendorLocation(DEFAULT_VENDOR_LOCATION)
            .servicePillar(DEFAULT_SERVICE_PILLAR)
            .serviceCategory(DEFAULT_SERVICE_CATEGORY)
            .serviceDrilldown(DEFAULT_SERVICE_DRILLDOWN)
            .sowName(DEFAULT_SOW_NAME)
            .sowNumber(DEFAULT_SOW_NUMBER)
            .poNumber(DEFAULT_PO_NUMBER)
            .deliveryPoc(DEFAULT_DELIVERY_POC)
            .ciscoBusinessOwner(DEFAULT_CISCO_BUSINESS_OWNER)
            .chrgbleAgentNumWdnmCases(DEFAULT_CHRGBLE_AGENT_NUM_WDNM_CASES)
            .projectedBillableHeadsM1(DEFAULT_PROJECTED_BILLABLE_HEADS_M_1)
            .projectedBillableHeadsM2(DEFAULT_PROJECTED_BILLABLE_HEADS_M_2)
            .projectedBillableHeadsM3(DEFAULT_PROJECTED_BILLABLE_HEADS_M_3)
            .fteHourlyRateDollar(DEFAULT_FTE_HOURLY_RATE_DOLLAR)
            .projectedTbpVolumeM1(DEFAULT_PROJECTED_TBP_VOLUME_M_1)
            .projectedTbpVolumeM2(DEFAULT_PROJECTED_TBP_VOLUME_M_2)
            .projectedTbpVolumeM3(DEFAULT_PROJECTED_TBP_VOLUME_M_3)
            .projectedOtherVolM1(DEFAULT_PROJECTED_OTHER_VOL_M_1)
            .projectedOtherVolM2(DEFAULT_PROJECTED_OTHER_VOL_M_2)
            .projectedOtherVolM3(DEFAULT_PROJECTED_OTHER_VOL_M_3)
            .ahtInMinutes(DEFAULT_AHT_IN_MINUTES)
            .dollarRatePerMinute(DEFAULT_DOLLAR_RATE_PER_MINUTE)
            .otherVolumeRate(DEFAULT_OTHER_VOLUME_RATE)
            .infMilestoneValueM1NonUsd(DEFAULT_INF_MILESTONE_VALUE_M_1_NON_USD)
            .infMilestoneValueM2NonUsd(DEFAULT_INF_MILESTONE_VALUE_M_2_NON_USD)
            .infMilestoneValueM3NonUsd(DEFAULT_INF_MILESTONE_VALUE_M_3_NON_USD)
            .infBufferNonUsd(DEFAULT_INF_BUFFER_NON_USD)
            .infPoAmountNonUsd(DEFAULT_INF_PO_AMOUNT_NON_USD)
            .milestoneValueM1Usd(DEFAULT_MILESTONE_VALUE_M_1_USD)
            .milestoneValueM2Usd(DEFAULT_MILESTONE_VALUE_M_2_USD)
            .milestoneValueM3Usd(DEFAULT_MILESTONE_VALUE_M_3_USD)
            .bufferUsd(DEFAULT_BUFFER_USD)
            .poAmountUsd(DEFAULT_PO_AMOUNT_USD)
            .actualBillableHeadsM1(DEFAULT_ACTUAL_BILLABLE_HEADS_M_1)
            .payActBillableHoursM1(DEFAULT_PAY_ACT_BILLABLE_HOURS_M_1)
            .actualBillableHeadsM2(DEFAULT_ACTUAL_BILLABLE_HEADS_M_2)
            .payActBillableHoursM2(DEFAULT_PAY_ACT_BILLABLE_HOURS_M_2)
            .actualBillableHeadsM3(DEFAULT_ACTUAL_BILLABLE_HEADS_M_3)
            .payActBillableHoursM3(DEFAULT_PAY_ACT_BILLABLE_HOURS_M_3)
            .actualTbpVolumeM1(DEFAULT_ACTUAL_TBP_VOLUME_M_1)
            .actualTbpVolumeM2(DEFAULT_ACTUAL_TBP_VOLUME_M_2)
            .actualTbpVolumeM3(DEFAULT_ACTUAL_TBP_VOLUME_M_3)
            .actualOtherVolM1(DEFAULT_ACTUAL_OTHER_VOL_M_1)
            .actualOtherVolM2(DEFAULT_ACTUAL_OTHER_VOL_M_2)
            .actualOtherVolM3(DEFAULT_ACTUAL_OTHER_VOL_M_3)
            .billingAdjHittingM1(DEFAULT_BILLING_ADJ_HITTING_M_1)
            .billingAdjHittingM2(DEFAULT_BILLING_ADJ_HITTING_M_2)
            .billingAdjHittingM3(DEFAULT_BILLING_ADJ_HITTING_M_3)
            .actualSpendM1Usd(DEFAULT_ACTUAL_SPEND_M_1_USD)
            .actualSpendM2Usd(DEFAULT_ACTUAL_SPEND_M_2_USD)
            .actualSpendM3Usd(DEFAULT_ACTUAL_SPEND_M_3_USD)
            .totalQtrlySpendUsd(DEFAULT_TOTAL_QTRLY_SPEND_USD)
            .actualProjM1DiffUsd(DEFAULT_ACTUAL_PROJ_M_1_DIFF_USD)
            .actualProjM2DiffUsd(DEFAULT_ACTUAL_PROJ_M_2_DIFF_USD)
            .actualProjM3DiffUsd(DEFAULT_ACTUAL_PROJ_M_3_DIFF_USD)
            .actualMilestoneM3DiffPer(DEFAULT_ACTUAL_MILESTONE_M_3_DIFF_PER)
            .actualPoValueDiffPer(DEFAULT_ACTUAL_PO_VALUE_DIFF_PER)
            .retrospectiveAdjM1(DEFAULT_RETROSPECTIVE_ADJ_M_1)
            .retrospectiveAdjM2(DEFAULT_RETROSPECTIVE_ADJ_M_2)
            .retrospectiveAdjM3(DEFAULT_RETROSPECTIVE_ADJ_M_3)
            .actualRetrospectiveCostM1(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_1)
            .actualRetrospectiveCostM2(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_2)
            .actualRetrospectiveCostM3(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_3)
            .totalQtrlyRetrospectiveCost(DEFAULT_TOTAL_QTRLY_RETROSPECTIVE_COST)
            .changeImpact(DEFAULT_CHANGE_IMPACT)
            .method(DEFAULT_METHOD)
            .otRate(DEFAULT_OT_RATE)
            .appOtHrsM1(DEFAULT_APP_OT_HRS_M_1)
            .appOtHrsM2(DEFAULT_APP_OT_HRS_M_2)
            .appOtHrsM3(DEFAULT_APP_OT_HRS_M_3)
            .otSpendM1(DEFAULT_OT_SPEND_M_1)
            .otSpendM2(DEFAULT_OT_SPEND_M_2)
            .otSpendM3(DEFAULT_OT_SPEND_M_3)
            .notes(DEFAULT_NOTES)
            .chrgbleStaffHrsWDNMCases(DEFAULT_CHRGBLE_STAFF_HRS_WDNM_CASES)
            .projectedBillableHrsM1(DEFAULT_PROJECTED_BILLABLE_HRS_M_1)
            .projectedBillableHrsM2(DEFAULT_PROJECTED_BILLABLE_HRS_M_2)
            .projectedBillableHrsM3(DEFAULT_PROJECTED_BILLABLE_HRS_M_3)
            .ccaVendorDataSk(DEFAULT_CCA_VENDOR_DATA_SK)
            .payrollHourlyRateDollar(DEFAULT_PAYROLL_HOURLY_RATE_DOLLAR)
            .infActualBillableHoursM1(DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_1)
            .infActualBillableHoursM2(DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_2)
            .infActualBillableHoursM3(DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_3)
            .infActualSpendM1NonUsd(DEFAULT_INF_ACTUAL_SPEND_M_1_NON_USD)
            .infActualSpendM2NonUsd(DEFAULT_INF_ACTUAL_SPEND_M_2_NON_USD)
            .infActualSpendM3NonUsd(DEFAULT_INF_ACTUAL_SPEND_M_3_NON_USD)
            .infBaseAht(DEFAULT_INF_BASE_AHT)
            .infBaseHeads(DEFAULT_INF_BASE_HEADS)
            .cnxBaseRate(DEFAULT_CNX_BASE_RATE)
            .infCurrency(DEFAULT_INF_CURRENCY)
            .infCurrencyHourlyRate(DEFAULT_INF_CURRENCY_HOURLY_RATE)
            .fiscalQuaterName(DEFAULT_FISCAL_QUATER_NAME)
            .actualMilestoneM1DiffPer(DEFAULT_ACTUAL_MILESTONE_M_1_DIFF_PER)
            .actualMilestoneM2DiffPer(DEFAULT_ACTUAL_MILESTONE_M_2_DIFF_PER)
            .qtrlyDiffActualProjection(DEFAULT_QTRLY_DIFF_ACTUAL_PROJECTION)
            .infTotalQtrlySpendNonUsd(DEFAULT_INF_TOTAL_QTRLY_SPEND_NON_USD)
            .dataFlag(DEFAULT_DATA_FLAG)
            .loadDate(DEFAULT_LOAD_DATE)
            .cnxBaseRateFte(DEFAULT_CNX_BASE_RATE_FTE)
            .cnxbaseratetbp(DEFAULT_CNXBASERATETBP);
        return hCBTModel;
    }

    @Before
    public void initTest() {
        hCBTModel = createEntity(em);
    }

    @Test
    @Transactional
    public void createHCBTModel() throws Exception {
        int databaseSizeBeforeCreate = hCBTModelRepository.findAll().size();

        // Create the HCBTModel
        HCBTModelDTO hCBTModelDTO = hCBTModelMapper.toDto(hCBTModel);
        restHCBTModelMockMvc.perform(post("/api/hcbt-models")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(hCBTModelDTO)))
            .andExpect(status().isCreated());

        // Validate the HCBTModel in the database
        List<HCBTModel> hCBTModelList = hCBTModelRepository.findAll();
        assertThat(hCBTModelList).hasSize(databaseSizeBeforeCreate + 1);
        HCBTModel testHCBTModel = hCBTModelList.get(hCBTModelList.size() - 1);
        assertThat(testHCBTModel.getVendorName()).isEqualTo(DEFAULT_VENDOR_NAME);
        assertThat(testHCBTModel.getVendorLocation()).isEqualTo(DEFAULT_VENDOR_LOCATION);
        assertThat(testHCBTModel.getServicePillar()).isEqualTo(DEFAULT_SERVICE_PILLAR);
        assertThat(testHCBTModel.getServiceCategory()).isEqualTo(DEFAULT_SERVICE_CATEGORY);
        assertThat(testHCBTModel.getServiceDrilldown()).isEqualTo(DEFAULT_SERVICE_DRILLDOWN);
        assertThat(testHCBTModel.getSowName()).isEqualTo(DEFAULT_SOW_NAME);
        assertThat(testHCBTModel.getSowNumber()).isEqualTo(DEFAULT_SOW_NUMBER);
        assertThat(testHCBTModel.getPoNumber()).isEqualTo(DEFAULT_PO_NUMBER);
        assertThat(testHCBTModel.getDeliveryPoc()).isEqualTo(DEFAULT_DELIVERY_POC);
        assertThat(testHCBTModel.getCiscoBusinessOwner()).isEqualTo(DEFAULT_CISCO_BUSINESS_OWNER);
        assertThat(testHCBTModel.getChrgbleAgentNumWdnmCases()).isEqualTo(DEFAULT_CHRGBLE_AGENT_NUM_WDNM_CASES);
        assertThat(testHCBTModel.getProjectedBillableHeadsM1()).isEqualTo(DEFAULT_PROJECTED_BILLABLE_HEADS_M_1);
        assertThat(testHCBTModel.getProjectedBillableHeadsM2()).isEqualTo(DEFAULT_PROJECTED_BILLABLE_HEADS_M_2);
        assertThat(testHCBTModel.getProjectedBillableHeadsM3()).isEqualTo(DEFAULT_PROJECTED_BILLABLE_HEADS_M_3);
        assertThat(testHCBTModel.getFteHourlyRateDollar()).isEqualTo(DEFAULT_FTE_HOURLY_RATE_DOLLAR);
        assertThat(testHCBTModel.getProjectedTbpVolumeM1()).isEqualTo(DEFAULT_PROJECTED_TBP_VOLUME_M_1);
        assertThat(testHCBTModel.getProjectedTbpVolumeM2()).isEqualTo(DEFAULT_PROJECTED_TBP_VOLUME_M_2);
        assertThat(testHCBTModel.getProjectedTbpVolumeM3()).isEqualTo(DEFAULT_PROJECTED_TBP_VOLUME_M_3);
        assertThat(testHCBTModel.getProjectedOtherVolM1()).isEqualTo(DEFAULT_PROJECTED_OTHER_VOL_M_1);
        assertThat(testHCBTModel.getProjectedOtherVolM2()).isEqualTo(DEFAULT_PROJECTED_OTHER_VOL_M_2);
        assertThat(testHCBTModel.getProjectedOtherVolM3()).isEqualTo(DEFAULT_PROJECTED_OTHER_VOL_M_3);
        assertThat(testHCBTModel.getAhtInMinutes()).isEqualTo(DEFAULT_AHT_IN_MINUTES);
        assertThat(testHCBTModel.getDollarRatePerMinute()).isEqualTo(DEFAULT_DOLLAR_RATE_PER_MINUTE);
        assertThat(testHCBTModel.getOtherVolumeRate()).isEqualTo(DEFAULT_OTHER_VOLUME_RATE);
        assertThat(testHCBTModel.getInfMilestoneValueM1NonUsd()).isEqualTo(DEFAULT_INF_MILESTONE_VALUE_M_1_NON_USD);
        assertThat(testHCBTModel.getInfMilestoneValueM2NonUsd()).isEqualTo(DEFAULT_INF_MILESTONE_VALUE_M_2_NON_USD);
        assertThat(testHCBTModel.getInfMilestoneValueM3NonUsd()).isEqualTo(DEFAULT_INF_MILESTONE_VALUE_M_3_NON_USD);
        assertThat(testHCBTModel.getInfBufferNonUsd()).isEqualTo(DEFAULT_INF_BUFFER_NON_USD);
        assertThat(testHCBTModel.getInfPoAmountNonUsd()).isEqualTo(DEFAULT_INF_PO_AMOUNT_NON_USD);
        assertThat(testHCBTModel.getMilestoneValueM1Usd()).isEqualTo(DEFAULT_MILESTONE_VALUE_M_1_USD);
        assertThat(testHCBTModel.getMilestoneValueM2Usd()).isEqualTo(DEFAULT_MILESTONE_VALUE_M_2_USD);
        assertThat(testHCBTModel.getMilestoneValueM3Usd()).isEqualTo(DEFAULT_MILESTONE_VALUE_M_3_USD);
        assertThat(testHCBTModel.getBufferUsd()).isEqualTo(DEFAULT_BUFFER_USD);
        assertThat(testHCBTModel.getPoAmountUsd()).isEqualTo(DEFAULT_PO_AMOUNT_USD);
        assertThat(testHCBTModel.getActualBillableHeadsM1()).isEqualTo(DEFAULT_ACTUAL_BILLABLE_HEADS_M_1);
        assertThat(testHCBTModel.getPayActBillableHoursM1()).isEqualTo(DEFAULT_PAY_ACT_BILLABLE_HOURS_M_1);
        assertThat(testHCBTModel.getActualBillableHeadsM2()).isEqualTo(DEFAULT_ACTUAL_BILLABLE_HEADS_M_2);
        assertThat(testHCBTModel.getPayActBillableHoursM2()).isEqualTo(DEFAULT_PAY_ACT_BILLABLE_HOURS_M_2);
        assertThat(testHCBTModel.getActualBillableHeadsM3()).isEqualTo(DEFAULT_ACTUAL_BILLABLE_HEADS_M_3);
        assertThat(testHCBTModel.getPayActBillableHoursM3()).isEqualTo(DEFAULT_PAY_ACT_BILLABLE_HOURS_M_3);
        assertThat(testHCBTModel.getActualTbpVolumeM1()).isEqualTo(DEFAULT_ACTUAL_TBP_VOLUME_M_1);
        assertThat(testHCBTModel.getActualTbpVolumeM2()).isEqualTo(DEFAULT_ACTUAL_TBP_VOLUME_M_2);
        assertThat(testHCBTModel.getActualTbpVolumeM3()).isEqualTo(DEFAULT_ACTUAL_TBP_VOLUME_M_3);
        assertThat(testHCBTModel.getActualOtherVolM1()).isEqualTo(DEFAULT_ACTUAL_OTHER_VOL_M_1);
        assertThat(testHCBTModel.getActualOtherVolM2()).isEqualTo(DEFAULT_ACTUAL_OTHER_VOL_M_2);
        assertThat(testHCBTModel.getActualOtherVolM3()).isEqualTo(DEFAULT_ACTUAL_OTHER_VOL_M_3);
        assertThat(testHCBTModel.getBillingAdjHittingM1()).isEqualTo(DEFAULT_BILLING_ADJ_HITTING_M_1);
        assertThat(testHCBTModel.getBillingAdjHittingM2()).isEqualTo(DEFAULT_BILLING_ADJ_HITTING_M_2);
        assertThat(testHCBTModel.getBillingAdjHittingM3()).isEqualTo(DEFAULT_BILLING_ADJ_HITTING_M_3);
        assertThat(testHCBTModel.getActualSpendM1Usd()).isEqualTo(DEFAULT_ACTUAL_SPEND_M_1_USD);
        assertThat(testHCBTModel.getActualSpendM2Usd()).isEqualTo(DEFAULT_ACTUAL_SPEND_M_2_USD);
        assertThat(testHCBTModel.getActualSpendM3Usd()).isEqualTo(DEFAULT_ACTUAL_SPEND_M_3_USD);
        assertThat(testHCBTModel.getTotalQtrlySpendUsd()).isEqualTo(DEFAULT_TOTAL_QTRLY_SPEND_USD);
        assertThat(testHCBTModel.getActualProjM1DiffUsd()).isEqualTo(DEFAULT_ACTUAL_PROJ_M_1_DIFF_USD);
        assertThat(testHCBTModel.getActualProjM2DiffUsd()).isEqualTo(DEFAULT_ACTUAL_PROJ_M_2_DIFF_USD);
        assertThat(testHCBTModel.getActualProjM3DiffUsd()).isEqualTo(DEFAULT_ACTUAL_PROJ_M_3_DIFF_USD);
        assertThat(testHCBTModel.getActualMilestoneM3DiffPer()).isEqualTo(DEFAULT_ACTUAL_MILESTONE_M_3_DIFF_PER);
        assertThat(testHCBTModel.getActualPoValueDiffPer()).isEqualTo(DEFAULT_ACTUAL_PO_VALUE_DIFF_PER);
        assertThat(testHCBTModel.getRetrospectiveAdjM1()).isEqualTo(DEFAULT_RETROSPECTIVE_ADJ_M_1);
        assertThat(testHCBTModel.getRetrospectiveAdjM2()).isEqualTo(DEFAULT_RETROSPECTIVE_ADJ_M_2);
        assertThat(testHCBTModel.getRetrospectiveAdjM3()).isEqualTo(DEFAULT_RETROSPECTIVE_ADJ_M_3);
        assertThat(testHCBTModel.getActualRetrospectiveCostM1()).isEqualTo(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_1);
        assertThat(testHCBTModel.getActualRetrospectiveCostM2()).isEqualTo(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_2);
        assertThat(testHCBTModel.getActualRetrospectiveCostM3()).isEqualTo(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_3);
        assertThat(testHCBTModel.getTotalQtrlyRetrospectiveCost()).isEqualTo(DEFAULT_TOTAL_QTRLY_RETROSPECTIVE_COST);
        assertThat(testHCBTModel.getChangeImpact()).isEqualTo(DEFAULT_CHANGE_IMPACT);
        assertThat(testHCBTModel.getMethod()).isEqualTo(DEFAULT_METHOD);
        assertThat(testHCBTModel.getOtRate()).isEqualTo(DEFAULT_OT_RATE);
        assertThat(testHCBTModel.getAppOtHrsM1()).isEqualTo(DEFAULT_APP_OT_HRS_M_1);
        assertThat(testHCBTModel.getAppOtHrsM2()).isEqualTo(DEFAULT_APP_OT_HRS_M_2);
        assertThat(testHCBTModel.getAppOtHrsM3()).isEqualTo(DEFAULT_APP_OT_HRS_M_3);
        assertThat(testHCBTModel.getOtSpendM1()).isEqualTo(DEFAULT_OT_SPEND_M_1);
        assertThat(testHCBTModel.getOtSpendM2()).isEqualTo(DEFAULT_OT_SPEND_M_2);
        assertThat(testHCBTModel.getOtSpendM3()).isEqualTo(DEFAULT_OT_SPEND_M_3);
        assertThat(testHCBTModel.getNotes()).isEqualTo(DEFAULT_NOTES);
        assertThat(testHCBTModel.getChrgbleStaffHrsWDNMCases()).isEqualTo(DEFAULT_CHRGBLE_STAFF_HRS_WDNM_CASES);
        assertThat(testHCBTModel.getProjectedBillableHrsM1()).isEqualTo(DEFAULT_PROJECTED_BILLABLE_HRS_M_1);
        assertThat(testHCBTModel.getProjectedBillableHrsM2()).isEqualTo(DEFAULT_PROJECTED_BILLABLE_HRS_M_2);
        assertThat(testHCBTModel.getProjectedBillableHrsM3()).isEqualTo(DEFAULT_PROJECTED_BILLABLE_HRS_M_3);
        assertThat(testHCBTModel.getCcaVendorDataSk()).isEqualTo(DEFAULT_CCA_VENDOR_DATA_SK);
        assertThat(testHCBTModel.getPayrollHourlyRateDollar()).isEqualTo(DEFAULT_PAYROLL_HOURLY_RATE_DOLLAR);
        assertThat(testHCBTModel.getInfActualBillableHoursM1()).isEqualTo(DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_1);
        assertThat(testHCBTModel.getInfActualBillableHoursM2()).isEqualTo(DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_2);
        assertThat(testHCBTModel.getInfActualBillableHoursM3()).isEqualTo(DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_3);
        assertThat(testHCBTModel.getInfActualSpendM1NonUsd()).isEqualTo(DEFAULT_INF_ACTUAL_SPEND_M_1_NON_USD);
        assertThat(testHCBTModel.getInfActualSpendM2NonUsd()).isEqualTo(DEFAULT_INF_ACTUAL_SPEND_M_2_NON_USD);
        assertThat(testHCBTModel.getInfActualSpendM3NonUsd()).isEqualTo(DEFAULT_INF_ACTUAL_SPEND_M_3_NON_USD);
        assertThat(testHCBTModel.getInfBaseAht()).isEqualTo(DEFAULT_INF_BASE_AHT);
        assertThat(testHCBTModel.getInfBaseHeads()).isEqualTo(DEFAULT_INF_BASE_HEADS);
        assertThat(testHCBTModel.getCnxBaseRate()).isEqualTo(DEFAULT_CNX_BASE_RATE);
        assertThat(testHCBTModel.getInfCurrency()).isEqualTo(DEFAULT_INF_CURRENCY);
        assertThat(testHCBTModel.getInfCurrencyHourlyRate()).isEqualTo(DEFAULT_INF_CURRENCY_HOURLY_RATE);
        assertThat(testHCBTModel.getFiscalQuaterName()).isEqualTo(DEFAULT_FISCAL_QUATER_NAME);
        assertThat(testHCBTModel.getActualMilestoneM1DiffPer()).isEqualTo(DEFAULT_ACTUAL_MILESTONE_M_1_DIFF_PER);
        assertThat(testHCBTModel.getActualMilestoneM2DiffPer()).isEqualTo(DEFAULT_ACTUAL_MILESTONE_M_2_DIFF_PER);
        assertThat(testHCBTModel.getQtrlyDiffActualProjection()).isEqualTo(DEFAULT_QTRLY_DIFF_ACTUAL_PROJECTION);
        assertThat(testHCBTModel.getInfTotalQtrlySpendNonUsd()).isEqualTo(DEFAULT_INF_TOTAL_QTRLY_SPEND_NON_USD);
        assertThat(testHCBTModel.getDataFlag()).isEqualTo(DEFAULT_DATA_FLAG);
        assertThat(testHCBTModel.getLoadDate()).isEqualTo(DEFAULT_LOAD_DATE);
        assertThat(testHCBTModel.getCnxBaseRateFte()).isEqualTo(DEFAULT_CNX_BASE_RATE_FTE);
        assertThat(testHCBTModel.getCnxbaseratetbp()).isEqualTo(DEFAULT_CNXBASERATETBP);
    }

    @Test
    @Transactional
    public void createHCBTModelWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = hCBTModelRepository.findAll().size();

        // Create the HCBTModel with an existing ID
        hCBTModel.setId(1L);
        HCBTModelDTO hCBTModelDTO = hCBTModelMapper.toDto(hCBTModel);

        // An entity with an existing ID cannot be created, so this API call must fail
        restHCBTModelMockMvc.perform(post("/api/hcbt-models")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(hCBTModelDTO)))
            .andExpect(status().isBadRequest());

        // Validate the HCBTModel in the database
        List<HCBTModel> hCBTModelList = hCBTModelRepository.findAll();
        assertThat(hCBTModelList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllHCBTModels() throws Exception {
        // Initialize the database
        hCBTModelRepository.saveAndFlush(hCBTModel);

        // Get all the hCBTModelList
        restHCBTModelMockMvc.perform(get("/api/hcbt-models?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(hCBTModel.getId().intValue())))
            .andExpect(jsonPath("$.[*].vendorName").value(hasItem(DEFAULT_VENDOR_NAME.toString())))
            .andExpect(jsonPath("$.[*].vendorLocation").value(hasItem(DEFAULT_VENDOR_LOCATION.toString())))
            .andExpect(jsonPath("$.[*].servicePillar").value(hasItem(DEFAULT_SERVICE_PILLAR.toString())))
            .andExpect(jsonPath("$.[*].serviceCategory").value(hasItem(DEFAULT_SERVICE_CATEGORY.toString())))
            .andExpect(jsonPath("$.[*].serviceDrilldown").value(hasItem(DEFAULT_SERVICE_DRILLDOWN.toString())))
            .andExpect(jsonPath("$.[*].sowName").value(hasItem(DEFAULT_SOW_NAME.toString())))
            .andExpect(jsonPath("$.[*].sowNumber").value(hasItem(DEFAULT_SOW_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].poNumber").value(hasItem(DEFAULT_PO_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].deliveryPoc").value(hasItem(DEFAULT_DELIVERY_POC.toString())))
            .andExpect(jsonPath("$.[*].ciscoBusinessOwner").value(hasItem(DEFAULT_CISCO_BUSINESS_OWNER.toString())))
            .andExpect(jsonPath("$.[*].chrgbleAgentNumWdnmCases").value(hasItem(DEFAULT_CHRGBLE_AGENT_NUM_WDNM_CASES)))
            .andExpect(jsonPath("$.[*].projectedBillableHeadsM1").value(hasItem(DEFAULT_PROJECTED_BILLABLE_HEADS_M_1)))
            .andExpect(jsonPath("$.[*].projectedBillableHeadsM2").value(hasItem(DEFAULT_PROJECTED_BILLABLE_HEADS_M_2)))
            .andExpect(jsonPath("$.[*].projectedBillableHeadsM3").value(hasItem(DEFAULT_PROJECTED_BILLABLE_HEADS_M_3)))
            .andExpect(jsonPath("$.[*].fteHourlyRateDollar").value(hasItem(DEFAULT_FTE_HOURLY_RATE_DOLLAR)))
            .andExpect(jsonPath("$.[*].projectedTbpVolumeM1").value(hasItem(DEFAULT_PROJECTED_TBP_VOLUME_M_1)))
            .andExpect(jsonPath("$.[*].projectedTbpVolumeM2").value(hasItem(DEFAULT_PROJECTED_TBP_VOLUME_M_2)))
            .andExpect(jsonPath("$.[*].projectedTbpVolumeM3").value(hasItem(DEFAULT_PROJECTED_TBP_VOLUME_M_3)))
            .andExpect(jsonPath("$.[*].projectedOtherVolM1").value(hasItem(DEFAULT_PROJECTED_OTHER_VOL_M_1)))
            .andExpect(jsonPath("$.[*].projectedOtherVolM2").value(hasItem(DEFAULT_PROJECTED_OTHER_VOL_M_2)))
            .andExpect(jsonPath("$.[*].projectedOtherVolM3").value(hasItem(DEFAULT_PROJECTED_OTHER_VOL_M_3)))
            .andExpect(jsonPath("$.[*].ahtInMinutes").value(hasItem(DEFAULT_AHT_IN_MINUTES)))
            .andExpect(jsonPath("$.[*].dollarRatePerMinute").value(hasItem(DEFAULT_DOLLAR_RATE_PER_MINUTE)))
            .andExpect(jsonPath("$.[*].otherVolumeRate").value(hasItem(DEFAULT_OTHER_VOLUME_RATE)))
            .andExpect(jsonPath("$.[*].infMilestoneValueM1NonUsd").value(hasItem(DEFAULT_INF_MILESTONE_VALUE_M_1_NON_USD)))
            .andExpect(jsonPath("$.[*].infMilestoneValueM2NonUsd").value(hasItem(DEFAULT_INF_MILESTONE_VALUE_M_2_NON_USD)))
            .andExpect(jsonPath("$.[*].infMilestoneValueM3NonUsd").value(hasItem(DEFAULT_INF_MILESTONE_VALUE_M_3_NON_USD)))
            .andExpect(jsonPath("$.[*].infBufferNonUsd").value(hasItem(DEFAULT_INF_BUFFER_NON_USD)))
            .andExpect(jsonPath("$.[*].infPoAmountNonUsd").value(hasItem(DEFAULT_INF_PO_AMOUNT_NON_USD)))
            .andExpect(jsonPath("$.[*].milestoneValueM1Usd").value(hasItem(DEFAULT_MILESTONE_VALUE_M_1_USD)))
            .andExpect(jsonPath("$.[*].milestoneValueM2Usd").value(hasItem(DEFAULT_MILESTONE_VALUE_M_2_USD)))
            .andExpect(jsonPath("$.[*].milestoneValueM3Usd").value(hasItem(DEFAULT_MILESTONE_VALUE_M_3_USD)))
            .andExpect(jsonPath("$.[*].bufferUsd").value(hasItem(DEFAULT_BUFFER_USD)))
            .andExpect(jsonPath("$.[*].poAmountUsd").value(hasItem(DEFAULT_PO_AMOUNT_USD)))
            .andExpect(jsonPath("$.[*].actualBillableHeadsM1").value(hasItem(DEFAULT_ACTUAL_BILLABLE_HEADS_M_1)))
            .andExpect(jsonPath("$.[*].payActBillableHoursM1").value(hasItem(DEFAULT_PAY_ACT_BILLABLE_HOURS_M_1)))
            .andExpect(jsonPath("$.[*].actualBillableHeadsM2").value(hasItem(DEFAULT_ACTUAL_BILLABLE_HEADS_M_2)))
            .andExpect(jsonPath("$.[*].payActBillableHoursM2").value(hasItem(DEFAULT_PAY_ACT_BILLABLE_HOURS_M_2)))
            .andExpect(jsonPath("$.[*].actualBillableHeadsM3").value(hasItem(DEFAULT_ACTUAL_BILLABLE_HEADS_M_3)))
            .andExpect(jsonPath("$.[*].payActBillableHoursM3").value(hasItem(DEFAULT_PAY_ACT_BILLABLE_HOURS_M_3)))
            .andExpect(jsonPath("$.[*].actualTbpVolumeM1").value(hasItem(DEFAULT_ACTUAL_TBP_VOLUME_M_1)))
            .andExpect(jsonPath("$.[*].actualTbpVolumeM2").value(hasItem(DEFAULT_ACTUAL_TBP_VOLUME_M_2)))
            .andExpect(jsonPath("$.[*].actualTbpVolumeM3").value(hasItem(DEFAULT_ACTUAL_TBP_VOLUME_M_3)))
            .andExpect(jsonPath("$.[*].actualOtherVolM1").value(hasItem(DEFAULT_ACTUAL_OTHER_VOL_M_1)))
            .andExpect(jsonPath("$.[*].actualOtherVolM2").value(hasItem(DEFAULT_ACTUAL_OTHER_VOL_M_2)))
            .andExpect(jsonPath("$.[*].actualOtherVolM3").value(hasItem(DEFAULT_ACTUAL_OTHER_VOL_M_3)))
            .andExpect(jsonPath("$.[*].billingAdjHittingM1").value(hasItem(DEFAULT_BILLING_ADJ_HITTING_M_1)))
            .andExpect(jsonPath("$.[*].billingAdjHittingM2").value(hasItem(DEFAULT_BILLING_ADJ_HITTING_M_2)))
            .andExpect(jsonPath("$.[*].billingAdjHittingM3").value(hasItem(DEFAULT_BILLING_ADJ_HITTING_M_3)))
            .andExpect(jsonPath("$.[*].actualSpendM1Usd").value(hasItem(DEFAULT_ACTUAL_SPEND_M_1_USD)))
            .andExpect(jsonPath("$.[*].actualSpendM2Usd").value(hasItem(DEFAULT_ACTUAL_SPEND_M_2_USD)))
            .andExpect(jsonPath("$.[*].actualSpendM3Usd").value(hasItem(DEFAULT_ACTUAL_SPEND_M_3_USD)))
            .andExpect(jsonPath("$.[*].totalQtrlySpendUsd").value(hasItem(DEFAULT_TOTAL_QTRLY_SPEND_USD)))
            .andExpect(jsonPath("$.[*].actualProjM1DiffUsd").value(hasItem(DEFAULT_ACTUAL_PROJ_M_1_DIFF_USD)))
            .andExpect(jsonPath("$.[*].actualProjM2DiffUsd").value(hasItem(DEFAULT_ACTUAL_PROJ_M_2_DIFF_USD)))
            .andExpect(jsonPath("$.[*].actualProjM3DiffUsd").value(hasItem(DEFAULT_ACTUAL_PROJ_M_3_DIFF_USD)))
            .andExpect(jsonPath("$.[*].actualMilestoneM3DiffPer").value(hasItem(DEFAULT_ACTUAL_MILESTONE_M_3_DIFF_PER)))
            .andExpect(jsonPath("$.[*].actualPoValueDiffPer").value(hasItem(DEFAULT_ACTUAL_PO_VALUE_DIFF_PER)))
            .andExpect(jsonPath("$.[*].retrospectiveAdjM1").value(hasItem(DEFAULT_RETROSPECTIVE_ADJ_M_1)))
            .andExpect(jsonPath("$.[*].retrospectiveAdjM2").value(hasItem(DEFAULT_RETROSPECTIVE_ADJ_M_2)))
            .andExpect(jsonPath("$.[*].retrospectiveAdjM3").value(hasItem(DEFAULT_RETROSPECTIVE_ADJ_M_3)))
            .andExpect(jsonPath("$.[*].actualRetrospectiveCostM1").value(hasItem(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_1)))
            .andExpect(jsonPath("$.[*].actualRetrospectiveCostM2").value(hasItem(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_2)))
            .andExpect(jsonPath("$.[*].actualRetrospectiveCostM3").value(hasItem(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_3)))
            .andExpect(jsonPath("$.[*].totalQtrlyRetrospectiveCost").value(hasItem(DEFAULT_TOTAL_QTRLY_RETROSPECTIVE_COST)))
            .andExpect(jsonPath("$.[*].changeImpact").value(hasItem(DEFAULT_CHANGE_IMPACT.toString())))
            .andExpect(jsonPath("$.[*].method").value(hasItem(DEFAULT_METHOD.toString())))
            .andExpect(jsonPath("$.[*].otRate").value(hasItem(DEFAULT_OT_RATE)))
            .andExpect(jsonPath("$.[*].appOtHrsM1").value(hasItem(DEFAULT_APP_OT_HRS_M_1)))
            .andExpect(jsonPath("$.[*].appOtHrsM2").value(hasItem(DEFAULT_APP_OT_HRS_M_2)))
            .andExpect(jsonPath("$.[*].appOtHrsM3").value(hasItem(DEFAULT_APP_OT_HRS_M_3)))
            .andExpect(jsonPath("$.[*].otSpendM1").value(hasItem(DEFAULT_OT_SPEND_M_1)))
            .andExpect(jsonPath("$.[*].otSpendM2").value(hasItem(DEFAULT_OT_SPEND_M_2)))
            .andExpect(jsonPath("$.[*].otSpendM3").value(hasItem(DEFAULT_OT_SPEND_M_3)))
            .andExpect(jsonPath("$.[*].notes").value(hasItem(DEFAULT_NOTES.toString())))
            .andExpect(jsonPath("$.[*].chrgbleStaffHrsWDNMCases").value(hasItem(DEFAULT_CHRGBLE_STAFF_HRS_WDNM_CASES)))
            .andExpect(jsonPath("$.[*].projectedBillableHrsM1").value(hasItem(DEFAULT_PROJECTED_BILLABLE_HRS_M_1)))
            .andExpect(jsonPath("$.[*].projectedBillableHrsM2").value(hasItem(DEFAULT_PROJECTED_BILLABLE_HRS_M_2)))
            .andExpect(jsonPath("$.[*].projectedBillableHrsM3").value(hasItem(DEFAULT_PROJECTED_BILLABLE_HRS_M_3)))
            .andExpect(jsonPath("$.[*].ccaVendorDataSk").value(hasItem(DEFAULT_CCA_VENDOR_DATA_SK.toString())))
            .andExpect(jsonPath("$.[*].payrollHourlyRateDollar").value(hasItem(DEFAULT_PAYROLL_HOURLY_RATE_DOLLAR)))
            .andExpect(jsonPath("$.[*].infActualBillableHoursM1").value(hasItem(DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_1)))
            .andExpect(jsonPath("$.[*].infActualBillableHoursM2").value(hasItem(DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_2)))
            .andExpect(jsonPath("$.[*].infActualBillableHoursM3").value(hasItem(DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_3)))
            .andExpect(jsonPath("$.[*].infActualSpendM1NonUsd").value(hasItem(DEFAULT_INF_ACTUAL_SPEND_M_1_NON_USD)))
            .andExpect(jsonPath("$.[*].infActualSpendM2NonUsd").value(hasItem(DEFAULT_INF_ACTUAL_SPEND_M_2_NON_USD)))
            .andExpect(jsonPath("$.[*].infActualSpendM3NonUsd").value(hasItem(DEFAULT_INF_ACTUAL_SPEND_M_3_NON_USD)))
            .andExpect(jsonPath("$.[*].infBaseAht").value(hasItem(DEFAULT_INF_BASE_AHT)))
            .andExpect(jsonPath("$.[*].infBaseHeads").value(hasItem(DEFAULT_INF_BASE_HEADS)))
            .andExpect(jsonPath("$.[*].cnxBaseRate").value(hasItem(DEFAULT_CNX_BASE_RATE)))
            .andExpect(jsonPath("$.[*].infCurrency").value(hasItem(DEFAULT_INF_CURRENCY)))
            .andExpect(jsonPath("$.[*].infCurrencyHourlyRate").value(hasItem(DEFAULT_INF_CURRENCY_HOURLY_RATE)))
            .andExpect(jsonPath("$.[*].fiscalQuaterName").value(hasItem(DEFAULT_FISCAL_QUATER_NAME.toString())))
            .andExpect(jsonPath("$.[*].actualMilestoneM1DiffPer").value(hasItem(DEFAULT_ACTUAL_MILESTONE_M_1_DIFF_PER)))
            .andExpect(jsonPath("$.[*].actualMilestoneM2DiffPer").value(hasItem(DEFAULT_ACTUAL_MILESTONE_M_2_DIFF_PER)))
            .andExpect(jsonPath("$.[*].qtrlyDiffActualProjection").value(hasItem(DEFAULT_QTRLY_DIFF_ACTUAL_PROJECTION)))
            .andExpect(jsonPath("$.[*].infTotalQtrlySpendNonUsd").value(hasItem(DEFAULT_INF_TOTAL_QTRLY_SPEND_NON_USD)))
            .andExpect(jsonPath("$.[*].dataFlag").value(hasItem(DEFAULT_DATA_FLAG.toString())))
            .andExpect(jsonPath("$.[*].loadDate").value(hasItem(DEFAULT_LOAD_DATE)))
            .andExpect(jsonPath("$.[*].cnxBaseRateFte").value(hasItem(DEFAULT_CNX_BASE_RATE_FTE)))
            .andExpect(jsonPath("$.[*].cnxbaseratetbp").value(hasItem(DEFAULT_CNXBASERATETBP)));
    }
    
    @Test
    @Transactional
    public void getHCBTModel() throws Exception {
        // Initialize the database
        hCBTModelRepository.saveAndFlush(hCBTModel);

        // Get the hCBTModel
        restHCBTModelMockMvc.perform(get("/api/hcbt-models/{id}", hCBTModel.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(hCBTModel.getId().intValue()))
            .andExpect(jsonPath("$.vendorName").value(DEFAULT_VENDOR_NAME.toString()))
            .andExpect(jsonPath("$.vendorLocation").value(DEFAULT_VENDOR_LOCATION.toString()))
            .andExpect(jsonPath("$.servicePillar").value(DEFAULT_SERVICE_PILLAR.toString()))
            .andExpect(jsonPath("$.serviceCategory").value(DEFAULT_SERVICE_CATEGORY.toString()))
            .andExpect(jsonPath("$.serviceDrilldown").value(DEFAULT_SERVICE_DRILLDOWN.toString()))
            .andExpect(jsonPath("$.sowName").value(DEFAULT_SOW_NAME.toString()))
            .andExpect(jsonPath("$.sowNumber").value(DEFAULT_SOW_NUMBER.toString()))
            .andExpect(jsonPath("$.poNumber").value(DEFAULT_PO_NUMBER.toString()))
            .andExpect(jsonPath("$.deliveryPoc").value(DEFAULT_DELIVERY_POC.toString()))
            .andExpect(jsonPath("$.ciscoBusinessOwner").value(DEFAULT_CISCO_BUSINESS_OWNER.toString()))
            .andExpect(jsonPath("$.chrgbleAgentNumWdnmCases").value(DEFAULT_CHRGBLE_AGENT_NUM_WDNM_CASES))
            .andExpect(jsonPath("$.projectedBillableHeadsM1").value(DEFAULT_PROJECTED_BILLABLE_HEADS_M_1))
            .andExpect(jsonPath("$.projectedBillableHeadsM2").value(DEFAULT_PROJECTED_BILLABLE_HEADS_M_2))
            .andExpect(jsonPath("$.projectedBillableHeadsM3").value(DEFAULT_PROJECTED_BILLABLE_HEADS_M_3))
            .andExpect(jsonPath("$.fteHourlyRateDollar").value(DEFAULT_FTE_HOURLY_RATE_DOLLAR))
            .andExpect(jsonPath("$.projectedTbpVolumeM1").value(DEFAULT_PROJECTED_TBP_VOLUME_M_1))
            .andExpect(jsonPath("$.projectedTbpVolumeM2").value(DEFAULT_PROJECTED_TBP_VOLUME_M_2))
            .andExpect(jsonPath("$.projectedTbpVolumeM3").value(DEFAULT_PROJECTED_TBP_VOLUME_M_3))
            .andExpect(jsonPath("$.projectedOtherVolM1").value(DEFAULT_PROJECTED_OTHER_VOL_M_1))
            .andExpect(jsonPath("$.projectedOtherVolM2").value(DEFAULT_PROJECTED_OTHER_VOL_M_2))
            .andExpect(jsonPath("$.projectedOtherVolM3").value(DEFAULT_PROJECTED_OTHER_VOL_M_3))
            .andExpect(jsonPath("$.ahtInMinutes").value(DEFAULT_AHT_IN_MINUTES))
            .andExpect(jsonPath("$.dollarRatePerMinute").value(DEFAULT_DOLLAR_RATE_PER_MINUTE))
            .andExpect(jsonPath("$.otherVolumeRate").value(DEFAULT_OTHER_VOLUME_RATE))
            .andExpect(jsonPath("$.infMilestoneValueM1NonUsd").value(DEFAULT_INF_MILESTONE_VALUE_M_1_NON_USD))
            .andExpect(jsonPath("$.infMilestoneValueM2NonUsd").value(DEFAULT_INF_MILESTONE_VALUE_M_2_NON_USD))
            .andExpect(jsonPath("$.infMilestoneValueM3NonUsd").value(DEFAULT_INF_MILESTONE_VALUE_M_3_NON_USD))
            .andExpect(jsonPath("$.infBufferNonUsd").value(DEFAULT_INF_BUFFER_NON_USD))
            .andExpect(jsonPath("$.infPoAmountNonUsd").value(DEFAULT_INF_PO_AMOUNT_NON_USD))
            .andExpect(jsonPath("$.milestoneValueM1Usd").value(DEFAULT_MILESTONE_VALUE_M_1_USD))
            .andExpect(jsonPath("$.milestoneValueM2Usd").value(DEFAULT_MILESTONE_VALUE_M_2_USD))
            .andExpect(jsonPath("$.milestoneValueM3Usd").value(DEFAULT_MILESTONE_VALUE_M_3_USD))
            .andExpect(jsonPath("$.bufferUsd").value(DEFAULT_BUFFER_USD))
            .andExpect(jsonPath("$.poAmountUsd").value(DEFAULT_PO_AMOUNT_USD))
            .andExpect(jsonPath("$.actualBillableHeadsM1").value(DEFAULT_ACTUAL_BILLABLE_HEADS_M_1))
            .andExpect(jsonPath("$.payActBillableHoursM1").value(DEFAULT_PAY_ACT_BILLABLE_HOURS_M_1))
            .andExpect(jsonPath("$.actualBillableHeadsM2").value(DEFAULT_ACTUAL_BILLABLE_HEADS_M_2))
            .andExpect(jsonPath("$.payActBillableHoursM2").value(DEFAULT_PAY_ACT_BILLABLE_HOURS_M_2))
            .andExpect(jsonPath("$.actualBillableHeadsM3").value(DEFAULT_ACTUAL_BILLABLE_HEADS_M_3))
            .andExpect(jsonPath("$.payActBillableHoursM3").value(DEFAULT_PAY_ACT_BILLABLE_HOURS_M_3))
            .andExpect(jsonPath("$.actualTbpVolumeM1").value(DEFAULT_ACTUAL_TBP_VOLUME_M_1))
            .andExpect(jsonPath("$.actualTbpVolumeM2").value(DEFAULT_ACTUAL_TBP_VOLUME_M_2))
            .andExpect(jsonPath("$.actualTbpVolumeM3").value(DEFAULT_ACTUAL_TBP_VOLUME_M_3))
            .andExpect(jsonPath("$.actualOtherVolM1").value(DEFAULT_ACTUAL_OTHER_VOL_M_1))
            .andExpect(jsonPath("$.actualOtherVolM2").value(DEFAULT_ACTUAL_OTHER_VOL_M_2))
            .andExpect(jsonPath("$.actualOtherVolM3").value(DEFAULT_ACTUAL_OTHER_VOL_M_3))
            .andExpect(jsonPath("$.billingAdjHittingM1").value(DEFAULT_BILLING_ADJ_HITTING_M_1))
            .andExpect(jsonPath("$.billingAdjHittingM2").value(DEFAULT_BILLING_ADJ_HITTING_M_2))
            .andExpect(jsonPath("$.billingAdjHittingM3").value(DEFAULT_BILLING_ADJ_HITTING_M_3))
            .andExpect(jsonPath("$.actualSpendM1Usd").value(DEFAULT_ACTUAL_SPEND_M_1_USD))
            .andExpect(jsonPath("$.actualSpendM2Usd").value(DEFAULT_ACTUAL_SPEND_M_2_USD))
            .andExpect(jsonPath("$.actualSpendM3Usd").value(DEFAULT_ACTUAL_SPEND_M_3_USD))
            .andExpect(jsonPath("$.totalQtrlySpendUsd").value(DEFAULT_TOTAL_QTRLY_SPEND_USD))
            .andExpect(jsonPath("$.actualProjM1DiffUsd").value(DEFAULT_ACTUAL_PROJ_M_1_DIFF_USD))
            .andExpect(jsonPath("$.actualProjM2DiffUsd").value(DEFAULT_ACTUAL_PROJ_M_2_DIFF_USD))
            .andExpect(jsonPath("$.actualProjM3DiffUsd").value(DEFAULT_ACTUAL_PROJ_M_3_DIFF_USD))
            .andExpect(jsonPath("$.actualMilestoneM3DiffPer").value(DEFAULT_ACTUAL_MILESTONE_M_3_DIFF_PER))
            .andExpect(jsonPath("$.actualPoValueDiffPer").value(DEFAULT_ACTUAL_PO_VALUE_DIFF_PER))
            .andExpect(jsonPath("$.retrospectiveAdjM1").value(DEFAULT_RETROSPECTIVE_ADJ_M_1))
            .andExpect(jsonPath("$.retrospectiveAdjM2").value(DEFAULT_RETROSPECTIVE_ADJ_M_2))
            .andExpect(jsonPath("$.retrospectiveAdjM3").value(DEFAULT_RETROSPECTIVE_ADJ_M_3))
            .andExpect(jsonPath("$.actualRetrospectiveCostM1").value(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_1))
            .andExpect(jsonPath("$.actualRetrospectiveCostM2").value(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_2))
            .andExpect(jsonPath("$.actualRetrospectiveCostM3").value(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_3))
            .andExpect(jsonPath("$.totalQtrlyRetrospectiveCost").value(DEFAULT_TOTAL_QTRLY_RETROSPECTIVE_COST))
            .andExpect(jsonPath("$.changeImpact").value(DEFAULT_CHANGE_IMPACT.toString()))
            .andExpect(jsonPath("$.method").value(DEFAULT_METHOD.toString()))
            .andExpect(jsonPath("$.otRate").value(DEFAULT_OT_RATE))
            .andExpect(jsonPath("$.appOtHrsM1").value(DEFAULT_APP_OT_HRS_M_1))
            .andExpect(jsonPath("$.appOtHrsM2").value(DEFAULT_APP_OT_HRS_M_2))
            .andExpect(jsonPath("$.appOtHrsM3").value(DEFAULT_APP_OT_HRS_M_3))
            .andExpect(jsonPath("$.otSpendM1").value(DEFAULT_OT_SPEND_M_1))
            .andExpect(jsonPath("$.otSpendM2").value(DEFAULT_OT_SPEND_M_2))
            .andExpect(jsonPath("$.otSpendM3").value(DEFAULT_OT_SPEND_M_3))
            .andExpect(jsonPath("$.notes").value(DEFAULT_NOTES.toString()))
            .andExpect(jsonPath("$.chrgbleStaffHrsWDNMCases").value(DEFAULT_CHRGBLE_STAFF_HRS_WDNM_CASES))
            .andExpect(jsonPath("$.projectedBillableHrsM1").value(DEFAULT_PROJECTED_BILLABLE_HRS_M_1))
            .andExpect(jsonPath("$.projectedBillableHrsM2").value(DEFAULT_PROJECTED_BILLABLE_HRS_M_2))
            .andExpect(jsonPath("$.projectedBillableHrsM3").value(DEFAULT_PROJECTED_BILLABLE_HRS_M_3))
            .andExpect(jsonPath("$.ccaVendorDataSk").value(DEFAULT_CCA_VENDOR_DATA_SK.toString()))
            .andExpect(jsonPath("$.payrollHourlyRateDollar").value(DEFAULT_PAYROLL_HOURLY_RATE_DOLLAR))
            .andExpect(jsonPath("$.infActualBillableHoursM1").value(DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_1))
            .andExpect(jsonPath("$.infActualBillableHoursM2").value(DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_2))
            .andExpect(jsonPath("$.infActualBillableHoursM3").value(DEFAULT_INF_ACTUAL_BILLABLE_HOURS_M_3))
            .andExpect(jsonPath("$.infActualSpendM1NonUsd").value(DEFAULT_INF_ACTUAL_SPEND_M_1_NON_USD))
            .andExpect(jsonPath("$.infActualSpendM2NonUsd").value(DEFAULT_INF_ACTUAL_SPEND_M_2_NON_USD))
            .andExpect(jsonPath("$.infActualSpendM3NonUsd").value(DEFAULT_INF_ACTUAL_SPEND_M_3_NON_USD))
            .andExpect(jsonPath("$.infBaseAht").value(DEFAULT_INF_BASE_AHT))
            .andExpect(jsonPath("$.infBaseHeads").value(DEFAULT_INF_BASE_HEADS))
            .andExpect(jsonPath("$.cnxBaseRate").value(DEFAULT_CNX_BASE_RATE))
            .andExpect(jsonPath("$.infCurrency").value(DEFAULT_INF_CURRENCY))
            .andExpect(jsonPath("$.infCurrencyHourlyRate").value(DEFAULT_INF_CURRENCY_HOURLY_RATE))
            .andExpect(jsonPath("$.fiscalQuaterName").value(DEFAULT_FISCAL_QUATER_NAME.toString()))
            .andExpect(jsonPath("$.actualMilestoneM1DiffPer").value(DEFAULT_ACTUAL_MILESTONE_M_1_DIFF_PER))
            .andExpect(jsonPath("$.actualMilestoneM2DiffPer").value(DEFAULT_ACTUAL_MILESTONE_M_2_DIFF_PER))
            .andExpect(jsonPath("$.qtrlyDiffActualProjection").value(DEFAULT_QTRLY_DIFF_ACTUAL_PROJECTION))
            .andExpect(jsonPath("$.infTotalQtrlySpendNonUsd").value(DEFAULT_INF_TOTAL_QTRLY_SPEND_NON_USD))
            .andExpect(jsonPath("$.dataFlag").value(DEFAULT_DATA_FLAG.toString()))
            .andExpect(jsonPath("$.loadDate").value(DEFAULT_LOAD_DATE))
            .andExpect(jsonPath("$.cnxBaseRateFte").value(DEFAULT_CNX_BASE_RATE_FTE))
            .andExpect(jsonPath("$.cnxbaseratetbp").value(DEFAULT_CNXBASERATETBP));
    }

    @Test
    @Transactional
    public void getNonExistingHCBTModel() throws Exception {
        // Get the hCBTModel
        restHCBTModelMockMvc.perform(get("/api/hcbt-models/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateHCBTModel() throws Exception {
        // Initialize the database
        hCBTModelRepository.saveAndFlush(hCBTModel);

        int databaseSizeBeforeUpdate = hCBTModelRepository.findAll().size();

        // Update the hCBTModel
        HCBTModel updatedHCBTModel = hCBTModelRepository.findById(hCBTModel.getId()).get();
        // Disconnect from session so that the updates on updatedHCBTModel are not directly saved in db
        em.detach(updatedHCBTModel);
        updatedHCBTModel
            .vendorName(UPDATED_VENDOR_NAME)
            .vendorLocation(UPDATED_VENDOR_LOCATION)
            .servicePillar(UPDATED_SERVICE_PILLAR)
            .serviceCategory(UPDATED_SERVICE_CATEGORY)
            .serviceDrilldown(UPDATED_SERVICE_DRILLDOWN)
            .sowName(UPDATED_SOW_NAME)
            .sowNumber(UPDATED_SOW_NUMBER)
            .poNumber(UPDATED_PO_NUMBER)
            .deliveryPoc(UPDATED_DELIVERY_POC)
            .ciscoBusinessOwner(UPDATED_CISCO_BUSINESS_OWNER)
            .chrgbleAgentNumWdnmCases(UPDATED_CHRGBLE_AGENT_NUM_WDNM_CASES)
            .projectedBillableHeadsM1(UPDATED_PROJECTED_BILLABLE_HEADS_M_1)
            .projectedBillableHeadsM2(UPDATED_PROJECTED_BILLABLE_HEADS_M_2)
            .projectedBillableHeadsM3(UPDATED_PROJECTED_BILLABLE_HEADS_M_3)
            .fteHourlyRateDollar(UPDATED_FTE_HOURLY_RATE_DOLLAR)
            .projectedTbpVolumeM1(UPDATED_PROJECTED_TBP_VOLUME_M_1)
            .projectedTbpVolumeM2(UPDATED_PROJECTED_TBP_VOLUME_M_2)
            .projectedTbpVolumeM3(UPDATED_PROJECTED_TBP_VOLUME_M_3)
            .projectedOtherVolM1(UPDATED_PROJECTED_OTHER_VOL_M_1)
            .projectedOtherVolM2(UPDATED_PROJECTED_OTHER_VOL_M_2)
            .projectedOtherVolM3(UPDATED_PROJECTED_OTHER_VOL_M_3)
            .ahtInMinutes(UPDATED_AHT_IN_MINUTES)
            .dollarRatePerMinute(UPDATED_DOLLAR_RATE_PER_MINUTE)
            .otherVolumeRate(UPDATED_OTHER_VOLUME_RATE)
            .infMilestoneValueM1NonUsd(UPDATED_INF_MILESTONE_VALUE_M_1_NON_USD)
            .infMilestoneValueM2NonUsd(UPDATED_INF_MILESTONE_VALUE_M_2_NON_USD)
            .infMilestoneValueM3NonUsd(UPDATED_INF_MILESTONE_VALUE_M_3_NON_USD)
            .infBufferNonUsd(UPDATED_INF_BUFFER_NON_USD)
            .infPoAmountNonUsd(UPDATED_INF_PO_AMOUNT_NON_USD)
            .milestoneValueM1Usd(UPDATED_MILESTONE_VALUE_M_1_USD)
            .milestoneValueM2Usd(UPDATED_MILESTONE_VALUE_M_2_USD)
            .milestoneValueM3Usd(UPDATED_MILESTONE_VALUE_M_3_USD)
            .bufferUsd(UPDATED_BUFFER_USD)
            .poAmountUsd(UPDATED_PO_AMOUNT_USD)
            .actualBillableHeadsM1(UPDATED_ACTUAL_BILLABLE_HEADS_M_1)
            .payActBillableHoursM1(UPDATED_PAY_ACT_BILLABLE_HOURS_M_1)
            .actualBillableHeadsM2(UPDATED_ACTUAL_BILLABLE_HEADS_M_2)
            .payActBillableHoursM2(UPDATED_PAY_ACT_BILLABLE_HOURS_M_2)
            .actualBillableHeadsM3(UPDATED_ACTUAL_BILLABLE_HEADS_M_3)
            .payActBillableHoursM3(UPDATED_PAY_ACT_BILLABLE_HOURS_M_3)
            .actualTbpVolumeM1(UPDATED_ACTUAL_TBP_VOLUME_M_1)
            .actualTbpVolumeM2(UPDATED_ACTUAL_TBP_VOLUME_M_2)
            .actualTbpVolumeM3(UPDATED_ACTUAL_TBP_VOLUME_M_3)
            .actualOtherVolM1(UPDATED_ACTUAL_OTHER_VOL_M_1)
            .actualOtherVolM2(UPDATED_ACTUAL_OTHER_VOL_M_2)
            .actualOtherVolM3(UPDATED_ACTUAL_OTHER_VOL_M_3)
            .billingAdjHittingM1(UPDATED_BILLING_ADJ_HITTING_M_1)
            .billingAdjHittingM2(UPDATED_BILLING_ADJ_HITTING_M_2)
            .billingAdjHittingM3(UPDATED_BILLING_ADJ_HITTING_M_3)
            .actualSpendM1Usd(UPDATED_ACTUAL_SPEND_M_1_USD)
            .actualSpendM2Usd(UPDATED_ACTUAL_SPEND_M_2_USD)
            .actualSpendM3Usd(UPDATED_ACTUAL_SPEND_M_3_USD)
            .totalQtrlySpendUsd(UPDATED_TOTAL_QTRLY_SPEND_USD)
            .actualProjM1DiffUsd(UPDATED_ACTUAL_PROJ_M_1_DIFF_USD)
            .actualProjM2DiffUsd(UPDATED_ACTUAL_PROJ_M_2_DIFF_USD)
            .actualProjM3DiffUsd(UPDATED_ACTUAL_PROJ_M_3_DIFF_USD)
            .actualMilestoneM3DiffPer(UPDATED_ACTUAL_MILESTONE_M_3_DIFF_PER)
            .actualPoValueDiffPer(UPDATED_ACTUAL_PO_VALUE_DIFF_PER)
            .retrospectiveAdjM1(UPDATED_RETROSPECTIVE_ADJ_M_1)
            .retrospectiveAdjM2(UPDATED_RETROSPECTIVE_ADJ_M_2)
            .retrospectiveAdjM3(UPDATED_RETROSPECTIVE_ADJ_M_3)
            .actualRetrospectiveCostM1(UPDATED_ACTUAL_RETROSPECTIVE_COST_M_1)
            .actualRetrospectiveCostM2(UPDATED_ACTUAL_RETROSPECTIVE_COST_M_2)
            .actualRetrospectiveCostM3(UPDATED_ACTUAL_RETROSPECTIVE_COST_M_3)
            .totalQtrlyRetrospectiveCost(UPDATED_TOTAL_QTRLY_RETROSPECTIVE_COST)
            .changeImpact(UPDATED_CHANGE_IMPACT)
            .method(UPDATED_METHOD)
            .otRate(UPDATED_OT_RATE)
            .appOtHrsM1(UPDATED_APP_OT_HRS_M_1)
            .appOtHrsM2(UPDATED_APP_OT_HRS_M_2)
            .appOtHrsM3(UPDATED_APP_OT_HRS_M_3)
            .otSpendM1(UPDATED_OT_SPEND_M_1)
            .otSpendM2(UPDATED_OT_SPEND_M_2)
            .otSpendM3(UPDATED_OT_SPEND_M_3)
            .notes(UPDATED_NOTES)
            .chrgbleStaffHrsWDNMCases(UPDATED_CHRGBLE_STAFF_HRS_WDNM_CASES)
            .projectedBillableHrsM1(UPDATED_PROJECTED_BILLABLE_HRS_M_1)
            .projectedBillableHrsM2(UPDATED_PROJECTED_BILLABLE_HRS_M_2)
            .projectedBillableHrsM3(UPDATED_PROJECTED_BILLABLE_HRS_M_3)
            .ccaVendorDataSk(UPDATED_CCA_VENDOR_DATA_SK)
            .payrollHourlyRateDollar(UPDATED_PAYROLL_HOURLY_RATE_DOLLAR)
            .infActualBillableHoursM1(UPDATED_INF_ACTUAL_BILLABLE_HOURS_M_1)
            .infActualBillableHoursM2(UPDATED_INF_ACTUAL_BILLABLE_HOURS_M_2)
            .infActualBillableHoursM3(UPDATED_INF_ACTUAL_BILLABLE_HOURS_M_3)
            .infActualSpendM1NonUsd(UPDATED_INF_ACTUAL_SPEND_M_1_NON_USD)
            .infActualSpendM2NonUsd(UPDATED_INF_ACTUAL_SPEND_M_2_NON_USD)
            .infActualSpendM3NonUsd(UPDATED_INF_ACTUAL_SPEND_M_3_NON_USD)
            .infBaseAht(UPDATED_INF_BASE_AHT)
            .infBaseHeads(UPDATED_INF_BASE_HEADS)
            .cnxBaseRate(UPDATED_CNX_BASE_RATE)
            .infCurrency(UPDATED_INF_CURRENCY)
            .infCurrencyHourlyRate(UPDATED_INF_CURRENCY_HOURLY_RATE)
            .fiscalQuaterName(UPDATED_FISCAL_QUATER_NAME)
            .actualMilestoneM1DiffPer(UPDATED_ACTUAL_MILESTONE_M_1_DIFF_PER)
            .actualMilestoneM2DiffPer(UPDATED_ACTUAL_MILESTONE_M_2_DIFF_PER)
            .qtrlyDiffActualProjection(UPDATED_QTRLY_DIFF_ACTUAL_PROJECTION)
            .infTotalQtrlySpendNonUsd(UPDATED_INF_TOTAL_QTRLY_SPEND_NON_USD)
            .dataFlag(UPDATED_DATA_FLAG)
            .loadDate(UPDATED_LOAD_DATE)
            .cnxBaseRateFte(UPDATED_CNX_BASE_RATE_FTE)
            .cnxbaseratetbp(UPDATED_CNXBASERATETBP);
        HCBTModelDTO hCBTModelDTO = hCBTModelMapper.toDto(updatedHCBTModel);

        restHCBTModelMockMvc.perform(put("/api/hcbt-models")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(hCBTModelDTO)))
            .andExpect(status().isOk());

        // Validate the HCBTModel in the database
        List<HCBTModel> hCBTModelList = hCBTModelRepository.findAll();
        assertThat(hCBTModelList).hasSize(databaseSizeBeforeUpdate);
        HCBTModel testHCBTModel = hCBTModelList.get(hCBTModelList.size() - 1);
        assertThat(testHCBTModel.getVendorName()).isEqualTo(UPDATED_VENDOR_NAME);
        assertThat(testHCBTModel.getVendorLocation()).isEqualTo(UPDATED_VENDOR_LOCATION);
        assertThat(testHCBTModel.getServicePillar()).isEqualTo(UPDATED_SERVICE_PILLAR);
        assertThat(testHCBTModel.getServiceCategory()).isEqualTo(UPDATED_SERVICE_CATEGORY);
        assertThat(testHCBTModel.getServiceDrilldown()).isEqualTo(UPDATED_SERVICE_DRILLDOWN);
        assertThat(testHCBTModel.getSowName()).isEqualTo(UPDATED_SOW_NAME);
        assertThat(testHCBTModel.getSowNumber()).isEqualTo(UPDATED_SOW_NUMBER);
        assertThat(testHCBTModel.getPoNumber()).isEqualTo(UPDATED_PO_NUMBER);
        assertThat(testHCBTModel.getDeliveryPoc()).isEqualTo(UPDATED_DELIVERY_POC);
        assertThat(testHCBTModel.getCiscoBusinessOwner()).isEqualTo(UPDATED_CISCO_BUSINESS_OWNER);
        assertThat(testHCBTModel.getChrgbleAgentNumWdnmCases()).isEqualTo(UPDATED_CHRGBLE_AGENT_NUM_WDNM_CASES);
        assertThat(testHCBTModel.getProjectedBillableHeadsM1()).isEqualTo(UPDATED_PROJECTED_BILLABLE_HEADS_M_1);
        assertThat(testHCBTModel.getProjectedBillableHeadsM2()).isEqualTo(UPDATED_PROJECTED_BILLABLE_HEADS_M_2);
        assertThat(testHCBTModel.getProjectedBillableHeadsM3()).isEqualTo(UPDATED_PROJECTED_BILLABLE_HEADS_M_3);
        assertThat(testHCBTModel.getFteHourlyRateDollar()).isEqualTo(UPDATED_FTE_HOURLY_RATE_DOLLAR);
        assertThat(testHCBTModel.getProjectedTbpVolumeM1()).isEqualTo(UPDATED_PROJECTED_TBP_VOLUME_M_1);
        assertThat(testHCBTModel.getProjectedTbpVolumeM2()).isEqualTo(UPDATED_PROJECTED_TBP_VOLUME_M_2);
        assertThat(testHCBTModel.getProjectedTbpVolumeM3()).isEqualTo(UPDATED_PROJECTED_TBP_VOLUME_M_3);
        assertThat(testHCBTModel.getProjectedOtherVolM1()).isEqualTo(UPDATED_PROJECTED_OTHER_VOL_M_1);
        assertThat(testHCBTModel.getProjectedOtherVolM2()).isEqualTo(UPDATED_PROJECTED_OTHER_VOL_M_2);
        assertThat(testHCBTModel.getProjectedOtherVolM3()).isEqualTo(UPDATED_PROJECTED_OTHER_VOL_M_3);
        assertThat(testHCBTModel.getAhtInMinutes()).isEqualTo(UPDATED_AHT_IN_MINUTES);
        assertThat(testHCBTModel.getDollarRatePerMinute()).isEqualTo(UPDATED_DOLLAR_RATE_PER_MINUTE);
        assertThat(testHCBTModel.getOtherVolumeRate()).isEqualTo(UPDATED_OTHER_VOLUME_RATE);
        assertThat(testHCBTModel.getInfMilestoneValueM1NonUsd()).isEqualTo(UPDATED_INF_MILESTONE_VALUE_M_1_NON_USD);
        assertThat(testHCBTModel.getInfMilestoneValueM2NonUsd()).isEqualTo(UPDATED_INF_MILESTONE_VALUE_M_2_NON_USD);
        assertThat(testHCBTModel.getInfMilestoneValueM3NonUsd()).isEqualTo(UPDATED_INF_MILESTONE_VALUE_M_3_NON_USD);
        assertThat(testHCBTModel.getInfBufferNonUsd()).isEqualTo(UPDATED_INF_BUFFER_NON_USD);
        assertThat(testHCBTModel.getInfPoAmountNonUsd()).isEqualTo(UPDATED_INF_PO_AMOUNT_NON_USD);
        assertThat(testHCBTModel.getMilestoneValueM1Usd()).isEqualTo(UPDATED_MILESTONE_VALUE_M_1_USD);
        assertThat(testHCBTModel.getMilestoneValueM2Usd()).isEqualTo(UPDATED_MILESTONE_VALUE_M_2_USD);
        assertThat(testHCBTModel.getMilestoneValueM3Usd()).isEqualTo(UPDATED_MILESTONE_VALUE_M_3_USD);
        assertThat(testHCBTModel.getBufferUsd()).isEqualTo(UPDATED_BUFFER_USD);
        assertThat(testHCBTModel.getPoAmountUsd()).isEqualTo(UPDATED_PO_AMOUNT_USD);
        assertThat(testHCBTModel.getActualBillableHeadsM1()).isEqualTo(UPDATED_ACTUAL_BILLABLE_HEADS_M_1);
        assertThat(testHCBTModel.getPayActBillableHoursM1()).isEqualTo(UPDATED_PAY_ACT_BILLABLE_HOURS_M_1);
        assertThat(testHCBTModel.getActualBillableHeadsM2()).isEqualTo(UPDATED_ACTUAL_BILLABLE_HEADS_M_2);
        assertThat(testHCBTModel.getPayActBillableHoursM2()).isEqualTo(UPDATED_PAY_ACT_BILLABLE_HOURS_M_2);
        assertThat(testHCBTModel.getActualBillableHeadsM3()).isEqualTo(UPDATED_ACTUAL_BILLABLE_HEADS_M_3);
        assertThat(testHCBTModel.getPayActBillableHoursM3()).isEqualTo(UPDATED_PAY_ACT_BILLABLE_HOURS_M_3);
        assertThat(testHCBTModel.getActualTbpVolumeM1()).isEqualTo(UPDATED_ACTUAL_TBP_VOLUME_M_1);
        assertThat(testHCBTModel.getActualTbpVolumeM2()).isEqualTo(UPDATED_ACTUAL_TBP_VOLUME_M_2);
        assertThat(testHCBTModel.getActualTbpVolumeM3()).isEqualTo(UPDATED_ACTUAL_TBP_VOLUME_M_3);
        assertThat(testHCBTModel.getActualOtherVolM1()).isEqualTo(UPDATED_ACTUAL_OTHER_VOL_M_1);
        assertThat(testHCBTModel.getActualOtherVolM2()).isEqualTo(UPDATED_ACTUAL_OTHER_VOL_M_2);
        assertThat(testHCBTModel.getActualOtherVolM3()).isEqualTo(UPDATED_ACTUAL_OTHER_VOL_M_3);
        assertThat(testHCBTModel.getBillingAdjHittingM1()).isEqualTo(UPDATED_BILLING_ADJ_HITTING_M_1);
        assertThat(testHCBTModel.getBillingAdjHittingM2()).isEqualTo(UPDATED_BILLING_ADJ_HITTING_M_2);
        assertThat(testHCBTModel.getBillingAdjHittingM3()).isEqualTo(UPDATED_BILLING_ADJ_HITTING_M_3);
        assertThat(testHCBTModel.getActualSpendM1Usd()).isEqualTo(UPDATED_ACTUAL_SPEND_M_1_USD);
        assertThat(testHCBTModel.getActualSpendM2Usd()).isEqualTo(UPDATED_ACTUAL_SPEND_M_2_USD);
        assertThat(testHCBTModel.getActualSpendM3Usd()).isEqualTo(UPDATED_ACTUAL_SPEND_M_3_USD);
        assertThat(testHCBTModel.getTotalQtrlySpendUsd()).isEqualTo(UPDATED_TOTAL_QTRLY_SPEND_USD);
        assertThat(testHCBTModel.getActualProjM1DiffUsd()).isEqualTo(UPDATED_ACTUAL_PROJ_M_1_DIFF_USD);
        assertThat(testHCBTModel.getActualProjM2DiffUsd()).isEqualTo(UPDATED_ACTUAL_PROJ_M_2_DIFF_USD);
        assertThat(testHCBTModel.getActualProjM3DiffUsd()).isEqualTo(UPDATED_ACTUAL_PROJ_M_3_DIFF_USD);
        assertThat(testHCBTModel.getActualMilestoneM3DiffPer()).isEqualTo(UPDATED_ACTUAL_MILESTONE_M_3_DIFF_PER);
        assertThat(testHCBTModel.getActualPoValueDiffPer()).isEqualTo(UPDATED_ACTUAL_PO_VALUE_DIFF_PER);
        assertThat(testHCBTModel.getRetrospectiveAdjM1()).isEqualTo(UPDATED_RETROSPECTIVE_ADJ_M_1);
        assertThat(testHCBTModel.getRetrospectiveAdjM2()).isEqualTo(UPDATED_RETROSPECTIVE_ADJ_M_2);
        assertThat(testHCBTModel.getRetrospectiveAdjM3()).isEqualTo(UPDATED_RETROSPECTIVE_ADJ_M_3);
        assertThat(testHCBTModel.getActualRetrospectiveCostM1()).isEqualTo(UPDATED_ACTUAL_RETROSPECTIVE_COST_M_1);
        assertThat(testHCBTModel.getActualRetrospectiveCostM2()).isEqualTo(UPDATED_ACTUAL_RETROSPECTIVE_COST_M_2);
        assertThat(testHCBTModel.getActualRetrospectiveCostM3()).isEqualTo(UPDATED_ACTUAL_RETROSPECTIVE_COST_M_3);
        assertThat(testHCBTModel.getTotalQtrlyRetrospectiveCost()).isEqualTo(UPDATED_TOTAL_QTRLY_RETROSPECTIVE_COST);
        assertThat(testHCBTModel.getChangeImpact()).isEqualTo(UPDATED_CHANGE_IMPACT);
        assertThat(testHCBTModel.getMethod()).isEqualTo(UPDATED_METHOD);
        assertThat(testHCBTModel.getOtRate()).isEqualTo(UPDATED_OT_RATE);
        assertThat(testHCBTModel.getAppOtHrsM1()).isEqualTo(UPDATED_APP_OT_HRS_M_1);
        assertThat(testHCBTModel.getAppOtHrsM2()).isEqualTo(UPDATED_APP_OT_HRS_M_2);
        assertThat(testHCBTModel.getAppOtHrsM3()).isEqualTo(UPDATED_APP_OT_HRS_M_3);
        assertThat(testHCBTModel.getOtSpendM1()).isEqualTo(UPDATED_OT_SPEND_M_1);
        assertThat(testHCBTModel.getOtSpendM2()).isEqualTo(UPDATED_OT_SPEND_M_2);
        assertThat(testHCBTModel.getOtSpendM3()).isEqualTo(UPDATED_OT_SPEND_M_3);
        assertThat(testHCBTModel.getNotes()).isEqualTo(UPDATED_NOTES);
        assertThat(testHCBTModel.getChrgbleStaffHrsWDNMCases()).isEqualTo(UPDATED_CHRGBLE_STAFF_HRS_WDNM_CASES);
        assertThat(testHCBTModel.getProjectedBillableHrsM1()).isEqualTo(UPDATED_PROJECTED_BILLABLE_HRS_M_1);
        assertThat(testHCBTModel.getProjectedBillableHrsM2()).isEqualTo(UPDATED_PROJECTED_BILLABLE_HRS_M_2);
        assertThat(testHCBTModel.getProjectedBillableHrsM3()).isEqualTo(UPDATED_PROJECTED_BILLABLE_HRS_M_3);
        assertThat(testHCBTModel.getCcaVendorDataSk()).isEqualTo(UPDATED_CCA_VENDOR_DATA_SK);
        assertThat(testHCBTModel.getPayrollHourlyRateDollar()).isEqualTo(UPDATED_PAYROLL_HOURLY_RATE_DOLLAR);
        assertThat(testHCBTModel.getInfActualBillableHoursM1()).isEqualTo(UPDATED_INF_ACTUAL_BILLABLE_HOURS_M_1);
        assertThat(testHCBTModel.getInfActualBillableHoursM2()).isEqualTo(UPDATED_INF_ACTUAL_BILLABLE_HOURS_M_2);
        assertThat(testHCBTModel.getInfActualBillableHoursM3()).isEqualTo(UPDATED_INF_ACTUAL_BILLABLE_HOURS_M_3);
        assertThat(testHCBTModel.getInfActualSpendM1NonUsd()).isEqualTo(UPDATED_INF_ACTUAL_SPEND_M_1_NON_USD);
        assertThat(testHCBTModel.getInfActualSpendM2NonUsd()).isEqualTo(UPDATED_INF_ACTUAL_SPEND_M_2_NON_USD);
        assertThat(testHCBTModel.getInfActualSpendM3NonUsd()).isEqualTo(UPDATED_INF_ACTUAL_SPEND_M_3_NON_USD);
        assertThat(testHCBTModel.getInfBaseAht()).isEqualTo(UPDATED_INF_BASE_AHT);
        assertThat(testHCBTModel.getInfBaseHeads()).isEqualTo(UPDATED_INF_BASE_HEADS);
        assertThat(testHCBTModel.getCnxBaseRate()).isEqualTo(UPDATED_CNX_BASE_RATE);
        assertThat(testHCBTModel.getInfCurrency()).isEqualTo(UPDATED_INF_CURRENCY);
        assertThat(testHCBTModel.getInfCurrencyHourlyRate()).isEqualTo(UPDATED_INF_CURRENCY_HOURLY_RATE);
        assertThat(testHCBTModel.getFiscalQuaterName()).isEqualTo(UPDATED_FISCAL_QUATER_NAME);
        assertThat(testHCBTModel.getActualMilestoneM1DiffPer()).isEqualTo(UPDATED_ACTUAL_MILESTONE_M_1_DIFF_PER);
        assertThat(testHCBTModel.getActualMilestoneM2DiffPer()).isEqualTo(UPDATED_ACTUAL_MILESTONE_M_2_DIFF_PER);
        assertThat(testHCBTModel.getQtrlyDiffActualProjection()).isEqualTo(UPDATED_QTRLY_DIFF_ACTUAL_PROJECTION);
        assertThat(testHCBTModel.getInfTotalQtrlySpendNonUsd()).isEqualTo(UPDATED_INF_TOTAL_QTRLY_SPEND_NON_USD);
        assertThat(testHCBTModel.getDataFlag()).isEqualTo(UPDATED_DATA_FLAG);
        assertThat(testHCBTModel.getLoadDate()).isEqualTo(UPDATED_LOAD_DATE);
        assertThat(testHCBTModel.getCnxBaseRateFte()).isEqualTo(UPDATED_CNX_BASE_RATE_FTE);
        assertThat(testHCBTModel.getCnxbaseratetbp()).isEqualTo(UPDATED_CNXBASERATETBP);
    }

    @Test
    @Transactional
    public void updateNonExistingHCBTModel() throws Exception {
        int databaseSizeBeforeUpdate = hCBTModelRepository.findAll().size();

        // Create the HCBTModel
        HCBTModelDTO hCBTModelDTO = hCBTModelMapper.toDto(hCBTModel);

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restHCBTModelMockMvc.perform(put("/api/hcbt-models")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(hCBTModelDTO)))
            .andExpect(status().isBadRequest());

        // Validate the HCBTModel in the database
        List<HCBTModel> hCBTModelList = hCBTModelRepository.findAll();
        assertThat(hCBTModelList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteHCBTModel() throws Exception {
        // Initialize the database
        hCBTModelRepository.saveAndFlush(hCBTModel);

        int databaseSizeBeforeDelete = hCBTModelRepository.findAll().size();

        // Get the hCBTModel
        restHCBTModelMockMvc.perform(delete("/api/hcbt-models/{id}", hCBTModel.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<HCBTModel> hCBTModelList = hCBTModelRepository.findAll();
        assertThat(hCBTModelList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(HCBTModel.class);
        HCBTModel hCBTModel1 = new HCBTModel();
        hCBTModel1.setId(1L);
        HCBTModel hCBTModel2 = new HCBTModel();
        hCBTModel2.setId(hCBTModel1.getId());
        assertThat(hCBTModel1).isEqualTo(hCBTModel2);
        hCBTModel2.setId(2L);
        assertThat(hCBTModel1).isNotEqualTo(hCBTModel2);
        hCBTModel1.setId(null);
        assertThat(hCBTModel1).isNotEqualTo(hCBTModel2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(HCBTModelDTO.class);
        HCBTModelDTO hCBTModelDTO1 = new HCBTModelDTO();
        hCBTModelDTO1.setId(1L);
        HCBTModelDTO hCBTModelDTO2 = new HCBTModelDTO();
        assertThat(hCBTModelDTO1).isNotEqualTo(hCBTModelDTO2);
        hCBTModelDTO2.setId(hCBTModelDTO1.getId());
        assertThat(hCBTModelDTO1).isEqualTo(hCBTModelDTO2);
        hCBTModelDTO2.setId(2L);
        assertThat(hCBTModelDTO1).isNotEqualTo(hCBTModelDTO2);
        hCBTModelDTO1.setId(null);
        assertThat(hCBTModelDTO1).isNotEqualTo(hCBTModelDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(hCBTModelMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(hCBTModelMapper.fromId(null)).isNull();
    }
}
