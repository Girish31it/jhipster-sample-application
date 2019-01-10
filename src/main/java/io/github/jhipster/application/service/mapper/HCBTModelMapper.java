package io.github.jhipster.application.service.mapper;

import io.github.jhipster.application.domain.*;
import io.github.jhipster.application.service.dto.HCBTModelDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity HCBTModel and its DTO HCBTModelDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface HCBTModelMapper extends EntityMapper<HCBTModelDTO, HCBTModel> {



    default HCBTModel fromId(Long id) {
        if (id == null) {
            return null;
        }
        HCBTModel hCBTModel = new HCBTModel();
        hCBTModel.setId(id);
        return hCBTModel;
    }
}
