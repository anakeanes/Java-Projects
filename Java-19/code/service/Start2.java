class Start
{
    public static void main(String[] data)
    {
        Book b = new Book();
        b.price = 350;
        System.out.println(b.getTax()); // Display 35.0
    }
}

class Book implements Taxable, Shippable 
{
//indicate which class is related to implement which interface (ex. map or match)
//**must write every Method that is indicated in the Interface
    
        public double getTax()
        {
            return 0.10*price;
        }

        double price;
        public double getShippingPrice() 
        {
        return 0;
        }
    
}


interface Taxable
{
    double getTax();
}

interface Shippable
{
    double getShippingPrice();
}