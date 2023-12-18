import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

class Report
{
    public static void main(String[] data) throws FileNotFoundException
    {
        var input = new Scanner(new File("data.txt")); // Assuming the data is in a file named "data.txt"
        int size = Integer.parseInt(input.nextLine().trim());
        var team = new Player[size];
        
        for (int i = 0; i < size; i++)
        {
            String line = input.nextLine();
            String[] parts = line.split(",");
            String name = parts[0].trim();
            int number = Integer.parseInt(parts[1].trim());
            double salary = Double.parseDouble(parts[2].trim());
            team[i] = new Player(name, number, salary);
        }
        
        Arrays.sort(team, (p1, p2) -> Double.compare(p1.getSalary(), p2.getSalary()));
        
        System.out.println("Player with the minimum salary:");
        System.out.println("Name: " + team[0].getName());
        System.out.println("Number: " + team[0].getNumber());
        System.out.println("Salary: " + team[0].getSalary());
    }
}

class Player
{
    private String name;
    private int number;
    private double salary;
    
    public Player(String name, int number, double salary)
    {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public double getSalary()
    {
        return salary;
    }
}
