package io.github.jhipster.application.service;

import io.github.jhipster.application.service.dto.TestEntityDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing TestEntity.
 */
public interface TestEntityService {

    /**
     * Save a testEntity.
     *
     * @param testEntityDTO the entity to save
     * @return the persisted entity
     */
    TestEntityDTO save(TestEntityDTO testEntityDTO);

    /**
     * Get all the testEntities.
     *
     * @return the list of entities
     */
    List<TestEntityDTO> findAll();


    /**
     * Get the "id" testEntity.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<TestEntityDTO> findOne(Long id);

    /**
     * Delete the "id" testEntity.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
