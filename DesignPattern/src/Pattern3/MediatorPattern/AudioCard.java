package Pattern3.MediatorPattern;

/**
 * 声卡类，一个同事类
 */
public class AudioCard extends Colleague {

    /**
     * 构造函数
     */
    public AudioCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放音频数据
     */
    public void play(String data) {
        System.out.println("画外音：" + data);
    }
}

