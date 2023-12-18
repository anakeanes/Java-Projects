//Method of Threads creation No.1 - Extend

class Start { 
    public static void main(String[] data) 
    {
        var p = new Printer();
        p.start();   
        //start() for intilize command in OS
        //for create new Thread and run()
        //new Printer().start();
        for (var i = 0 ; i < 1000 ; i++)
        {
            System.out.print("M");
          
        }
    }
}
class Printer extends Thread
{
    public void run ()
    {
        for (var i = 0 ; i < 1000; i++)
        {
            System.out.print("P");
        }
    }
}