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
        personLive.setBaby("正常婴儿");
    }

    @Override
    public void buildChildren() {
        personLive.setChildren("学习");
    }

    @Override
    public void buildYouth() {
        personLive.setYouth("学习");
    }

    @Override
    public void buildMidLife() {
        personLive.setMidLife("学习");
    }

    @Override
    public void buildOld() {
        personLive.setOld("老有所成");
    }

    @Override
    public PersonLive getPerson() {
        return personLive;
    }
}
