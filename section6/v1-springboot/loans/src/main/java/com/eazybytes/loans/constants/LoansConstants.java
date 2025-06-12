package com.eazybytes.loans.constants;

public final class LoansConstants {

    private LoansConstants() {
        // restrict instantiation
    } // reason using private constructor - no one can access object this class
// final - final variables value can not be modified, static - variables can access directly by their class name without creating object of the class.
// it is a reccomendation and good standard to use the field name or constant name of the class with all caps
    public static final String  HOME_LOAN = "Home Loan";
    public static final int  NEW_LOAN_LIMIT = 1_00_000;
    public static final String  STATUS_201 = "201";
    public static final String  MESSAGE_201 = "Loan created successfully";
    public static final String  STATUS_200 = "200";
    public static final String  MESSAGE_200 = "Request processed successfully";
    public static final String  STATUS_417 = "417";
    public static final String  MESSAGE_417_UPDATE= "Update operation failed. Please try again or contact Dev team";
    public static final String  MESSAGE_417_DELETE= "Delete operation failed. Please try again or contact Dev team";
    // public static final String  STATUS_500 = "500";
    // public static final String  MESSAGE_500 = "An error occurred. Please try again or contact Dev team";

}