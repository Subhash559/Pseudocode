// #  4. NESTED IF :-

// #  DECLARE u_id : STRING
// #  DECLARE pass : STRING
// #  READ u_id , pass
// #  IF u_id == "TIT" THEN
// #       IF pass == "TIT" THEN
// #           PRINT "Welcome"
// #       ELSE 
// #           PRINT "Invalid pass"
// #       END IF 
// #  ELSE 
// #     PRINT "Invalid"

import java.util.Scanner;

public class selectionnestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String u_id, pass;

        u_id = sc.next();
        pass = sc.next();

        if (u_id.equals("TIT")) {
            if (pass.equals("TIT")) {
                System.out.println("Welcome");
            } else {
                System.out.println("Invalid pass");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
