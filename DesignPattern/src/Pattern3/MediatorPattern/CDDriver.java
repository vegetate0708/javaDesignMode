package Pattern3.MediatorPattern;

/**
 * �����࣬һ��ͬ����
 */
public class CDDriver extends Colleague {

    // ������ȡ����������
    private String data = "";

    /**
     * ���캯��
     */
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    /**
     * ��ȡ���̶�ȡ����������
     */
    public String getData() {
        return data;
    }

    /**
     * ��ȡ����
     */
    public void readCD(String data) {
        // ����ǰ����Ƶ��ʾ�����ݣ����ź�������
        this.data = data;
        // ֪ͨ���壬�Լ���״̬�����˸ı�
        getMediator().changed(this);
    }
}
