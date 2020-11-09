package doit.woteco.practice;


import java.util.Scanner;

public class Withdraw {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        int tmp = 0;
        int[] money_standard = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] money_count = new int[9];

        for (int i = 0; i < money_standard.length; i++) {
            money_count[i] += money / money_standard[i];
            money %= money_standard[i];
        }

        for (int j = 0; j < money_count.length; j++)
            System.out.print(money_count[j] + " ");
    }
}
