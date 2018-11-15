package Pattern3.CommandPattern;

/**
 * Created by lx on 2017/8/28.
 */
public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        LeftCommand leftCommand = new LeftCommand(game);
        RightCommand rightCommand = new RightCommand(game);
        TransformCommand transformCommand = new TransformCommand(game);
        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setTransformCommand(transformCommand);

        buttons.toRight();
        buttons.toLeft();
        buttons.transform();

    }
}