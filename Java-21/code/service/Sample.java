import java.util.ArrayList;
import java.util.HashMap;

class Sample
{
    public static void main(String[] data)
    {
        ArrayList<Object> a = new ArrayList<>(); // Use proper generic type
        
        a.add("Latte"); // String
        a.add("2.8");   // Double
        a.add(20);      // Integer
        a.add("Mocha");
        a.add("Mocha");
        a.add(17);

        // Count variable types and data by type
        HashMap<String, Integer> typeCount = new HashMap<>();
        HashMap<String, ArrayList<Object>> dataByType = new HashMap<>();
        
        for (Object o : a)
        {
            String typeName = o.getClass().getSimpleName();
            typeCount.put(typeName, typeCount.getOrDefault(typeName, 0) + 1);

            if (!dataByType.containsKey(typeName)) {
                dataByType.put(typeName, new ArrayList<>());
            }
            dataByType.get(typeName).add(o);

            System.out.println(o);
        }
        
        System.out.println("\nVariable type counts:");
        for (String typeName : typeCount.keySet())
        {
            System.out.println(typeName + ": " + typeCount.get(typeName));
        }

        System.out.println("\nData sorted by type:");
        for (String typeName : dataByType.keySet())
        {
            System.out.println(typeName + ": " + dataByType.get(typeName));
        }
    }
}
