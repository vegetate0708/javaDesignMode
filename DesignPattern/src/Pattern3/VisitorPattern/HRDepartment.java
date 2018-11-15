package Pattern3.VisitorPattern;

/**
 * ��������Դ���ţ���������ߡ�
 *
 * @author vegetate
 * @create 2018/11/15 11:24
 */
/**
 * ��������߶��󣺹�˾������Դ��<br/>
 * ������Դ����ְ����Ǹ���ͳ�ƺ���Ա����ÿ���ϰ�ʱ��
 *
 */
public class HRDepartment extends Department {

    /**
     * ���ʹ�˾�����߶����ÿ��ʵ���ϰ�ʱ��ͳ��
     */
    @Override
    public void visit(ManagerEmployee me) {
        me.getTotalTimeSheet();
    }

    /**
     * ���ʹ�˾��ͨԱ�������ÿ��ʵ���ϰ�ʱ��ͳ��
     */
    @Override
    public void visit(GeneralEmployee ge) {
        ge.getTotalTimeSheet();
    }

}
