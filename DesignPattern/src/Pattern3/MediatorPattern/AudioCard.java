package Pattern3.MediatorPattern;

/**
 * �����࣬һ��ͬ����
 */
public class AudioCard extends Colleague {

    /**
     * ���캯��
     */
    public AudioCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * ������Ƶ����
     */
    public void play(String data) {
        System.out.println("��������" + data);
    }
}

