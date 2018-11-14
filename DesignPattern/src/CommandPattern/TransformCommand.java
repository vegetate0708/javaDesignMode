package CommandPattern;

/**
 * Created by lx on 2017/8/26.
 * 具体命令执行角色
 */
public class TransformCommand implements Command {
    private Game receiver;

    public TransformCommand(Game receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.transform();
    }
}