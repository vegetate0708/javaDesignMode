package Pattern3.InterpreterPattern;

/**
 * ���������࣬���ʽ+��
 *
 * @author vegetate
 * @create 2018/11/15 15:30
 */
public class Add implements Interpreter {
    @Override
    public int interpret(Context context) {
        //�������
        return context.getNum1() + context.getNum2();
    }
}
