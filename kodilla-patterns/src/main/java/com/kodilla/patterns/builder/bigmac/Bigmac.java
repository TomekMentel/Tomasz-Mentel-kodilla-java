package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private String roll;
    private int burgers;
    private String bun;
    private List<String> sauces;
    private List<String> ingredients;


    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String bun;
        private List<String> sauces = new ArrayList<>();
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            sauces.add(sauce);
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, roll, sauces, ingredients);
        }
    }

    public Bigmac(String bun, int burgers, String roll, List<String> sauces, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.bun = bun;
        this.sauces = new ArrayList<>(sauces);
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getBuns() {
        return bun;
    }

    public List<String> getSauce() {
        return sauces;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", bun=" + bun +
                ", sauce=" + sauces +
                ", ingredients=" + ingredients +
                '}';
    }
}