package com.DesignPatterns.AdapterPattern;

/**
 * 高级媒体播放器接口
 * @author lubiao
 * @createDate 2018年07月30日 上午 09:18:00
 */
public interface AdvancedMediaPlayer {

    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
