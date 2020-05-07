package main.java.at.fhj.iit;

import java.util.List;
/**
 * Class represents a mixed drink which can has to contain one alcoholic and one non-alcoholic liquid
 * drinks
 */
public class MixedDrink extends Drink {


    /**
     * This enum contains the possible sirups which can be added to the mixed drink
     */
    enum sirup{


    }

    protected  Liquid l1;
    protected  Liquid l2;
    protected List<String> otherIngredients;




    /**
     * Creates a MixedDrink object with given name
     *
     * @param name name of the drink
     *
     */
    MixedDrink(String name){
        super(name);

    }
    /**
     * Creates a MixedDrink object with given name and two Liquids
     *
     * @param name name of the drink
     * @param l1 name of the first liquid
     * @param l2 name of the second liquid
     *
     */
    MixedDrink(String name, Liquid l1, Liquid l2){
        super(name);

    }
    /**
     * Creates a MixedDrink object with given name and two Liquids
     *
     * @param name name of the drink
     * @param l1 name of the first liquid
     * @param l2 name of the second liquid
     * @param sirup name of the sirup
     */
    MixedDrink(String name, Liquid l1, Liquid l2, Enum sirup){
        super(name);

    }

    /**
     * Creates a MixedDrink object with given name and two Liquids
     *
     * @param name name of the drink
     * @param l1 name of the first liquid
     * @param l2 name of the second liquid
     * @param otherIngredients  list of names of other ingredients
     */
    MixedDrink(String name, Liquid l1, Liquid l2, List<String>otherIngredients){
        super(name);

    }

    /**
     * Creates a MixedDrink object with given name and two Liquids
     *
     * @param name name of the drink
     * @param l1 name of the first liquid
     * @param l2 name of the second liquid
     * @param sirup name of the sirup
     * @param otherIngredients  list of names of other ingredients
     */
    MixedDrink(String name, Liquid l1, Liquid l2, Enum sirup, List<String>otherIngredients){
        super(name);

    }


    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        return 0;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        return false;
    }

    /**
     * Shakes the ingredients of the mixed drink
     */
    public void shake(){


    }

    /**
     * Stirs the ingredients of the mixed drink
     */
    public  void  stir(){

    }
}
