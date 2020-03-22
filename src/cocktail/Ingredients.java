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
public abstract class Ingredients {
//fields: 
    private String name;
    private int amountOfCalories;
   

    //Constructors:
    public Ingredients() {
    }

    public Ingredients(String name, int amountOfCalories) {
        this.name = name;
        this.amountOfCalories = amountOfCalories;
    }

    public Ingredients(String name) {
        this.name = name;
    }

    public Ingredients(int amountOfCalories) {
        this.amountOfCalories = amountOfCalories;
    }


   
       
    
// Setters:

    public void setName(String name) {
        this.name = name;
    }

    public void setAmountOfCalories(int amountOfCalories) {
        this.amountOfCalories = amountOfCalories;
    }

   
//Getters: 

    public String getName() {
        return name;
    }

    public int getAmountOfCalories() {
        return amountOfCalories;
    }

    

    //abstract method: getinfo
    public abstract String getInfo();

}
