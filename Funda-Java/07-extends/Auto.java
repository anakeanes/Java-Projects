//"Class should be a template, structure, or a bluprint of the object"

public class Auto extends Loan{
 
    
    public Auto (String applicantName) {
        super(applicantName);
}

    public Auto(String applicantName, double loanAmount, float interestRate) {
        super(applicantName, loanAmount, interestRate);
    }
    

    // this is called overriding method, is the method that replace the parent's method
    @Override
    public double calculateInterest() {
        System.out.println("Auto: calculateInterest()");
        return 5.5d;
    }

}

