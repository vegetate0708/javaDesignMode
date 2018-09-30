package MediatorPattern;

/**
 * 抽象同事类
 */
public abstract class Colleague {

    // 持有一个中介者对象
    private Mediator mediator;

    /**
     * 构造函数
     */
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 获取当前同事类对应的中介者对象
     */
    public Mediator getMediator() {
        return mediator;
    }
}

