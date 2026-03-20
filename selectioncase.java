// #  2. CASE :-

// # DECLARE X:INTEGER
// # READ X
// # CASE OF X
// #         1: PRINT "one"
// #         2: PRINT "two"
// #         3: PRINT "three"
// #         4: PRINT "four"
// # OTHERWISE
// #         PRINT "Wrong"
// # END CASE

    import java.util.Scanner;

public class selectioncase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("Wrong");
        }
    }
}
    

