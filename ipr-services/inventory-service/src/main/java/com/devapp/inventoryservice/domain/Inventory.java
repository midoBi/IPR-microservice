package com.devapp.inventoryservice.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class Inventory extends BaseEntity {

    @Column(nullable = false)
    private Integer productId;

    private Integer quantity;

    private String productName;

    private String productCategory;

    private String location;
}
