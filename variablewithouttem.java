// # without temoprary variable

// # DECLARE num1,num2 : INTEGER
// # READ num1,num2
// # num1 =  num1 + num2
// # num2 =  num1 - num2
// # num1 =  num1 - num2
// # PRINT num1,num2
    import java.util.Scanner;

public class variablewithouttem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter first no: ");
        a = sc.nextInt();

        System.out.print("Enter second no: ");
        b = sc.nextInt();

        // Swap without temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

