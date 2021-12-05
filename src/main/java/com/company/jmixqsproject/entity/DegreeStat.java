package com.company.jmixqsproject.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.metamodel.annotation.JmixEntity;

import java.util.UUID;

@JmixEntity
public class DegreeStat {

    @JmixId
    private UUID degreeCountId;

    private String degeeName;

    private Integer degreeCount;

    public Integer getDegreeCount() {
        return degreeCount;
    }

    public void setDegreeCount(Integer degreeCount) {
        this.degreeCount = degreeCount;
    }

    public String getDegeeName() {
        return degeeName;
    }

    public void setDegeeName(String degeeName) {
        this.degeeName = degeeName;
    }

    public UUID getDegreeCountId() {
        return degreeCountId;
    }

    public void setDegreeCountId(UUID id) {
        this.degreeCountId = id;
    }
}