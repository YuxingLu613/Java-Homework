package Expirement_2;

import java.util.Scanner;
import java.util.Random;

public class Question2_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("你出什么？（石头（2）、剪刀（1）、布（0））：");
        int gamenum = scan.nextInt();
        Random rand = new Random();
        int systemnum = rand.nextInt(3);
        System.out
                .println("计算机出的是：" + What(systemnum) + "," + "你出的是：" + What(gamenum) + "," + Judge(gamenum, systemnum));
        scan.close();
    }

    public static String Judge(int player, int system) {
        if (player == system) {
            return "平局";
        }
        if (player - system == 1 || player - system == -2) {
            return "你赢了";
        } else {
            return "你输了";
        }
    }

    public static String What(int systemnum) {
        String systemplay = null;
        if (systemnum == 0) {
            systemplay = "布";
        } else if (systemnum == 1) {
            systemplay = "剪刀";
        } else {
            systemplay = "石头";
        }
        return systemplay;
    }
}
