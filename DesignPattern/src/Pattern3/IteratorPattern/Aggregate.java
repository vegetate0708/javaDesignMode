package Pattern3.IteratorPattern;

/**
 * 〈工厂方法，创建相应迭代子对象的接口〉
 *
 * @author vegetate
 * @create 2018/11/9 17:08
 */

public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();

}