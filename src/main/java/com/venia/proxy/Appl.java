package com.venia.proxy;

import java.util.Arrays;

/**
 * Created by HOME on 22.12.2019.
 */
public class Appl {
    public static void main(String [] args) {
        System.out.println("=======================");
        ThirdPartYoutubeLib service = new ThirdPartYoutubeService();
        ThirdPartYoutubeLib cached = new CachedYoutube(service, null);

        cached.listVideos();
        cached.getVideoInfo("1111");
        cached.downloadVideo("2222");

        cached.listVideos();
        cached.getVideoInfo("xxx");
        cached.downloadVideo("xxxx");

        cached.listVideos();
        cached.getVideoInfo("zzz");
        cached.downloadVideo("zzz");

        cached.listVideos();
        cached.getVideoInfo("aaa");
        cached.downloadVideo("aa");
    }
}
