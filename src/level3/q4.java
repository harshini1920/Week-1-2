package level3;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double t1 = sc.nextDouble();
        double t2 = sc.nextDouble();

        double totalDistance = (d1 + d2) * 1.6;
        double totalTime = t1 + t2;

        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity + " is " +
                totalDistance + " km and the Total Time taken is " +
                totalTime + " minutes");

        sc.close();
    }
}
