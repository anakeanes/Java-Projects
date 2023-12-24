
//command+shift+p, as shortcut
//javac for complier --> will get the .class file (byte code)
//java for run (if we run, it will run byte code file, not the java file)
//File name and Class name must be the same, or it will failed to comply
public class Hello {
    public static void main(String[] args) {
        //Java is a statically language, it need to be known the type at the compiling time
        // <type> <name> = <value>
        String msg = "Hello World!";
        System.out.println(msg);

        //console.log("Hello World") in JavaScript
        //fmt.Println("Hello World") in Go
        //print("Hello World") in Python

        int loanTerm = 36;
        System.out.println(loanTerm);

        float interestRate = 7.5f; //for float we have to end with f, float with 7 digits, double go with 15 digits (standard)
        System.out.println(interestRate); 


        double loanAmount = 10000.0d;
        System.out.println(loanAmount);

        boolean isApproved = true;
        System.out.println(isApproved);

        char grade = 'A';
        System.out.println(grade);
    }
}
