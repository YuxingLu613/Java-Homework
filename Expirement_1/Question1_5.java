package Expirement_1;

public class Question1_5 {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x = x + 1) {
            for (int y = 1; y <= x; y = y + 1) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
