// # 3. IF-ELSE-IF Ladder :-

// #   Example 1 -

// # DECLARE X : INTEGER
// # READ X
// # IF X > 0 THEN
// #     PRINT "positive"
// # ElSE IF  X < 0 THEN
// #     PRINT "negative"
// # ELSE
// #     PRINT "Zero"
// # END IF

import java.util.Scanner;

public class selectionifelseladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();

        if (x > 0) {
            System.out.println("Positive");
        } else if (x < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}

// # Example 2 -

// # DECLARE cn : INTEGER
// # DECLARE cd : INTEGER
// # DECLARE pm : INTEGER
// # DECLARE dbms : INTEGER
// # DECLARE ml : INTEGER
// # READ cn,cd,pm,dbms,ml
// # per:= (cn+cd+pm+dbms+ml)/5
// # IF per >= 90 THEN
// #     PRINT "A+"
// # ElSE IF  per >= 70 THEN
// #     PRINT "A"
// # ElSE IF  per >= 60 THEN
// #     PRINT "B"
// # ElSE IF  per >= 50 THEN
// #     PRINT "C"
// # ELSE
// #     PRINT "fail"
// # END IF



// public class selectionifelseladder {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int cn, cd, pm, dbms, ml;
//         double per;

//         // Input marks
//         cn = sc.nextInt();
//         cd = sc.nextInt();
//         pm = sc.nextInt();
//         dbms = sc.nextInt();
//         ml = sc.nextInt();

//         // Calculate percentage
//         per = (cn + cd + pm + dbms + ml) / 5.0;

//         // Grade calculation
//         if (per >= 90) {
//             System.out.println("A+");
//         } else if (per >= 70) {
//             System.out.println("A");
//         } else if (per >= 60) {
//             System.out.println("B");
//         } else if (per >= 50) {
//             System.out.println("C");
//         } else {
//             System.out.println("Fail");
//         }
//     }
// }