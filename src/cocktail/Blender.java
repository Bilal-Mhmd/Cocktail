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
public class Blender {

    private double capacity;
    private Milk m;
    private Fruits f;
    private Sugar s;

//Constructors: 
    public Blender(Milk m, Fruits f, Sugar s) {
        this.m = m;
        this.f = f;
        this.s = s;
    }

    public Blender() {
    }

    public Blender(double capacity) {
        this.capacity = capacity;
    }

    //Getters
    public double getCapacity() {
        return capacity;
    }

    public Milk getM() {
        return m;
    }

    public Fruits getF() {
        return f;
    }

    public Sugar getS() {
        return s;
    }

    //Methods::
    public int totalAmountofCalories(Milk m, Fruits f, Sugar s) {
        return m.getAmountOfCalories() + f.getAmountOfCalories() + s.getAmountOfCalories();
    }

    public String cocktailColor(Milk M, Fruits F) {
        return ""; // LATER
    }

    public double cocktailVolume(Milk m, Fruits f) {
        return 1; // LATER
    }

    public String cocktailContains(Blender b) {
        return b.getF().getName()+b.getM().getName()+ b.getS().getName();
    }
    public String getInfo()
   {
   return ""; // LATER
   }
    
    //Setters: 

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setM(Milk m) {
        this.m = m;
    }

    public void setF(Fruits f) {
        this.f = f;
    }

    public void setS(Sugar s) {
        this.s = s;
    }
    

}
