package com.eazybytes.loans.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // tells to spring data jpa to use this class as a entity or pojo representation for my table hence the name of this class shoulds match with table  name
// if table name not match with class name then we can use @Table annotation and pass the name of the table eg : @Table(name="table name")
@Getter
@Setter
@AllArgsConstructor // lombok will genrate a constructor which accept all the fields as arguments
@NoArgsConstructor // generate the empty constructor, whenever we use this entity we may need to create the constructor to access all fields that is why we mention this annotation here
public class Loans extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // here we are giving responsibility to spring data jpa to automatically generate id for every record. it is going to genrate the sequence number and primary key value with native strategy of whatever database I am going to ue
    private Long loanId;

    // if column namer and field name are matching then we no need to use @column annotation since jpa itself consider entity fields as table field
    private String mobileNumber;

    private String loanNumber;

    private String loanType;

    private int totalLoan;

    private int amountPaid;

    private int outstandingAmount;
}
