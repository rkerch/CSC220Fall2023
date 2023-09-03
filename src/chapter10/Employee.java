package chapter10;

public class Employee {

    private String name;
    private String dob; //date of birth
    private String address;
    private String phone;
    private double score;

//    public Employee(String n, String d, String a, String p){
//        name = n;
//        dob = d;
//        address = a;
//        phone = p;
//    }
    public Employee(){}

    public Employee(String n, String d, String a, String p){
        setName(n);
        setDob(d);
        setPhone(p);
        setAddress(a);
        setPhone(p);
    }

    //Static means you don't need to initialize an instance/object of the class to use the method (invoke it)
    public static void displayEmployeeInfo(String id){
        System.out.println(id);
    }



    //to accss a private data field, we need to use the get method
    //to assign a value to a data field, we need to use the set method
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public String getDob(){
        return dob;
    }

    public void setDob(String d){
        dob = d;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String a){
        address = a;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String p){
        phone = p;
    }

    public double getScore(){
        return score;
    }

    public void setScore(double s){
        score = s;
    }
}
