package com.example.testMA.testMA.models.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_m_articles")
public class Articles {
    
    @Id
    private Integer id;
    
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String slug;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column(columnDefinition = "TEXT")
    private String banner;

    @Column(columnDefinition = "TEXT")
    private String image;

    @Enumerated(EnumType.STRING)
    @Column(name="Type")
    private Type type;

    @Enumerated(EnumType.STRING)
    @Column(name="Status")
    private Status status;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean is_slide_show;

    @Column(nullable = false)
    private Integer counter;

    public enum Type {Knowledge, News, Promo};

    public enum Status {Published, Draft, Deleted};

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "tb_tr_article_categories",
        joinColumns = @JoinColumn(name = "category_id"),
        inverseJoinColumns = @JoinColumn(name = "article_id")
    )
    private List<Categories> categories;
}
