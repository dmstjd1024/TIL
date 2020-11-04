package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class YoungPrince {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(bufferedReader.readLine());

        while (t-- > 0) {
            int answer = 0;

            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(bufferedReader.readLine());

            Plant[] arr = new Plant[n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(bufferedReader.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int radius = Integer.parseInt(st.nextToken());


                boolean check1 = false;
                boolean check2 = false;

                if ( Math.pow(startX - x, 2) + Math.pow(startY -y, 2) > Math.pow(radius, 2))
                    check1 = true;
                if ( Math.pow(endX - x, 2) - Math.pow(endY -y, 2) > Math.pow(radius, 2))
                    check2 = true;

                if(check1 && !check2){
                    answer ++;
                }
                else if(!check1 && check2){
                    answer ++;
                }
            }
            bufferedWriter.write(answer + "\n");

        }
        bufferedReader.close();
        bufferedWriter.close();
    }

}

class Plant {
    int x;
    int y;
    int radius;

    public Plant(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
}