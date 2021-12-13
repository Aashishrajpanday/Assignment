package assignment;

public class Answer5d {
        public static void main(String[] args) {
            int n = 5;
            for (int i = n; i > 0; i--) {
                for (int b = i; b < n; b++)
                    System.out.print("  ");
                for (int a = 2 * i; a > 1; a--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

