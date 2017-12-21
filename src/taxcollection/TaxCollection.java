

package taxcollection;
import java.util.Scanner;
/**
 * Raphael Crespo
 * Period 2
 * Mr. Larrubia
 * Project name: Tax Collection
 * 
 */
public class TaxCollection {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        String groceryName [] = new String[3];
        double groceryPrice [] = new double [3];
        
        for (int i = 0; i < groceryName.length; i++) {
            System.out.print("Please enter the item name > ");
            groceryName[i] = in.nextLine();
            
            System.out.printf("Please eneter the price > ");
            groceryPrice[i] = in.nextDouble() * 1.07;
            in.nextLine();
            
        }
        
        for (int i = 0; i < groceryName.length; i++) {
            System.out.println("The cost of " + groceryName[i] + "'s > "
            + groceryPrice[i]);
            
            
        }
        
        

    }
    
    
    
    

}
