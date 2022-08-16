package com.sangtt.toeic_test.service;

import com.sangtt.toeic_test.service.dto.QnADTO;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link com.sangtt.toeic_test.domain.QnA}.
 */
public interface QnAService {
    /**
     * Save a qnA.
     *
     * @param qnADTO the entity to save.
     * @return the persisted entity.
     */
    QnADTO save(QnADTO qnADTO);

    /**
     * Partially updates a qnA.
     *
     * @param qnADTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<QnADTO> partialUpdate(QnADTO qnADTO);

    /**
     * Get all the qnAS.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<QnADTO> findAll(Pageable pageable);

    /**
     * Get the "id" qnA.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<QnADTO> findOne(Long id);

    /**
     * Delete the "id" qnA.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
