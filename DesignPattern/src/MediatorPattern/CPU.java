package MediatorPattern;

/**
 * CPU�࣬һ��ͬ����
 */
public class CPU extends Colleague {

    // �ֽ��������Ƶ����
    private String videoData = "";
    // �ֽ��������������
    private String audioData = "";

    /**
     * ���캯��
     */
    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     * ��ȡ�ֽ��������Ƶ����
     */
    public String getVideoData() {
        return videoData;
    }

    /**
     * ��ȡ�ֽ��������������
     */
    public String getAudioData() {
        return audioData;
    }

    /**
     * �������ݣ������ݷֳ���Ƶ����Ƶ������
     */
    public void processData(String data) {
        // �����ݷֽ⿪��ǰ������Ƶ���ݣ���������Ƶ����
        String[] array = data.split(",");
        this.videoData = array[0];
        this.audioData = array[1];
        // ֪ͨ���壬CPU��ɹ���
        getMediator().changed(this);
    }
}
