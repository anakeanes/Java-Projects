
import java.util.Scanner; //codestar.work/common.pdf

class Search
{
 public static void main(String[] data)
 {
     int [] a = {8,5,8,7,5};  //output should be 3 (unique value)
     Sample s = new Sample();
     int r = s.find(a);
     System.out.println(r);
     
 }
}
class Sample
{
    int find(int[] a)
    {
        if (a == null) return 0;  // could be -1 depend on the input
        if (a.length == 0) return 0;
        java.util.Arrays.sort(a);
        int count = 1;
        for (int i = 1 ; i < a.length ; i++) // start with 1 because if it has 1 number the output should be one
        {
            if(a[i-1] == a[i]){}
            if(a[i-1] != a[i]) {count++;}
        }
        return count;
    }
}