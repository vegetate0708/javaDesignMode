package StatePattern;

/**
 * Created by lx on 2017/8/22.
 */
public interface CarState {
    public void upSpeed();//加速
    public void downSpeed();//减速
    public void turnOnLight();//开灯
    public void turnDownLight();//关灯
}
