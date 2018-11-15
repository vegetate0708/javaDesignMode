package Pattern3.VisitorPattern;

/**
 * 〈人力资源部门，具体访问者〉
 *
 * @author vegetate
 * @create 2018/11/15 11:24
 */
/**
 * 具体访问者对象：公司人力资源部<br/>
 * 人力资源部的职责就是负责统计核算员工的每月上班时长
 *
 */
public class HRDepartment extends Department {

    /**
     * 访问公司管理者对象的每月实际上班时长统计
     */
    @Override
    public void visit(ManagerEmployee me) {
        me.getTotalTimeSheet();
    }

    /**
     * 访问公司普通员工对象的每月实际上班时长统计
     */
    @Override
    public void visit(GeneralEmployee ge) {
        ge.getTotalTimeSheet();
    }

}
