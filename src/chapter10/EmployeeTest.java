package chapter10;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setName("Mahmoud");
        e1.setDob("1990-9-9");
        e1.setAddress("Beautiful Ave");
        e1.setPhone("444-555-6666");

        System.out.println("My name is " + e1.getName());
        System.out.println("My date of birth is " + e1.getDob());
        System.out.println("My address is " + e1.getAddress());

        Employee e2 = new Employee("Mike", "2000-10-10", "Any address", "333-444-5555");

        //You use the name of the class to call a static method instead of using a specific instance variable
        Employee.displayEmployeeInfo("643");

        //A non-static method must be called (invoked) using a specific instance variable not the name of the class
        //e2.setName("Paul");



    }



}
