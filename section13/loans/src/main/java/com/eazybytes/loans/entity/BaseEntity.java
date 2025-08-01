package com.eazybytes.loans.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@MappedSuperclass // this annotation is going to give instruction to Spring Data JPA that this class is going to act as a super class to other entities wherever I am going to extend it as a super class
@EntityListeners(AuditingEntityListener.class) // this class provided by spring data JPA to provide the auditing of the data
public class BaseEntity { // this class contains metadata related columns which is going to be common and used my other entity class

    @Column(updatable = false) // what is the column name in the database we are trying to map to this field. Since name of this field is same in database so no need to give name but in am mentioning the updatable field as true since this field is going to get value once entry created and not modidfied if any changes uppers as this is to maintain the auditing of the data.
    @CreatedDate // annotation provided by spring data JPA to get the current time when the record is created
    private LocalDateTime createdAt;

    @Column(updatable = false)  // this is going to represent what is the original time and whome has been created the record
    @CreatedBy // annotation provided by spring data JPA to get the user who has created the record
    private String createdBy;

    @Column(insertable = false) // this will tell spring data JPA to not add the value to these fields when insert the new record
    @LastModifiedDate // annotation provided by spring data JPA to get the current time when the record is updated
    private LocalDateTime updatedAt;

    @Column(insertable = false)
    @LastModifiedBy // annotation provided by spring data JPA to get the user who has updated the record
    private String updatedBy;
}
