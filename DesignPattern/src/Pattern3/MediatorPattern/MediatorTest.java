package Pattern3.MediatorPattern;

/**
 * Created by lx on 2018/9/30.
 */
public class MediatorTest {

        public static void main(String[] args) {
            // 创建中介者——主板
            MainBoard mediator = new MainBoard();
            // 创建同事类
            CDDriver cdDriver = new CDDriver(mediator);
            CPU cpu = new CPU(mediator);
            VideoCard videoCard = new VideoCard(mediator);
            AudioCard audioCard = new AudioCard(mediator);
            // 让中介者知道所有同事
            mediator.setCdDriver(cdDriver);
            mediator.setCpu(cpu);
            mediator.setVideoCard(videoCard);
            mediator.setAudioCard(audioCard);
            // 开始看电影，把光盘放入光驱，光驱开始读盘
            cdDriver.readCD("东京热,真的好热！");

        }
}


