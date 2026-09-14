import java.util.Scanner;

public class main_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string of 0s and 1s (or type 'exit' to quit): ");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break;
            }

            String state = "q0";
            boolean wrong = false;

            for (int i = 0; i < answer.length(); i++) {
            if (state.equals("q0") && answer.charAt(i) == '0') {
                state = "q1";
            }
            else if (state.equals("q0") && answer.charAt(i) == '1') {
                state = "q0";
            }
            else if (state.equals("q0") && answer.charAt(i) == '0') {
                state = "q1";
            }
            else if (state.equals("q1") && answer.charAt(i) == '1') {
                state = "q2";
            }
            else if (state.equals("q2") && answer.charAt(i) == '0') {
                state = "q1";
            }
            else if (state.equals("q2") && answer.charAt(i) == '1') {
                state = "q0";
            }
            else {
                System.out.println("Invalid input character detected.\n");
                wrong = true;
                break;
            }
        }
        if (!wrong) {
            if (state.equals ("q2")) {
                System.out.println("Result: String accepted!\n");
            }
            else {
                System.out.println("Result: String not accepted!\n");
            }
        }
    }
    input.close();
    }
}
