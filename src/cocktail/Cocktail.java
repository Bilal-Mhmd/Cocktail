/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail;

//import java.util.Scanner;

/**
 *
 * @author Bilal
 */
public class Cocktail {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Color red = new Color(255,0,0);
        Color yellowBanana =new Color(255, 247, 0);
        Color white = new Color(255,255,255);

        Fruits f1 = new Fruits("Apple", 52, 2, red );
        Fruits f2 = new Fruits("banana", 60, 8, yellowBanana);
        Milk m1 = new Milk("Milk1", 10,8, white);
        
        Blender b1 = new Blender(10);
        b1.add(f1);
        b1.add(f2);
        b1.add(m1);
        b1.add(f1);
        System.out.println(b1.getVolume());
         b1.blend();
       
       // Cup c1 =new Cup(3);
      //  System.out.println(c1.getVolume());
     //   b1.pour(b1,c1);
     //   System.out.println(c1.getVolume());
        
        
      //  Scanner in = new Scanner(System.in);

     
        
        
    }
    
}
