package com.example.testMA.testMA.models.dto.requests;

import lombok.Data;

@Data
public class ArticlesRequest {
    private Integer id;
    private String title;
    private String slug;
    private String body;
    private String banner;
    private String image;
    private Enum type;
    private Enum status;
    private Boolean is_slide_show;
    private Integer counter;
}
