package Expirement_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question2_4 {
    public static void main(String[] args) {
        Date nowTime = new Date(System.currentTimeMillis());
        SimpleDateFormat sdFormatter = new SimpleDateFormat("HH:mm:dd");
        String retStrFormatNowDate = sdFormatter.format(nowTime);
        System.out.println("当前时间：" + retStrFormatNowDate + " GMT");
    }
}
