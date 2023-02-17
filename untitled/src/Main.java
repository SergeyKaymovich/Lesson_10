import by.teachmeskills.kaymovich.homework10.WorkWithString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int key = scanner.nextInt();
        Scanner sc = new Scanner(System.in);

        switch (key) {
            case 1 -> {
                System.out.print("Input string: ");
                String inputString = sc.nextLine();
                System.out.print("Result: ");
                System.out.println(WorkWithString.removingSpaces(inputString));
            }
            case 2 -> {
                System.out.print("Input card number (16 digit necessary!): ");
                String inputString = sc.nextLine();
                System.out.print("Result: ");
                System.out.println(WorkWithString.bankcardNumber(inputString.trim()));
            }
            case 3 -> {
                System.out.print("Input name: ");
                String name = sc.nextLine();
                System.out.print("Input surname: ");
                String surname = sc.nextLine();
                System.out.print("Input patronymic if necessary or press enter: ");
                String patronymic = sc.nextLine();
                System.out.println(WorkWithString.formatName(name.trim(), surname.trim(), patronymic.trim()));
            }
            case 4 -> {
                System.out.print("Input passport number: ");
                String number = sc.nextLine();
                System.out.println("Are input number [" + number + "] a Belarusian passport? ->"
                        + WorkWithString.isBelarusPassport(number.trim()));
            }
            case 5 -> {
                System.out.print("Input preferred password: ");
                String password = sc.nextLine();
                System.out.println("Are this password [" + password + "] is strong? -> "
                        + WorkWithString.isStrongPassword(password.trim()));
            }
            case 6 -> {
                System.out.print("Input email address: ");
                String email = sc.nextLine();
                System.out.println("Are input string [" + email.trim() + "] is email? -> "
                        + WorkWithString.isEmail(email.trim()));
            }
            case 0 -> {
                System.out.println("See you!!!");
                return;
            }
            default -> System.out.println("Wrong key!!!");
        }
        while (true) ;
    }
}
