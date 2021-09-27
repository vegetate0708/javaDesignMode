package Pattern1.BuilderPattern;

/**
 * Created by lx on 2018/11/8.
 */

public class GiftedChildrenBuilder implements LiveBuilder {
    private PersonLive personLive;

    public GiftedChildrenBuilder() {
        personLive = new PersonLive();
    }

    @Override
    public void buildBaby() {
        personLive.setBaby("与众不同");
    }

    @Override
    public void buildChildren() {
        personLive.setChildren("脱颖而出");
    }

    @Override
    public void buildYouth() {
        personLive.setYouth("随父炫耀");
    }

    @Override
    public void buildMidLife() {
        personLive.setMidLife("泯然众人矣");
    }

    @Override
    public void buildOld() {
        personLive.setOld("泯然众人矣");
    }

    @Override
    public PersonLive getPerson() {
        return personLive;
    }
}
