package Expirement_2;

import java.util.Scanner;

public class Question2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year % 4 == 0 && year % 400 != 0) {
            System.out.println(year + "年不是闰年");
        } else if (year % 4 == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
        scan.close();
    }
}
