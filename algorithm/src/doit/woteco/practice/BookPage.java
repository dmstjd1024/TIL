package doit.woteco.practice;

import static java.lang.Math.max;

public class BookPage {

    public static void main(String[] args) {

        int[] pobi = {97, 98};
        int[] crong = {131, 132};

        int score1 = score(crong);

    }

    static int score(int[] input) {

        int max = 0;
        int[] num = new int[input.length];

        for (int i = 0; i < input.length; i++) {

            String[] split = String.valueOf(input[i]).split("");

            for (int j = 0; j < split.length; j++) {
                num[j] += Integer.parseInt(split[i]);
                System.out.println(num[j]);
            }

            int sum = 0;
            int sum1 = 0;
            int mul = 1;
            int mul1 = 1;

            for (int j : num) {
//                System.out.println(j);
                sum += j;
                sum1 += j;
                mul *= j;
                mul1 *= j;
            }
//            System.out.println(sum+ ", "+ sum1 + "," + mul +", "+ mul1);
            int result = max(max(sum, mul), max(sum1, mul1));

            if (result > max) {
                max = result;
            }
        }
        return max;
    }
}
