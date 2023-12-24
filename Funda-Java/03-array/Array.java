public class Array {
    public static void main(String[] args) {
        String[] name = {"Laumcing", "Coffee", "Podpo"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        //add the value inside of the array
        name[0] = "Java";
        System.out.println(name[0]);

        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        //to see the amount inside of the array
        System.out.println("length: " + numbers.length);
    }
}
