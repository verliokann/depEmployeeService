package com.company.jmixqsproject.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "CONTRACT")
@Entity
public class Contract {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "APPROVE_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date approveDate;

    @Column(name = "NUMBER_", nullable = false, length = 50)
    @NotNull
    private String number;

    @Column(name = "START_DATE", nullable = false)
    @NotNull
    private LocalDate startDate;

    @Column(name = "END_DATE", nullable = false)
    @NotNull
    private LocalDate endDate;

    @JoinColumn(name = "CONTRACT_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatalogContractType contractType;

    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public CatalogContractType getContractType() {
        return contractType;
    }

    public void setContractType(CatalogContractType contractType) {
        this.contractType = contractType;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @InstanceName
    @DependsOnProperties({"number", "approveDate"})
    public String getContractNumDate() {
        return String.format("%s %s", number, approveDate);
    }
}