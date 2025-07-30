package com.eazybytes.loans.repository;

import com.eazybytes.loans.entity.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // spring data jpa will create the bean representation of this interface based on whatever configuration i am going to provide
public interface LoansRepository extends JpaRepository<Loans, Long> { // name of entity class and second parameter is what is the type of primary key of this entity.
    // behind the scene jpa will generate the code which provides lot many methods with all crud operations. jpaRepository comes from JPA framework
    Optional<Loans> findByMobileNumber(String mobileNumber); // framework can only provide fid method based upon the private key of entity which id.

    Optional<Loans> findByLoanNumber(String loanNumber);
    // spring data jpa framework will write the logic of fetching the record based on mobile number or whatever column we have mentioned. make sure the spelling is correct, and it is not case-sensitive
    // Optional : there can be customer or can not be any customer, so to prevent null pointer exception we use Optional here.
}
