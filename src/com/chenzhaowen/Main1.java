package com.chenzhaowen;

/**
 * Created by chenzhaowen on 2017/5/17.
 */
public class Main1 {
    public static void main(String[] args){
        extendClass1 BasicTest = new extendClass1("xiaoming","student");
        System.out.println("name:"+BasicTest.getName());
        System.out.println("work:"+BasicTest.getWork());//由于getWork属性为protected，所以本行代码无法通过编译
        BasicTest.age();
        System.out.println("income:"+BasicTest.getIncome());
    }
}
