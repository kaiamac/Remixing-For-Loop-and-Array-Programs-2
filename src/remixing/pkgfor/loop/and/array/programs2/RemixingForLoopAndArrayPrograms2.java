/*
 * Kaia Mac
 * Remixing For Loop and Array Programs
 * October 25th, 2018
 */

package remixing.pkgfor.loop.and.array.programs2;
import java.util.Scanner;
/**
 *
 * @author kamac8665
 */
public class RemixingForLoopAndArrayPrograms2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        String [ ] friends = new String [5];
        
        System.out.println("Enter the names of five friends:");
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        
        System.out.println("The second, third and forth names listed were:");
        System.out.println("Second: " + friends[1]);
        System.out.println("Third: " + friends[2]);  
        System.out.println("Fourth: " + friends[3]);  
    }
    
}
