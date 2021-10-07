package com.company.jmixqsproject.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "RIB_ARTICLE")
@Entity
public class RibArticle {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "RIB_ID", nullable = false)
    @Composition
    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private Rib rib;

    @Column(name = "START_PAGE")
    private Integer startPage;

    @Column(name = "END_PAGE")
    private Integer endPage;

    public Rib getRib() {
        return rib;
    }

    public void setRib(Rib rib) {
        this.rib = rib;
    }

    public void setEndPage(Integer endPage) {
        this.endPage = endPage;
    }

    public Integer getEndPage() {
        return endPage;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}