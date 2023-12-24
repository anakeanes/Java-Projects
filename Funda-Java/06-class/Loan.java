//"Class should be a template, structure, or a bluprint of the object"

public class Loan {
    // don't have to define public static void main
    // then we remove the value to make it as a blueprint
        private String applicantName;
        private double loanAmount;
        private float interestRate;

    // Blank class like this can be used as a blueprint, can be called *Hojo class* or Record class


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
    
    // create "getter" function (or getter method in java)
    // start with the word "get" + variable's name (as Java is a camel case language, we have to start after "get" with capital letter)
    //**Caution, Always use the same type of variable to cast the get method. Example for interest rate which is float */
    public float getInterestRate () {
        return interestRate;
    
    }
    // method like this can be called "behavior"
    // Another one is "setter" method is use to modify the value in the private class (a class that cannot be modified directly from outside of the class)
    public void setInterestRate( float interestRate){
        this.interestRate = interestRate; // Receive the value for modification
        // this is very famous method, we can create setter method and let the framework modify it on demand (we send/recieve values from frameworks by getter/setter only, not directly)
    }


    //if we don't want the output to be hashed, we use method "to String"
    //to notice method, we use modifier, "public", "private", "protected" for example
    public String toString() {
        return "Applicant Name: " + applicantName + "\nLoan Amount: " + loanAmount +"\nInterest Rate: " + interestRate;
    }
}

