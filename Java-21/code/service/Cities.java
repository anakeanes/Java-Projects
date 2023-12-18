import java.util.HashSet;
class Start
{
    public static void main(String[] data)
    {
        HashSet<String> table = new HashSet<>();
        table.add("London");
        table.add("Miami");
        table.add("Boston");
        table.add("Miami"); // It will ignore the repeat item together with the index
        for(String s:table)
        {
            System.out.println(s); // London Miami Boston
        }
    }
}
        