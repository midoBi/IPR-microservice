package com.devapp.inventoryservice.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class Purchase extends BaseEntity {

    @Column(nullable = false)
    private Integer productId;

    private Integer quantityPurchased;
}
