package MediatorPattern;

/**
 * 显卡类，一个同事类
 */
public class VideoCard extends Colleague {

    /**
     * 构造函数
     */
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 显示视频数据
     */
    public void display(String data) {
        System.out.println("您正在观看的是：" + data);
    }
}

