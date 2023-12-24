public class Main {
    public static void main(String[] args) {
        Loan john = new Loan("John", 20000.0d, 8.5f);
        System.out.println(john.getInterestRate());
        System.out.println(john);

        System.out.println("---------------------------------------");
        
        Auto laumcing = new Auto("Laumcing", 10000.0d, 7.5f);
        System.out.println(laumcing.getInterestRate());
        System.out.println(laumcing);

        System.out.println("---------------------------------------");
        
        Mortgage laumcing2 = new Mortgage("Laumcing2", 10000.0d, 7.5f);
        System.out.println(laumcing2.getInterestRate());
        System.out.println(laumcing2);
    }
    
}
