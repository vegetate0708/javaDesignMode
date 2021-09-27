package Pattern3.VisitorPattern;

/**
 * �����屻�����ߡ�
 *
 * @author vegetate
 * @create 2018/11/15 11:20
 */
public class GeneralEmployee extends Employee {
    // Ա������
    private String name;
    // ÿ���ϰ�ʱ��
    private int timeSheet;
    // ÿ�¹���
    private double wage;
    // ���/�ٵ� �ͷ�ʱ��
    private int punishmentTime;

    public GeneralEmployee(String name, int timeSheet, double wage, int punishmentTime) {
        this.name = name;
        this.timeSheet = timeSheet;
        this.wage = wage;
        this.punishmentTime = punishmentTime;
    }

    @Override
    public void accept(Department department) {
        department.visit(this);
    }

    /**
     * ��ȡÿ�µ��ϰ�ʵ��ʱ�� = ÿ���ϰ�ʱ�� * ÿ���ϰ����� - �ͷ�ʱ��
     *
     * @return
     */
    public int getTotalTimeSheet() {
        return timeSheet * 22 - punishmentTime;
    }

    /**
     * ��ȡÿ��ʵ��Ӧ������ = ÿ�¹̶����� - �ͷ�ʱ�� * 10<br/>
     * <��Ϊ��˾��ͨԱ��  ÿ�ٵ�1Сʱ ��10��Ǯ  �Ӱɣ�  ����>
     *
     * @return
     */
    public double getTotalWage() {
        return wage - punishmentTime * 10;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPunishmentTime() {
        return punishmentTime;
    }

    public void setPunishmentTime(int punishmentTime) {
        this.punishmentTime = punishmentTime;
    }

}
