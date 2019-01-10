package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.HCBTModel;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the HCBTModel entity.
 */
@SuppressWarnings("unused")
@Repository
public interface HCBTModelRepository extends JpaRepository<HCBTModel, Long> {

}
