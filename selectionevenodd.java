// # 3. even/odd :-

// # DECLARE X : INTEGER
// # READ X
// # IF X MOD 2 == 0 THEN
// #     PRINT "Number is Even."
// # ElSE 
// #     PRINT "Number is odd."
// # END IF
    import java.util.Scanner;

public class selectionevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd.");
        }
    }
}
    

