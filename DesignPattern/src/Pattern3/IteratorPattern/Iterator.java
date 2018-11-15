package Pattern3.IteratorPattern;

/**
 * 〈抽象迭代子角色类〉
 *
 * @author vegetate
 * @create 2018/11/9 17:09
 */

public interface Iterator {
    /**
     * 迭代方法：移动到第一个元素
     */
    public void first();
    /**
     * 迭代方法：移动到下一个元素
     */
    public void next();
    /**
     * 迭代方法：是否为最后一个元素
     */
    public boolean isDone();
    /**
     * 迭代方法：返还当前元素
     */
    public Object currentItem();

}