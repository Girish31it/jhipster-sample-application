package io.github.jhipster.application.service.impl;

import io.github.jhipster.application.service.HCBTModelService;
import io.github.jhipster.application.domain.HCBTModel;
import io.github.jhipster.application.repository.HCBTModelRepository;
import io.github.jhipster.application.service.dto.HCBTModelDTO;
import io.github.jhipster.application.service.mapper.HCBTModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing HCBTModel.
 */
@Service
@Transactional
public class HCBTModelServiceImpl implements HCBTModelService {

    private final Logger log = LoggerFactory.getLogger(HCBTModelServiceImpl.class);

    private final HCBTModelRepository hCBTModelRepository;

    private final HCBTModelMapper hCBTModelMapper;

    public HCBTModelServiceImpl(HCBTModelRepository hCBTModelRepository, HCBTModelMapper hCBTModelMapper) {
        this.hCBTModelRepository = hCBTModelRepository;
        this.hCBTModelMapper = hCBTModelMapper;
    }

    /**
     * Save a hCBTModel.
     *
     * @param hCBTModelDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public HCBTModelDTO save(HCBTModelDTO hCBTModelDTO) {
        log.debug("Request to save HCBTModel : {}", hCBTModelDTO);

        HCBTModel hCBTModel = hCBTModelMapper.toEntity(hCBTModelDTO);
        hCBTModel = hCBTModelRepository.save(hCBTModel);
        return hCBTModelMapper.toDto(hCBTModel);
    }

    /**
     * Get all the hCBTModels.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<HCBTModelDTO> findAll() {
        log.debug("Request to get all HCBTModels");
        return hCBTModelRepository.findAll().stream()
            .map(hCBTModelMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }


    /**
     * Get one hCBTModel by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<HCBTModelDTO> findOne(Long id) {
        log.debug("Request to get HCBTModel : {}", id);
        return hCBTModelRepository.findById(id)
            .map(hCBTModelMapper::toDto);
    }

    /**
     * Delete the hCBTModel by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete HCBTModel : {}", id);
        hCBTModelRepository.deleteById(id);
    }
}
