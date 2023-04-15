package com.devapp.productservice.domain;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Product extends BaseEntity {

    private String name;

    private String quantity;

    private String description;

    private Float price;

    private Integer version;
}
