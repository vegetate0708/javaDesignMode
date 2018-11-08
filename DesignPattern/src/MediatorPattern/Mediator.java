package MediatorPattern;

/**
 * 中介者接口
 */
public interface Mediator {
    /**
     * 同事对象在自身改变的时候来通知中介者的方法 让中介者去负责相应的与其他同事对象的交互
     */
    public void changed(Colleague c);
}
