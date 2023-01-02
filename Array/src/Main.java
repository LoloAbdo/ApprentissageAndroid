import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        String[] students = new String[5];
//        students[1] = "Loik";
//        students[0] = "Testing";
//        students[2] = "Tom";
//        students[3] = "Brad";
//        students[4] = "Madeline";
//
//        //System.out.println(students[2]);
//
//        String[] employees = {"Meisam", "Tom", "Bob"};
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i<numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }


        String[] names = {"Loik", "Testing", "Bob", "Brad", "Brian"};
        int[] numbers = {123456, 135452, 233553, 90098, 99921};

        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i = 0; i<names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println(numbers[i]);
            }
        }
    }
}