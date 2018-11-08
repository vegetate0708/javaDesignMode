package PrototypePattern;

import java.util.ArrayList;

/**
 * Created by lx on 2018/11/7.
 */
public class Prototype1 implements Cloneable {
    private ArrayList list = new ArrayList<>();
    //但是有一个问题,习惯性的经常使用List接口来代替ArrayList
    //2.重写Object类的clone方法.
    public Prototype1 clone(){
        Prototype1 prototype1=null;
        try{
               prototype1=(Prototype1)super.clone();
               prototype1.list=(ArrayList)this.list.clone();
            }catch(CloneNotSupportedException e){
                    e.printStackTrace();
            }
        return prototype1;
    }

}
