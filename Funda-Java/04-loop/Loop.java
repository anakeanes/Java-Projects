public class Loop {
    //the following is function, but in Java, we call it method
    public static void main(String[] args) {
        for (int i = 0; i < 5; i ++) {
            System.out.println(i);
        }
        System.out.println(); // for new line
        int[] numbers = {1,2,3,4,5};
        for (int i =0 ; i < numbers.length; i ++) {
            System.out.println(numbers[i]);
        }
        System.out.println(); // for new line
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i ++;
        }

        
    }
}
