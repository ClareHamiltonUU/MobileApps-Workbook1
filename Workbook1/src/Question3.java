import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //int num = 4;
        System.out.println("Please enter a number");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("Do you want to continue? (Y/N)");
        char next = scanner.next().charAt(0);

        if (next == 'Y' || next == 'y') {
            System.out.println("Please enter a number");
            int num2 = scanner.nextInt();

            if (num2 % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } else {
            System.out.println("Thank you");
    }
}
}

