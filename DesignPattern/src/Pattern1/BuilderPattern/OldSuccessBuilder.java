package Pattren1.BuilderPattern;

/**
 * Created by lx on 2018/11/8.
 */

public class OldSuccessBuilder implements LiveBuilder {
    private PersonLive personLive;

    public OldSuccessBuilder(){
        personLive = new PersonLive();
    }

    @Override
    public void buildBaby() {
        personLive.setBaby("����Ӥ��");
    }

    @Override
    public void buildChildren() {
        personLive.setChildren("ѧϰ");
    }

    @Override
    public void buildYouth() {
        personLive.setYouth("ѧϰ");
    }

    @Override
    public void buildMidLife() {
        personLive.setMidLife("ѧϰ");
    }

    @Override
    public void buildOld() {
        personLive.setOld("��������");
    }

    @Override
    public PersonLive getPerson() {
        return personLive;
    }
}
