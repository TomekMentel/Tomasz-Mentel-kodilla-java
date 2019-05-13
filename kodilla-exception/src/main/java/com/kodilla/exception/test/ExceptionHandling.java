package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2, 2);
        } catch (Exception e) {
            System.out.println("Error Exceptions: " + e);
        } finally {
            System.out.println("Second Exception");
        }
    }
}
