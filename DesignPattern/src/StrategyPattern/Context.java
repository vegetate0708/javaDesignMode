package StrategyPattern;

/**
 * 〈Context角色类〉
 *
 * @author vegetate
 * @create 2018/11/9 15:15
 */
public class Context {
    private Strategy strategy;
    //构造函数，要你使用哪种方式去上班
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    public void operate(){
        this.strategy.operate();
    }

}