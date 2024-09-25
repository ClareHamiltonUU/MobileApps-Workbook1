import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //char initial;
        System.out.println("Please enter your first initial");
        char initial = scanner.next().charAt(0);

        //String lName = "Smith";
        System.out.println("Please enter your surname");
        String lName = scanner.next();

        //int age = 25;
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        //double salary = 21000;
        System.out.println("Please enter your salary");
        double salary = scanner.nextDouble();


        System.out.println("Are you currently employed? (True/False)");
        boolean isEmployed = scanner.nextBoolean();

        String employed;

        if (isEmployed) {
            employed =  "employed";
        } else {
            employed = "unemployed";
        }

        System.out.println(initial + " " + lName + " is " + age + " years old, is currently " + employed + " and has a salary of £" + salary + " per year. ");

    }
}

