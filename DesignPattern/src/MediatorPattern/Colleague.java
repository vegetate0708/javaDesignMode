package MediatorPattern;

/**
 * ����ͬ����
 */
public abstract class Colleague {

    // ����һ���н��߶���
    private Mediator mediator;

    /**
     * ���캯��
     */
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * ��ȡ��ǰͬ�����Ӧ���н��߶���
     */
    public Mediator getMediator() {
        return mediator;
    }
}

