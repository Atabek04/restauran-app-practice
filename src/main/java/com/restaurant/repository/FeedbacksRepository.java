package com.restaurant.repository;

import com.restaurant.model.Feedbacks;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface FeedbacksRepository extends CrudRepository<Feedbacks, String> {
}
