package Expirement_2;

public class Question2_1 {
     public static void main(String[] args) {
          // 定义变量
          char c = 'a';
          byte b = 10;
          int i = 100;
          long l = 1000l;
          float f = 2.72f;
          double d = 3.14159;
          // 自动类型转换
          int ii = c + i;
          long ll = l - ii;
          float ff = f * b;
          double dd = ff / i + d;
          // 强制类型转换
          byte bb = (byte) i;
          int iii = (int) ll;
          // 显示
          System.out.println("ii=" + ii + ", ll=" + ll + ", ff=" + ff + ", dd=" + dd);
          System.out.println("bb=" + bb + ", iii=" + iii);
     }
}
