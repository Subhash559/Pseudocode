//  Find area and perimeter of rectangle

// DECLARE length : REAL
// DECLARE breadth : REAL
// READ length,breadth
// PRINT length * breadth
// PRINT 2*(length + breadth)

import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        System.out.println("Area " + (length * breadth));
        System.out.println("Perimeter " + (2 * (length + breadth)));
    }
}

