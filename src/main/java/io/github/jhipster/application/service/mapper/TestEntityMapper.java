package io.github.jhipster.application.service.mapper;

import io.github.jhipster.application.domain.*;
import io.github.jhipster.application.service.dto.TestEntityDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity TestEntity and its DTO TestEntityDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TestEntityMapper extends EntityMapper<TestEntityDTO, TestEntity> {



    default TestEntity fromId(Long id) {
        if (id == null) {
            return null;
        }
        TestEntity testEntity = new TestEntity();
        testEntity.setId(id);
        return testEntity;
    }
}
