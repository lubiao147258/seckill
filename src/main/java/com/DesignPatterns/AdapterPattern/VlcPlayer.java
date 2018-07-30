package com.DesignPatterns.AdapterPattern;

/**
 * 创建实现了 AdvancedMediaPlayer 接口的实体类
 * @author lubiao
 * @createDate 2018年07月30日 上午 09:20:00
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放VLC媒体文件的文件名为："+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
