package basics;
import java.util.Scanner;
public class triangle {

	public static void main(String[] args) {
		int rows = 5; // Number of rows in the triangle
        
        // Outer loop to iterate through rows
        for (int i = 1; i <= rows; i++) {
        
            // Inner loop to print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Inner loop to print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // Move to the next line after each row
            System.out.println();
        }

	}
}