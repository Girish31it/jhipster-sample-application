package io.github.jhipster.application.web.rest;

import io.github.jhipster.application.JhipsterSampleApplicationApp;

import io.github.jhipster.application.domain.TestEntity;
import io.github.jhipster.application.repository.TestEntityRepository;
import io.github.jhipster.application.service.TestEntityService;
import io.github.jhipster.application.service.dto.TestEntityDTO;
import io.github.jhipster.application.service.mapper.TestEntityMapper;
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

import javax.persistence.EntityManager;
import java.util.List;


import static io.github.jhipster.application.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the TestEntityResource REST controller.
 *
 * @see TestEntityResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JhipsterSampleApplicationApp.class)
public class TestEntityResourceIntTest {

    private static final Long DEFAULT_RECORD_ID = 1L;
    private static final Long UPDATED_RECORD_ID = 2L;

    private static final String DEFAULT_LABLE = "AAAAAAAAAA";
    private static final String UPDATED_LABLE = "BBBBBBBBBB";

    private static final String DEFAULT_TITLE = "AAAAAAAAAA";
    private static final String UPDATED_TITLE = "BBBBBBBBBB";

    private static final String DEFAULT_URL = "AAAAAAAAAA";
    private static final String UPDATED_URL = "BBBBBBBBBB";

    private static final Boolean DEFAULT_SHOW_ICON = false;
    private static final Boolean UPDATED_SHOW_ICON = true;

    private static final String DEFAULT_ICON = "AAAAAAAAAA";
    private static final String UPDATED_ICON = "BBBBBBBBBB";

    private static final Boolean DEFAULT_DIVIDER = false;
    private static final Boolean UPDATED_DIVIDER = true;

    private static final Integer DEFAULT_SORT_ORDER = 1;
    private static final Integer UPDATED_SORT_ORDER = 2;

    private static final String DEFAULT_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_TYPE = "BBBBBBBBBB";

    private static final Integer DEFAULT_PRODUCT_ID = 1;
    private static final Integer UPDATED_PRODUCT_ID = 2;

    private static final Integer DEFAULT_USER_ID = 1;
    private static final Integer UPDATED_USER_ID = 2;

    @Autowired
    private TestEntityRepository testEntityRepository;


    @Autowired
    private TestEntityMapper testEntityMapper;
    

    @Autowired
    private TestEntityService testEntityService;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restTestEntityMockMvc;

    private TestEntity testEntity;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final TestEntityResource testEntityResource = new TestEntityResource(testEntityService);
        this.restTestEntityMockMvc = MockMvcBuilders.standaloneSetup(testEntityResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static TestEntity createEntity(EntityManager em) {
        TestEntity testEntity = new TestEntity()
            .recordId(DEFAULT_RECORD_ID)
            .lable(DEFAULT_LABLE)
            .title(DEFAULT_TITLE)
            .url(DEFAULT_URL)
            .showIcon(DEFAULT_SHOW_ICON)
            .icon(DEFAULT_ICON)
            .divider(DEFAULT_DIVIDER)
            .sortOrder(DEFAULT_SORT_ORDER)
            .type(DEFAULT_TYPE)
            .productId(DEFAULT_PRODUCT_ID)
            .userId(DEFAULT_USER_ID);
        return testEntity;
    }

    @Before
    public void initTest() {
        testEntity = createEntity(em);
    }

    @Test
    @Transactional
    public void createTestEntity() throws Exception {
        int databaseSizeBeforeCreate = testEntityRepository.findAll().size();

        // Create the TestEntity
        TestEntityDTO testEntityDTO = testEntityMapper.toDto(testEntity);
        restTestEntityMockMvc.perform(post("/api/test-entities")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(testEntityDTO)))
            .andExpect(status().isCreated());

        // Validate the TestEntity in the database
        List<TestEntity> testEntityList = testEntityRepository.findAll();
        assertThat(testEntityList).hasSize(databaseSizeBeforeCreate + 1);
        TestEntity testTestEntity = testEntityList.get(testEntityList.size() - 1);
        assertThat(testTestEntity.getRecordId()).isEqualTo(DEFAULT_RECORD_ID);
        assertThat(testTestEntity.getLable()).isEqualTo(DEFAULT_LABLE);
        assertThat(testTestEntity.getTitle()).isEqualTo(DEFAULT_TITLE);
        assertThat(testTestEntity.getUrl()).isEqualTo(DEFAULT_URL);
        assertThat(testTestEntity.isShowIcon()).isEqualTo(DEFAULT_SHOW_ICON);
        assertThat(testTestEntity.getIcon()).isEqualTo(DEFAULT_ICON);
        assertThat(testTestEntity.isDivider()).isEqualTo(DEFAULT_DIVIDER);
        assertThat(testTestEntity.getSortOrder()).isEqualTo(DEFAULT_SORT_ORDER);
        assertThat(testTestEntity.getType()).isEqualTo(DEFAULT_TYPE);
        assertThat(testTestEntity.getProductId()).isEqualTo(DEFAULT_PRODUCT_ID);
        assertThat(testTestEntity.getUserId()).isEqualTo(DEFAULT_USER_ID);
    }

    @Test
    @Transactional
    public void createTestEntityWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = testEntityRepository.findAll().size();

        // Create the TestEntity with an existing ID
        testEntity.setId(1L);
        TestEntityDTO testEntityDTO = testEntityMapper.toDto(testEntity);

        // An entity with an existing ID cannot be created, so this API call must fail
        restTestEntityMockMvc.perform(post("/api/test-entities")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(testEntityDTO)))
            .andExpect(status().isBadRequest());

        // Validate the TestEntity in the database
        List<TestEntity> testEntityList = testEntityRepository.findAll();
        assertThat(testEntityList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllTestEntities() throws Exception {
        // Initialize the database
        testEntityRepository.saveAndFlush(testEntity);

        // Get all the testEntityList
        restTestEntityMockMvc.perform(get("/api/test-entities?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(testEntity.getId().intValue())))
            .andExpect(jsonPath("$.[*].recordId").value(hasItem(DEFAULT_RECORD_ID.intValue())))
            .andExpect(jsonPath("$.[*].lable").value(hasItem(DEFAULT_LABLE.toString())))
            .andExpect(jsonPath("$.[*].title").value(hasItem(DEFAULT_TITLE.toString())))
            .andExpect(jsonPath("$.[*].url").value(hasItem(DEFAULT_URL.toString())))
            .andExpect(jsonPath("$.[*].showIcon").value(hasItem(DEFAULT_SHOW_ICON.booleanValue())))
            .andExpect(jsonPath("$.[*].icon").value(hasItem(DEFAULT_ICON.toString())))
            .andExpect(jsonPath("$.[*].divider").value(hasItem(DEFAULT_DIVIDER.booleanValue())))
            .andExpect(jsonPath("$.[*].sortOrder").value(hasItem(DEFAULT_SORT_ORDER)))
            .andExpect(jsonPath("$.[*].type").value(hasItem(DEFAULT_TYPE.toString())))
            .andExpect(jsonPath("$.[*].productId").value(hasItem(DEFAULT_PRODUCT_ID)))
            .andExpect(jsonPath("$.[*].userId").value(hasItem(DEFAULT_USER_ID)));
    }
    

    @Test
    @Transactional
    public void getTestEntity() throws Exception {
        // Initialize the database
        testEntityRepository.saveAndFlush(testEntity);

        // Get the testEntity
        restTestEntityMockMvc.perform(get("/api/test-entities/{id}", testEntity.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(testEntity.getId().intValue()))
            .andExpect(jsonPath("$.recordId").value(DEFAULT_RECORD_ID.intValue()))
            .andExpect(jsonPath("$.lable").value(DEFAULT_LABLE.toString()))
            .andExpect(jsonPath("$.title").value(DEFAULT_TITLE.toString()))
            .andExpect(jsonPath("$.url").value(DEFAULT_URL.toString()))
            .andExpect(jsonPath("$.showIcon").value(DEFAULT_SHOW_ICON.booleanValue()))
            .andExpect(jsonPath("$.icon").value(DEFAULT_ICON.toString()))
            .andExpect(jsonPath("$.divider").value(DEFAULT_DIVIDER.booleanValue()))
            .andExpect(jsonPath("$.sortOrder").value(DEFAULT_SORT_ORDER))
            .andExpect(jsonPath("$.type").value(DEFAULT_TYPE.toString()))
            .andExpect(jsonPath("$.productId").value(DEFAULT_PRODUCT_ID))
            .andExpect(jsonPath("$.userId").value(DEFAULT_USER_ID));
    }
    @Test
    @Transactional
    public void getNonExistingTestEntity() throws Exception {
        // Get the testEntity
        restTestEntityMockMvc.perform(get("/api/test-entities/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateTestEntity() throws Exception {
        // Initialize the database
        testEntityRepository.saveAndFlush(testEntity);

        int databaseSizeBeforeUpdate = testEntityRepository.findAll().size();

        // Update the testEntity
        TestEntity updatedTestEntity = testEntityRepository.findById(testEntity.getId()).get();
        // Disconnect from session so that the updates on updatedTestEntity are not directly saved in db
        em.detach(updatedTestEntity);
        updatedTestEntity
            .recordId(UPDATED_RECORD_ID)
            .lable(UPDATED_LABLE)
            .title(UPDATED_TITLE)
            .url(UPDATED_URL)
            .showIcon(UPDATED_SHOW_ICON)
            .icon(UPDATED_ICON)
            .divider(UPDATED_DIVIDER)
            .sortOrder(UPDATED_SORT_ORDER)
            .type(UPDATED_TYPE)
            .productId(UPDATED_PRODUCT_ID)
            .userId(UPDATED_USER_ID);
        TestEntityDTO testEntityDTO = testEntityMapper.toDto(updatedTestEntity);

        restTestEntityMockMvc.perform(put("/api/test-entities")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(testEntityDTO)))
            .andExpect(status().isOk());

        // Validate the TestEntity in the database
        List<TestEntity> testEntityList = testEntityRepository.findAll();
        assertThat(testEntityList).hasSize(databaseSizeBeforeUpdate);
        TestEntity testTestEntity = testEntityList.get(testEntityList.size() - 1);
        assertThat(testTestEntity.getRecordId()).isEqualTo(UPDATED_RECORD_ID);
        assertThat(testTestEntity.getLable()).isEqualTo(UPDATED_LABLE);
        assertThat(testTestEntity.getTitle()).isEqualTo(UPDATED_TITLE);
        assertThat(testTestEntity.getUrl()).isEqualTo(UPDATED_URL);
        assertThat(testTestEntity.isShowIcon()).isEqualTo(UPDATED_SHOW_ICON);
        assertThat(testTestEntity.getIcon()).isEqualTo(UPDATED_ICON);
        assertThat(testTestEntity.isDivider()).isEqualTo(UPDATED_DIVIDER);
        assertThat(testTestEntity.getSortOrder()).isEqualTo(UPDATED_SORT_ORDER);
        assertThat(testTestEntity.getType()).isEqualTo(UPDATED_TYPE);
        assertThat(testTestEntity.getProductId()).isEqualTo(UPDATED_PRODUCT_ID);
        assertThat(testTestEntity.getUserId()).isEqualTo(UPDATED_USER_ID);
    }

    @Test
    @Transactional
    public void updateNonExistingTestEntity() throws Exception {
        int databaseSizeBeforeUpdate = testEntityRepository.findAll().size();

        // Create the TestEntity
        TestEntityDTO testEntityDTO = testEntityMapper.toDto(testEntity);

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restTestEntityMockMvc.perform(put("/api/test-entities")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(testEntityDTO)))
            .andExpect(status().isBadRequest());

        // Validate the TestEntity in the database
        List<TestEntity> testEntityList = testEntityRepository.findAll();
        assertThat(testEntityList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteTestEntity() throws Exception {
        // Initialize the database
        testEntityRepository.saveAndFlush(testEntity);

        int databaseSizeBeforeDelete = testEntityRepository.findAll().size();

        // Get the testEntity
        restTestEntityMockMvc.perform(delete("/api/test-entities/{id}", testEntity.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<TestEntity> testEntityList = testEntityRepository.findAll();
        assertThat(testEntityList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(TestEntity.class);
        TestEntity testEntity1 = new TestEntity();
        testEntity1.setId(1L);
        TestEntity testEntity2 = new TestEntity();
        testEntity2.setId(testEntity1.getId());
        assertThat(testEntity1).isEqualTo(testEntity2);
        testEntity2.setId(2L);
        assertThat(testEntity1).isNotEqualTo(testEntity2);
        testEntity1.setId(null);
        assertThat(testEntity1).isNotEqualTo(testEntity2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(TestEntityDTO.class);
        TestEntityDTO testEntityDTO1 = new TestEntityDTO();
        testEntityDTO1.setId(1L);
        TestEntityDTO testEntityDTO2 = new TestEntityDTO();
        assertThat(testEntityDTO1).isNotEqualTo(testEntityDTO2);
        testEntityDTO2.setId(testEntityDTO1.getId());
        assertThat(testEntityDTO1).isEqualTo(testEntityDTO2);
        testEntityDTO2.setId(2L);
        assertThat(testEntityDTO1).isNotEqualTo(testEntityDTO2);
        testEntityDTO1.setId(null);
        assertThat(testEntityDTO1).isNotEqualTo(testEntityDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(testEntityMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(testEntityMapper.fromId(null)).isNull();
    }
}
