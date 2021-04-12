package Expirement_3;

import org.jetbrains.annotations.NotNull;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public MyInteger() {
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return this.value % 2 == 1;
    }

    public boolean isPrime(){
        for(int i=2;i<this.value;i++){
            if(this.value%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int test) {
        return test % 2 == 0;
    }

    public static boolean isOdd(int test) {
        return test % 2 == 1;
    }

    public static boolean isPrime(int test){
        for(int i=2;i<test;i++){
            if(test%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger m){
        return m.getValue()%2==0;
    }

    public static boolean isOdd(MyInteger m){
        return m.getValue()%2!=0;
    }

    public static boolean isPrime(MyInteger m){
        for(int i=2;i<m.getValue();i++){
            if(m.getValue()%i==0){
                return false;
            }
        }
        return true;
    }

    public boolean equals(int o) {
        return this.value == o;
    }

    public boolean equals(MyInteger m) {
        if (this.value == m.value) return true;
        if (getClass() != m.getClass()) return false;
        return false;
    }

    public int parseInt(char @NotNull [] c){
        return c.length;
    }

    public int parseInt(String s){
        return Integer.parseInt(s,16);
    }


}
