import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int function = 0;

        //int a = 10;
        System.out.println("Please enter your first number");
        int a = scanner.nextInt();

        //int b = 5;
        System.out.println("Please enter your second number");
        int b = scanner.nextInt();

        //int sum = a + b;
        //int difference = a - b;
        //int product = a * b;
        //double quotient = a / b;

        System.out.println("What arithmetic function would you like? (1 = sum, 2 = difference, 3 = product or 4 = quotient)");
        int arithmetic = scanner.nextInt();
        System.out.println(arithmetic);

        if (arithmetic == 1) {
            function = a + b;
            //System.out.println(a + b);
        } else if (arithmetic == 2) {
            function = a - b;
            //System.out.println(a - b);
        } else if (arithmetic == 3) {
            function = a* b;
            //System.out.println(a * b);
        } else if (arithmetic == 4) {
            function = a / b;
            //System.out.println(a / b);
        } else {
            System.out.println("Valid");
        }

       System.out.println("The result is: " + function);


        //System.out.println(" Sum: " + sum + " \n Difference: " + difference + " \n Product: " + product + " \n Quotient: " + quotient);

    }
}
