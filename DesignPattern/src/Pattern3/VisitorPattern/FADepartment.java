package Pattern3.VisitorPattern;

/**
 * ����������ߡ�
 * ��������߶��󣺹�˾����<br/>
 * ���񲿵�ְ����Ǹ���ͳ�ƺ���Ա���Ĺ���
 *
 * @author vegetate
 * @create 2018/11/15 11:22
 */

public class FADepartment extends Department {

    /**
     * ���ʹ�˾�����߶����ÿ�¹���
     */
    @Override
    public void visit(ManagerEmployee me) {
        double totalWage = me.getTotalWage();
        System.out.println("������: " + me.getName() +
                "  �̶����� =" + me.getWage() +
                ", �ٵ�ʱ�� " + me.getPunishmentTime() + "Сʱ" +
                ", ʵ������=" + totalWage);
    }

    /**
     * ���ʹ�˾��ͨԱ�������ÿ�¹���
     */
    @Override
    public void visit(GeneralEmployee ge) {
        double totalWage = ge.getTotalWage();
        System.out.println("��ͨԱ��: " + ge.getName() +
                "  �̶����� =" + ge.getWage() +
                ", �ٵ�ʱ�� " + ge.getPunishmentTime() + "Сʱ" +
                ", ʵ������=" + totalWage);
    }

}
