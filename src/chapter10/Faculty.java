package chapter10;

public class Faculty {

    private String name;
    private String dob; //date of birth
    private String address;
    private String phone;
    private double score;


    //This is used so the name of the parameter in the constructor can be the exact same as the name of the data field
    public Faculty(String name, String dob, String address, String phone){
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
    }

    public Faculty(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }




}
