package Pattern3.InterpreterPattern;

/**
 * 〈解释器类，表达式+〉
 *
 * @author vegetate
 * @create 2018/11/15 15:30
 */
public class Add implements Interpreter {
    @Override
    public int interpret(Context context) {
        //两数相加
        return context.getNum1() + context.getNum2();
    }
}
