package com.DesignPatterns.AdapterPattern;

/**
 * 创建实现了 AdvancedMediaPlayer 接口的实体类
 * @author lubiao
 * @createDate 2018年07月30日 上午 09:22:00
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放Mp4媒体文件的文件名为："+fileName);
    }
}
