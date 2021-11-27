package com.sfm;

import java.util.Scanner;

public class client {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入要造的人类型的参数：");
        String parameter = s.nextLine();
        Person p = nvwaFactory.getPerson(parameter);
        assert p != null;
        p.makePeople();
    }
}
