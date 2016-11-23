import java.util.Scanner;

/**
 * Created by User on 22.11.2016.
 */
public class Ex7 {
    public static void main(String[] args) {
        System.out.print("Enter the first whole number: ");
        int a = getIntFromUser();
        System.out.print("Enter the second whole number: ");
        int b = getIntFromUser();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }

    private static int getIntFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.err.print("Wrong input, please try again: ");
        }
        return scanner.nextInt();
    }
}
