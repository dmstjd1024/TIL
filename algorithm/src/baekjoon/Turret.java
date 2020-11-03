package baekjoon;

import java.util.Scanner;

public class Turret {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int x[] = new int[3];
            int y[] = new int[3];
            int r[] = new int[3];

            for (int i = 1; i <= 2; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
                r[i] = sc.nextInt();
            }
            double dotDistance = Math.sqrt(Math.pow(x[1] - x[2], 2) + Math.pow(y[1] - y[2], 2));
            int circleSum = r[1] + r[2];
            int circleSub = Math.abs(r[1] - r[2]);
            if (dotDistance == 0 && circleSub == 0) {
                System.out.println(-1);
            } else if (dotDistance < circleSub || dotDistance > circleSum) {
                System.out.println(0);
            } else if (dotDistance == circleSub || dotDistance == circleSum) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        } sc.close();
    }

}
