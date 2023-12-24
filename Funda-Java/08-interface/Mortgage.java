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
}