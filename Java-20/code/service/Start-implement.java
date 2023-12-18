//Method of Threads creation No.2 - Implementation

class Start { 
    public static void main(String[] data) 
    {
       
        new Printer().start();
        var w = new Worker();
        var t = new Thread(w);
        
        t. start(); //Start will call run
        //if we run directly(not start,start is for threads), it will runs in single threads (Run all M then P then W)
        //run is automatically run on the single thread
        //if we run directly(code: p.run), it will show 1000P 1000M and 1000W, this is call sequencial run
        //the correct way is (code: p.start)
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
class Worker implements Runnable // Sometime we already extended, we cannot dupplicate the extension
        //We have to use implementation
{
    public void run()
    {
        for (var i = 0 ; i < 1000 ; i ++)
        {
            System.out.print("W");           
        }
    }
}