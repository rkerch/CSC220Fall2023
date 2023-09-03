package chapter10;

public class Student {
    //Instance variables or data fields
    String name;
    String dob; //date of birth
    String address;
    String phone;
    double score;
    /*
    Public - can be accessed from any class or package
    Private - can only be accessed by the same class
    Protected - can be accessed through child class or different package
    Default - can be accessed from a different class in the same package
     */



    //by default the compiler will make this default constructor
    //public Student() {
        /* This constructor initialize the data field to the default values
        name = null;
        dob = null;
        address = null;
        phone = null;
        score = 0;
        this non argument constructor is created by the compiler by default
         */
    //}

    //non argument constructor, the constructor is a method that has the same name as the class exactly
    public Student(){
        name = "Mike";
        dob = "2002-10-10";
        address = "172 Clark Ave Alliance OH";
        phone = "330-456-7890";
        score = 85.6;
    }

    //any class can have more than one constructor
    public Student(String n, String d, String a, String p, double s){
        //initialize the instance variables/data fields
        name = n;
        dob = d;
        address = a;
        phone = p;
        score = s;
    }

    public Student(String n){
        name = n;
    }

    public Student(double s, String n){
        score = s;
        name = n;
    }


}
