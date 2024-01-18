package com.example.testMA.testMA.models.dto.requests;

import com.example.testMA.testMA.models.entity.Forums;

import lombok.Data;

@Data
public class ForumsRequest {
    private Integer id;
    private String name;
    private String description;
    private String icon;
    private Enum type;
    private Forums forums;
}
