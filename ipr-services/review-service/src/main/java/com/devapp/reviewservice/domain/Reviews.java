package com.devapp.reviewservice.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class Reviews extends BaseEntity {

    @Column(nullable = false)
    private Integer productId;

    @Column(nullable = false)
    private Integer userId;

    private Integer rating;

    private String comment;

}
