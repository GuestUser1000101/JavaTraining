package Classes;
import java.util.Scanner;

public class BadCode {
    public static void main(String[] args) {
        /*
         * The code is INTENDED to:
         * 
         * Ask for two integers, intA and intB
         * If intA and intB are both POSITIVE and the SUM of intA and intB is ODD or 948, print out "congradulations" 10 times
         * Otherwise, print out "incorrect, try again" and loop back until the above condition is reached
         * 
         * The following code has both syntax and logic errors
         */

        // Can you spot all of the misstakes?

        scanner = new Scanner(System.in);
        approvalMessage = congradulations;
        disapprovalMessage = incorrect, try again;
        isLoopBroken = False;

        while !isLoopBroken {
            System.out.println(what is intA?);
            String intA = scanner.nextInt();
            System.out.println(what is intB?);
            String intB = scanner.nextInt();

            if intA > 0 and intB > 0 and (intA + intB = 948 and intA + intB % 2 = 0) {
                for (10) {
                    System.out.println(approvalMessage);
                }
                isLoopBroken = True
            } otherwise {
                System.out.println(disapprovalMessage);
            }
    }
}
