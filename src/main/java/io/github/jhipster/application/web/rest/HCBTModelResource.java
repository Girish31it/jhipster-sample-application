package io.github.jhipster.application.web.rest;

import com.codahale.metrics.annotation.Timed;
import io.github.jhipster.application.service.HCBTModelService;
import io.github.jhipster.application.web.rest.errors.BadRequestAlertException;
import io.github.jhipster.application.web.rest.util.HeaderUtil;
import io.github.jhipster.application.service.dto.HCBTModelDTO;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing HCBTModel.
 */
@RestController
@RequestMapping("/api")
public class HCBTModelResource {

    private final Logger log = LoggerFactory.getLogger(HCBTModelResource.class);

    private static final String ENTITY_NAME = "hCBTModel";

    private final HCBTModelService hCBTModelService;

    public HCBTModelResource(HCBTModelService hCBTModelService) {
        this.hCBTModelService = hCBTModelService;
    }

    /**
     * POST  /hcbt-models : Create a new hCBTModel.
     *
     * @param hCBTModelDTO the hCBTModelDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new hCBTModelDTO, or with status 400 (Bad Request) if the hCBTModel has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/hcbt-models")
    @Timed
    public ResponseEntity<HCBTModelDTO> createHCBTModel(@RequestBody HCBTModelDTO hCBTModelDTO) throws URISyntaxException {
        log.debug("REST request to save HCBTModel : {}", hCBTModelDTO);
        if (hCBTModelDTO.getId() != null) {
            throw new BadRequestAlertException("A new hCBTModel cannot already have an ID", ENTITY_NAME, "idexists");
        }
        HCBTModelDTO result = hCBTModelService.save(hCBTModelDTO);
        return ResponseEntity.created(new URI("/api/hcbt-models/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /hcbt-models : Updates an existing hCBTModel.
     *
     * @param hCBTModelDTO the hCBTModelDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated hCBTModelDTO,
     * or with status 400 (Bad Request) if the hCBTModelDTO is not valid,
     * or with status 500 (Internal Server Error) if the hCBTModelDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/hcbt-models")
    @Timed
    public ResponseEntity<HCBTModelDTO> updateHCBTModel(@RequestBody HCBTModelDTO hCBTModelDTO) throws URISyntaxException {
        log.debug("REST request to update HCBTModel : {}", hCBTModelDTO);
        if (hCBTModelDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        HCBTModelDTO result = hCBTModelService.save(hCBTModelDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, hCBTModelDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /hcbt-models : get all the hCBTModels.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of hCBTModels in body
     */
    @GetMapping("/hcbt-models")
    @Timed
    public List<HCBTModelDTO> getAllHCBTModels() {
        log.debug("REST request to get all HCBTModels");
        return hCBTModelService.findAll();
    }

    /**
     * GET  /hcbt-models/:id : get the "id" hCBTModel.
     *
     * @param id the id of the hCBTModelDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the hCBTModelDTO, or with status 404 (Not Found)
     */
    @GetMapping("/hcbt-models/{id}")
    @Timed
    public ResponseEntity<HCBTModelDTO> getHCBTModel(@PathVariable Long id) {
        log.debug("REST request to get HCBTModel : {}", id);
        Optional<HCBTModelDTO> hCBTModelDTO = hCBTModelService.findOne(id);
        return ResponseUtil.wrapOrNotFound(hCBTModelDTO);
    }

    /**
     * DELETE  /hcbt-models/:id : delete the "id" hCBTModel.
     *
     * @param id the id of the hCBTModelDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/hcbt-models/{id}")
    @Timed
    public ResponseEntity<Void> deleteHCBTModel(@PathVariable Long id) {
        log.debug("REST request to delete HCBTModel : {}", id);
        hCBTModelService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}
