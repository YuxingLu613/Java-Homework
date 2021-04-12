package Expirement_3;

public class Student {
    private int number;
    private String name;
    private int age;
    private static int cnt = 0;

    public Student() {
    }

    public Student(int number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
        cnt++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getCnt() {
        return cnt;
    }


}
