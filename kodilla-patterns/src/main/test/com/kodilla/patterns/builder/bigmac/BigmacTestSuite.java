package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BigmacTestSuite {
    @Test
    public void bigMacBuilderTest() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Z sezamem")
                .ingredient("Bekon")
                .ingredient("Cebulka")
                .ingredient("Szynka")
                .sauce("Barbecue")
                .sauce("Standard")
                .burgers(2)
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManySauce = bigmac.getSauce().size();
        List<String> ingredientTest = bigmac.getIngredients();
        List<String> sauceTest = bigmac.getSauce();
        //Then
        assertEquals(3, howManyIngredients);
        assertEquals(2, howManySauce);
        assertEquals("Z sezamem", bigmac.getBuns());
        assertEquals(ingredientTest, bigmac.getIngredients());
        assertEquals(sauceTest, bigmac.getSauce());
        assertEquals(2, bigmac.getBurgers());
    }
}
