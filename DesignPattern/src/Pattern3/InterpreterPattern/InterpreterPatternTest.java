package Pattern3.InterpreterPattern;

/**
 * �������ࡵ
 *
 * @author vegetate
 * @create 2018/11/15 15:32
 */
public class InterpreterPatternTest {
    public static void main(String[] args) {
        //���100 - (1+1) ��ʽ
        int result = new Subtract().interpret(new Context(100,new Add().interpret(new Context(1,1))));
        System.out.println("result = "+result);
    }
}
