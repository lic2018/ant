package com.ant.test;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
public class TestDemo {

    public static void main(String[] args) {
        Man man = new Man();
        man.setId(1);
        man.setName("nihao");
        System.out.println("结果："+man.toString());
    }
}
