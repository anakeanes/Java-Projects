public class Mortgage implements Loan {
    private String applicantName;
    private double loanAmount;
    private float interestRate;

    public Mortgage(String applicantName) {
        this.applicantName = applicantName;
    }

    public Mortgage(String applicantName, double loanAmount, float interestRate) {
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }
    @Override
    public double calculateInterest() {
        System.out.println( "Mortgage: calculateInterest()");
        return 3.4d;
    }
    @Override
    public String toString() {
        return "Applicant Name: " + applicantName + "\nLoan Amount: " + loanAmount + "\nInterest Rate: " + interestRate;
    }
}