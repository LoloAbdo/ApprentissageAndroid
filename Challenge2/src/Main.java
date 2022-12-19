import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome, what is your name ?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name + " !\nWould you like to start a game? Yes or No");




        boolean flag = true;
        while (flag) {
            String response = scanner.next();
            switch (response.toLowerCase()) {
                case "yes":
                    System.out.println("Nice !");
                    flag = false;
                    break;
                case "no":
                    System.out.println("Alright pussy");
                    System.exit(0);
                default:
                    System.out.println("Not a valid answer (yes or no)");
            }

//          String reponse = "";
//           do {
//               reponse = scanner.next().toLowerCase();
//           } while(!(reponse.equals("yes") || reponse.equals("no")));

        }

        System.out.println("Guess a number between 1 and 50, you have 5 chances ");
        Random rdn = new Random();
        int answer = rdn.nextInt(50);
        int chances = 0;


        while (chances < 6) {
            int guess = scanner.nextInt();

            if (guess > answer) {
                System.out.println("Nope, hint: the answer is lower ;)");
                chances++;
            } else if (guess < answer) {
                System.out.println("Nope, hint: the answer is higher ;)");
                chances++;
            } else {
                System.out.println("AYO ! Congrats my boiii, you win! ;)");
            }

        }

    }
}