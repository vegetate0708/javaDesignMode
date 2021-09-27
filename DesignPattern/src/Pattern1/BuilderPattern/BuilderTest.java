package Pattern1.BuilderPattern;

/**
 * Created by lx on 2018/11/8.
 */

public class BuilderTest {
    public static void main(String[] args) {
        LiveDirector liveDirector = new LiveDirector();

        //����
        PersonLive zhongyong = liveDirector.generateLive(new GiftedChildrenBuilder());

        //������
        PersonLive jiangziya = liveDirector.generateLive(new OldSuccessBuilder());
    }
}
