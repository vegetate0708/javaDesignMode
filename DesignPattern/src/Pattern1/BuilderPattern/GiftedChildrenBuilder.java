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
        personLive.setBaby("���ڲ�ͬ");
    }

    @Override
    public void buildChildren() {
        personLive.setChildren("��ӱ����");
    }

    @Override
    public void buildYouth() {
        personLive.setYouth("�游��ҫ");
    }

    @Override
    public void buildMidLife() {
        personLive.setMidLife("��Ȼ������");
    }

    @Override
    public void buildOld() {
        personLive.setOld("��Ȼ������");
    }

    @Override
    public PersonLive getPerson() {
        return personLive;
    }
}
