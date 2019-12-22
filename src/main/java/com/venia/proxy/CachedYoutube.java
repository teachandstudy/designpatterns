package com.venia.proxy;

import java.util.List;

/**
 * Created by HOME on 22.12.2019.
 */
public class CachedYoutube implements ThirdPartYoutubeLib {
    private ThirdPartYoutubeLib service;
    private List<String> listCached;
    private String videoCached;
    private String downloadedVideo;
    private boolean needReset;

    public CachedYoutube(ThirdPartYoutubeLib service, List<String> listCached, String videoCached, boolean needReset) {
        this.service = service;
        this.listCached = listCached;
        this.videoCached = videoCached;
        this.needReset = needReset;
    }

    public CachedYoutube(ThirdPartYoutubeLib service, List<String> listCached) {
        this(service, listCached, null, false);
    }

    @Override
    public List<String> listVideos() {
        if (listCached == null || needReset) {
            listCached = service.listVideos();
            System.out.println(listCached);
        } else {
            System.out.println(String.format("List cached -> %s", listCached));
        }
        return listCached;
    }

    @Override
    public String getVideoInfo(String id) {
        if (videoCached == null || needReset) {
            videoCached = service.getVideoInfo(id);
            System.out.println(videoCached);
        } else {
            System.out.println(String.format("Video info cached -> %s", videoCached));
        }
        return videoCached;
    }

    @Override
    public String downloadVideo(String id) {
        if (downloadedVideo == null || needReset) {
            downloadedVideo = service.downloadVideo(id);
            System.out.println(downloadedVideo);
        } else {
            System.out.println(String.format("DownloadedVideo cached -> %s", downloadedVideo));
        }
        return downloadedVideo;
    }
}
