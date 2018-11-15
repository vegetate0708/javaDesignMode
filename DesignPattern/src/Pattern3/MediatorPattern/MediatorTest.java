package Pattern3.MediatorPattern;

/**
 * Created by lx on 2018/9/30.
 */
public class MediatorTest {

        public static void main(String[] args) {
            // �����н��ߡ�������
            MainBoard mediator = new MainBoard();
            // ����ͬ����
            CDDriver cdDriver = new CDDriver(mediator);
            CPU cpu = new CPU(mediator);
            VideoCard videoCard = new VideoCard(mediator);
            AudioCard audioCard = new AudioCard(mediator);
            // ���н���֪������ͬ��
            mediator.setCdDriver(cdDriver);
            mediator.setCpu(cpu);
            mediator.setVideoCard(videoCard);
            mediator.setAudioCard(audioCard);
            // ��ʼ����Ӱ���ѹ��̷��������������ʼ����
            cdDriver.readCD("������,��ĺ��ȣ�");

        }
}


