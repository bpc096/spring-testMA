package com.example.testMA.testMA.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_m_forums")
public class Forums {
    @Id
    private Integer id;
    
    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "TEXT")
    private String icon;

    @Enumerated(EnumType.STRING)
    @Column(name="Type")
    private Type type;

    public enum Type {Forum, SubForum};

    @ManyToOne
    @JoinColumn(name = "sub_forum_id", nullable = false)
    private Forums forums;

}
