package baekjoon;

import java.util.Scanner;

public class Multiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        System.out.println((a * (b % 10) ));
        System.out.println((a * ( (b %100)/10) ));
        System.out.println((a * (b/100) ));
        System.out.println((a * b));
        scanner.close();
    }
}

/*
* import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		br.close();

		StringBuilder sb = new StringBuilder();

		sb.append(A * (B%10));
		sb.append('\n');

		sb.append(A * ((B%100)/10));
		sb.append('\n');

		sb.append(A * (B/100));
		sb.append('\n');

		sb.append(A * B);

		System.out.print(sb);

	}

}
* */
