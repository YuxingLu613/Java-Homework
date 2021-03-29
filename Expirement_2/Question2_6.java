package Expirement_2;

import java.util.Scanner;

public class Question2_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstnum = scan.nextInt();
        int maxn = firstnum;
        int minn = firstnum;
        for (int i = 0; i < 3; i++) {
            int newnum = scan.nextInt();

            if (newnum > maxn) {
                maxn = newnum;
            }
            if (newnum < minn) {
                minn = newnum;
            }
        }
        System.out.println("max=" + maxn + "\n" + "min=" + minn);
        scan.close();
    }
}
