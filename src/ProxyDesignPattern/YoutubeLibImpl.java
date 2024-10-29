package ProxyDesignPattern;

import java.util.HashMap;

public class YoutubeLibImpl implements YoutubeLib{
    @Override
    public HashMap<String,Video> getPopularVideos() {
        System.out.println("connecting to youtube server..");
        return getSomeVideos();
    }

    HashMap<String,Video> getSomeVideos(){
        HashMap<String,Video> hmap = new HashMap<>();
        hmap.put("Blinding Lights",new Video(1,"BlindingLights.mp3"));
        hmap.put("Alone",new Video(1,"Alone.mp3"));
        hmap.put("Bad Guy",new Video(1,"BadGuy.mp3"));
        return hmap;
    }
}
