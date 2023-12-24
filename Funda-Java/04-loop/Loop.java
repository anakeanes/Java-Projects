public class Loop {
    //the following is function, but in Java, we call it method
    public static void main(String[] args) {
        
        System.out.println(); // for new line
        int[] numbers = {1,2,3,4,5};
        for (int i =0 ; i < numbers.length; i ++) {
            int n = numbers[i];
            if (n % 2 == 0 ) {
                System.out.println(n + " is even.");
            }else if ( n == 3) {
                System.out.println(n + " is three.");
            }else {
                System.out.println(n + " is odd.");
            }
        }
    }
}
