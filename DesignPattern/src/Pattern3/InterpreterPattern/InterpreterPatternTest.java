package Pattern3.InterpreterPattern;

/**
 * 〈测试类〉
 *
 * @author vegetate
 * @create 2018/11/15 15:32
 */
public class InterpreterPatternTest {
    public static void main(String[] args) {
        //完成100 - (1+1) 算式
        int result = new Subtract().interpret(new Context(100,new Add().interpret(new Context(1,1))));
        System.out.println("result = "+result);
    }
}
