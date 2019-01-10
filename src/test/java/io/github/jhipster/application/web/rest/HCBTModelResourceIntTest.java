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
import java.time.LocalDate;
import java.time.ZoneId;
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

    private static final Integer DEFAULT_PROJECTED_OTH_VOL_M_1_TBP = 1;
    private static final Integer UPDATED_PROJECTED_OTH_VOL_M_1_TBP = 2;

    private static final Integer DEFAULT_PROJECTED_OTH_VOL_M_2_TBP = 1;
    private static final Integer UPDATED_PROJECTED_OTH_VOL_M_2_TBP = 2;

    private static final Integer DEFAULT_PROJECTED_OTH_VOL_M_3_TBP = 1;
    private static final Integer UPDATED_PROJECTED_OTH_VOL_M_3_TBP = 2;

    private static final Integer DEFAULT_PROJECTED_VOL_M_1_TBP = 1;
    private static final Integer UPDATED_PROJECTED_VOL_M_1_TBP = 2;

    private static final Integer DEFAULT_PROJECTED_VOL_M_2_TBP = 1;
    private static final Integer UPDATED_PROJECTED_VOL_M_2_TBP = 2;

    private static final Integer DEFAULT_PROJECTED_VOL_M_3_TBP = 1;
    private static final Integer UPDATED_PROJECTED_VOL_M_3_TBP = 2;

    private static final Integer DEFAULT_QTRLY_DIFF_ACTUAL_PROJECTION = 1;
    private static final Integer UPDATED_QTRLY_DIFF_ACTUAL_PROJECTION = 2;

    private static final Integer DEFAULT_RETROSPECTIVE_ADJ_M_1 = 1;
    private static final Integer UPDATED_RETROSPECTIVE_ADJ_M_1 = 2;

    private static final Integer DEFAULT_RETROSPECTIVE_ADJ_M_2 = 1;
    private static final Integer UPDATED_RETROSPECTIVE_ADJ_M_2 = 2;

    private static final Integer DEFAULT_RETROSPECTIVE_ADJ_M_3 = 1;
    private static final Integer UPDATED_RETROSPECTIVE_ADJ_M_3 = 2;

    private static final String DEFAULT_SERVICE_CATEGORY = "AAAAAAAAAA";
    private static final String UPDATED_SERVICE_CATEGORY = "BBBBBBBBBB";

    private static final String DEFAULT_SERVICE_DRILL_DOWN = "AAAAAAAAAA";
    private static final String UPDATED_SERVICE_DRILL_DOWN = "BBBBBBBBBB";

    private static final String DEFAULT_SERVICE_PILLAR = "AAAAAAAAAA";
    private static final String UPDATED_SERVICE_PILLAR = "BBBBBBBBBB";

    private static final String DEFAULT_SOW_NAME = "AAAAAAAAAA";
    private static final String UPDATED_SOW_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_SOW_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_SOW_NUMBER = "BBBBBBBBBB";

    private static final Integer DEFAULT_TOTAL_QTRLY_SPEND_USD = 1;
    private static final Integer UPDATED_TOTAL_QTRLY_SPEND_USD = 2;

    private static final Integer DEFAULT_INF_TOTAL_QTRLY_SPEND_NON_USD = 1;
    private static final Integer UPDATED_INF_TOTAL_QTRLY_SPEND_NON_USD = 2;

    private static final String DEFAULT_VENDOR_NAME = "AAAAAAAAAA";
    private static final String UPDATED_VENDOR_NAME = "BBBBBBBBBB";

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

    private static final String DEFAULT_NOTES = "AAAAAAAAAA";
    private static final String UPDATED_NOTES = "BBBBBBBBBB";

    private static final String DEFAULT_DATA_FLAG = "AAAAAAAAAA";
    private static final String UPDATED_DATA_FLAG = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_LOAD_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_LOAD_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final Integer DEFAULT_CCA_VENDOR_DATA_SK = 1;
    private static final Integer UPDATED_CCA_VENDOR_DATA_SK = 2;

    private static final String DEFAULT_CCA_VENDOR_DATA_PK = "AAAAAAAAAA";
    private static final String UPDATED_CCA_VENDOR_DATA_PK = "BBBBBBBBBB";

    private static final Integer DEFAULT_HOURLY_RATE_DOLLAR_FTE = 1;
    private static final Integer UPDATED_HOURLY_RATE_DOLLAR_FTE = 2;

    private static final Integer DEFAULT_HOURLY_RATE_DOLLAR_PH = 1;
    private static final Integer UPDATED_HOURLY_RATE_DOLLAR_PH = 2;

    private static final Integer DEFAULT_DOLLAR_RATE_PER_MINUTE_TBP = 1;
    private static final Integer UPDATED_DOLLAR_RATE_PER_MINUTE_TBP = 2;

    private static final String DEFAULT_DELIVERY_POC = "AAAAAAAAAA";
    private static final String UPDATED_DELIVERY_POC = "BBBBBBBBBB";

    private static final Integer DEFAULT_ACTUAL_BILLABLE_HEADS_M_1_FTE = 1;
    private static final Integer UPDATED_ACTUAL_BILLABLE_HEADS_M_1_FTE = 2;

    private static final Integer DEFAULT_ACTUAL_BILLABLE_HEADS_M_2_FTE = 1;
    private static final Integer UPDATED_ACTUAL_BILLABLE_HEADS_M_2_FTE = 2;

    private static final Integer DEFAULT_ACTUAL_BILLABLE_HEADS_M_3_FTE = 1;
    private static final Integer UPDATED_ACTUAL_BILLABLE_HEADS_M_3_FTE = 2;

    private static final Integer DEFAULT_ACT_BILLABLE_HOURS_M_1_PH = 1;
    private static final Integer UPDATED_ACT_BILLABLE_HOURS_M_1_PH = 2;

    private static final Integer DEFAULT_INF_ACT_BILL_HOURS_M_1_FTE = 1;
    private static final Integer UPDATED_INF_ACT_BILL_HOURS_M_1_FTE = 2;

    private static final Integer DEFAULT_ACT_BILLABLE_HOURS_M_2_PH = 1;
    private static final Integer UPDATED_ACT_BILLABLE_HOURS_M_2_PH = 2;

    private static final Integer DEFAULT_INF_ACT_BILL_HOURS_M_2_FTE = 1;
    private static final Integer UPDATED_INF_ACT_BILL_HOURS_M_2_FTE = 2;

    private static final Integer DEFAULT_ACT_BILLABLE_HOURS_M_3_PH = 1;
    private static final Integer UPDATED_ACT_BILLABLE_HOURS_M_3_PH = 2;

    private static final Integer DEFAULT_INF_ACT_BILL_HOURS_M_3_FTE = 1;
    private static final Integer UPDATED_INF_ACT_BILL_HOURS_M_3_FTE = 2;

    private static final Integer DEFAULT_ACTUAL_OTHER_VOLUME_M_1_TBP = 1;
    private static final Integer UPDATED_ACTUAL_OTHER_VOLUME_M_1_TBP = 2;

    private static final Integer DEFAULT_ACTUAL_OTHER_VOLUME_M_2_TBP = 1;
    private static final Integer UPDATED_ACTUAL_OTHER_VOLUME_M_2_TBP = 2;

    private static final Integer DEFAULT_ACTUAL_OTHER_VOLUME_M_3_TBP = 1;
    private static final Integer UPDATED_ACTUAL_OTHER_VOLUME_M_3_TBP = 2;

    private static final Integer DEFAULT_ACTUAL_SPEND_M_1_USD = 1;
    private static final Integer UPDATED_ACTUAL_SPEND_M_1_USD = 2;

    private static final Double DEFAULT_INF_ACT_SPEND_M_1_NON_USD_CURR = 1D;
    private static final Double UPDATED_INF_ACT_SPEND_M_1_NON_USD_CURR = 2D;

    private static final Integer DEFAULT_ACTUAL_SPEND_M_2_USD = 1;
    private static final Integer UPDATED_ACTUAL_SPEND_M_2_USD = 2;

    private static final Double DEFAULT_INF_ACT_SPEND_M_2_NON_USD_CURR = 1D;
    private static final Double UPDATED_INF_ACT_SPEND_M_2_NON_USD_CURR = 2D;

    private static final Integer DEFAULT_ACTUAL_SPEND_M_3_USD = 1;
    private static final Integer UPDATED_ACTUAL_SPEND_M_3_USD = 2;

    private static final Double DEFAULT_INF_ACT_SPEND_M_3_NON_USD_CURR = 1D;
    private static final Double UPDATED_INF_ACT_SPEND_M_3_NON_USD_CURR = 2D;

    private static final Integer DEFAULT_ACTUAL_VOLUME_M_1_TBP = 1;
    private static final Integer UPDATED_ACTUAL_VOLUME_M_1_TBP = 2;

    private static final Integer DEFAULT_ACTUAL_VOLUME_M_2_TBP = 1;
    private static final Integer UPDATED_ACTUAL_VOLUME_M_2_TBP = 2;

    private static final Integer DEFAULT_ACTUAL_VOLUME_M_3_TBP = 1;
    private static final Integer UPDATED_ACTUAL_VOLUME_M_3_TBP = 2;

    private static final Integer DEFAULT_ACTUAL_PO_VALUE_DIFF_PER = 1;
    private static final Integer UPDATED_ACTUAL_PO_VALUE_DIFF_PER = 2;

    private static final Integer DEFAULT_AHT_IN_MINUTES_TBP = 1;
    private static final Integer UPDATED_AHT_IN_MINUTES_TBP = 2;

    private static final Integer DEFAULT_APP_OT_HRS_M_1 = 1;
    private static final Integer UPDATED_APP_OT_HRS_M_1 = 2;

    private static final Integer DEFAULT_APP_OT_HRS_M_2 = 1;
    private static final Integer UPDATED_APP_OT_HRS_M_2 = 2;

    private static final Integer DEFAULT_APP_OT_HRS_M_3 = 1;
    private static final Integer UPDATED_APP_OT_HRS_M_3 = 2;

    private static final Integer DEFAULT_INF_BASE_AHT = 1;
    private static final Integer UPDATED_INF_BASE_AHT = 2;

    private static final String DEFAULT_INF_BASE_HEADS = "AAAAAAAAAA";
    private static final String UPDATED_INF_BASE_HEADS = "BBBBBBBBBB";

    private static final Integer DEFAULT_CNX_BASE_RATE_TBP = 1;
    private static final Integer UPDATED_CNX_BASE_RATE_TBP = 2;

    private static final Integer DEFAULT_CNX_BASE_RATE_FTE = 1;
    private static final Integer UPDATED_CNX_BASE_RATE_FTE = 2;

    private static final Integer DEFAULT_BILLING_ADJ_HITTING_M_1 = 1;
    private static final Integer UPDATED_BILLING_ADJ_HITTING_M_1 = 2;

    private static final Integer DEFAULT_BILLING_ADJ_HITTING_M_2 = 1;
    private static final Integer UPDATED_BILLING_ADJ_HITTING_M_2 = 2;

    private static final Integer DEFAULT_BILLING_ADJ_HITTING_M_3 = 1;
    private static final Integer UPDATED_BILLING_ADJ_HITTING_M_3 = 2;

    private static final Integer DEFAULT_BUFFER_USD = 1;
    private static final Integer UPDATED_BUFFER_USD = 2;

    private static final Double DEFAULT_INF_BUFFER_NON_USD_CURR = 1D;
    private static final Double UPDATED_INF_BUFFER_NON_USD_CURR = 2D;

    private static final String DEFAULT_CISCO_BUSINESS_OWNER = "AAAAAAAAAA";
    private static final String UPDATED_CISCO_BUSINESS_OWNER = "BBBBBBBBBB";

    private static final String DEFAULT_INF_CURRENCY = "AAAAAAAAAA";
    private static final String UPDATED_INF_CURRENCY = "BBBBBBBBBB";

    private static final Integer DEFAULT_INF_CURRENCY_HRLY_RATE_FTE = 1;
    private static final Integer UPDATED_INF_CURRENCY_HRLY_RATE_FTE = 2;

    private static final Integer DEFAULT_ACTUAL_PROJ_M_1_DIFF_USD = 1;
    private static final Integer UPDATED_ACTUAL_PROJ_M_1_DIFF_USD = 2;

    private static final Integer DEFAULT_ACTUAL_PROJ_M_2_DIFF_USD = 1;
    private static final Integer UPDATED_ACTUAL_PROJ_M_2_DIFF_USD = 2;

    private static final Integer DEFAULT_ACTUAL_PROJ_M_3_DIFF_USD = 1;
    private static final Integer UPDATED_ACTUAL_PROJ_M_3_DIFF_USD = 2;

    private static final String DEFAULT_FISCAL_QUARTER_NAME = "AAAAAAAAAA";
    private static final String UPDATED_FISCAL_QUARTER_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_VENDOR_LOCATION = "AAAAAAAAAA";
    private static final String UPDATED_VENDOR_LOCATION = "BBBBBBBBBB";

    private static final String DEFAULT_METHOD = "AAAAAAAAAA";
    private static final String UPDATED_METHOD = "BBBBBBBBBB";

    private static final Integer DEFAULT_ACTUAL_MILESTONE_M_1_PER = 1;
    private static final Integer UPDATED_ACTUAL_MILESTONE_M_1_PER = 2;

    private static final Integer DEFAULT_ACTUAL_MILESTONE_M_2_PER = 1;
    private static final Integer UPDATED_ACTUAL_MILESTONE_M_2_PER = 2;

    private static final Integer DEFAULT_ACTUAL_MILESTONE_M_3_PER = 1;
    private static final Integer UPDATED_ACTUAL_MILESTONE_M_3_PER = 2;

    private static final Integer DEFAULT_MILESTONE_VALUE_M_1_USD = 1;
    private static final Integer UPDATED_MILESTONE_VALUE_M_1_USD = 2;

    private static final Double DEFAULT_INF_M_STON_VAL_M_1_NON_USD_CUR = 1D;
    private static final Double UPDATED_INF_M_STON_VAL_M_1_NON_USD_CUR = 2D;

    private static final Integer DEFAULT_MILESTONE_VALUE_M_2_USD = 1;
    private static final Integer UPDATED_MILESTONE_VALUE_M_2_USD = 2;

    private static final Double DEFAULT_INF_M_STON_VAL_M_2_NON_USD_CUR = 1D;
    private static final Double UPDATED_INF_M_STON_VAL_M_2_NON_USD_CUR = 2D;

    private static final Integer DEFAULT_MILESTONE_VALUE_M_3_USD = 1;
    private static final Integer UPDATED_MILESTONE_VALUE_M_3_USD = 2;

    private static final Double DEFAULT_INF_M_STON_VAL_M_3_NON_USD_CUR = 1D;
    private static final Double UPDATED_INF_M_STON_VAL_M_3_NON_USD_CUR = 2D;

    private static final Integer DEFAULT_CNX_CHR_AGENT_NUM_WDNM_CASES = 1;
    private static final Integer UPDATED_CNX_CHR_AGENT_NUM_WDNM_CASES = 2;

    private static final Integer DEFAULT_CNV_CHR_STAFF_HRS_WDNM_CASES = 1;
    private static final Integer UPDATED_CNV_CHR_STAFF_HRS_WDNM_CASES = 2;

    private static final Integer DEFAULT_OTHER_VOLUME_RATE_TBP = 1;
    private static final Integer UPDATED_OTHER_VOLUME_RATE_TBP = 2;

    private static final Integer DEFAULT_OT_RATE = 1;
    private static final Integer UPDATED_OT_RATE = 2;

    private static final Integer DEFAULT_OT_SPEND_M_1 = 1;
    private static final Integer UPDATED_OT_SPEND_M_1 = 2;

    private static final Integer DEFAULT_OT_SPEND_M_2 = 1;
    private static final Integer UPDATED_OT_SPEND_M_2 = 2;

    private static final Integer DEFAULT_OT_SPEND_M_3 = 1;
    private static final Integer UPDATED_OT_SPEND_M_3 = 2;

    private static final Integer DEFAULT_PO_AMOUNT_USD = 1;
    private static final Integer UPDATED_PO_AMOUNT_USD = 2;

    private static final Integer DEFAULT_INF_PO_AMOUNT_NON_USD = 1;
    private static final Integer UPDATED_INF_PO_AMOUNT_NON_USD = 2;

    private static final String DEFAULT_PO_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_PO_NUMBER = "BBBBBBBBBB";

    private static final Integer DEFAULT_PROJ_BILLABLE_HEADS_M_1_FTE = 1;
    private static final Integer UPDATED_PROJ_BILLABLE_HEADS_M_1_FTE = 2;

    private static final Integer DEFAULT_PROJ_BILLABLE_HEADS_M_2_FTE = 1;
    private static final Integer UPDATED_PROJ_BILLABLE_HEADS_M_2_FTE = 2;

    private static final Integer DEFAULT_PROJ_BILLABLE_HEADS_M_3_FTE = 1;
    private static final Integer UPDATED_PROJ_BILLABLE_HEADS_M_3_FTE = 2;

    private static final Integer DEFAULT_PROJECTED_BILLABLE_HRS_M_1_PH = 1;
    private static final Integer UPDATED_PROJECTED_BILLABLE_HRS_M_1_PH = 2;

    private static final Integer DEFAULT_PROJECTED_BILLABLE_HRS_M_2_PH = 1;
    private static final Integer UPDATED_PROJECTED_BILLABLE_HRS_M_2_PH = 2;

    private static final Integer DEFAULT_PROJECTED_BILLABLE_HRS_M_3_PH = 1;
    private static final Integer UPDATED_PROJECTED_BILLABLE_HRS_M_3_PH = 2;

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
            .projectedOthVolM1Tbp(DEFAULT_PROJECTED_OTH_VOL_M_1_TBP)
            .projectedOthVolM2Tbp(DEFAULT_PROJECTED_OTH_VOL_M_2_TBP)
            .projectedOthVolM3Tbp(DEFAULT_PROJECTED_OTH_VOL_M_3_TBP)
            .projectedVolM1Tbp(DEFAULT_PROJECTED_VOL_M_1_TBP)
            .projectedVolM2Tbp(DEFAULT_PROJECTED_VOL_M_2_TBP)
            .projectedVolM3Tbp(DEFAULT_PROJECTED_VOL_M_3_TBP)
            .qtrlyDiffActualProjection(DEFAULT_QTRLY_DIFF_ACTUAL_PROJECTION)
            .retrospectiveAdjM1(DEFAULT_RETROSPECTIVE_ADJ_M_1)
            .retrospectiveAdjM2(DEFAULT_RETROSPECTIVE_ADJ_M_2)
            .retrospectiveAdjM3(DEFAULT_RETROSPECTIVE_ADJ_M_3)
            .serviceCategory(DEFAULT_SERVICE_CATEGORY)
            .serviceDrillDown(DEFAULT_SERVICE_DRILL_DOWN)
            .servicePillar(DEFAULT_SERVICE_PILLAR)
            .sowName(DEFAULT_SOW_NAME)
            .sowNumber(DEFAULT_SOW_NUMBER)
            .totalQtrlySpendUsd(DEFAULT_TOTAL_QTRLY_SPEND_USD)
            .infTotalQtrlySpendNonUsd(DEFAULT_INF_TOTAL_QTRLY_SPEND_NON_USD)
            .vendorName(DEFAULT_VENDOR_NAME)
            .actualRetrospectiveCostM1(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_1)
            .actualRetrospectiveCostM2(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_2)
            .actualRetrospectiveCostM3(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_3)
            .totalQtrlyRetrospectiveCost(DEFAULT_TOTAL_QTRLY_RETROSPECTIVE_COST)
            .changeImpact(DEFAULT_CHANGE_IMPACT)
            .notes(DEFAULT_NOTES)
            .dataFlag(DEFAULT_DATA_FLAG)
            .loadDate(DEFAULT_LOAD_DATE)
            .ccaVendorDataSk(DEFAULT_CCA_VENDOR_DATA_SK)
            .ccaVendorDataPk(DEFAULT_CCA_VENDOR_DATA_PK)
            .hourlyRateDollarFte(DEFAULT_HOURLY_RATE_DOLLAR_FTE)
            .hourlyRateDollarPh(DEFAULT_HOURLY_RATE_DOLLAR_PH)
            .dollarRatePerMinuteTbp(DEFAULT_DOLLAR_RATE_PER_MINUTE_TBP)
            .deliveryPoc(DEFAULT_DELIVERY_POC)
            .actualBillableHeadsM1Fte(DEFAULT_ACTUAL_BILLABLE_HEADS_M_1_FTE)
            .actualBillableHeadsM2Fte(DEFAULT_ACTUAL_BILLABLE_HEADS_M_2_FTE)
            .actualBillableHeadsM3Fte(DEFAULT_ACTUAL_BILLABLE_HEADS_M_3_FTE)
            .actBillableHoursM1Ph(DEFAULT_ACT_BILLABLE_HOURS_M_1_PH)
            .infActBillHoursM1Fte(DEFAULT_INF_ACT_BILL_HOURS_M_1_FTE)
            .actBillableHoursM2Ph(DEFAULT_ACT_BILLABLE_HOURS_M_2_PH)
            .infActBillHoursM2Fte(DEFAULT_INF_ACT_BILL_HOURS_M_2_FTE)
            .actBillableHoursM3Ph(DEFAULT_ACT_BILLABLE_HOURS_M_3_PH)
            .infActBillHoursM3Fte(DEFAULT_INF_ACT_BILL_HOURS_M_3_FTE)
            .actualOtherVolumeM1Tbp(DEFAULT_ACTUAL_OTHER_VOLUME_M_1_TBP)
            .actualOtherVolumeM2Tbp(DEFAULT_ACTUAL_OTHER_VOLUME_M_2_TBP)
            .actualOtherVolumeM3Tbp(DEFAULT_ACTUAL_OTHER_VOLUME_M_3_TBP)
            .actualSpendM1Usd(DEFAULT_ACTUAL_SPEND_M_1_USD)
            .infActSpendM1NonUsdCurr(DEFAULT_INF_ACT_SPEND_M_1_NON_USD_CURR)
            .actualSpendM2Usd(DEFAULT_ACTUAL_SPEND_M_2_USD)
            .infActSpendM2NonUsdCurr(DEFAULT_INF_ACT_SPEND_M_2_NON_USD_CURR)
            .actualSpendM3Usd(DEFAULT_ACTUAL_SPEND_M_3_USD)
            .infActSpendM3NonUsdCurr(DEFAULT_INF_ACT_SPEND_M_3_NON_USD_CURR)
            .actualVolumeM1Tbp(DEFAULT_ACTUAL_VOLUME_M_1_TBP)
            .actualVolumeM2Tbp(DEFAULT_ACTUAL_VOLUME_M_2_TBP)
            .actualVolumeM3Tbp(DEFAULT_ACTUAL_VOLUME_M_3_TBP)
            .actualPoValueDiffPer(DEFAULT_ACTUAL_PO_VALUE_DIFF_PER)
            .ahtInMinutesTbp(DEFAULT_AHT_IN_MINUTES_TBP)
            .appOtHrsM1(DEFAULT_APP_OT_HRS_M_1)
            .appOtHrsM2(DEFAULT_APP_OT_HRS_M_2)
            .appOtHrsM3(DEFAULT_APP_OT_HRS_M_3)
            .infBaseAht(DEFAULT_INF_BASE_AHT)
            .infBaseHeads(DEFAULT_INF_BASE_HEADS)
            .cnxBaseRateTbp(DEFAULT_CNX_BASE_RATE_TBP)
            .cnxBaseRateFte(DEFAULT_CNX_BASE_RATE_FTE)
            .billingAdjHittingM1(DEFAULT_BILLING_ADJ_HITTING_M_1)
            .billingAdjHittingM2(DEFAULT_BILLING_ADJ_HITTING_M_2)
            .billingAdjHittingM3(DEFAULT_BILLING_ADJ_HITTING_M_3)
            .bufferUsd(DEFAULT_BUFFER_USD)
            .infBufferNonUsdCurr(DEFAULT_INF_BUFFER_NON_USD_CURR)
            .ciscoBusinessOwner(DEFAULT_CISCO_BUSINESS_OWNER)
            .infCurrency(DEFAULT_INF_CURRENCY)
            .infCurrencyHrlyRateFte(DEFAULT_INF_CURRENCY_HRLY_RATE_FTE)
            .actualProjM1DiffUsd(DEFAULT_ACTUAL_PROJ_M_1_DIFF_USD)
            .actualProjM2DiffUsd(DEFAULT_ACTUAL_PROJ_M_2_DIFF_USD)
            .actualProjM3DiffUsd(DEFAULT_ACTUAL_PROJ_M_3_DIFF_USD)
            .fiscalQuarterName(DEFAULT_FISCAL_QUARTER_NAME)
            .vendorLocation(DEFAULT_VENDOR_LOCATION)
            .method(DEFAULT_METHOD)
            .actualMilestoneM1Per(DEFAULT_ACTUAL_MILESTONE_M_1_PER)
            .actualMilestoneM2Per(DEFAULT_ACTUAL_MILESTONE_M_2_PER)
            .actualMilestoneM3Per(DEFAULT_ACTUAL_MILESTONE_M_3_PER)
            .milestoneValueM1Usd(DEFAULT_MILESTONE_VALUE_M_1_USD)
            .infMStonValM1NonUsdCur(DEFAULT_INF_M_STON_VAL_M_1_NON_USD_CUR)
            .milestoneValueM2Usd(DEFAULT_MILESTONE_VALUE_M_2_USD)
            .infMStonValM2NonUsdCur(DEFAULT_INF_M_STON_VAL_M_2_NON_USD_CUR)
            .milestoneValueM3Usd(DEFAULT_MILESTONE_VALUE_M_3_USD)
            .infMStonValM3NonUsdCur(DEFAULT_INF_M_STON_VAL_M_3_NON_USD_CUR)
            .cnxChrAgentNumWdnmCases(DEFAULT_CNX_CHR_AGENT_NUM_WDNM_CASES)
            .cnvChrStaffHrsWdnmCases(DEFAULT_CNV_CHR_STAFF_HRS_WDNM_CASES)
            .otherVolumeRateTbp(DEFAULT_OTHER_VOLUME_RATE_TBP)
            .otRate(DEFAULT_OT_RATE)
            .otSpendM1(DEFAULT_OT_SPEND_M_1)
            .otSpendM2(DEFAULT_OT_SPEND_M_2)
            .otSpendM3(DEFAULT_OT_SPEND_M_3)
            .poAmountUsd(DEFAULT_PO_AMOUNT_USD)
            .infPoAmountNonUsd(DEFAULT_INF_PO_AMOUNT_NON_USD)
            .poNumber(DEFAULT_PO_NUMBER)
            .projBillableHeadsM1Fte(DEFAULT_PROJ_BILLABLE_HEADS_M_1_FTE)
            .projBillableHeadsM2Fte(DEFAULT_PROJ_BILLABLE_HEADS_M_2_FTE)
            .projBillableHeadsM3Fte(DEFAULT_PROJ_BILLABLE_HEADS_M_3_FTE)
            .projectedBillableHrsM1Ph(DEFAULT_PROJECTED_BILLABLE_HRS_M_1_PH)
            .projectedBillableHrsM2Ph(DEFAULT_PROJECTED_BILLABLE_HRS_M_2_PH)
            .projectedBillableHrsM3Ph(DEFAULT_PROJECTED_BILLABLE_HRS_M_3_PH);
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
        assertThat(testHCBTModel.getProjectedOthVolM1Tbp()).isEqualTo(DEFAULT_PROJECTED_OTH_VOL_M_1_TBP);
        assertThat(testHCBTModel.getProjectedOthVolM2Tbp()).isEqualTo(DEFAULT_PROJECTED_OTH_VOL_M_2_TBP);
        assertThat(testHCBTModel.getProjectedOthVolM3Tbp()).isEqualTo(DEFAULT_PROJECTED_OTH_VOL_M_3_TBP);
        assertThat(testHCBTModel.getProjectedVolM1Tbp()).isEqualTo(DEFAULT_PROJECTED_VOL_M_1_TBP);
        assertThat(testHCBTModel.getProjectedVolM2Tbp()).isEqualTo(DEFAULT_PROJECTED_VOL_M_2_TBP);
        assertThat(testHCBTModel.getProjectedVolM3Tbp()).isEqualTo(DEFAULT_PROJECTED_VOL_M_3_TBP);
        assertThat(testHCBTModel.getQtrlyDiffActualProjection()).isEqualTo(DEFAULT_QTRLY_DIFF_ACTUAL_PROJECTION);
        assertThat(testHCBTModel.getRetrospectiveAdjM1()).isEqualTo(DEFAULT_RETROSPECTIVE_ADJ_M_1);
        assertThat(testHCBTModel.getRetrospectiveAdjM2()).isEqualTo(DEFAULT_RETROSPECTIVE_ADJ_M_2);
        assertThat(testHCBTModel.getRetrospectiveAdjM3()).isEqualTo(DEFAULT_RETROSPECTIVE_ADJ_M_3);
        assertThat(testHCBTModel.getServiceCategory()).isEqualTo(DEFAULT_SERVICE_CATEGORY);
        assertThat(testHCBTModel.getServiceDrillDown()).isEqualTo(DEFAULT_SERVICE_DRILL_DOWN);
        assertThat(testHCBTModel.getServicePillar()).isEqualTo(DEFAULT_SERVICE_PILLAR);
        assertThat(testHCBTModel.getSowName()).isEqualTo(DEFAULT_SOW_NAME);
        assertThat(testHCBTModel.getSowNumber()).isEqualTo(DEFAULT_SOW_NUMBER);
        assertThat(testHCBTModel.getTotalQtrlySpendUsd()).isEqualTo(DEFAULT_TOTAL_QTRLY_SPEND_USD);
        assertThat(testHCBTModel.getInfTotalQtrlySpendNonUsd()).isEqualTo(DEFAULT_INF_TOTAL_QTRLY_SPEND_NON_USD);
        assertThat(testHCBTModel.getVendorName()).isEqualTo(DEFAULT_VENDOR_NAME);
        assertThat(testHCBTModel.getActualRetrospectiveCostM1()).isEqualTo(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_1);
        assertThat(testHCBTModel.getActualRetrospectiveCostM2()).isEqualTo(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_2);
        assertThat(testHCBTModel.getActualRetrospectiveCostM3()).isEqualTo(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_3);
        assertThat(testHCBTModel.getTotalQtrlyRetrospectiveCost()).isEqualTo(DEFAULT_TOTAL_QTRLY_RETROSPECTIVE_COST);
        assertThat(testHCBTModel.getChangeImpact()).isEqualTo(DEFAULT_CHANGE_IMPACT);
        assertThat(testHCBTModel.getNotes()).isEqualTo(DEFAULT_NOTES);
        assertThat(testHCBTModel.getDataFlag()).isEqualTo(DEFAULT_DATA_FLAG);
        assertThat(testHCBTModel.getLoadDate()).isEqualTo(DEFAULT_LOAD_DATE);
        assertThat(testHCBTModel.getCcaVendorDataSk()).isEqualTo(DEFAULT_CCA_VENDOR_DATA_SK);
        assertThat(testHCBTModel.getCcaVendorDataPk()).isEqualTo(DEFAULT_CCA_VENDOR_DATA_PK);
        assertThat(testHCBTModel.getHourlyRateDollarFte()).isEqualTo(DEFAULT_HOURLY_RATE_DOLLAR_FTE);
        assertThat(testHCBTModel.getHourlyRateDollarPh()).isEqualTo(DEFAULT_HOURLY_RATE_DOLLAR_PH);
        assertThat(testHCBTModel.getDollarRatePerMinuteTbp()).isEqualTo(DEFAULT_DOLLAR_RATE_PER_MINUTE_TBP);
        assertThat(testHCBTModel.getDeliveryPoc()).isEqualTo(DEFAULT_DELIVERY_POC);
        assertThat(testHCBTModel.getActualBillableHeadsM1Fte()).isEqualTo(DEFAULT_ACTUAL_BILLABLE_HEADS_M_1_FTE);
        assertThat(testHCBTModel.getActualBillableHeadsM2Fte()).isEqualTo(DEFAULT_ACTUAL_BILLABLE_HEADS_M_2_FTE);
        assertThat(testHCBTModel.getActualBillableHeadsM3Fte()).isEqualTo(DEFAULT_ACTUAL_BILLABLE_HEADS_M_3_FTE);
        assertThat(testHCBTModel.getActBillableHoursM1Ph()).isEqualTo(DEFAULT_ACT_BILLABLE_HOURS_M_1_PH);
        assertThat(testHCBTModel.getInfActBillHoursM1Fte()).isEqualTo(DEFAULT_INF_ACT_BILL_HOURS_M_1_FTE);
        assertThat(testHCBTModel.getActBillableHoursM2Ph()).isEqualTo(DEFAULT_ACT_BILLABLE_HOURS_M_2_PH);
        assertThat(testHCBTModel.getInfActBillHoursM2Fte()).isEqualTo(DEFAULT_INF_ACT_BILL_HOURS_M_2_FTE);
        assertThat(testHCBTModel.getActBillableHoursM3Ph()).isEqualTo(DEFAULT_ACT_BILLABLE_HOURS_M_3_PH);
        assertThat(testHCBTModel.getInfActBillHoursM3Fte()).isEqualTo(DEFAULT_INF_ACT_BILL_HOURS_M_3_FTE);
        assertThat(testHCBTModel.getActualOtherVolumeM1Tbp()).isEqualTo(DEFAULT_ACTUAL_OTHER_VOLUME_M_1_TBP);
        assertThat(testHCBTModel.getActualOtherVolumeM2Tbp()).isEqualTo(DEFAULT_ACTUAL_OTHER_VOLUME_M_2_TBP);
        assertThat(testHCBTModel.getActualOtherVolumeM3Tbp()).isEqualTo(DEFAULT_ACTUAL_OTHER_VOLUME_M_3_TBP);
        assertThat(testHCBTModel.getActualSpendM1Usd()).isEqualTo(DEFAULT_ACTUAL_SPEND_M_1_USD);
        assertThat(testHCBTModel.getInfActSpendM1NonUsdCurr()).isEqualTo(DEFAULT_INF_ACT_SPEND_M_1_NON_USD_CURR);
        assertThat(testHCBTModel.getActualSpendM2Usd()).isEqualTo(DEFAULT_ACTUAL_SPEND_M_2_USD);
        assertThat(testHCBTModel.getInfActSpendM2NonUsdCurr()).isEqualTo(DEFAULT_INF_ACT_SPEND_M_2_NON_USD_CURR);
        assertThat(testHCBTModel.getActualSpendM3Usd()).isEqualTo(DEFAULT_ACTUAL_SPEND_M_3_USD);
        assertThat(testHCBTModel.getInfActSpendM3NonUsdCurr()).isEqualTo(DEFAULT_INF_ACT_SPEND_M_3_NON_USD_CURR);
        assertThat(testHCBTModel.getActualVolumeM1Tbp()).isEqualTo(DEFAULT_ACTUAL_VOLUME_M_1_TBP);
        assertThat(testHCBTModel.getActualVolumeM2Tbp()).isEqualTo(DEFAULT_ACTUAL_VOLUME_M_2_TBP);
        assertThat(testHCBTModel.getActualVolumeM3Tbp()).isEqualTo(DEFAULT_ACTUAL_VOLUME_M_3_TBP);
        assertThat(testHCBTModel.getActualPoValueDiffPer()).isEqualTo(DEFAULT_ACTUAL_PO_VALUE_DIFF_PER);
        assertThat(testHCBTModel.getAhtInMinutesTbp()).isEqualTo(DEFAULT_AHT_IN_MINUTES_TBP);
        assertThat(testHCBTModel.getAppOtHrsM1()).isEqualTo(DEFAULT_APP_OT_HRS_M_1);
        assertThat(testHCBTModel.getAppOtHrsM2()).isEqualTo(DEFAULT_APP_OT_HRS_M_2);
        assertThat(testHCBTModel.getAppOtHrsM3()).isEqualTo(DEFAULT_APP_OT_HRS_M_3);
        assertThat(testHCBTModel.getInfBaseAht()).isEqualTo(DEFAULT_INF_BASE_AHT);
        assertThat(testHCBTModel.getInfBaseHeads()).isEqualTo(DEFAULT_INF_BASE_HEADS);
        assertThat(testHCBTModel.getCnxBaseRateTbp()).isEqualTo(DEFAULT_CNX_BASE_RATE_TBP);
        assertThat(testHCBTModel.getCnxBaseRateFte()).isEqualTo(DEFAULT_CNX_BASE_RATE_FTE);
        assertThat(testHCBTModel.getBillingAdjHittingM1()).isEqualTo(DEFAULT_BILLING_ADJ_HITTING_M_1);
        assertThat(testHCBTModel.getBillingAdjHittingM2()).isEqualTo(DEFAULT_BILLING_ADJ_HITTING_M_2);
        assertThat(testHCBTModel.getBillingAdjHittingM3()).isEqualTo(DEFAULT_BILLING_ADJ_HITTING_M_3);
        assertThat(testHCBTModel.getBufferUsd()).isEqualTo(DEFAULT_BUFFER_USD);
        assertThat(testHCBTModel.getInfBufferNonUsdCurr()).isEqualTo(DEFAULT_INF_BUFFER_NON_USD_CURR);
        assertThat(testHCBTModel.getCiscoBusinessOwner()).isEqualTo(DEFAULT_CISCO_BUSINESS_OWNER);
        assertThat(testHCBTModel.getInfCurrency()).isEqualTo(DEFAULT_INF_CURRENCY);
        assertThat(testHCBTModel.getInfCurrencyHrlyRateFte()).isEqualTo(DEFAULT_INF_CURRENCY_HRLY_RATE_FTE);
        assertThat(testHCBTModel.getActualProjM1DiffUsd()).isEqualTo(DEFAULT_ACTUAL_PROJ_M_1_DIFF_USD);
        assertThat(testHCBTModel.getActualProjM2DiffUsd()).isEqualTo(DEFAULT_ACTUAL_PROJ_M_2_DIFF_USD);
        assertThat(testHCBTModel.getActualProjM3DiffUsd()).isEqualTo(DEFAULT_ACTUAL_PROJ_M_3_DIFF_USD);
        assertThat(testHCBTModel.getFiscalQuarterName()).isEqualTo(DEFAULT_FISCAL_QUARTER_NAME);
        assertThat(testHCBTModel.getVendorLocation()).isEqualTo(DEFAULT_VENDOR_LOCATION);
        assertThat(testHCBTModel.getMethod()).isEqualTo(DEFAULT_METHOD);
        assertThat(testHCBTModel.getActualMilestoneM1Per()).isEqualTo(DEFAULT_ACTUAL_MILESTONE_M_1_PER);
        assertThat(testHCBTModel.getActualMilestoneM2Per()).isEqualTo(DEFAULT_ACTUAL_MILESTONE_M_2_PER);
        assertThat(testHCBTModel.getActualMilestoneM3Per()).isEqualTo(DEFAULT_ACTUAL_MILESTONE_M_3_PER);
        assertThat(testHCBTModel.getMilestoneValueM1Usd()).isEqualTo(DEFAULT_MILESTONE_VALUE_M_1_USD);
        assertThat(testHCBTModel.getInfMStonValM1NonUsdCur()).isEqualTo(DEFAULT_INF_M_STON_VAL_M_1_NON_USD_CUR);
        assertThat(testHCBTModel.getMilestoneValueM2Usd()).isEqualTo(DEFAULT_MILESTONE_VALUE_M_2_USD);
        assertThat(testHCBTModel.getInfMStonValM2NonUsdCur()).isEqualTo(DEFAULT_INF_M_STON_VAL_M_2_NON_USD_CUR);
        assertThat(testHCBTModel.getMilestoneValueM3Usd()).isEqualTo(DEFAULT_MILESTONE_VALUE_M_3_USD);
        assertThat(testHCBTModel.getInfMStonValM3NonUsdCur()).isEqualTo(DEFAULT_INF_M_STON_VAL_M_3_NON_USD_CUR);
        assertThat(testHCBTModel.getCnxChrAgentNumWdnmCases()).isEqualTo(DEFAULT_CNX_CHR_AGENT_NUM_WDNM_CASES);
        assertThat(testHCBTModel.getCnvChrStaffHrsWdnmCases()).isEqualTo(DEFAULT_CNV_CHR_STAFF_HRS_WDNM_CASES);
        assertThat(testHCBTModel.getOtherVolumeRateTbp()).isEqualTo(DEFAULT_OTHER_VOLUME_RATE_TBP);
        assertThat(testHCBTModel.getOtRate()).isEqualTo(DEFAULT_OT_RATE);
        assertThat(testHCBTModel.getOtSpendM1()).isEqualTo(DEFAULT_OT_SPEND_M_1);
        assertThat(testHCBTModel.getOtSpendM2()).isEqualTo(DEFAULT_OT_SPEND_M_2);
        assertThat(testHCBTModel.getOtSpendM3()).isEqualTo(DEFAULT_OT_SPEND_M_3);
        assertThat(testHCBTModel.getPoAmountUsd()).isEqualTo(DEFAULT_PO_AMOUNT_USD);
        assertThat(testHCBTModel.getInfPoAmountNonUsd()).isEqualTo(DEFAULT_INF_PO_AMOUNT_NON_USD);
        assertThat(testHCBTModel.getPoNumber()).isEqualTo(DEFAULT_PO_NUMBER);
        assertThat(testHCBTModel.getProjBillableHeadsM1Fte()).isEqualTo(DEFAULT_PROJ_BILLABLE_HEADS_M_1_FTE);
        assertThat(testHCBTModel.getProjBillableHeadsM2Fte()).isEqualTo(DEFAULT_PROJ_BILLABLE_HEADS_M_2_FTE);
        assertThat(testHCBTModel.getProjBillableHeadsM3Fte()).isEqualTo(DEFAULT_PROJ_BILLABLE_HEADS_M_3_FTE);
        assertThat(testHCBTModel.getProjectedBillableHrsM1Ph()).isEqualTo(DEFAULT_PROJECTED_BILLABLE_HRS_M_1_PH);
        assertThat(testHCBTModel.getProjectedBillableHrsM2Ph()).isEqualTo(DEFAULT_PROJECTED_BILLABLE_HRS_M_2_PH);
        assertThat(testHCBTModel.getProjectedBillableHrsM3Ph()).isEqualTo(DEFAULT_PROJECTED_BILLABLE_HRS_M_3_PH);
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
            .andExpect(jsonPath("$.[*].projectedOthVolM1Tbp").value(hasItem(DEFAULT_PROJECTED_OTH_VOL_M_1_TBP)))
            .andExpect(jsonPath("$.[*].projectedOthVolM2Tbp").value(hasItem(DEFAULT_PROJECTED_OTH_VOL_M_2_TBP)))
            .andExpect(jsonPath("$.[*].projectedOthVolM3Tbp").value(hasItem(DEFAULT_PROJECTED_OTH_VOL_M_3_TBP)))
            .andExpect(jsonPath("$.[*].projectedVolM1Tbp").value(hasItem(DEFAULT_PROJECTED_VOL_M_1_TBP)))
            .andExpect(jsonPath("$.[*].projectedVolM2Tbp").value(hasItem(DEFAULT_PROJECTED_VOL_M_2_TBP)))
            .andExpect(jsonPath("$.[*].projectedVolM3Tbp").value(hasItem(DEFAULT_PROJECTED_VOL_M_3_TBP)))
            .andExpect(jsonPath("$.[*].qtrlyDiffActualProjection").value(hasItem(DEFAULT_QTRLY_DIFF_ACTUAL_PROJECTION)))
            .andExpect(jsonPath("$.[*].retrospectiveAdjM1").value(hasItem(DEFAULT_RETROSPECTIVE_ADJ_M_1)))
            .andExpect(jsonPath("$.[*].retrospectiveAdjM2").value(hasItem(DEFAULT_RETROSPECTIVE_ADJ_M_2)))
            .andExpect(jsonPath("$.[*].retrospectiveAdjM3").value(hasItem(DEFAULT_RETROSPECTIVE_ADJ_M_3)))
            .andExpect(jsonPath("$.[*].serviceCategory").value(hasItem(DEFAULT_SERVICE_CATEGORY.toString())))
            .andExpect(jsonPath("$.[*].serviceDrillDown").value(hasItem(DEFAULT_SERVICE_DRILL_DOWN.toString())))
            .andExpect(jsonPath("$.[*].servicePillar").value(hasItem(DEFAULT_SERVICE_PILLAR.toString())))
            .andExpect(jsonPath("$.[*].sowName").value(hasItem(DEFAULT_SOW_NAME.toString())))
            .andExpect(jsonPath("$.[*].sowNumber").value(hasItem(DEFAULT_SOW_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].totalQtrlySpendUsd").value(hasItem(DEFAULT_TOTAL_QTRLY_SPEND_USD)))
            .andExpect(jsonPath("$.[*].infTotalQtrlySpendNonUsd").value(hasItem(DEFAULT_INF_TOTAL_QTRLY_SPEND_NON_USD)))
            .andExpect(jsonPath("$.[*].vendorName").value(hasItem(DEFAULT_VENDOR_NAME.toString())))
            .andExpect(jsonPath("$.[*].actualRetrospectiveCostM1").value(hasItem(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_1)))
            .andExpect(jsonPath("$.[*].actualRetrospectiveCostM2").value(hasItem(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_2)))
            .andExpect(jsonPath("$.[*].actualRetrospectiveCostM3").value(hasItem(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_3)))
            .andExpect(jsonPath("$.[*].totalQtrlyRetrospectiveCost").value(hasItem(DEFAULT_TOTAL_QTRLY_RETROSPECTIVE_COST)))
            .andExpect(jsonPath("$.[*].changeImpact").value(hasItem(DEFAULT_CHANGE_IMPACT.toString())))
            .andExpect(jsonPath("$.[*].notes").value(hasItem(DEFAULT_NOTES.toString())))
            .andExpect(jsonPath("$.[*].dataFlag").value(hasItem(DEFAULT_DATA_FLAG.toString())))
            .andExpect(jsonPath("$.[*].loadDate").value(hasItem(DEFAULT_LOAD_DATE.toString())))
            .andExpect(jsonPath("$.[*].ccaVendorDataSk").value(hasItem(DEFAULT_CCA_VENDOR_DATA_SK)))
            .andExpect(jsonPath("$.[*].ccaVendorDataPk").value(hasItem(DEFAULT_CCA_VENDOR_DATA_PK.toString())))
            .andExpect(jsonPath("$.[*].hourlyRateDollarFte").value(hasItem(DEFAULT_HOURLY_RATE_DOLLAR_FTE)))
            .andExpect(jsonPath("$.[*].hourlyRateDollarPh").value(hasItem(DEFAULT_HOURLY_RATE_DOLLAR_PH)))
            .andExpect(jsonPath("$.[*].dollarRatePerMinuteTbp").value(hasItem(DEFAULT_DOLLAR_RATE_PER_MINUTE_TBP)))
            .andExpect(jsonPath("$.[*].deliveryPoc").value(hasItem(DEFAULT_DELIVERY_POC.toString())))
            .andExpect(jsonPath("$.[*].actualBillableHeadsM1Fte").value(hasItem(DEFAULT_ACTUAL_BILLABLE_HEADS_M_1_FTE)))
            .andExpect(jsonPath("$.[*].actualBillableHeadsM2Fte").value(hasItem(DEFAULT_ACTUAL_BILLABLE_HEADS_M_2_FTE)))
            .andExpect(jsonPath("$.[*].actualBillableHeadsM3Fte").value(hasItem(DEFAULT_ACTUAL_BILLABLE_HEADS_M_3_FTE)))
            .andExpect(jsonPath("$.[*].actBillableHoursM1Ph").value(hasItem(DEFAULT_ACT_BILLABLE_HOURS_M_1_PH)))
            .andExpect(jsonPath("$.[*].infActBillHoursM1Fte").value(hasItem(DEFAULT_INF_ACT_BILL_HOURS_M_1_FTE)))
            .andExpect(jsonPath("$.[*].actBillableHoursM2Ph").value(hasItem(DEFAULT_ACT_BILLABLE_HOURS_M_2_PH)))
            .andExpect(jsonPath("$.[*].infActBillHoursM2Fte").value(hasItem(DEFAULT_INF_ACT_BILL_HOURS_M_2_FTE)))
            .andExpect(jsonPath("$.[*].actBillableHoursM3Ph").value(hasItem(DEFAULT_ACT_BILLABLE_HOURS_M_3_PH)))
            .andExpect(jsonPath("$.[*].infActBillHoursM3Fte").value(hasItem(DEFAULT_INF_ACT_BILL_HOURS_M_3_FTE)))
            .andExpect(jsonPath("$.[*].actualOtherVolumeM1Tbp").value(hasItem(DEFAULT_ACTUAL_OTHER_VOLUME_M_1_TBP)))
            .andExpect(jsonPath("$.[*].actualOtherVolumeM2Tbp").value(hasItem(DEFAULT_ACTUAL_OTHER_VOLUME_M_2_TBP)))
            .andExpect(jsonPath("$.[*].actualOtherVolumeM3Tbp").value(hasItem(DEFAULT_ACTUAL_OTHER_VOLUME_M_3_TBP)))
            .andExpect(jsonPath("$.[*].actualSpendM1Usd").value(hasItem(DEFAULT_ACTUAL_SPEND_M_1_USD)))
            .andExpect(jsonPath("$.[*].infActSpendM1NonUsdCurr").value(hasItem(DEFAULT_INF_ACT_SPEND_M_1_NON_USD_CURR.doubleValue())))
            .andExpect(jsonPath("$.[*].actualSpendM2Usd").value(hasItem(DEFAULT_ACTUAL_SPEND_M_2_USD)))
            .andExpect(jsonPath("$.[*].infActSpendM2NonUsdCurr").value(hasItem(DEFAULT_INF_ACT_SPEND_M_2_NON_USD_CURR.doubleValue())))
            .andExpect(jsonPath("$.[*].actualSpendM3Usd").value(hasItem(DEFAULT_ACTUAL_SPEND_M_3_USD)))
            .andExpect(jsonPath("$.[*].infActSpendM3NonUsdCurr").value(hasItem(DEFAULT_INF_ACT_SPEND_M_3_NON_USD_CURR.doubleValue())))
            .andExpect(jsonPath("$.[*].actualVolumeM1Tbp").value(hasItem(DEFAULT_ACTUAL_VOLUME_M_1_TBP)))
            .andExpect(jsonPath("$.[*].actualVolumeM2Tbp").value(hasItem(DEFAULT_ACTUAL_VOLUME_M_2_TBP)))
            .andExpect(jsonPath("$.[*].actualVolumeM3Tbp").value(hasItem(DEFAULT_ACTUAL_VOLUME_M_3_TBP)))
            .andExpect(jsonPath("$.[*].actualPoValueDiffPer").value(hasItem(DEFAULT_ACTUAL_PO_VALUE_DIFF_PER)))
            .andExpect(jsonPath("$.[*].ahtInMinutesTbp").value(hasItem(DEFAULT_AHT_IN_MINUTES_TBP)))
            .andExpect(jsonPath("$.[*].appOtHrsM1").value(hasItem(DEFAULT_APP_OT_HRS_M_1)))
            .andExpect(jsonPath("$.[*].appOtHrsM2").value(hasItem(DEFAULT_APP_OT_HRS_M_2)))
            .andExpect(jsonPath("$.[*].appOtHrsM3").value(hasItem(DEFAULT_APP_OT_HRS_M_3)))
            .andExpect(jsonPath("$.[*].infBaseAht").value(hasItem(DEFAULT_INF_BASE_AHT)))
            .andExpect(jsonPath("$.[*].infBaseHeads").value(hasItem(DEFAULT_INF_BASE_HEADS.toString())))
            .andExpect(jsonPath("$.[*].cnxBaseRateTbp").value(hasItem(DEFAULT_CNX_BASE_RATE_TBP)))
            .andExpect(jsonPath("$.[*].cnxBaseRateFte").value(hasItem(DEFAULT_CNX_BASE_RATE_FTE)))
            .andExpect(jsonPath("$.[*].billingAdjHittingM1").value(hasItem(DEFAULT_BILLING_ADJ_HITTING_M_1)))
            .andExpect(jsonPath("$.[*].billingAdjHittingM2").value(hasItem(DEFAULT_BILLING_ADJ_HITTING_M_2)))
            .andExpect(jsonPath("$.[*].billingAdjHittingM3").value(hasItem(DEFAULT_BILLING_ADJ_HITTING_M_3)))
            .andExpect(jsonPath("$.[*].bufferUsd").value(hasItem(DEFAULT_BUFFER_USD)))
            .andExpect(jsonPath("$.[*].infBufferNonUsdCurr").value(hasItem(DEFAULT_INF_BUFFER_NON_USD_CURR.doubleValue())))
            .andExpect(jsonPath("$.[*].ciscoBusinessOwner").value(hasItem(DEFAULT_CISCO_BUSINESS_OWNER.toString())))
            .andExpect(jsonPath("$.[*].infCurrency").value(hasItem(DEFAULT_INF_CURRENCY.toString())))
            .andExpect(jsonPath("$.[*].infCurrencyHrlyRateFte").value(hasItem(DEFAULT_INF_CURRENCY_HRLY_RATE_FTE)))
            .andExpect(jsonPath("$.[*].actualProjM1DiffUsd").value(hasItem(DEFAULT_ACTUAL_PROJ_M_1_DIFF_USD)))
            .andExpect(jsonPath("$.[*].actualProjM2DiffUsd").value(hasItem(DEFAULT_ACTUAL_PROJ_M_2_DIFF_USD)))
            .andExpect(jsonPath("$.[*].actualProjM3DiffUsd").value(hasItem(DEFAULT_ACTUAL_PROJ_M_3_DIFF_USD)))
            .andExpect(jsonPath("$.[*].fiscalQuarterName").value(hasItem(DEFAULT_FISCAL_QUARTER_NAME.toString())))
            .andExpect(jsonPath("$.[*].vendorLocation").value(hasItem(DEFAULT_VENDOR_LOCATION.toString())))
            .andExpect(jsonPath("$.[*].method").value(hasItem(DEFAULT_METHOD.toString())))
            .andExpect(jsonPath("$.[*].actualMilestoneM1Per").value(hasItem(DEFAULT_ACTUAL_MILESTONE_M_1_PER)))
            .andExpect(jsonPath("$.[*].actualMilestoneM2Per").value(hasItem(DEFAULT_ACTUAL_MILESTONE_M_2_PER)))
            .andExpect(jsonPath("$.[*].actualMilestoneM3Per").value(hasItem(DEFAULT_ACTUAL_MILESTONE_M_3_PER)))
            .andExpect(jsonPath("$.[*].milestoneValueM1Usd").value(hasItem(DEFAULT_MILESTONE_VALUE_M_1_USD)))
            .andExpect(jsonPath("$.[*].infMStonValM1NonUsdCur").value(hasItem(DEFAULT_INF_M_STON_VAL_M_1_NON_USD_CUR.doubleValue())))
            .andExpect(jsonPath("$.[*].milestoneValueM2Usd").value(hasItem(DEFAULT_MILESTONE_VALUE_M_2_USD)))
            .andExpect(jsonPath("$.[*].infMStonValM2NonUsdCur").value(hasItem(DEFAULT_INF_M_STON_VAL_M_2_NON_USD_CUR.doubleValue())))
            .andExpect(jsonPath("$.[*].milestoneValueM3Usd").value(hasItem(DEFAULT_MILESTONE_VALUE_M_3_USD)))
            .andExpect(jsonPath("$.[*].infMStonValM3NonUsdCur").value(hasItem(DEFAULT_INF_M_STON_VAL_M_3_NON_USD_CUR.doubleValue())))
            .andExpect(jsonPath("$.[*].cnxChrAgentNumWdnmCases").value(hasItem(DEFAULT_CNX_CHR_AGENT_NUM_WDNM_CASES)))
            .andExpect(jsonPath("$.[*].cnvChrStaffHrsWdnmCases").value(hasItem(DEFAULT_CNV_CHR_STAFF_HRS_WDNM_CASES)))
            .andExpect(jsonPath("$.[*].otherVolumeRateTbp").value(hasItem(DEFAULT_OTHER_VOLUME_RATE_TBP)))
            .andExpect(jsonPath("$.[*].otRate").value(hasItem(DEFAULT_OT_RATE)))
            .andExpect(jsonPath("$.[*].otSpendM1").value(hasItem(DEFAULT_OT_SPEND_M_1)))
            .andExpect(jsonPath("$.[*].otSpendM2").value(hasItem(DEFAULT_OT_SPEND_M_2)))
            .andExpect(jsonPath("$.[*].otSpendM3").value(hasItem(DEFAULT_OT_SPEND_M_3)))
            .andExpect(jsonPath("$.[*].poAmountUsd").value(hasItem(DEFAULT_PO_AMOUNT_USD)))
            .andExpect(jsonPath("$.[*].infPoAmountNonUsd").value(hasItem(DEFAULT_INF_PO_AMOUNT_NON_USD)))
            .andExpect(jsonPath("$.[*].poNumber").value(hasItem(DEFAULT_PO_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].projBillableHeadsM1Fte").value(hasItem(DEFAULT_PROJ_BILLABLE_HEADS_M_1_FTE)))
            .andExpect(jsonPath("$.[*].projBillableHeadsM2Fte").value(hasItem(DEFAULT_PROJ_BILLABLE_HEADS_M_2_FTE)))
            .andExpect(jsonPath("$.[*].projBillableHeadsM3Fte").value(hasItem(DEFAULT_PROJ_BILLABLE_HEADS_M_3_FTE)))
            .andExpect(jsonPath("$.[*].projectedBillableHrsM1Ph").value(hasItem(DEFAULT_PROJECTED_BILLABLE_HRS_M_1_PH)))
            .andExpect(jsonPath("$.[*].projectedBillableHrsM2Ph").value(hasItem(DEFAULT_PROJECTED_BILLABLE_HRS_M_2_PH)))
            .andExpect(jsonPath("$.[*].projectedBillableHrsM3Ph").value(hasItem(DEFAULT_PROJECTED_BILLABLE_HRS_M_3_PH)));
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
            .andExpect(jsonPath("$.projectedOthVolM1Tbp").value(DEFAULT_PROJECTED_OTH_VOL_M_1_TBP))
            .andExpect(jsonPath("$.projectedOthVolM2Tbp").value(DEFAULT_PROJECTED_OTH_VOL_M_2_TBP))
            .andExpect(jsonPath("$.projectedOthVolM3Tbp").value(DEFAULT_PROJECTED_OTH_VOL_M_3_TBP))
            .andExpect(jsonPath("$.projectedVolM1Tbp").value(DEFAULT_PROJECTED_VOL_M_1_TBP))
            .andExpect(jsonPath("$.projectedVolM2Tbp").value(DEFAULT_PROJECTED_VOL_M_2_TBP))
            .andExpect(jsonPath("$.projectedVolM3Tbp").value(DEFAULT_PROJECTED_VOL_M_3_TBP))
            .andExpect(jsonPath("$.qtrlyDiffActualProjection").value(DEFAULT_QTRLY_DIFF_ACTUAL_PROJECTION))
            .andExpect(jsonPath("$.retrospectiveAdjM1").value(DEFAULT_RETROSPECTIVE_ADJ_M_1))
            .andExpect(jsonPath("$.retrospectiveAdjM2").value(DEFAULT_RETROSPECTIVE_ADJ_M_2))
            .andExpect(jsonPath("$.retrospectiveAdjM3").value(DEFAULT_RETROSPECTIVE_ADJ_M_3))
            .andExpect(jsonPath("$.serviceCategory").value(DEFAULT_SERVICE_CATEGORY.toString()))
            .andExpect(jsonPath("$.serviceDrillDown").value(DEFAULT_SERVICE_DRILL_DOWN.toString()))
            .andExpect(jsonPath("$.servicePillar").value(DEFAULT_SERVICE_PILLAR.toString()))
            .andExpect(jsonPath("$.sowName").value(DEFAULT_SOW_NAME.toString()))
            .andExpect(jsonPath("$.sowNumber").value(DEFAULT_SOW_NUMBER.toString()))
            .andExpect(jsonPath("$.totalQtrlySpendUsd").value(DEFAULT_TOTAL_QTRLY_SPEND_USD))
            .andExpect(jsonPath("$.infTotalQtrlySpendNonUsd").value(DEFAULT_INF_TOTAL_QTRLY_SPEND_NON_USD))
            .andExpect(jsonPath("$.vendorName").value(DEFAULT_VENDOR_NAME.toString()))
            .andExpect(jsonPath("$.actualRetrospectiveCostM1").value(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_1))
            .andExpect(jsonPath("$.actualRetrospectiveCostM2").value(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_2))
            .andExpect(jsonPath("$.actualRetrospectiveCostM3").value(DEFAULT_ACTUAL_RETROSPECTIVE_COST_M_3))
            .andExpect(jsonPath("$.totalQtrlyRetrospectiveCost").value(DEFAULT_TOTAL_QTRLY_RETROSPECTIVE_COST))
            .andExpect(jsonPath("$.changeImpact").value(DEFAULT_CHANGE_IMPACT.toString()))
            .andExpect(jsonPath("$.notes").value(DEFAULT_NOTES.toString()))
            .andExpect(jsonPath("$.dataFlag").value(DEFAULT_DATA_FLAG.toString()))
            .andExpect(jsonPath("$.loadDate").value(DEFAULT_LOAD_DATE.toString()))
            .andExpect(jsonPath("$.ccaVendorDataSk").value(DEFAULT_CCA_VENDOR_DATA_SK))
            .andExpect(jsonPath("$.ccaVendorDataPk").value(DEFAULT_CCA_VENDOR_DATA_PK.toString()))
            .andExpect(jsonPath("$.hourlyRateDollarFte").value(DEFAULT_HOURLY_RATE_DOLLAR_FTE))
            .andExpect(jsonPath("$.hourlyRateDollarPh").value(DEFAULT_HOURLY_RATE_DOLLAR_PH))
            .andExpect(jsonPath("$.dollarRatePerMinuteTbp").value(DEFAULT_DOLLAR_RATE_PER_MINUTE_TBP))
            .andExpect(jsonPath("$.deliveryPoc").value(DEFAULT_DELIVERY_POC.toString()))
            .andExpect(jsonPath("$.actualBillableHeadsM1Fte").value(DEFAULT_ACTUAL_BILLABLE_HEADS_M_1_FTE))
            .andExpect(jsonPath("$.actualBillableHeadsM2Fte").value(DEFAULT_ACTUAL_BILLABLE_HEADS_M_2_FTE))
            .andExpect(jsonPath("$.actualBillableHeadsM3Fte").value(DEFAULT_ACTUAL_BILLABLE_HEADS_M_3_FTE))
            .andExpect(jsonPath("$.actBillableHoursM1Ph").value(DEFAULT_ACT_BILLABLE_HOURS_M_1_PH))
            .andExpect(jsonPath("$.infActBillHoursM1Fte").value(DEFAULT_INF_ACT_BILL_HOURS_M_1_FTE))
            .andExpect(jsonPath("$.actBillableHoursM2Ph").value(DEFAULT_ACT_BILLABLE_HOURS_M_2_PH))
            .andExpect(jsonPath("$.infActBillHoursM2Fte").value(DEFAULT_INF_ACT_BILL_HOURS_M_2_FTE))
            .andExpect(jsonPath("$.actBillableHoursM3Ph").value(DEFAULT_ACT_BILLABLE_HOURS_M_3_PH))
            .andExpect(jsonPath("$.infActBillHoursM3Fte").value(DEFAULT_INF_ACT_BILL_HOURS_M_3_FTE))
            .andExpect(jsonPath("$.actualOtherVolumeM1Tbp").value(DEFAULT_ACTUAL_OTHER_VOLUME_M_1_TBP))
            .andExpect(jsonPath("$.actualOtherVolumeM2Tbp").value(DEFAULT_ACTUAL_OTHER_VOLUME_M_2_TBP))
            .andExpect(jsonPath("$.actualOtherVolumeM3Tbp").value(DEFAULT_ACTUAL_OTHER_VOLUME_M_3_TBP))
            .andExpect(jsonPath("$.actualSpendM1Usd").value(DEFAULT_ACTUAL_SPEND_M_1_USD))
            .andExpect(jsonPath("$.infActSpendM1NonUsdCurr").value(DEFAULT_INF_ACT_SPEND_M_1_NON_USD_CURR.doubleValue()))
            .andExpect(jsonPath("$.actualSpendM2Usd").value(DEFAULT_ACTUAL_SPEND_M_2_USD))
            .andExpect(jsonPath("$.infActSpendM2NonUsdCurr").value(DEFAULT_INF_ACT_SPEND_M_2_NON_USD_CURR.doubleValue()))
            .andExpect(jsonPath("$.actualSpendM3Usd").value(DEFAULT_ACTUAL_SPEND_M_3_USD))
            .andExpect(jsonPath("$.infActSpendM3NonUsdCurr").value(DEFAULT_INF_ACT_SPEND_M_3_NON_USD_CURR.doubleValue()))
            .andExpect(jsonPath("$.actualVolumeM1Tbp").value(DEFAULT_ACTUAL_VOLUME_M_1_TBP))
            .andExpect(jsonPath("$.actualVolumeM2Tbp").value(DEFAULT_ACTUAL_VOLUME_M_2_TBP))
            .andExpect(jsonPath("$.actualVolumeM3Tbp").value(DEFAULT_ACTUAL_VOLUME_M_3_TBP))
            .andExpect(jsonPath("$.actualPoValueDiffPer").value(DEFAULT_ACTUAL_PO_VALUE_DIFF_PER))
            .andExpect(jsonPath("$.ahtInMinutesTbp").value(DEFAULT_AHT_IN_MINUTES_TBP))
            .andExpect(jsonPath("$.appOtHrsM1").value(DEFAULT_APP_OT_HRS_M_1))
            .andExpect(jsonPath("$.appOtHrsM2").value(DEFAULT_APP_OT_HRS_M_2))
            .andExpect(jsonPath("$.appOtHrsM3").value(DEFAULT_APP_OT_HRS_M_3))
            .andExpect(jsonPath("$.infBaseAht").value(DEFAULT_INF_BASE_AHT))
            .andExpect(jsonPath("$.infBaseHeads").value(DEFAULT_INF_BASE_HEADS.toString()))
            .andExpect(jsonPath("$.cnxBaseRateTbp").value(DEFAULT_CNX_BASE_RATE_TBP))
            .andExpect(jsonPath("$.cnxBaseRateFte").value(DEFAULT_CNX_BASE_RATE_FTE))
            .andExpect(jsonPath("$.billingAdjHittingM1").value(DEFAULT_BILLING_ADJ_HITTING_M_1))
            .andExpect(jsonPath("$.billingAdjHittingM2").value(DEFAULT_BILLING_ADJ_HITTING_M_2))
            .andExpect(jsonPath("$.billingAdjHittingM3").value(DEFAULT_BILLING_ADJ_HITTING_M_3))
            .andExpect(jsonPath("$.bufferUsd").value(DEFAULT_BUFFER_USD))
            .andExpect(jsonPath("$.infBufferNonUsdCurr").value(DEFAULT_INF_BUFFER_NON_USD_CURR.doubleValue()))
            .andExpect(jsonPath("$.ciscoBusinessOwner").value(DEFAULT_CISCO_BUSINESS_OWNER.toString()))
            .andExpect(jsonPath("$.infCurrency").value(DEFAULT_INF_CURRENCY.toString()))
            .andExpect(jsonPath("$.infCurrencyHrlyRateFte").value(DEFAULT_INF_CURRENCY_HRLY_RATE_FTE))
            .andExpect(jsonPath("$.actualProjM1DiffUsd").value(DEFAULT_ACTUAL_PROJ_M_1_DIFF_USD))
            .andExpect(jsonPath("$.actualProjM2DiffUsd").value(DEFAULT_ACTUAL_PROJ_M_2_DIFF_USD))
            .andExpect(jsonPath("$.actualProjM3DiffUsd").value(DEFAULT_ACTUAL_PROJ_M_3_DIFF_USD))
            .andExpect(jsonPath("$.fiscalQuarterName").value(DEFAULT_FISCAL_QUARTER_NAME.toString()))
            .andExpect(jsonPath("$.vendorLocation").value(DEFAULT_VENDOR_LOCATION.toString()))
            .andExpect(jsonPath("$.method").value(DEFAULT_METHOD.toString()))
            .andExpect(jsonPath("$.actualMilestoneM1Per").value(DEFAULT_ACTUAL_MILESTONE_M_1_PER))
            .andExpect(jsonPath("$.actualMilestoneM2Per").value(DEFAULT_ACTUAL_MILESTONE_M_2_PER))
            .andExpect(jsonPath("$.actualMilestoneM3Per").value(DEFAULT_ACTUAL_MILESTONE_M_3_PER))
            .andExpect(jsonPath("$.milestoneValueM1Usd").value(DEFAULT_MILESTONE_VALUE_M_1_USD))
            .andExpect(jsonPath("$.infMStonValM1NonUsdCur").value(DEFAULT_INF_M_STON_VAL_M_1_NON_USD_CUR.doubleValue()))
            .andExpect(jsonPath("$.milestoneValueM2Usd").value(DEFAULT_MILESTONE_VALUE_M_2_USD))
            .andExpect(jsonPath("$.infMStonValM2NonUsdCur").value(DEFAULT_INF_M_STON_VAL_M_2_NON_USD_CUR.doubleValue()))
            .andExpect(jsonPath("$.milestoneValueM3Usd").value(DEFAULT_MILESTONE_VALUE_M_3_USD))
            .andExpect(jsonPath("$.infMStonValM3NonUsdCur").value(DEFAULT_INF_M_STON_VAL_M_3_NON_USD_CUR.doubleValue()))
            .andExpect(jsonPath("$.cnxChrAgentNumWdnmCases").value(DEFAULT_CNX_CHR_AGENT_NUM_WDNM_CASES))
            .andExpect(jsonPath("$.cnvChrStaffHrsWdnmCases").value(DEFAULT_CNV_CHR_STAFF_HRS_WDNM_CASES))
            .andExpect(jsonPath("$.otherVolumeRateTbp").value(DEFAULT_OTHER_VOLUME_RATE_TBP))
            .andExpect(jsonPath("$.otRate").value(DEFAULT_OT_RATE))
            .andExpect(jsonPath("$.otSpendM1").value(DEFAULT_OT_SPEND_M_1))
            .andExpect(jsonPath("$.otSpendM2").value(DEFAULT_OT_SPEND_M_2))
            .andExpect(jsonPath("$.otSpendM3").value(DEFAULT_OT_SPEND_M_3))
            .andExpect(jsonPath("$.poAmountUsd").value(DEFAULT_PO_AMOUNT_USD))
            .andExpect(jsonPath("$.infPoAmountNonUsd").value(DEFAULT_INF_PO_AMOUNT_NON_USD))
            .andExpect(jsonPath("$.poNumber").value(DEFAULT_PO_NUMBER.toString()))
            .andExpect(jsonPath("$.projBillableHeadsM1Fte").value(DEFAULT_PROJ_BILLABLE_HEADS_M_1_FTE))
            .andExpect(jsonPath("$.projBillableHeadsM2Fte").value(DEFAULT_PROJ_BILLABLE_HEADS_M_2_FTE))
            .andExpect(jsonPath("$.projBillableHeadsM3Fte").value(DEFAULT_PROJ_BILLABLE_HEADS_M_3_FTE))
            .andExpect(jsonPath("$.projectedBillableHrsM1Ph").value(DEFAULT_PROJECTED_BILLABLE_HRS_M_1_PH))
            .andExpect(jsonPath("$.projectedBillableHrsM2Ph").value(DEFAULT_PROJECTED_BILLABLE_HRS_M_2_PH))
            .andExpect(jsonPath("$.projectedBillableHrsM3Ph").value(DEFAULT_PROJECTED_BILLABLE_HRS_M_3_PH));
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
            .projectedOthVolM1Tbp(UPDATED_PROJECTED_OTH_VOL_M_1_TBP)
            .projectedOthVolM2Tbp(UPDATED_PROJECTED_OTH_VOL_M_2_TBP)
            .projectedOthVolM3Tbp(UPDATED_PROJECTED_OTH_VOL_M_3_TBP)
            .projectedVolM1Tbp(UPDATED_PROJECTED_VOL_M_1_TBP)
            .projectedVolM2Tbp(UPDATED_PROJECTED_VOL_M_2_TBP)
            .projectedVolM3Tbp(UPDATED_PROJECTED_VOL_M_3_TBP)
            .qtrlyDiffActualProjection(UPDATED_QTRLY_DIFF_ACTUAL_PROJECTION)
            .retrospectiveAdjM1(UPDATED_RETROSPECTIVE_ADJ_M_1)
            .retrospectiveAdjM2(UPDATED_RETROSPECTIVE_ADJ_M_2)
            .retrospectiveAdjM3(UPDATED_RETROSPECTIVE_ADJ_M_3)
            .serviceCategory(UPDATED_SERVICE_CATEGORY)
            .serviceDrillDown(UPDATED_SERVICE_DRILL_DOWN)
            .servicePillar(UPDATED_SERVICE_PILLAR)
            .sowName(UPDATED_SOW_NAME)
            .sowNumber(UPDATED_SOW_NUMBER)
            .totalQtrlySpendUsd(UPDATED_TOTAL_QTRLY_SPEND_USD)
            .infTotalQtrlySpendNonUsd(UPDATED_INF_TOTAL_QTRLY_SPEND_NON_USD)
            .vendorName(UPDATED_VENDOR_NAME)
            .actualRetrospectiveCostM1(UPDATED_ACTUAL_RETROSPECTIVE_COST_M_1)
            .actualRetrospectiveCostM2(UPDATED_ACTUAL_RETROSPECTIVE_COST_M_2)
            .actualRetrospectiveCostM3(UPDATED_ACTUAL_RETROSPECTIVE_COST_M_3)
            .totalQtrlyRetrospectiveCost(UPDATED_TOTAL_QTRLY_RETROSPECTIVE_COST)
            .changeImpact(UPDATED_CHANGE_IMPACT)
            .notes(UPDATED_NOTES)
            .dataFlag(UPDATED_DATA_FLAG)
            .loadDate(UPDATED_LOAD_DATE)
            .ccaVendorDataSk(UPDATED_CCA_VENDOR_DATA_SK)
            .ccaVendorDataPk(UPDATED_CCA_VENDOR_DATA_PK)
            .hourlyRateDollarFte(UPDATED_HOURLY_RATE_DOLLAR_FTE)
            .hourlyRateDollarPh(UPDATED_HOURLY_RATE_DOLLAR_PH)
            .dollarRatePerMinuteTbp(UPDATED_DOLLAR_RATE_PER_MINUTE_TBP)
            .deliveryPoc(UPDATED_DELIVERY_POC)
            .actualBillableHeadsM1Fte(UPDATED_ACTUAL_BILLABLE_HEADS_M_1_FTE)
            .actualBillableHeadsM2Fte(UPDATED_ACTUAL_BILLABLE_HEADS_M_2_FTE)
            .actualBillableHeadsM3Fte(UPDATED_ACTUAL_BILLABLE_HEADS_M_3_FTE)
            .actBillableHoursM1Ph(UPDATED_ACT_BILLABLE_HOURS_M_1_PH)
            .infActBillHoursM1Fte(UPDATED_INF_ACT_BILL_HOURS_M_1_FTE)
            .actBillableHoursM2Ph(UPDATED_ACT_BILLABLE_HOURS_M_2_PH)
            .infActBillHoursM2Fte(UPDATED_INF_ACT_BILL_HOURS_M_2_FTE)
            .actBillableHoursM3Ph(UPDATED_ACT_BILLABLE_HOURS_M_3_PH)
            .infActBillHoursM3Fte(UPDATED_INF_ACT_BILL_HOURS_M_3_FTE)
            .actualOtherVolumeM1Tbp(UPDATED_ACTUAL_OTHER_VOLUME_M_1_TBP)
            .actualOtherVolumeM2Tbp(UPDATED_ACTUAL_OTHER_VOLUME_M_2_TBP)
            .actualOtherVolumeM3Tbp(UPDATED_ACTUAL_OTHER_VOLUME_M_3_TBP)
            .actualSpendM1Usd(UPDATED_ACTUAL_SPEND_M_1_USD)
            .infActSpendM1NonUsdCurr(UPDATED_INF_ACT_SPEND_M_1_NON_USD_CURR)
            .actualSpendM2Usd(UPDATED_ACTUAL_SPEND_M_2_USD)
            .infActSpendM2NonUsdCurr(UPDATED_INF_ACT_SPEND_M_2_NON_USD_CURR)
            .actualSpendM3Usd(UPDATED_ACTUAL_SPEND_M_3_USD)
            .infActSpendM3NonUsdCurr(UPDATED_INF_ACT_SPEND_M_3_NON_USD_CURR)
            .actualVolumeM1Tbp(UPDATED_ACTUAL_VOLUME_M_1_TBP)
            .actualVolumeM2Tbp(UPDATED_ACTUAL_VOLUME_M_2_TBP)
            .actualVolumeM3Tbp(UPDATED_ACTUAL_VOLUME_M_3_TBP)
            .actualPoValueDiffPer(UPDATED_ACTUAL_PO_VALUE_DIFF_PER)
            .ahtInMinutesTbp(UPDATED_AHT_IN_MINUTES_TBP)
            .appOtHrsM1(UPDATED_APP_OT_HRS_M_1)
            .appOtHrsM2(UPDATED_APP_OT_HRS_M_2)
            .appOtHrsM3(UPDATED_APP_OT_HRS_M_3)
            .infBaseAht(UPDATED_INF_BASE_AHT)
            .infBaseHeads(UPDATED_INF_BASE_HEADS)
            .cnxBaseRateTbp(UPDATED_CNX_BASE_RATE_TBP)
            .cnxBaseRateFte(UPDATED_CNX_BASE_RATE_FTE)
            .billingAdjHittingM1(UPDATED_BILLING_ADJ_HITTING_M_1)
            .billingAdjHittingM2(UPDATED_BILLING_ADJ_HITTING_M_2)
            .billingAdjHittingM3(UPDATED_BILLING_ADJ_HITTING_M_3)
            .bufferUsd(UPDATED_BUFFER_USD)
            .infBufferNonUsdCurr(UPDATED_INF_BUFFER_NON_USD_CURR)
            .ciscoBusinessOwner(UPDATED_CISCO_BUSINESS_OWNER)
            .infCurrency(UPDATED_INF_CURRENCY)
            .infCurrencyHrlyRateFte(UPDATED_INF_CURRENCY_HRLY_RATE_FTE)
            .actualProjM1DiffUsd(UPDATED_ACTUAL_PROJ_M_1_DIFF_USD)
            .actualProjM2DiffUsd(UPDATED_ACTUAL_PROJ_M_2_DIFF_USD)
            .actualProjM3DiffUsd(UPDATED_ACTUAL_PROJ_M_3_DIFF_USD)
            .fiscalQuarterName(UPDATED_FISCAL_QUARTER_NAME)
            .vendorLocation(UPDATED_VENDOR_LOCATION)
            .method(UPDATED_METHOD)
            .actualMilestoneM1Per(UPDATED_ACTUAL_MILESTONE_M_1_PER)
            .actualMilestoneM2Per(UPDATED_ACTUAL_MILESTONE_M_2_PER)
            .actualMilestoneM3Per(UPDATED_ACTUAL_MILESTONE_M_3_PER)
            .milestoneValueM1Usd(UPDATED_MILESTONE_VALUE_M_1_USD)
            .infMStonValM1NonUsdCur(UPDATED_INF_M_STON_VAL_M_1_NON_USD_CUR)
            .milestoneValueM2Usd(UPDATED_MILESTONE_VALUE_M_2_USD)
            .infMStonValM2NonUsdCur(UPDATED_INF_M_STON_VAL_M_2_NON_USD_CUR)
            .milestoneValueM3Usd(UPDATED_MILESTONE_VALUE_M_3_USD)
            .infMStonValM3NonUsdCur(UPDATED_INF_M_STON_VAL_M_3_NON_USD_CUR)
            .cnxChrAgentNumWdnmCases(UPDATED_CNX_CHR_AGENT_NUM_WDNM_CASES)
            .cnvChrStaffHrsWdnmCases(UPDATED_CNV_CHR_STAFF_HRS_WDNM_CASES)
            .otherVolumeRateTbp(UPDATED_OTHER_VOLUME_RATE_TBP)
            .otRate(UPDATED_OT_RATE)
            .otSpendM1(UPDATED_OT_SPEND_M_1)
            .otSpendM2(UPDATED_OT_SPEND_M_2)
            .otSpendM3(UPDATED_OT_SPEND_M_3)
            .poAmountUsd(UPDATED_PO_AMOUNT_USD)
            .infPoAmountNonUsd(UPDATED_INF_PO_AMOUNT_NON_USD)
            .poNumber(UPDATED_PO_NUMBER)
            .projBillableHeadsM1Fte(UPDATED_PROJ_BILLABLE_HEADS_M_1_FTE)
            .projBillableHeadsM2Fte(UPDATED_PROJ_BILLABLE_HEADS_M_2_FTE)
            .projBillableHeadsM3Fte(UPDATED_PROJ_BILLABLE_HEADS_M_3_FTE)
            .projectedBillableHrsM1Ph(UPDATED_PROJECTED_BILLABLE_HRS_M_1_PH)
            .projectedBillableHrsM2Ph(UPDATED_PROJECTED_BILLABLE_HRS_M_2_PH)
            .projectedBillableHrsM3Ph(UPDATED_PROJECTED_BILLABLE_HRS_M_3_PH);
        HCBTModelDTO hCBTModelDTO = hCBTModelMapper.toDto(updatedHCBTModel);

        restHCBTModelMockMvc.perform(put("/api/hcbt-models")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(hCBTModelDTO)))
            .andExpect(status().isOk());

        // Validate the HCBTModel in the database
        List<HCBTModel> hCBTModelList = hCBTModelRepository.findAll();
        assertThat(hCBTModelList).hasSize(databaseSizeBeforeUpdate);
        HCBTModel testHCBTModel = hCBTModelList.get(hCBTModelList.size() - 1);
        assertThat(testHCBTModel.getProjectedOthVolM1Tbp()).isEqualTo(UPDATED_PROJECTED_OTH_VOL_M_1_TBP);
        assertThat(testHCBTModel.getProjectedOthVolM2Tbp()).isEqualTo(UPDATED_PROJECTED_OTH_VOL_M_2_TBP);
        assertThat(testHCBTModel.getProjectedOthVolM3Tbp()).isEqualTo(UPDATED_PROJECTED_OTH_VOL_M_3_TBP);
        assertThat(testHCBTModel.getProjectedVolM1Tbp()).isEqualTo(UPDATED_PROJECTED_VOL_M_1_TBP);
        assertThat(testHCBTModel.getProjectedVolM2Tbp()).isEqualTo(UPDATED_PROJECTED_VOL_M_2_TBP);
        assertThat(testHCBTModel.getProjectedVolM3Tbp()).isEqualTo(UPDATED_PROJECTED_VOL_M_3_TBP);
        assertThat(testHCBTModel.getQtrlyDiffActualProjection()).isEqualTo(UPDATED_QTRLY_DIFF_ACTUAL_PROJECTION);
        assertThat(testHCBTModel.getRetrospectiveAdjM1()).isEqualTo(UPDATED_RETROSPECTIVE_ADJ_M_1);
        assertThat(testHCBTModel.getRetrospectiveAdjM2()).isEqualTo(UPDATED_RETROSPECTIVE_ADJ_M_2);
        assertThat(testHCBTModel.getRetrospectiveAdjM3()).isEqualTo(UPDATED_RETROSPECTIVE_ADJ_M_3);
        assertThat(testHCBTModel.getServiceCategory()).isEqualTo(UPDATED_SERVICE_CATEGORY);
        assertThat(testHCBTModel.getServiceDrillDown()).isEqualTo(UPDATED_SERVICE_DRILL_DOWN);
        assertThat(testHCBTModel.getServicePillar()).isEqualTo(UPDATED_SERVICE_PILLAR);
        assertThat(testHCBTModel.getSowName()).isEqualTo(UPDATED_SOW_NAME);
        assertThat(testHCBTModel.getSowNumber()).isEqualTo(UPDATED_SOW_NUMBER);
        assertThat(testHCBTModel.getTotalQtrlySpendUsd()).isEqualTo(UPDATED_TOTAL_QTRLY_SPEND_USD);
        assertThat(testHCBTModel.getInfTotalQtrlySpendNonUsd()).isEqualTo(UPDATED_INF_TOTAL_QTRLY_SPEND_NON_USD);
        assertThat(testHCBTModel.getVendorName()).isEqualTo(UPDATED_VENDOR_NAME);
        assertThat(testHCBTModel.getActualRetrospectiveCostM1()).isEqualTo(UPDATED_ACTUAL_RETROSPECTIVE_COST_M_1);
        assertThat(testHCBTModel.getActualRetrospectiveCostM2()).isEqualTo(UPDATED_ACTUAL_RETROSPECTIVE_COST_M_2);
        assertThat(testHCBTModel.getActualRetrospectiveCostM3()).isEqualTo(UPDATED_ACTUAL_RETROSPECTIVE_COST_M_3);
        assertThat(testHCBTModel.getTotalQtrlyRetrospectiveCost()).isEqualTo(UPDATED_TOTAL_QTRLY_RETROSPECTIVE_COST);
        assertThat(testHCBTModel.getChangeImpact()).isEqualTo(UPDATED_CHANGE_IMPACT);
        assertThat(testHCBTModel.getNotes()).isEqualTo(UPDATED_NOTES);
        assertThat(testHCBTModel.getDataFlag()).isEqualTo(UPDATED_DATA_FLAG);
        assertThat(testHCBTModel.getLoadDate()).isEqualTo(UPDATED_LOAD_DATE);
        assertThat(testHCBTModel.getCcaVendorDataSk()).isEqualTo(UPDATED_CCA_VENDOR_DATA_SK);
        assertThat(testHCBTModel.getCcaVendorDataPk()).isEqualTo(UPDATED_CCA_VENDOR_DATA_PK);
        assertThat(testHCBTModel.getHourlyRateDollarFte()).isEqualTo(UPDATED_HOURLY_RATE_DOLLAR_FTE);
        assertThat(testHCBTModel.getHourlyRateDollarPh()).isEqualTo(UPDATED_HOURLY_RATE_DOLLAR_PH);
        assertThat(testHCBTModel.getDollarRatePerMinuteTbp()).isEqualTo(UPDATED_DOLLAR_RATE_PER_MINUTE_TBP);
        assertThat(testHCBTModel.getDeliveryPoc()).isEqualTo(UPDATED_DELIVERY_POC);
        assertThat(testHCBTModel.getActualBillableHeadsM1Fte()).isEqualTo(UPDATED_ACTUAL_BILLABLE_HEADS_M_1_FTE);
        assertThat(testHCBTModel.getActualBillableHeadsM2Fte()).isEqualTo(UPDATED_ACTUAL_BILLABLE_HEADS_M_2_FTE);
        assertThat(testHCBTModel.getActualBillableHeadsM3Fte()).isEqualTo(UPDATED_ACTUAL_BILLABLE_HEADS_M_3_FTE);
        assertThat(testHCBTModel.getActBillableHoursM1Ph()).isEqualTo(UPDATED_ACT_BILLABLE_HOURS_M_1_PH);
        assertThat(testHCBTModel.getInfActBillHoursM1Fte()).isEqualTo(UPDATED_INF_ACT_BILL_HOURS_M_1_FTE);
        assertThat(testHCBTModel.getActBillableHoursM2Ph()).isEqualTo(UPDATED_ACT_BILLABLE_HOURS_M_2_PH);
        assertThat(testHCBTModel.getInfActBillHoursM2Fte()).isEqualTo(UPDATED_INF_ACT_BILL_HOURS_M_2_FTE);
        assertThat(testHCBTModel.getActBillableHoursM3Ph()).isEqualTo(UPDATED_ACT_BILLABLE_HOURS_M_3_PH);
        assertThat(testHCBTModel.getInfActBillHoursM3Fte()).isEqualTo(UPDATED_INF_ACT_BILL_HOURS_M_3_FTE);
        assertThat(testHCBTModel.getActualOtherVolumeM1Tbp()).isEqualTo(UPDATED_ACTUAL_OTHER_VOLUME_M_1_TBP);
        assertThat(testHCBTModel.getActualOtherVolumeM2Tbp()).isEqualTo(UPDATED_ACTUAL_OTHER_VOLUME_M_2_TBP);
        assertThat(testHCBTModel.getActualOtherVolumeM3Tbp()).isEqualTo(UPDATED_ACTUAL_OTHER_VOLUME_M_3_TBP);
        assertThat(testHCBTModel.getActualSpendM1Usd()).isEqualTo(UPDATED_ACTUAL_SPEND_M_1_USD);
        assertThat(testHCBTModel.getInfActSpendM1NonUsdCurr()).isEqualTo(UPDATED_INF_ACT_SPEND_M_1_NON_USD_CURR);
        assertThat(testHCBTModel.getActualSpendM2Usd()).isEqualTo(UPDATED_ACTUAL_SPEND_M_2_USD);
        assertThat(testHCBTModel.getInfActSpendM2NonUsdCurr()).isEqualTo(UPDATED_INF_ACT_SPEND_M_2_NON_USD_CURR);
        assertThat(testHCBTModel.getActualSpendM3Usd()).isEqualTo(UPDATED_ACTUAL_SPEND_M_3_USD);
        assertThat(testHCBTModel.getInfActSpendM3NonUsdCurr()).isEqualTo(UPDATED_INF_ACT_SPEND_M_3_NON_USD_CURR);
        assertThat(testHCBTModel.getActualVolumeM1Tbp()).isEqualTo(UPDATED_ACTUAL_VOLUME_M_1_TBP);
        assertThat(testHCBTModel.getActualVolumeM2Tbp()).isEqualTo(UPDATED_ACTUAL_VOLUME_M_2_TBP);
        assertThat(testHCBTModel.getActualVolumeM3Tbp()).isEqualTo(UPDATED_ACTUAL_VOLUME_M_3_TBP);
        assertThat(testHCBTModel.getActualPoValueDiffPer()).isEqualTo(UPDATED_ACTUAL_PO_VALUE_DIFF_PER);
        assertThat(testHCBTModel.getAhtInMinutesTbp()).isEqualTo(UPDATED_AHT_IN_MINUTES_TBP);
        assertThat(testHCBTModel.getAppOtHrsM1()).isEqualTo(UPDATED_APP_OT_HRS_M_1);
        assertThat(testHCBTModel.getAppOtHrsM2()).isEqualTo(UPDATED_APP_OT_HRS_M_2);
        assertThat(testHCBTModel.getAppOtHrsM3()).isEqualTo(UPDATED_APP_OT_HRS_M_3);
        assertThat(testHCBTModel.getInfBaseAht()).isEqualTo(UPDATED_INF_BASE_AHT);
        assertThat(testHCBTModel.getInfBaseHeads()).isEqualTo(UPDATED_INF_BASE_HEADS);
        assertThat(testHCBTModel.getCnxBaseRateTbp()).isEqualTo(UPDATED_CNX_BASE_RATE_TBP);
        assertThat(testHCBTModel.getCnxBaseRateFte()).isEqualTo(UPDATED_CNX_BASE_RATE_FTE);
        assertThat(testHCBTModel.getBillingAdjHittingM1()).isEqualTo(UPDATED_BILLING_ADJ_HITTING_M_1);
        assertThat(testHCBTModel.getBillingAdjHittingM2()).isEqualTo(UPDATED_BILLING_ADJ_HITTING_M_2);
        assertThat(testHCBTModel.getBillingAdjHittingM3()).isEqualTo(UPDATED_BILLING_ADJ_HITTING_M_3);
        assertThat(testHCBTModel.getBufferUsd()).isEqualTo(UPDATED_BUFFER_USD);
        assertThat(testHCBTModel.getInfBufferNonUsdCurr()).isEqualTo(UPDATED_INF_BUFFER_NON_USD_CURR);
        assertThat(testHCBTModel.getCiscoBusinessOwner()).isEqualTo(UPDATED_CISCO_BUSINESS_OWNER);
        assertThat(testHCBTModel.getInfCurrency()).isEqualTo(UPDATED_INF_CURRENCY);
        assertThat(testHCBTModel.getInfCurrencyHrlyRateFte()).isEqualTo(UPDATED_INF_CURRENCY_HRLY_RATE_FTE);
        assertThat(testHCBTModel.getActualProjM1DiffUsd()).isEqualTo(UPDATED_ACTUAL_PROJ_M_1_DIFF_USD);
        assertThat(testHCBTModel.getActualProjM2DiffUsd()).isEqualTo(UPDATED_ACTUAL_PROJ_M_2_DIFF_USD);
        assertThat(testHCBTModel.getActualProjM3DiffUsd()).isEqualTo(UPDATED_ACTUAL_PROJ_M_3_DIFF_USD);
        assertThat(testHCBTModel.getFiscalQuarterName()).isEqualTo(UPDATED_FISCAL_QUARTER_NAME);
        assertThat(testHCBTModel.getVendorLocation()).isEqualTo(UPDATED_VENDOR_LOCATION);
        assertThat(testHCBTModel.getMethod()).isEqualTo(UPDATED_METHOD);
        assertThat(testHCBTModel.getActualMilestoneM1Per()).isEqualTo(UPDATED_ACTUAL_MILESTONE_M_1_PER);
        assertThat(testHCBTModel.getActualMilestoneM2Per()).isEqualTo(UPDATED_ACTUAL_MILESTONE_M_2_PER);
        assertThat(testHCBTModel.getActualMilestoneM3Per()).isEqualTo(UPDATED_ACTUAL_MILESTONE_M_3_PER);
        assertThat(testHCBTModel.getMilestoneValueM1Usd()).isEqualTo(UPDATED_MILESTONE_VALUE_M_1_USD);
        assertThat(testHCBTModel.getInfMStonValM1NonUsdCur()).isEqualTo(UPDATED_INF_M_STON_VAL_M_1_NON_USD_CUR);
        assertThat(testHCBTModel.getMilestoneValueM2Usd()).isEqualTo(UPDATED_MILESTONE_VALUE_M_2_USD);
        assertThat(testHCBTModel.getInfMStonValM2NonUsdCur()).isEqualTo(UPDATED_INF_M_STON_VAL_M_2_NON_USD_CUR);
        assertThat(testHCBTModel.getMilestoneValueM3Usd()).isEqualTo(UPDATED_MILESTONE_VALUE_M_3_USD);
        assertThat(testHCBTModel.getInfMStonValM3NonUsdCur()).isEqualTo(UPDATED_INF_M_STON_VAL_M_3_NON_USD_CUR);
        assertThat(testHCBTModel.getCnxChrAgentNumWdnmCases()).isEqualTo(UPDATED_CNX_CHR_AGENT_NUM_WDNM_CASES);
        assertThat(testHCBTModel.getCnvChrStaffHrsWdnmCases()).isEqualTo(UPDATED_CNV_CHR_STAFF_HRS_WDNM_CASES);
        assertThat(testHCBTModel.getOtherVolumeRateTbp()).isEqualTo(UPDATED_OTHER_VOLUME_RATE_TBP);
        assertThat(testHCBTModel.getOtRate()).isEqualTo(UPDATED_OT_RATE);
        assertThat(testHCBTModel.getOtSpendM1()).isEqualTo(UPDATED_OT_SPEND_M_1);
        assertThat(testHCBTModel.getOtSpendM2()).isEqualTo(UPDATED_OT_SPEND_M_2);
        assertThat(testHCBTModel.getOtSpendM3()).isEqualTo(UPDATED_OT_SPEND_M_3);
        assertThat(testHCBTModel.getPoAmountUsd()).isEqualTo(UPDATED_PO_AMOUNT_USD);
        assertThat(testHCBTModel.getInfPoAmountNonUsd()).isEqualTo(UPDATED_INF_PO_AMOUNT_NON_USD);
        assertThat(testHCBTModel.getPoNumber()).isEqualTo(UPDATED_PO_NUMBER);
        assertThat(testHCBTModel.getProjBillableHeadsM1Fte()).isEqualTo(UPDATED_PROJ_BILLABLE_HEADS_M_1_FTE);
        assertThat(testHCBTModel.getProjBillableHeadsM2Fte()).isEqualTo(UPDATED_PROJ_BILLABLE_HEADS_M_2_FTE);
        assertThat(testHCBTModel.getProjBillableHeadsM3Fte()).isEqualTo(UPDATED_PROJ_BILLABLE_HEADS_M_3_FTE);
        assertThat(testHCBTModel.getProjectedBillableHrsM1Ph()).isEqualTo(UPDATED_PROJECTED_BILLABLE_HRS_M_1_PH);
        assertThat(testHCBTModel.getProjectedBillableHrsM2Ph()).isEqualTo(UPDATED_PROJECTED_BILLABLE_HRS_M_2_PH);
        assertThat(testHCBTModel.getProjectedBillableHrsM3Ph()).isEqualTo(UPDATED_PROJECTED_BILLABLE_HRS_M_3_PH);
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
