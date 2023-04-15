package com.devapp.reviewservice.repository;

import com.devapp.reviewservice.domain.Reviews;
import org.springframework.data.repository.CrudRepository;

public interface ReviewsRepository extends CrudRepository<Reviews, Long> {
}
