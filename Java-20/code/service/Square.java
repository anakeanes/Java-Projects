class Start
{
    public static void main(String[] data)
    {
        Photo[] list = {new Photo(400,450), new Photo(800,500), new Photo (800,300), new Photo(300,500)};
        // After that, we start sorting by Square Area
        java.util.Arrays.sort(list, (x.y)) -> x.getSquareArea() - y.getSquareArea());
        for (Photo p : list)
        {
            System.out.println(p.getSquareArea());
        }
        
    
        }
    
}

class Photo
{
    Photo(int w, int h)
    {
        this.width = w;
        this.height = h;
        
    }
    int width, height;
    int getSquareArea()
    {
        return width<height ? width;
    }
}