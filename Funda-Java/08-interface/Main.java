public class Main {
    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage("Mortgage", 10000.0d, 7.5f);
        System.out.println(mortgage);
        double rate = mortgage.calculateInterest(); //create variable to receive the value from the method
        System.out.println("Interest: " + rate);
    }
    
}
