package assignment;

import java.util.Scanner;

public class Answer9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float time;
    float mps, kph, mph;

    System.out.print("Input distance in meters: ");
    float distance = sc.nextFloat();

    System.out.print("Input hour: ");
    float hr = sc.nextFloat();

    System.out.print("Input minutes: ");
    float min = sc.nextFloat();

    System.out.print("Input seconds: ");
    float sec = sc.nextFloat();

    time = (hr * 3600) + (min * 60) + sec;
    mps = (distance / time);
    kph = (distance / 1000.0f) / (time / 3600.0f);
    mph = (kph / 1.609f);

    System.out.println("Your speed is " + mps);
    System.out.println("Your speed is " + kph);
    System.out.println("Your speed is " + mph);


    sc.close();
}
}
