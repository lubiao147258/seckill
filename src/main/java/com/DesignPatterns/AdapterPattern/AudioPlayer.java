package com.DesignPatterns.AdapterPattern;

/**
 * 创建实现了 MediaPlayer 接口的实体类。
 * @author lubiao
 * @createDate 2018年07月30日 上午 09:30:00
 */
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //播放 MP3 音乐类型文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("播放MP3音乐文件的文件名为："+fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("不合法的媒体文件:“."+audioType+"” 格式不支持");
        }
    }
}
