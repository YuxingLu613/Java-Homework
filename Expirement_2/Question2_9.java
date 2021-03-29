package Expirement_2;

public class Question2_9 {
    public static void main(String[] args) {
        for (int a = 1; a <=1000; a++) {
            int sum = 1;
            for (int b = 2; b <a ; b++) {
                if ( a % b == 0 )
                    sum = sum +b;
            }
            if (sum == a)
                System.out.println("完全数为"+a);
        }
    }
}
