package com.restaurant.repository;

import com.restaurant.model.Feedback;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

public interface FeedbackRepository extends DynamoDBCrudRepository<Feedback, String> {
}