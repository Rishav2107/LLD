package ProxyDesignPattern;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        YoutubeLib youtubeLib = new YoutubeLibProxy();
        HashMap<String,Video> response = youtubeLib.getPopularVideos();
        response.forEach((String s,Video v) -> {
            System.out.println(s+" : "+v.name);
        });
        youtubeLib.getPopularVideos();
    }
}
