import java.util.LinkedList;
class Sample 
{
    public static void main(String[] data)
    {
        var a = new LinkedList<String>();
        a.add("Latte");
        a.add("Mocha");
        a.add("Cappucino");
        a.add("Mocha");
        a.remove(0);                                        //remove Latte by index no.0
        a.remove("Mocha");                                  //remove the fist Mocha that match (Sequencial Sorting)
        // any item that have been removed, the next index will replace the removed index automatically
        //the next bro, not the same ** highly recommend to remember**
        for (String s : a)
        {
            System.out.println(s);
        }
    }
}