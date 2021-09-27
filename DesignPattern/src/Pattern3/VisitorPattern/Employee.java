package Pattern3.VisitorPattern;

/**
 * 〈抽象被访问者〉
 *
 * @author vegetate
 * @create 2018/11/15 11:18
 */

public abstract class Employee {

    /**
     * 接收/引用一个抽象访问者对象
     *
     * @param department 抽象访问者 这里指的是公司部门如 人力资源部、财务部
     */
    public abstract void accept(Department department);
}