package com.example.demo;
import java.lang.*;
public class Test implements Runnable {

    @Override
    public void run(){
        int i=0;
        while(i<1000000){
            System.out.println(i);
        }
    }

}