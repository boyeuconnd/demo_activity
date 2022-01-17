package com.npay.demo_activiti.controller;

public class FlowController {
    public static void doSum(int num1, int num2){
        System.out.println(num1+num2);
    }

    public static String doMulti(int num1, int num2){
        return String.valueOf(num1*num2);
    }

}
