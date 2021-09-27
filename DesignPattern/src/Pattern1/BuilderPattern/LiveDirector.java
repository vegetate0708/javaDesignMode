package Pattern1.BuilderPattern;

/**
 * Created by lx on 2018/11/8.
 */

public class LiveDirector {
    public PersonLive generateLive(LiveBuilder liveBuilder) {
        liveBuilder.buildBaby();
        liveBuilder.buildChildren();
        liveBuilder.buildYouth();
        liveBuilder.buildMidLife();
        liveBuilder.buildOld();
        return liveBuilder.getPerson();
    }
}
