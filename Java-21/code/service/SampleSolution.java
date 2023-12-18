import java.util.ArrayList;
import java.util.LinkedList;
class Sample
{
    public static void main(String[] data)
    {
        ArrayList a = new ArrayList();             // Array 1st generation can mix the data
        a.add("Latte");     //String
        a.add("2.8");       //Double
        a.add(20);          //Integer
        a.add("Mocha");
        a.add("Mocha");
        a.add(17);
        for (Object o : a)
        {
            System.out.println(o);
            int countstring = 0;
            if (o instanceof String)
            {
                countstring++;
            }
            System.out.println("String amount = " + countstring);
        }
        
                
    }
}