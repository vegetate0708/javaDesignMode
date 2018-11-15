package Pattern3.ChainOfResponsibilityPattern;

/**
 * Created by lx on 2017/8/26.
 */
public class DeptManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {

        String str = "";
        //���ž����Ȩ��ֻ����1000����
        if(fee < 1000)
        {
            //Ϊ�˲��ԣ��򵥵㣬ֻͬ������������
            if("����".equals(user))
            {
                str = "�ɹ������ž���ͬ�⡾" + user + "���ľ۲ͷ��ã����Ϊ" + fee + "Ԫ";
            }else
            {
                //������һ�ɲ�ͬ��
                str = "ʧ�ܣ����ž���ͬ�⡾" + user + "���ľ۲ͷ��ã����Ϊ" + fee + "Ԫ";
            }
        }else
        {
            //����1000���������ݸ�������ߵ��˴���
            if(getSuccessor() != null)
            {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return str;
    }

}