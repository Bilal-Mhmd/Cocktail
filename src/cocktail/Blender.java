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
    
    private Color color;
    
    private double calPerMl;

    private ArrayList<Ingredients> ingredients;

    public Blender(int capacity) {
        this.capacity = capacity;
        this.ingredients = new ArrayList<>();
    }

    public void add(Ingredients ingredient) throws BlenderOverFlowException {
      
                      
                if (this.volume +ingredient.getVolume() > this.capacity) {
                    throw new BlenderOverFlowException();
                }
                else
                {
                  this.ingredients.add(ingredient);
                } 
                this.volume += ingredient.getVolume();

            }
        
  

    public int getVolume() {
        return this.volume;
    }

    public void blend() {
                 
        int totalR=0;
        int totalG=0;
        int totalB=0;
        for (Ingredients ing : this.ingredients) {
                totalR += ing.getColor().getR();
                totalG += ing.getColor().getG();
                totalB += ing.getColor().getB();   
                
                this.calories += ing.getCalories();
        }
        this.color= new Color(totalR/this.ingredients.size(),totalG/this.ingredients.size(),totalB/this.ingredients.size());
        this.calPerMl=(double)(this.calories)/(double)(this.volume);
        
        this.ingredients.clear();
    }

    public void pour(Cup cup) throws BlenderIsEmptyException {
    
            if(this.volume>0){
                   if(this.volume<cup.getCapacity())
                   {  cup.setCalories((int)(this.volume*this.calPerMl));
                      this.volume=0;     
                   }
                   else{
                   
                     this.volume-=cup.getCapacity();
                   }
                         
             } else{
                   throw new BlenderIsEmptyException();
            }
              
            
            
            }

    public int getCapacity() {
        return capacity;
    }

    public int getCalories() {
        return calories;
    }

    public Color getColor() {
        return color;
    }

    public double getCalPerMl() {
        return calPerMl;
    }
             
                

       
}

