//"Class should be a template, structure, or a bluprint of the object"

public class Loan {
    // don't have to define public static void main
        String applicantName = "Laumcing";
        double loanAmount = 10000.0d;
        float interestRate = 7.5f;
    
    //if we don't want the output to be hashed, we use method "to String"
    //to notice method, we use modifier, "public", "private", "protected" for example
    public String toString() {
        return "Applicant Name: " + applicantName + "\nLoan Amount: " + loanAmount +"\nInterest Rate: " + interestRate;
    }
}

