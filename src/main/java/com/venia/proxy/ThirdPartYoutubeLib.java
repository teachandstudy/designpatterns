package com.venia.proxy;

import java.util.List;

/**
 * Created by HOME on 22.12.2019.
 */
public interface ThirdPartYoutubeLib {
    List<String> listVideos();
    String getVideoInfo(String id);
    String downloadVideo(String id);
}
