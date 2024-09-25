import java.util.Scanner;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter number of movies?");
    int arrayVal = scanner.nextInt();

    String[] movies = new String[arrayVal];

    for(int i = 0; i < arrayVal; i++){
        System.out.println("Please enter a movie?");
        movies[i] = scanner.next();
    }

    for (String movie : movies) {
        System.out.println(movie);
    }





       //String[] fruits = {"Apple", "Banana", "Orange", "Grapes"};
       //System.out.println("For each loop output: ");

       //for (String name : fruits) {
       //    System.out.println(name);
       //}


       // int num = 1;

        // for (num = 1; num < 11; num++) {
        //    System.out.println(num);
        // }

        //while (num = 1) {
        //  System.out.println(num);
        //  num = num + 1;
        //}

    }
}
