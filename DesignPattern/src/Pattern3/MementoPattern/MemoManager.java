package Pattern3.MementoPattern;

/**
 * ������¼�������
 *
 * @author vegetate
 * @create 2018/11/12 17:11
 */
public class MemoManager {
    MemoBean memento;

    public MemoBean getMemento() {
        return memento;
    }

    public void setMemento(MemoBean memento) {
        this.memento = memento;
    }
}