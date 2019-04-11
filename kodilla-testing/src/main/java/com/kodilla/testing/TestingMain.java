package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        // SimpleUser Testing

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // Testing Calculator Class

        Calculator calculator = new Calculator();
        int addResults = calculator.add(23, 17);
        int subResults = calculator.subtract(23, 13);
        if ((addResults == 40) && (subResults == 10)) {
            System.out.println("Calculator Test OK");
        } else {
            System.out.println("Calculator Test Error!");
        }
    }
}



















