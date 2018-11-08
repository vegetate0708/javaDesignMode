package CommandPattern;

/**
 * Created by lx on 2017/8/26.
 */
public class RightCommand implements Command {
    private Game receiver;

    public RightCommand(Game receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.toRight();
    }
}