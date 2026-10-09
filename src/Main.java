import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountRegister register = new AccountRegister();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println();
            System.out.println("1. Skapa konto");
            System.out.println("2. Lista alla konton");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ut pengar");
            System.out.println("5. Avsluta");
            System.out.println("Val ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

            }
        }

    }
}
