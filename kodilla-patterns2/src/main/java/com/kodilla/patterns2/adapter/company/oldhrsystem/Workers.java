package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"788649382", "John", "Smith"},
            {"758629382", "Ivone", "Novak"},
            {"738649582", "Jessie", "Pinkman"},
            {"888629382", "Walter", "White"},
            {"798642312", "Clara", "Larson"}};

    private double[] salaries = {
            4500.00,
            3700.00,
            4300.00,
            9000.00,
            6200.00,};

    public String getWorkers(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + "," + workers[n][1] + "," + workers[n][2] + "," + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
