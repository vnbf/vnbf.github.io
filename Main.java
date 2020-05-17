package com.SQAST;

import java.text.SimpleDateFormat;
import java.util.Date;
//白盒测试实验(1707温炳峰201702801414)
public class Main {
    public static void main(String[] args){
        MyDate myDate = new MyDate();
        String nextDate = myDate.getNextDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("当前的日期："+"2020-05-01");
        System.out.println("下一天日期："+nextDate);
		System.out.println("明 天日期："+nextDate);
    }
}
