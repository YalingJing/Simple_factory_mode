package com.sfm;

public class nvwaFactory {

    public nvwaFactory(){
    }

    public static Person getPerson(String type){
        //根据type参数值来判断应该调用哪个产品类
        if("M".equals(type)){
            return new Man();
        }
        else if("W".equals(type)){
            return new Woman();
        }
        else if("R".equals(type)){
            return new RoBot();
        }
        else{
            return null;
        }
    }
}
