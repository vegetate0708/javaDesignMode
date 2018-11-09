package StrategyPattern;

/**
 * ��Context��ɫ�ࡵ
 *
 * @author vegetate
 * @create 2018/11/9 15:15
 */
public class Context {
    private Strategy strategy;
    //���캯����Ҫ��ʹ�����ַ�ʽȥ�ϰ�
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