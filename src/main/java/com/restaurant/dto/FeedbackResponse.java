package com.restaurant.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FeedbackResponse {

    private Long id;
    private String comment;
    private int rating;
}
