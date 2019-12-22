package com.venia.proxy;

import java.util.Collections;
import java.util.List;

/**
 * Created by HOME on 22.12.2019.
 */
public class ThirdPartYoutubeService implements ThirdPartYoutubeLib {
    @Override
    public List<String> listVideos() {
        return Collections.singletonList("Some video");
    }

    @Override
    public String getVideoInfo(String id) {
        return String.format("ThirdPartYoutubeService.[getVideoInfo](id) -> %s", id);
    }

    @Override
    public String downloadVideo(String id) {
        return String.format("ThirdPartYoutubeService.[downloadVideo](id) -> %s", id);
    }
}
