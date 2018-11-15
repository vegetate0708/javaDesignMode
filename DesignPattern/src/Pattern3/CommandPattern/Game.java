package Pattern3.CommandPattern;

/**
 * Created by lx on 2017/8/26.
 * 执行者角色
 */
public class Game {
    public void toLeft(){
        System.out.println("向左移动");
    }
    public  void toRight(){
        System.out.println("向右移动");
    }
    public void transform(){
        System.out.println("变形");
    }

}