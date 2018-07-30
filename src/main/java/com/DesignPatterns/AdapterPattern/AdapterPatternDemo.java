package com.DesignPatterns.AdapterPattern;

/**
 * 使用 AudioPlayer 来播放不同类型的音频格式。
 * @author lubiao
 * @createDate 2018年07月30日 上午 09:36:00
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","晴天.mp3");
        audioPlayer.play("mp4","雨天.mp4");
        audioPlayer.play("vlc","阴天.vlc");
        audioPlayer.play("avi","无法无天.mp3");
    }
}
