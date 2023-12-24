//"Class should be a template, structure, or a bluprint of the object"

// Let class "Mortgage" has the exact same properties just like class "Loan"
public class Mortgage extends Loan {
    // don't have to define public static void main
    // then we remove the value to make it as a blueprint
    
    

    // Blank class like this can be used as a blueprint, can be called *Hojo class* or Record class

    // In case we want to modify the constructor style (inside structure, ex. just only want the name(String), no loger want the numbers (doubel/float from loanAmount, interestRate) )
    // Can be the same name ** but different parameters
    // that will make one constructor can stored the data in many styles
    // this is called "overloaded" constructor

    //"super" is to call the "constructor" from the parent class, class "Loan" to be precise in this case 
    public Mortgage (String applicantName) {
        super(applicantName);
}

    //So now we will use the "Constructor Method" instead
    //"Constructor method" is a method that have the exact same name with class's name
    //Constructor can receive the name of the variable
    public Mortgage(String applicantName, double loanAmount, float interestRate) {
        super(applicantName, loanAmount, interestRate);
        //without any return type
        //this. is the value under the mentioned class (same class and the same method name)
    }
    
    // create "getter" function (or getter method in java)
    // start with the word "get" + variable's name (as Java is a camel case language, we have to start after "get" with capital letter)
    //**Caution, Always use the same type of variable to cast the get method. Example for interest rate which is float */
    //no need the following method because it's already obtained from the parent class
    /*public float getInterestRate () {
        return interestRate;
    }
    */
    
    // method like this can be called "behavior"
    // Another one is "setter" method is use to modify the value in the private class (a class that cannot be modified directly from outside of the class)
    //no need the following method because it's already obtained from the parent class
    /*public void setInterestRate( float interestRate){
        this.interestRate = interestRate; // Receive the value for modification
        // this is very famous method, we can create setter method and let the framework modify it on demand (we send/recieve values from frameworks by getter/setter only, not directly)
        // example when Spring wants to export the value, it will come and look at the getter/setter method for display / make it JSON format
    } */

    // we can cast our own method
    // we use this. for make sure to cast in the same covered bracket
    //no need the following method because it's already obtained from the parent class
    /*public double calculateInterest() {
        //return this.loanAmount * this.interestRate/ 100;
        System.out.println("Mortgage Interest: " + calculateInterest());
        return 3.5d;
    } */
  

    //if we don't want the output to be hashed, we use method "to String"
    //to notice method, we use modifier, "public", "private", "protected" for example
    //no need the following method because it's already obtained from the parent class
    /*public String toString() {
        return "Applicant Name: " + applicantName + "\nLoan Amount: " + loanAmount +"\nInterest Rate: " + interestRate;
    }*/
    
    // this is called overriding method, is the method that replace the parent's method
    @Override
    public double calculateInterest() {
        System.out.println("Mortgage: calculateInterest()");
        return 3.4d;

    }
}

