//create a HashMap to store person age and display them
import java.util.*;
public class Implementation{
    public static void main(String[] args){
        Map<String,Integer> hm = new HashMap<>();
        hm.put("Aditya",21);
        hm.put("Sparsh",21);
        hm.put("Sourav",19);
        hm.put("Rakshit",20);

        System.out.println(hm.get("Aditya"));

        hm.put("Aditya",22);

        System.out.println(hm.get("Aditya"));
        System.out.println(hm.containsKey("Aditya"));
        hm.remove("Sourav");
        System.out.println(hm.get("Sourav"));

        hm.putIfAbsent("Sourav", 17);
        System.out.println(hm.get("Sourav"));

        System.out.println(hm.keySet()); //return all keys
        System.out.println(hm.values()); //return all values
        System.out.println(hm.entrySet()); //return all keys with values

        //traversing through map
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}