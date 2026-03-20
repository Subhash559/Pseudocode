


    // Swap two numbers using temporary variable

// DECLARE num1,num2 : INTEGER
// DECLARE new : INTEGER
// READ num1,num2
// new = num1
// num1 = num2
// num2 = new
// PRINT num1,num2
import java.util.Scanner;
public class variableswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b1 = sc.nextInt();

        int temp;
        temp = a;
        a = b1;
        b1 = temp;
System.out.println(a + " " + b1);

    }
}