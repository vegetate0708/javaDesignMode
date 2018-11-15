package Pattern3.VisitorPattern;

/**
 * ����������ߡ�
 *  ��˾���ţ������ߣ�������
 * @author vegetate
 * @create 2018/11/15 11:19
 */

public abstract class Department {

    // ����һ�����صķ��ʷ��������ڷ��ʲ�ͬ���͵ľ���Ԫ�أ�����ָ���ǲ�ͬ��Ա����

    /**
     * ���󷽷� ���ʹ�˾�����߶���<br/>
     * ������ʶ����ʲô  ���ɾ���ķ��������ࣨ����ָ���ǲ�ͬ�ľ��岿�ţ�ȥʵ��
     * @param me
     */
    public abstract void visit(ManagerEmployee me);

    /**
     * ���󷽷� ���ʹ�˾��ͨԱ������<br/>
     * ������ʶ����ʲô  ���ɾ���ķ��������ࣨ����ָ���ǲ�ͬ�ľ��岿�ţ�ȥʵ��
     * @param ge
     */
    public abstract void visit(GeneralEmployee ge);

}