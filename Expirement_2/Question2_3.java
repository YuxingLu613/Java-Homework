package Expirement_2;

import java.util.Scanner;

public class Question2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num < 0 || num > 1000) {
            num = input.nextInt();
        }
        int sumn = 0;
        while (num != 0) {
            sumn += num % 10;
            num = num / 10;
        }
        System.out.println(sumn);
        input.close();
    }

}
