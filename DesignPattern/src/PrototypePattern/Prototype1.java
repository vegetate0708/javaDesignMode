package PrototypePattern;

import java.util.ArrayList;

/**
 * Created by lx on 2018/11/7.
 */
public class Prototype1 implements Cloneable {
    private ArrayList list = new ArrayList<>();
    //������һ������,ϰ���Եľ���ʹ��List�ӿ�������ArrayList
    //2.��дObject���clone����.
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
