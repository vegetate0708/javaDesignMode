package Pattern3.InterpreterPattern;

/**
 * ��ʵ������������ʽ-��
 *
 * @author vegetate
 * @create 2018/11/15 15:31
 */

public class Subtract implements Interpreter {
    @Override
    public int interpret(Context context) {
        //�������
        return context.getNum1() - context.getNum2();
    }
}
