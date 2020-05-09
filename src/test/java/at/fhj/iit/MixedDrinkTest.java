package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



@DisplayName ("Testing MixedDrink class")
public class MixedDrinkTest{
    private MixedDrink mx1;
//    private MixedDrink mx2;
//    private MixedDrink mx3;
//    private MixedDrink mx4;
//    private MixedDrink mx5;

    /**
     * BeforeEach: init multiple mixed drinks (one for each construtor)
     */
    @BeforeEach
    void setup(){
        mx1 = new MixedDrink("Wine");
//        mx2 = new MixedDrink("Spritzer", wine, soda);
//        mx3 = new MixedDrink("Blueberry Spritzer", wine, soda, blueberry);
//        mx4 = new MixedDrink("Whiskey Cola", whiskey, cola, ice);
//        mx5 = new MixedDrink("Hugo", prosecco, soda, elerberry, mintleaves);
    }

    /**
     * test the first constuctor (with name)
     */
    @Test
    @DisplayName("Testing the first constructor")
    public void testConstructorOne(){

    }

    /**
     * test the second constructor (name, two liquids)
     */
    @Test
    @DisplayName("Testing the second constructor")
    public void testConstructorTwo(){

    }

    /**
     * test the third constructor (name, two liquids, one syrup)
     */

    /**
     * test the fourth constructor (name, two liquids and a list with other ingredients)
     */

    /**
     * test the fifth constructor (name, two liquids, one syrup and a list with other ingredients)
     */

    /**
     * test the volume getter method
     */

    /**
     * test the alcoholPercent getter method
     */

    /**
     * test the isAlcoholic() method
     */

    /**
     * test the shake() method
     */

    /**
     * test the stir() method
     */

    /**
     * test the otherIngredients getter method
     */

    /**
     * test the otherIngredients setter method
     */

    /**
     * test the addOtherIngredients() method
     */

    /**
     * test the syrup getter method
     */

    /**
     * test the syrup setter method
     */
}