package chapter10;

public class StudentTest {


    public static void main(String[] args) {

        Student s1 = new Student(); //s1 is a reference variable, and it contains the memory address of Student
        //Student() is a constructor that initializes the instance of the class (Student)
        //to access any variable or method in Student, we use the reference varuable s1 followed by .
        System.out.println("The default name: " + s1.name);
        System.out.println("The default dob: " + s1.dob);
        System.out.println("The default address: " + s1.address);
        System.out.println("The default phone: " + s1.phone);
        System.out.println("The default score: " + s1.score);

//        s1.name = "Mike";
//        s1.dob = "2002-10-10";
//        s1.address = "172 Clark Ave, Alliance OH";
//        s1.phone = "330-456-7890";
//        s1.score = 85.6;
//
//        System.out.println("\nThe new name: " + s1.name);
//        System.out.println("The new dob: " + s1.dob);
//        System.out.println("The new address: " + s1.address);
//        System.out.println("The new phone: " + s1.phone);
//        System.out.println("The new score: " + s1.score);

        Student s2 = new Student("Lisa", "2003-5-6", "Beautiful Street", "332-334-6774", 90);

        System.out.println("\nThe name: " + s2.name);
        System.out.println("The dob: " + s2.dob);
        System.out.println("The address: " + s2.address);
        System.out.println("The phone: " + s2.phone);
        System.out.println("The score: " + s2.score);

        Student s3 = new Student("Laura");
        Student s4 = new Student(90.7, "Robert");

        System.out.println(s3);
    }

}
