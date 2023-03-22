//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

import java.util.Scanner;
public class Lab8A {
    public static int recursive_multiply(int first, int second) {
        second--;
        if (second == 0) {
            return first;
        }
        else {
            return (first + recursive_multiply(first, second));
        }
    }

    public static int recursive_div(int first, int second) {
        if (first == 0) {
            return 0;
        }
        else {
            return (1 + recursive_div((first-second), second));
        }
    }

    public static int recursive_mod(int first, int second) {
        if (second == 0) {
            return (-1);
        }
        else if (first < second) {
            return first;
        }
        else {
            return recursive_mod((first - second), second);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean boolStop = false;

        //main loop
        do {
            System.out.println("Choose from the following:\n0. Quit\n1. Multiply 2 numbers\n2. Div 2 numbers\n3. Mod 2 numbers");
            int intInput = Integer.parseInt(scan.nextLine());
            if (intInput == 0) {
                return;
            }
            System.out.println("Enter first number");
            int first = Integer.parseInt(scan.nextLine());
            System.out.println("Enter second number");
            int second = Integer.parseInt(scan.nextLine());
            System.out.print("Answer: ");
            switch (intInput) {
                case 1:
                    System.out.println(recursive_multiply(first, second));
                    break;
                case 2:
                    System.out.println(recursive_div(first, second));
                    break;
                case 3:
                    System.out.println(recursive_mod(first, second));
                    break;
                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }
        } while (!boolStop);
    }
}