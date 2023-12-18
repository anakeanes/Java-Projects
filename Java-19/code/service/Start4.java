import java.util.Iterator;
class Start
{
    public static void main(String[] data)
    {
        new s = new Storage();
        s.add("Latte");
        s.add("Mocha");
        s.add("Cappucino");
        while(s.hasNext())
        {
            Object o = s.next();
            System.out.println(o);
        }
        // indicate every method in which implement interface that is in used
        // จะปฏิบัติตามนโยบายไหน ต้องเขียนรายละเอียดข้อบังคับทุกข้อ
    }
}
class Storage implements Iterator
{
    Object []data = new Object [2];
    int size = 0;
    void add(Object x)
    {
        if (size >= data.length)
        {
            Object[] temporary = new Object [data.length *2]; // Copy from data to temporary
            for (int i = 0; i < data.length; i ++)
            {
                temporary[i] = data[i];        // in C we have to release the contained data with command "free(data)"
            }
            data = temporary; // Change the address
        }
        
        data[size] = x;
        size ++;
    }
    int index = 0;
    public boolean hasNext()
    {
        return index < size;
    }
    public Object next()
    {
        return data[index++];
    }
}