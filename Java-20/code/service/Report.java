import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
class Report
{
    public static void main(String[] data)
    {
        var input = new Scanner(System.in);
        int size = input.nextInt();
        input.nextLine(); // อ่านเครื่องหมายขึ้นบรรทัดใหม่ทิ้งไป
        var team = new Player[size];
        
        for(var i =0; i<size; i++)
        {
            String name = input.next();
            int number = input.nextInt();
            double salary = input.nextDouble();
            input.nextLine(); // read and ignore the next read value
            team[i].name = name;
            team[i].number = number;
            team[i].salary = salary;
        }
        Arrays.sort(team, new Player Comparator());
        for(Player p : team)
                {
                    System.out.println(p.name + " " + p.salary);
                }
    }
    
}
class PlayerComparator implements Comparator
{
    public int compare(object a, object b)
    {
        Player p = (Player)a;
        Player q = (Player)b;
        if(p.salary < q.salary) return -1;
        if(p.salary<q.salary) return +1;
        return 0;
    }
}



class Player
{
    String name;
    int number;
    double salary;
}