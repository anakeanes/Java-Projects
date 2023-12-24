public class Scope {
    public static void main(String[] args) {
        float xxx = 8.5f;
        {
            float interestRate = 7.5f;
            System.out.println(interestRate);
            System.out.println("inside is " + xxx);
            //we defined xxx outside, and call the xxx inside, this is called the "nested"
        }
        // if type here, it is out of the block scope {}, System.out.println(interestRate) cannot run comply here;
        //but for System.out.println(xxx) can belong here, because it still in the same block scope
    }
}
