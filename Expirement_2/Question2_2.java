package Expirement_2;

public class Question2_2 {
    public static void main(String[] args) {
        int a=20, b=3, c=4, d = 5;
        int value1, value2, value3;
        value2 = a+++b;
        value1 = a+ ++b;
        value3 = a++ +b;
        System.out.println("value1=" + value1
                + ", value2=" + value2
                + ", value3=" + value3);
        boolean x, y;
        x = !(c>d) || b*c>a && a>b;
        y = c==d && b>c+d || a-b>c+d && !x;
        System.out.println("x=" + x + ", y=" + y);
    }
}
