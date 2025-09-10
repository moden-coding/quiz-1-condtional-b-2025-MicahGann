import java.util.*;

 /**
 *  Basic task (up to B+ level):
 *    - Ask the user for a whole number x.
 *    - Print whether x is EVEN or ODD.
 *    - If x is exactly 0, also print "ZERO" on its own line.
 *
 *  Moderate task (up to A level): 
 *    - Ask for a second whole number called total (a positive number).
 *    - Compute x divided by total as a DECIMAL calculation.
 *      * Example: if x = 37 and total = 90, print: "37/90 is 0.4111111111111111"
 *    - If total <= 0, print an error message and skip the percentage.
 *
 *  Challenge task (up to A+ level):
 *    - If x < 0 or x > 100, print "Wrong number!".
 *    - Otherwise:
 *        Check to see if x is a prime number. A prime number less than
 *        100 should be divisible by itself and 1 but not by 2, 3, 5, or 7.
 *        Print your results
 */
public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a whole number:");
        int x = Integer.valueOf(scanner.nextLine());
        if (x == 0) {
            System.out.println("ZERO");
        } else if (x%2 == 1) {
            System.out.println("ODD");
        } else if (x%2 == 0) {
            System.out.println("EVEN");
        }
        System.out.println("Give another whole number: (Positive number)");            
        int total = Integer.valueOf(scanner.nextLine());
        double result3 = 1.0 * x/total;
        if (total <= 0) {
            System.out.println("ERROR");
        } else {
            System.out.println(result3);
        }
        
        if (x%x == 0 && x%1 == 0 && x > 0 && x < 100) {
            System.out.println(x + " is a prime number.");
        } if (x < 0 || x > 100) {
            System.out.println("Wrong number!");
        }
    }
}
