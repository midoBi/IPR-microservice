package com.devapp.reviewservice.domain;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDate;


public class AuditListener {

    @PrePersist
    public void setCreatedOn(BaseEntity entity) {
        if (entity != null) {
            entity.setCreatedDate(LocalDate.now());
            entity.setCreatedBy("admin");
        }
    }

    @PreUpdate
    public void setUpdatedOn(BaseEntity entity) {
        if (entity != null) {
            entity.setLastModifiedDate(LocalDate.now());
            entity.setLastModifiedBy("admin");
        }
    }


}
