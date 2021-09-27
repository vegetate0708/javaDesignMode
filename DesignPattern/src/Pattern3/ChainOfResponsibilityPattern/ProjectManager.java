package Pattern3.ChainOfResponsibilityPattern;

/**
 * Created by lx on 2017/8/26.
 */
public class ProjectManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {

        String str = "";
        //��Ŀ����Ȩ�ޱȽ�С��ֻ����500����
        if (fee < 500) {
            //Ϊ�˲��ԣ��򵥵㣬ֻͬ������������
            if ("����".equals(user)) {
                str = "�ɹ�����Ŀ����ͬ�⡾" + user + "���ľ۲ͷ��ã����Ϊ" + fee + "Ԫ";
            } else {
                //������һ�ɲ�ͬ��
                str = "ʧ�ܣ���Ŀ����ͬ�⡾" + user + "���ľ۲ͷ��ã����Ϊ" + fee + "Ԫ";
            }
        } else {
            //����500���������ݸ�������ߵ��˴���
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return str;
    }

}