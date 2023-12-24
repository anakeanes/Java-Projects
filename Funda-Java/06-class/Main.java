public class Main {
    public static void main(String[] args) {
    /*     String applicantName = "Laumcing";
        double loanAmount = 10000.0d;
        float interestRate = 7.5f;
        
        
        System.out.println("Applicant Name: " + applicantName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate);
    */
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

        //call function to use, use command "new"
        //"new" is use to class the instance
        Loan john = new Loan();
        // the output will comeout "Loan@hashed_object"
        //we don't have to comply the class "Loan", if you comply main, it will comply to the related class automatically
        john.applicantName = "John";
        john.loanAmount = 20000.0d;
        john.interestRate = 8.5f;
        System.out.println(john); 
        
        System.out.println();
        
        Loan laumcing = new Loan();
        System.out.println(laumcing);
        laumcing.applicantName = "Laumcing";
        laumcing.loanAmount = 10000.0d;
        laumcing.interestRate = 7.5f;
    }

}
