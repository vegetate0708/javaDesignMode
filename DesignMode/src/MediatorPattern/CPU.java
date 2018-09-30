package MediatorPattern;

/**
 * CPU类，一个同事类
 */
public class CPU extends Colleague {

    // 分解出来的视频数据
    private String videoData = "";
    // 分解出来的声音数据
    private String audioData = "";

    /**
     * 构造函数
     */
    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     * 获取分解出来的视频数据
     */
    public String getVideoData() {
        return videoData;
    }

    /**
     * 获取分解出来的声音数据
     */
    public String getAudioData() {
        return audioData;
    }

    /**
     * 处理数据，把数据分成视频和音频的数据
     */
    public void processData(String data) {
        // 把数据分解开，前面是视频数据，后面是音频数据
        String[] array = data.split(",");
        this.videoData = array[0];
        this.audioData = array[1];
        // 通知主板，CPU完成工作
        getMediator().changed(this);
    }
}
