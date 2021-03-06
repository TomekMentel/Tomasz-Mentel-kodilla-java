package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

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
        //Then
        assertEquals(3, howManyIngredients);
        assertEquals(2, howManySauce);
        assertEquals("Z sezamem", bigmac.getBuns());
        assertEquals("Bekon", bigmac.getIngredients().get(0));
        assertEquals("Cebulka", bigmac.getIngredients().get(1));
        assertEquals("Szynka", bigmac.getIngredients().get(2));

        assertEquals("Barbecue", bigmac.getSauce().get(0));
        assertEquals("Standard", bigmac.getSauce().get(1));
        assertEquals(2, bigmac.getBurgers());
    }
}
