package Pattern3.MementoPattern;

/**
 * ������¼�����ࡵ
 *
 * @author vegetate
 * @create 2018/11/12 17:08
 */
public class MemoBean {
    private int useTime;//ʹ��ʱ��
    private String deviceName;//�豸����
    private int stateLevel;//״̬
    public int getUseTime() {
        return useTime;
    }
    public void setUseTime(int useTime) {
        this.useTime = useTime;
    }
    public String getDeviceName() {
        return deviceName;
    }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public int getStateLevel() {
        return stateLevel;
    }
    public void setStateLevel(int stateLevel) {
        this.stateLevel = stateLevel;
    }

}