package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.TestEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the TestEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {

}
