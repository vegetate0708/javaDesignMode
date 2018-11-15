package Pattern3.IteratorPattern;

/**
 * ����������ӽ�ɫ�ࡵ
 *
 * @author vegetate
 * @create 2018/11/9 17:09
 */

public interface Iterator {
    /**
     * �����������ƶ�����һ��Ԫ��
     */
    public void first();
    /**
     * �����������ƶ�����һ��Ԫ��
     */
    public void next();
    /**
     * �����������Ƿ�Ϊ���һ��Ԫ��
     */
    public boolean isDone();
    /**
     * ����������������ǰԪ��
     */
    public Object currentItem();

}