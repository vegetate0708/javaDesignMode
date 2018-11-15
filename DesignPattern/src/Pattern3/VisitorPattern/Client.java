package Pattern3.VisitorPattern;

/**
 * �������ࡵ
 *
 * @author vegetate
 * @create 2018/11/15 11:24
 */
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee mep1,mep2,gep1,gep2,gep3;
        // ������1
        mep1 = new ManagerEmployee("����", 8, 20000, 10);
        // ������2
        mep2 = new ManagerEmployee("л����", 8, 15000, 15);
        // ��ͨԱ��1
        gep1 = new GeneralEmployee("С��", 8, 8000, 8);
        // ��ͨԱ��2
        gep2 = new GeneralEmployee("С��", 8, 8500, 12);
        // ��ͨԱ��3
        gep3 = new GeneralEmployee("С��", 8, 7500, 0);

        employeeList.add(mep1);
        employeeList.add(mep2);
        employeeList.add(gep1);
        employeeList.add(gep2);
        employeeList.add(gep3);

        // ���� �Թ�˾Ա���Ĺ��ʺ���/����
        FADepartment department = new FADepartment();
        for(Employee employee : employeeList){
            employee.accept(department);
        }
    }

}
