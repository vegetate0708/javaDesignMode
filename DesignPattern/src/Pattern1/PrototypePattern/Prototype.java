package Pattren1.PrototypePattern;

/**
 * Created by lx on 2018/11/7.
 * Ç³¿½±´
 */
 public class Prototype implements Cloneable{
    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;

    }
}
