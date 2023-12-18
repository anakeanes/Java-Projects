import java.util.TreeSet;
class Unique
{
    public static void main (String[] data)
    {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3); set.add(3); set.add(5); set.add(1);
        set.add(6); set.add(5); set.add(7); set.add(8);   //set is to remove the duplicate structure
        for (Integer e : set)
        {
            System.out.println(e);  //1,3,5,6,7,8
        }
    }
}