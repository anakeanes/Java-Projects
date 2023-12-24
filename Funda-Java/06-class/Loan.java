//"Class should be a template, structure, or a bluprint of the object"

private class Loan {
    // don't have to define public static void main
    // then we remove the value to make it as a blueprint
        private String applicantName;
        private double loanAmount;
        private float interestRate;


    //So now we will use the "Constructor Method" instead
    //"Constructor method" is a method that have the exact same name with class's name
    //Constructor can receive the name of the variable
    public Loan(String applicantName, double loanAmount, float interestRate) {
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        //without any return type
        //this. is the value under the mentioned class (same class and the same method name)
    }
    
    //if we don't want the output to be hashed, we use method "to String"
    //to notice method, we use modifier, "public", "private", "protected" for example
    public String toString() {
        return "Applicant Name: " + applicantName + "\nLoan Amount: " + loanAmount +"\nInterest Rate: " + interestRate;
    }
}

