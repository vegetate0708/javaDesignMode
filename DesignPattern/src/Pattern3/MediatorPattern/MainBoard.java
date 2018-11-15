package Pattern3.MediatorPattern;

/**
 * �����࣬ʵ���н��߽ӿ�
 */
public class MainBoard implements Mediator {

    // ��Ҫ֪��Ҫ������ͬ���ࡪ��������
    private CDDriver cdDriver = null;
    // ��Ҫ֪��Ҫ������ͬ���ࡪ��CPU��
    private CPU cpu = null;
    // ��Ҫ֪��Ҫ������ͬ���ࡪ���Կ���
    private VideoCard videoCard = null;
    // ��Ҫ֪��Ҫ������ͬ���ࡪ��������
    private AudioCard audioCard = null;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setAudioCard(AudioCard audioCard) {
        this.audioCard = audioCard;
    }

    @Override
    public void changed(Colleague c) {
        if (c instanceof CDDriver) {
            // ��ʾ�����Ѿ���ȡ������
            this.afterCDDriverReadData((CDDriver) c);
        } else if (c instanceof CPU) {
            // ��ʾCPU�Ѿ�����������
            this.afterCPUProcessData((CPU) c);
        }
    }

    /**
     * ������ȡ�����Ժ�����������Ľ���
     */
    private void afterCDDriverReadData(CDDriver cd) {
        // �Ȼ�ȡ������ȡ������
        String data = cd.getData();
        // ����Щ���ݴ��ݸ�CPU���д���
        cpu.processData(data);
    }

    /**
     * CPU���������ݺ�����������Ľ���
     */

    private void afterCPUProcessData(CPU cpu) {
        // �Ȼ�ȡCPU����������
        String videoData = cpu.getVideoData();
        String audioData = cpu.getAudioData();
        // ����Щ���ݴ��ݸ��Կ�������չʾ����
        videoCard.display(videoData);
        audioCard.play(audioData);
    }

}
