import java.util.HashMap;
import java.util.Set;

class TrackList{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Happy Song", "I am happy this is happy song");
        trackList.put("Sad Song", "No more happy this is sad song");
        trackList.put("Dance Song", "Dance dance dance");
        trackList.put("Random Song", "I have no idea what this is");
        System.out.println(trackList.get("Happy Song"));
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}