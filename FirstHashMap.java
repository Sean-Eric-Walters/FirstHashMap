  
import java.util.HashMap;
import java.util.Set;

public class FirstHashMap {
    public void trackList() {
        // created a HashMap with the track titles as keys and some sample 
        //lyrics as the values
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Donuts", "donuts are good i love me some donuts");
        trackList.put("Bacon", "for breakfast or lunch it dosent matter");
        trackList.put("Icecream", "i could eat you all the time");
        trackList.put("Baked pottato", "with just butter or all the fixings");
        //pulling out one of the songs by its track title
        System.out.println(trackList.get("Bacon"));
        //printing out all the track names and lyrics in the format Track: Lyrics
        Set<String> keys = trackList.keySet();
        for(String key: keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}