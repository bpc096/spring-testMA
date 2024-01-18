package com.example.testMA.testMA.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_m_votes")
public class Votes {
    
    @Id
    private Integer id;

    @Column(nullable = false)
    private Integer up_count;

    @Column(nullable = false)
    private Integer down_count;

}
