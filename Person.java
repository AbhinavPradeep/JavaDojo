
public class Person 
{
    //properties
    String MyName;
    int numberofeyes;
    double intelligencequotient;
    

    //constructor
    public Person(String Name)
    {
        MyName = Name;
    }
    public void SayName()
    {
        System.out.println("My name is " + MyName );
    }

}