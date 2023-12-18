class Start
{
    public static void main(String[] data)
    {
        Currency[] list = { new Currency ("Bitcoin", 25922, 7.5), new Currency("Ethereum", 1643.0, 12.75), new Currency("XAU/USD", 1905.42,30.0)};
        System.out.println(list[0].name() );            //Bitcoin
        System.out.println(list[1].rate() );            //1643.0
        double total = 0.0;
        for (Currency c : list)
        {
            total = total + c.rate()*c.amount();
        }
        System.out.println("Total asset is " + total);
     }
    
}
record Currency(String name, double rate, double amount) // casted out in private // cannot be used outside record
{
    
}

//Alternative way
//total += c.rate())*c.amount();