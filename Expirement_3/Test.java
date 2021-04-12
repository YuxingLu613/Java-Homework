package Expirement_3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Person colton = new Person("colton", 20);
        colton.speak();
        Person yuan = new Person();
        yuan.setAge(19);
        yuan.setName("yuan");
        yuan.speak();

        System.out.println("-----------------------");

        Circle circlea = new Circle(2, 3, 1.0);
        System.out.println(circlea.getArea());
        System.out.println(circlea.getPerimeter());

        System.out.println("-----------------------");

        Student lyx = new Student(1818401001, "lyx", 20);
        Student llx = new Student(1827405138, "llx", 20);
        System.out.println(lyx);
        System.out.println(llx);
        lyx.setAge(21);
        System.out.println(lyx);
        System.out.println(llx.getCnt());

        System.out.println("-----------------------");

        Stock stocka = new Stock("111", "abc", 100, 200);
        System.out.println(stocka.getChangePercent());

        System.out.println("-----------------------");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        QuadraticEquation q1 = new QuadraticEquation(a, b, c);
        if (q1.getDiscriminant() > 0) {
            System.out.println(q1.getRoot1());
            System.out.println(q1.getRoot2());
        } else if (q1.getDiscriminant() == 0) {
            System.out.println(q1.getRoot1());
        } else {
            System.out.println("方程无根");
        }

        System.out.println("-----------------------");

        MyInteger my=new MyInteger(2);
        System.out.println(my.getValue());
        System.out.println(my.equals(3));
        MyInteger your=new MyInteger(3);
        System.out.println(my.equals(your));
        System.out.println(my.parseInt("a"));

    }
}
