package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


@DisplayName("Testing MixedDrink class")
public class MixedDrinkTest {
    private MixedDrink mx1, mx2, mx3, mx4, mx5, mx6;
    private Liquid l1, l2, l3, l4, l5;

    /**
     * BeforeEach: init multiple mixed drinks (one for each construtor)
     */
    @BeforeEach
    void setup() throws AlcoholicSubstanceException {
        l1 = new Liquid("Soda", 0.3, 0);
        l2 = new Liquid("Wine", 0.125, 13);
        l3 = new Liquid("Whiskey", 0.04, 40);
        l4 = new Liquid("Cola", 0.25, 0);
        l5 = new Liquid("Prosecco", 0.16, 11);

        mx1 = new MixedDrink("Soda");
        mx2 = new MixedDrink("Spritzer", l2, l1);
        mx3 = new MixedDrink("Blueberry Spritzer", l2, l1, MixedDrink.Syrup.blueberry);
        mx4 = new MixedDrink("Whiskey Cola", l3, l4, List.of("ice"));
        mx5 = new MixedDrink("Hugo", l5, l1, MixedDrink.Syrup.elderberry, List.of("mint leaves"));
        mx6 = new MixedDrink("Cola Light", l1, l4);
    }

    /**
     * test the first constructor (with name)
     */
    @Test
    @DisplayName("Testing the first constructor")
    public void testConstructorOne() {
        assertEquals("Soda", mx1.getName());
    }

    /**
     * test the second constructor (name, two liquids)
     */
    @Test
    @DisplayName("Testing the second constructor")
    public void testConstructorTwo() {
        assertEquals("Spritzer", mx2.getName());
        assertEquals(6.5, mx2.getAlcoholPercent(), 0.001);
        assertEquals(0.425, mx2.getVolume(), 0.001);
    }

    /**
     * test the third constructor (name, two liquids, one syrup)
     */
    @Test
    @DisplayName("Testing the third constructor")
    public void testConstructorThree() {
        assertEquals("Blueberry Spritzer", mx3.getName());
        assertEquals(6.5, mx3.getAlcoholPercent(), 0.001);
        assertEquals(0.425, mx3.getVolume(), 0.001);
        assertEquals(MixedDrink.Syrup.blueberry, mx3.getSyrup());
    }

    /**
     * test the fourth constructor (name, two liquids and a list with other ingredients)
     */
    @Test
    @DisplayName("Testing the fourth constructor")
    public void testConstructorFour() {
        assertEquals("Whiskey Cola", mx4.getName());
        assertEquals(20, mx4.getAlcoholPercent(), 0.001);
        assertEquals(0.29, mx4.getVolume(), 0.001);
        assertEquals(List.of("ice"), mx4.getOtherIngredients());
    }

    /**
     * test the fifth constructor (name, two liquids, one syrup and a list with other ingredients)
     */
    @Test
    @DisplayName("Testing the fifth constructor")
    public void testConstructorFive() {
        assertEquals("Hugo", mx5.getName());
        assertEquals(5.5, mx5.getAlcoholPercent(), 0.001);
        assertEquals(0.46, mx5.getVolume(), 0.001);
        assertEquals(MixedDrink.Syrup.elderberry, mx5.getSyrup());
        assertEquals(List.of("mint leaves"), mx5.getOtherIngredients());
    }

    /**
     * test the volume getter method
     */
    @Test
    @DisplayName("Testing the volume getter method")
    public void testGetVolume() {
        assertEquals(0.425, mx2.getVolume(), 0.001);
        assertEquals(0.425, mx3.getVolume(), 0.001);
        assertEquals(0.29, mx4.getVolume(), 0.001);
        assertEquals(0.46, mx5.getVolume(), 0.001);
    }

    /**
     * test the alcoholPercent getter method
     */
    @Test
    @DisplayName("Testing the alcoholPercent getter method")
    public void testGetAlcoholPercent() {
        assertEquals(6.5, mx2.getAlcoholPercent(), 0.001);
        assertEquals(6.5, mx3.getAlcoholPercent(), 0.001);
        assertEquals(20, mx4.getAlcoholPercent(), 0.001);
        assertEquals(5.5, mx5.getAlcoholPercent(), 0.001);
    }

    /**
     * test the isAlcoholic() method
     */
    @Test
    @DisplayName("Testing the isAlcoholic method")
    public void testIsAlcoholic() {
        assertEquals(true, mx2.isAlcoholic());
        assertEquals(true, mx3.isAlcoholic());
        assertEquals(true, mx4.isAlcoholic());
        assertEquals(true, mx5.isAlcoholic());
        assertEquals(false, mx6.isAlcoholic());
    }

    /**
     * test the liquidsAlcoholic() method
     */
    @Test
    @DisplayName("Testing the liquidsAlcoholic method")
    public void testLiquidsAlcoholic() {
        assertEquals(false, mx2.liquidsAlcoholic(mx2.l1, mx2.l2));
        assertEquals(false, mx3.liquidsAlcoholic(mx3.l1, mx3.l2));
        assertEquals(false, mx4.liquidsAlcoholic(mx4.l1, mx4.l2));
        assertEquals(false, mx5.liquidsAlcoholic(mx5.l1, mx5.l2));
    }

    /**
     * test the shake() method
     */
    @Test
    @DisplayName("Testing the shake method")
    public void testShake() {
        assertEquals("The ingredients have been shook and the drink is now ready to serve", mx2.shake());
    }

    /**
     * test the stir() method
     */
    @Test
    @DisplayName("Testing the stir method")
    public void testStir() {
        assertEquals("The ingredients have been stirred and the drink is now ready to serve", mx3.stir());
    }

    /**
     * test the otherIngredients getter method
     */
    @Test
    @DisplayName("Testing the otherIngredients getter method")
    public void testGetIngredients() {
        assertEquals(List.of("ice"), mx4.getOtherIngredients());
        assertEquals(List.of("mint leaves"), mx5.getOtherIngredients());
    }

    /**
     * test the otherIngredients setter method
     */
    @Test
    @DisplayName("Testing the otherIngredients setter method")
    public void testSetIngredients() {
        mx2.setOtherIngredients(List.of("lemon"));
        assertEquals(List.of("lemon"), mx2.getOtherIngredients());
        mx3.setOtherIngredients(List.of("sugar"));
        assertEquals(List.of("sugar"), mx3.getOtherIngredients());
    }
    
    /**
     * test the syrup getter method
     */
    @Test
    @DisplayName("Testing the syrup getter method")
    public void testGetSyrup() {
        assertEquals(MixedDrink.Syrup.blueberry, mx3.getSyrup());
        assertEquals(MixedDrink.Syrup.elderberry, mx5.getSyrup());
    }

    /**
     * test the syrup setter method
     */
    @Test
    @DisplayName("Testing the syrup setter method")
    public void testSetSyrup() {
        mx2.setSyrup(MixedDrink.Syrup.strawberry);
        assertEquals(MixedDrink.Syrup.strawberry, mx2.getSyrup());
        mx4.setSyrup(MixedDrink.Syrup.rose);
        assertEquals(MixedDrink.Syrup.rose, mx4.getSyrup());
    }

    /**
     * test the self-implemented Exception AlcoholicSubstanceException
     */
    @Test
    @DisplayName("Testing the AlcoholicSubstanceException")
    public void testAlcoholicSubstanceException(){
        assertThrows(AlcoholicSubstanceException.class,  () -> {
            MixedDrink mx = new MixedDrink("Cocktail", l2, l3);
        });

        assertThrows(AlcoholicSubstanceException.class,  () -> {
            MixedDrink mx = new MixedDrink("Mint dream", l2, l3, MixedDrink.Syrup.mint);
        });

        assertThrows(AlcoholicSubstanceException.class,  () -> {
            MixedDrink mx = new MixedDrink("Swimmingpool", l2, l5, List.of("cream"));
        });

        assertThrows(AlcoholicSubstanceException.class,  () -> {
            MixedDrink mx = new MixedDrink("Blueberry Drink", l2, l5, MixedDrink.Syrup.blueberry, List.of("blueberries"));
        });
    }
}