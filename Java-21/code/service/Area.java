import java.util.TreeMap;
import java.util.HashMap;

class Area
{
    public static void main(String[] data)
    {
        TreeMap<String, String> map = new TreeMap<>();
        //HashMap<String, String> map = new HashMap<>();       // Alternative Way to use HashMap
        
        
        map.put("Bang Rak", "10500");
        map.put("Bang Plad", "10700");
        map.put("Dusit", "10300");
        map.put("Patumwan","10330");
        
        String s = map.get("Bang Plad"); 
        System.out.println(s);                 //10700
        String t = map.get("Bang Na");
        System.out.println(t);                 //Null
        for (String k : map.keySet())
        {
            System.out.println(k);             // All key alphabetically
        }
    }
}