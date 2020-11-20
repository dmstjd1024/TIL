import java.util.Scanner;

public class DayOfYear {

    static int[][] mdays = {
            {31,28,31, 30,31, 30,31,31, 30,31, 30, 31},
            {31,29,31, 30,31, 30,31,31, 30,31, 30, 31}
    };


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("그 해 경과");

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.printf("그 해 %d일", dayOfYear(year, month, day));

    }
    static int dayOfYear(int y, int m, int d) {
        while (--m != 0)
            d += mdays[isLeap(y)][m - 1];
        return (d);
    }

    static int leftDayOfYear(int y, int m, int d){
        while(--m != 0)
            d += mdays[isLeap(y)][m-1];
        return 365 - isLeap(y) - d;
    }

    private static int isLeap(int y) {
        return (y %4 == 0 && y % 100 !=0 || y %400 == 0) ? 1 : 0;
    }
}

