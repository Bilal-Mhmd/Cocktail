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
public class Sugar extends Ingredients {

    int amountOfSugar;
    
    public Sugar() {
        super("Sugar");
    }

    public Sugar(int amountOfSugar, int amountOfCalories) {
        super("Sugar", amountOfCalories);
        this.amountOfSugar = amountOfSugar;
    }

    public void setAmountOfSugar(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }

    

    @Override
    public String getInfo() {
        return ""; //I will edit it in next phase
    }
}
