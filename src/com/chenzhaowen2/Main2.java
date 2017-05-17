package com.chenzhaowen2;

import com.chenzhaowen.extendClass1;
/**
 * Created by chenzhaowen on 2017/5/17.
 */
public class Main2 {
    public static void main(String[] args){
        extendClass1 BasicTest2 = new extendClass1();
        BasicTest2.setName("xiaohong");
        //BasicTest2.setWork();//由于setWork为protected，外部无法访问
        System.out.println("name:"+BasicTest2.getName());
        //System.out.println("work:"+BasicTest2.getWork());//由于getWork属性为protected，所以本行代码无法通过编译
        BasicTest2.age();
        System.out.println("income:"+BasicTest2.getIncome());
    }
}
