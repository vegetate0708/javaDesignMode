package Pattern3.VisitorPattern;

/**
 * �����󱻷����ߡ�
 *
 * @author vegetate
 * @create 2018/11/15 11:18
 */

public abstract class Employee {

    /**
     * ����/����һ����������߶���
     *
     * @param department ��������� ����ָ���ǹ�˾������ ������Դ��������
     */
    public abstract void accept(Department department);
}