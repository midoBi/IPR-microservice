package com.devapp.inventoryservice.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass
@EntityListeners(AuditListener.class)
@Getter
@Setter
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedBy
    @Column(name = "creer_par", nullable = false, length = 50, updatable = false, columnDefinition = "varchar(50) DEFAULT 'System'")
    private String createdBy;

    @CreatedDate
    @Column(name = "date_creation", updatable = false, nullable = false)
    private LocalDate createdDate;

    @LastModifiedBy
    @Column(name = "derniere_modification_par")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "date_modification")
    private LocalDate lastModifiedDate;
}
