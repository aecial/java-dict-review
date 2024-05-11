package basics;
public class ChristmasTree {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the tree

        // Outer loop for rows
        for (int i = 0; i < rows; i++) {
            
            // Inner loop for spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Inner loop for stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            
            // Move to the next line after each row
            System.out.println();
        }

        // Print the trunk of the tree
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < rows - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
