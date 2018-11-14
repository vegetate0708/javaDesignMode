package MementoPattern;

/**
 * �������߶���
 *
 * @author vegetate
 * @create 2018/11/12 17:13
 */
public class MemoRole {
    private int useTime;// ʹ��ʱ��
    private String deviceName;// �豸����
    private int stateLevel;// ״̬

    public MemoRole(String deviceName, int useTime, int stateLevel) {
        super();
        this.useTime = useTime;
        this.deviceName = deviceName;
        this.stateLevel = stateLevel;
    }

    public MemoRole() {
    }

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

    public MemoBean createMemoObject() {
        MemoBean memento = new MemoBean();
        memento.setDeviceName(deviceName);
        memento.setStateLevel(stateLevel);
        memento.setUseTime(useTime);
        return memento;
    }

    public void setMemento(MemoBean memento) {
        this.deviceName = memento.getDeviceName();
        this.stateLevel = memento.getStateLevel();
        this.useTime = memento.getUseTime();
    }

    /**
     * ��ȡ����ǰ״̬
     */
    public void getCurrentState() {
        System.out.println("��ǰ�豸���ƣ�" + this.deviceName + "��ǰʹ��ʱ�䣺" + this.useTime + "��ǰ����״̬��" + this.stateLevel);
    }
}