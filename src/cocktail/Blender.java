package cocktail;

import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public class Blender {

    private int capacity;

    private int volume;

    private int calories;

    private ArrayList<Ingredients> ingredients;

    public Blender(int capacity) {
        this.capacity = capacity;
        this.ingredients = new ArrayList<>();
    }

    public void add(Ingredients ingredient) {
       
        
            try {
               
                if (this.volume > this.capacity) {
                    throw new Exception("cannot add");
                }
                this.ingredients.add(ingredient);
                this.volume += ingredient.getVolume();
                

                
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
  

    public int getVolume() {
        return this.volume;
    }

    public void blend() {

        for (Ingredients i : this.ingredients) {
                this.volume += i.getVolume();

                
            
        
        
        }
    }

    public Color mixtureFinalColor() {
        int x = ingredients.size();
        int r = 0;
        int g = 0;
        int b = 0;

        for (Ingredients i : ingredients) {
            r = +i.getColor().getR();
            g = +i.getColor().getG();
            b = +i.getColor().getB();
        }

        r = r / x;
        g = g / x;
        b = b / x;
        return new Color(r, g, b);

    }

    public int totalCalories() {
        for (Ingredients i : this.ingredients) {
            this.calories = +i.getCalories();
        }
        return calories;
    }

    public void pour(Blender b, Cup cup) {
        try {
            if (b.getVolume() == 0) {
                throw new Exception("Blender is Empty");
            }

            cup.setVolume(cup.getCapacity());
            int x = cup.getVolume();
            cup.setCalories(calories / x);
            this.volume = -x;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("calories in the cup =" + cup.getCalories());
    }
}
