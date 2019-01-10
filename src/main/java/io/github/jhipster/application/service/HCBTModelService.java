package io.github.jhipster.application.service;

import io.github.jhipster.application.service.dto.HCBTModelDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing HCBTModel.
 */
public interface HCBTModelService {

    /**
     * Save a hCBTModel.
     *
     * @param hCBTModelDTO the entity to save
     * @return the persisted entity
     */
    HCBTModelDTO save(HCBTModelDTO hCBTModelDTO);

    /**
     * Get all the hCBTModels.
     *
     * @return the list of entities
     */
    List<HCBTModelDTO> findAll();


    /**
     * Get the "id" hCBTModel.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<HCBTModelDTO> findOne(Long id);

    /**
     * Delete the "id" hCBTModel.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
