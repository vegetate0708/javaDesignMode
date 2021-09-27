package Pattern1.BuilderPattern;

/**
 * Created by lx on 2018/11/8.
 */

public class BuilderTest {
    public static void main(String[] args) {
        LiveDirector liveDirector = new LiveDirector();

        //жысю
        PersonLive zhongyong = liveDirector.generateLive(new GiftedChildrenBuilder());

        //╫╙всяю
        PersonLive jiangziya = liveDirector.generateLive(new OldSuccessBuilder());
    }
}
