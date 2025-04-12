package com.restaurant.service;

import com.restaurant.dto.FeedbackResponse;
import com.restaurant.model.Feedbacks;
import com.restaurant.repository.FeedbacksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeedbackService {

    @Autowired
    private FeedbacksRepository feedbacksRepository;

    public List<FeedbackResponse> getAllFeedbacks() {
        return feedbacksRepository.findAll().stream()
                .map(feedback -> new FeedbackResponse(feedback.getFeedbackId(), feedback.getComment(), feedback.getRate()))
                .collect(Collectors.toList());
    }

    public FeedbackResponse getFeedbackById(String id) {
        Feedbacks feedback = feedbacksRepository.findById(id).orElseThrow(() -> new RuntimeException("Feedback not found"));
        return new FeedbackResponse(feedback.getFeedbackId(), feedback.getComment(), feedback.getRate());
    }
}
