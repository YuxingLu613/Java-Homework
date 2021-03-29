package Expirement_2;

import java.util.Scanner;

public class Question2_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inum= scan.nextInt();
        String numo="";
        while(inum!=0) {
            numo += Integer.toString(inum % 2);
            inum /= 2;
        }
        StringBuffer sb=new StringBuffer(numo);
        System.out.println(sb.reverse());
    }

    }
