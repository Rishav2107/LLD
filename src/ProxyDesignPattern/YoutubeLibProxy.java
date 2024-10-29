package ProxyDesignPattern;

import java.util.HashMap;

public class YoutubeLibProxy implements YoutubeLib{
    YoutubeLib youtubeLib;
    HashMap<String,Video> cachedPopularVideos = new HashMap<>();

    public YoutubeLibProxy (){
        youtubeLib = new YoutubeLibImpl();
    }
    @Override
    public HashMap<String, Video> getPopularVideos() {
        if(cachedPopularVideos.isEmpty())
            cachedPopularVideos =  youtubeLib.getPopularVideos();
        else{
            System.out.println("Fetching from cache ...");
        }
        return cachedPopularVideos;
    }
}
