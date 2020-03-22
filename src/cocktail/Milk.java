/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail;

/**
 *
 * @author Bilal
 */
import java.awt.Color;

public class Milk extends Ingredients {
// fields: 

    private static final Color milkColor = Color.WHITE;
    private double volume;

//Constructors:  
    public Milk() {

    }

    public Milk(double volume) {
        this.volume = volume;
    }

    public Milk(double volume, String name, int amountOfCalories) {
        super(name, amountOfCalories);
        this.volume = volume;
    }

    public Milk(String name, int amountOfCalories, double volume) {
        super(name, amountOfCalories);
        this.volume = volume;
    }
//Setters

    public void setVolume(double volume) {
        this.volume = volume;
    }

//Getters:
    public static Color getMilkColor() {
        return milkColor;
    }

    public double getVolume() {
        return volume;
    }

//getInfo
    @Override
    public String getInfo() {
        return ""; //I will edit it in next phase
    }
}
