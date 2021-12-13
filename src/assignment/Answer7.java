package assignment;

import java.util.Scanner;

public class Answer7 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input first floatingPoint number: ");
            double num1 = input.nextDouble();
            System.out.print("Input second floatingPoint number: ");
            double num2 = input.nextDouble();
            input.close();

            if (Math.abs(num1 - num2) <= 0.01) {
                System.out.println("These numbers are the same.");
            }
            else {
                System.out.println("These numbers are different.");
            }
        }
    }