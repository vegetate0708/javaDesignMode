package MediatorPattern;

/**
 * �Կ��࣬һ��ͬ����
 */
public class VideoCard extends Colleague {

    /**
     * ���캯��
     */
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * ��ʾ��Ƶ����
     */
    public void display(String data) {
        System.out.println("�����ڹۿ����ǣ�" + data);
    }
}

