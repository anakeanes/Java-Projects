public class Main {
    public static void main(String[] args) {
        String applicantName = "Laumcing";
        double loanAmount = 10000.0d;
        float interestRate = 7.5f;
        
        
        System.out.println("Applicant Name: " + applicantName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate);

        //Three of these output should group into one "object"
        /*JavaScript Object Notation (JSON)
         * var loan = {
            ApplicantName: "Laumcing",
            loanAmount: 10000.0,
            interestRate: 7.5
         * };
        */

        //Go Struct
        /*
         * type Loan struct {
         * ApplicantName string
         * LoanAmount float64
         * InterestRate float32
         * }
         */
    }

}
