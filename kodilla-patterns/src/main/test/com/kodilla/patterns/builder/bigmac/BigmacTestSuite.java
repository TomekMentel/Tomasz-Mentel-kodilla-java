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
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManySauce = bigmac.getSauce().size();
        //Then
        assertEquals(3, howManyIngredients);
        assertEquals(2, howManySauce);
    }
}
