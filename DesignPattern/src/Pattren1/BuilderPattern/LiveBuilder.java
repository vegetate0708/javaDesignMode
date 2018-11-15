package Pattren1.BuilderPattern;

/**
 * Created by lx on 2018/11/8.
 */
public interface LiveBuilder {
    public void buildBaby();
    public void buildChildren();
    public void buildYouth();
    public void buildMidLife();
    public void buildOld();

    public PersonLive getPerson();

}
