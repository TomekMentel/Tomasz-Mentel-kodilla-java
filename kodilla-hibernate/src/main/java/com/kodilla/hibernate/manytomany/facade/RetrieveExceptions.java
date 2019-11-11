package com.kodilla.hibernate.manytomany.facade;

public class RetrieveExceptions extends Exception {

    public static final String COMPANY_RETRIEVER_ERR = "No company find.";
    public static final String EMPLOYEE_RETRIEVER_ERR = "No employee find.";

    public RetrieveExceptions(String message) {
        super(message);
    }
}
