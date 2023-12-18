class Start
{
    public static void main(String[] data)
    {
        var s = new Student();
        s.name = "Luna Lovegood";
        s.gender = Gender.Female;
        System.out.println (s.name + " " + s.gender);
                
    }
}
class Student
{
    String name;
    Gender gender;
    
}
enum Gender {Male, Female}

