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

public class Fruits extends Ingredients {

    //fields: 
    public Color color;
    private double volume;

// Constructors: 

    public Fruits() {
    }

    public Fruits(String name, int amountOfCalories, double volume, Color color) {
        super(name, amountOfCalories);
        this.color = color;
        this.volume = volume;
    }

    public Fruits(Color color, double volume) {
        this.volume = volume;
        this.color = color;
    }

//Setters: 
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setColor(Color color) {
        this.color = color;
    }
//Getters:

    public double getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String getInfo() {
        return ""; //I will edit it in next phase
    }

}
