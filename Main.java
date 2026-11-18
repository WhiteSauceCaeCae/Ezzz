package question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Cozy Nights Monarch mattress",
                          "Restonic Barbados mattress",
                          "Sealy Phuket mattress"};
        int months = 3;
        int[][] sales = new int[names.length][months];

        Scanner in = new Scanner(System.in);
        for (int p = 0; p < names.length; p++) {
            for (int m = 0; m < months; m++) {
                System.out.print("Enter number of sales for month " + (m + 1) + " for " + names[p] + ": ");
                sales[p][m] = in.nextInt();
            }
        }

        IProduct product = new Product(names, sales);
        new PrintProduct(product).printReport(2026);
    }
}
