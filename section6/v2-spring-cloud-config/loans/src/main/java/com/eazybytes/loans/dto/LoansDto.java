package com.eazybytes.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(name = "Loans",
        description = "Schema to hold Loan information"
)
// to flow the data from controller to service and diff layers of the web application good to use dto patterns
// dto is data transfer object and in between DTO class and DB entity there is mapper which helps in data  conversion from dto to enitty and vise versa.
@Data // collection of getter, setter, toString, requiredargsconstructor, equalsandhashcode and value...
public class LoansDto { // id not required as id is genrated internally and not something to share to client

    @NotEmpty(message = "Mobile number cannot be empty or null")
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    @Schema(
            description = "Mobile Number of Customer", example = "4365327698"
    )
    private String mobileNumber;

    @NotEmpty(message = "Loan number cannot be empty or null")
    @Pattern(regexp="(^$|[0-9]{12})",message = "Loan number must be 10 digits")
    @Schema(
            description = "Loan Number of the customer", example = "548732457654"
    )
    private String loanNumber;

    @NotEmpty(message = "Loan type cannot be empty or null")
    @Schema(
            description = "Type of the loan", example = "Home Loan"
    )
    private String loanType;

    @Positive(message = "Loan amount cannot be negative")
    @Schema(
            description = "Total loan amount", example = "100000"
    )
    private int totalLoan;

    @PositiveOrZero(message = "Amount paid cannot be negative")
    @Schema(
            description = "Total loan amount paid", example = "1000"
    )
    private int amountPaid;

    @PositiveOrZero(message = "Outstanding amount cannot be negative")
    @Schema(
            description = "Total outstanding amount against a loan", example = "99000"
    )
    private int outstandingAmount;
}
