package com.chenzhaowen;

/**
 * Created by chenzhaowen on 2017/5/17.
 */
public class test implements Test1{

    public String name;
    protected String work;
    private int income = 10000;

    public test() {

    }

    @Override
    public void age() {             //default方法在接口实现类里面需要覆写
        Test1.super.age();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected String getWork(String work){
        return work;
    }

    protected void setWork(String work){
        this.work = work;
    }

    public int getIncome() {
        return income;
    }
}
