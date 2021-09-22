package com.company.jmixqsproject.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "EMPLOYEE")
@Entity
public class Employee {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "PERSONAL_NUMBER", nullable = false, length = 6)
    @NotNull
    private String personalNumber;

    @Column(name = "FIRST_NAME", nullable = false)
    @NotNull
    private String firstName;

    @Column(name = "MIDDLE_NAME", nullable = false)
    @NotNull
    private String middleName;

    @Column(name = "LAST_NAME", nullable = false)
    @NotNull
    private String lastName;

    @JoinColumn(name = "DEGREE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatalogDegree degree;

    @JoinColumn(name = "RANK_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private CatalogRank rank;

    @JoinColumn(name = "POSITION_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private CatalogPosition position;

    @Composition
    @OneToMany(mappedBy = "employee")
    private List<Contract> contract;

    @Column(name = "DATE_OF_BIRTH", nullable = false)
    @NotNull
    private LocalDate dateOfBirth;

    @Column(name = "INIPA", length = 14)
    private String inipa;

    @Column(name = "RATE_SIZE", nullable = false)
    @NotNull
    private Double rateSize;

    @Email
    @Column(name = "EMAIL", nullable = false)
    @NotNull
    private String email;

    @Column(name = "MOBILE_PHONE", length = 11)
    private String mobilePhone;

    @Column(name = "ALT_MOBILE_PHONE", length = 11)
    private String altMobilePhone;

    @Column(name = "CITY_PHONE", length = 12)
    private String cityPhone;

    public void setContract(List<Contract> contract) {
        this.contract = contract;
    }

    public List<Contract> getContract() {
        return contract;
    }

    public String getCityPhone() {
        return cityPhone;
    }

    public void setCityPhone(String cityPhone) {
        this.cityPhone = cityPhone;
    }

    public String getAltMobilePhone() {
        return altMobilePhone;
    }

    public void setAltMobilePhone(String altMobilePhone) {
        this.altMobilePhone = altMobilePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public Double getRateSize() {
        return rateSize;
    }

    public void setRateSize(Double rateSize) {
        this.rateSize = rateSize;
    }

    public String getInipa() {
        return inipa;
    }

    public void setInipa(String inipa) {
        this.inipa = inipa;
    }

    public CatalogPosition getPosition() {
        return position;
    }

    public void setPosition(CatalogPosition position) {
        this.position = position;
    }

    public CatalogRank getRank() {
        return rank;
    }

    public void setRank(CatalogRank rank) {
        this.rank = rank;
    }

    public CatalogDegree getDegree() {
        return degree;
    }

    public void setDegree(CatalogDegree degree) {
        this.degree = degree;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @InstanceName
    @DependsOnProperties({"firstName", "lastName"})
    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
}