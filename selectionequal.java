// # SELECTION :-
// #  1. IF :-
// # check given number is equal

// # DECLARE X : INTEGER
// # READ X
// # IF X >= 5 THEN
// #     PRINT "X is greater or equal to 5."
// # END IF
import java.util.Scanner;

public class selectionequal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Enter a number: ");
        x = sc.nextInt();

        if (x >= 5) {
            System.out.println("X is greater or equal to 5.");
        }
    }
}