package com.SQAST;

import java.text.SimpleDateFormat;
import java.util.Date;
//�׺в���ʵ��(1707�±���201702801414)
public class Main {
    public static void main(String[] args){
        MyDate myDate = new MyDate();
        String nextDate = myDate.getNextDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("��ǰ�����ڣ�"+"2020-05-01");
        System.out.println("��һ�����ڣ�"+nextDate);
		System.out.println("�� �����ڣ�"+nextDate);
    }
}
