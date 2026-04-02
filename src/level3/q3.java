package level3;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salary;
        int bonus;

        System.out.print("Enter salary: ");
        salary = input.nextInt();

        System.out.print("Enter bonus: ");
        bonus = input.nextInt();

        int totalIncome = salary + bonus;

        System.out.printf("The salary is INR %d and bonus is INR %d. Hence Total Income is INR %d",
                salary, bonus, totalIncome);

        input.close();
    }

}




