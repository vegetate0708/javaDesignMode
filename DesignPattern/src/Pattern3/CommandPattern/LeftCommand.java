package Pattern3.CommandPattern;

/**
 * Created by lx on 2017/8/26.
 * ��������ִ����
 */
public class LeftCommand implements Command {
    private Game receiver;

    public LeftCommand(Game receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.toLeft();
    }
}