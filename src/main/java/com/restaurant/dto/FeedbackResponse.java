package com.restaurant.dto;

public class FeedbackResponse {

    private Long id;
    private String comment;
    private int rating;

    public FeedbackResponse(Long id, String comment, int rating) {
        this.id = id;
        this.comment = comment;
        this.rating = rating;
    }

    // Getters and Setters
}
