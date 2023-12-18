class Start
{
    public static void main(String[] data)
    {
        Staff f  = new Staff();
     
        double tax1 = t.getTax(12*35000);
        double tax2 = t.getTax(12*35000);
        System.out.println(tax1);
        System.out.println(tax2);
        
    }
}

class Staff
{
    double getTax(double income) {return income *0.10}
    double getTax(double income, int child)
    {
        return(income - child*50000*0.10);
    }
    
}