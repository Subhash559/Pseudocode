//# 2. IF-ELSE :-
// # 1. check given number is equal Or not

// # DECLARE X : INTEGER
// # READ X
// # IF X >= 5 THEN
// #     PRINT "X is greater or equal to 5."
// # ElSE 
// #     PRINT "X is Not equal to 5."
// # END IF
    import java.util.Scanner;

public class selectionifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();

        if (x >= 5) {
            System.out.println("X is greater or equal to 5.");
        } else {
            System.out.println("X is Not equal to 5.");
        }
    }
}
    

