class Start
{
    public static void main(String[] data)
    {
        new c = new Car(); // new is for creating the instance
        System.out.println( c instanceof Car); // true
        System.out.println( c instanceof Vehicle); //true
        System.out.println( c instanceof Object); // we have never cast "object class but it's true

        //System.out.println( c instanceof String); // Error
    }
    
    // in Java, JS or C# when we cast any class, they will automatically add superclass
    //and that is extends object
    // the class name object is superclass of all classes
}
class Vehicle
{
    String license;
}
class Car extends Vehicle // Car has already recieved the data from Vehicle
{
    String brand;
}