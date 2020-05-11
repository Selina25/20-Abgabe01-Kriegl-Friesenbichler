package test.java.at.fhj.iit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import main.java.at.fhj.*   ;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Testing SimpleDrink implementation")
public class SimpleDrinkTest {


    /**
     * inits an alcoholic liquid and an non-alcoholic Liquid to test the constructor of SimpleDrink
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        l1 = new Liquid("Orangensaft", 0.5,0);
        l2 = new Liquid("Vodka", 0.125, 40);
        sD1 = new SimpleDrink("Orangensaft", l1);
        sD2 = new SimpleDrink("Vodka",l2);

    }

    /**
     * tests the constructor of the class SimpleDrink with an non-alcoholic Liquid
     */
    @Test
    @DisplayName("Testing constructor non alcoholic")
    public void testConstructorNonAlcoholic(){
        assertEquals(sD1.getAlcoholPercent(), 0);
        assertEquals(sD1.getVolume(), 0.5, 0.001);
        assertEquals(sD1.isAlcoholic(), false);

    }

    /**
     * tests the constructor of the class SimpleDrink with an alcoholic Liquid
     */
    @Test
    @DisplayName("Testing constructor alcoholic")
    public void testConstructorAlcoholic(){
        assertEquals(sD2.getAlcoholPercent(), 40);
        assertEquals(sD2.getVolume(), 0.125, 0.001);
        assertEquals(sD2.isAlcoholic(), true);
    }



}
