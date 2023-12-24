public class Main {
    public static void main(String[] args) {
        Loan john = new Loan("John", 20000.0d, 8.5f);
        john.calculateInterest();
        System.out.println(john);

        System.out.println("---------------------------------------");
        
        Auto laumcing = new Auto("Laumcing", 10000.0d, 7.5f);
        laumcing.calculateInterest();
        System.out.println(laumcing);

        System.out.println("---------------------------------------");
        
        Mortgage laumcing2 = new Mortgage("Laumcing2", 10000.0d, 7.5f);
        laumcing2.calculateInterest();
        System.out.println(laumcing2);
    }
    
}
