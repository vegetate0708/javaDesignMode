package Pattern3.InterpreterPattern;

/**
 * 〈实体解释器，表达式-〉
 *
 * @author vegetate
 * @create 2018/11/15 15:31
 */

public class Subtract implements Interpreter {
    @Override
    public int interpret(Context context) {
        //两数相减
        return context.getNum1() - context.getNum2();
    }
}
