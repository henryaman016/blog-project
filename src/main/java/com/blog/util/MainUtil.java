package com.blog.util;

public class MainUtil {
    public static void main(String[] args) {
      new MainUtil().test().test2();
//        mainUtil.test();
    }

    public MainUtil test(){
       return new MainUtil();
    }
    public void test2(){
        System.out.println(200);
    }
}
