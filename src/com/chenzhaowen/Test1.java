package com.chenzhaowen;

/**
 * Created by chenzhaowen on 2017/5/17.
 */
public interface Test1 {
    default void age(){
        System.out.println("Age : 24");
    }
}
