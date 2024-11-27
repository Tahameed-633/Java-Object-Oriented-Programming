package Package1;

import java.util.ArrayList;

public class AssociationTest {
    public static void main(String[] args) {
        
        Address address = new Address("16", "1209", "Dhaka");
        Contact contact = new Contact("1234567890", "tahameed@gmail.com"); 
        Department department = new Department("Computer Science","Main Building"); 
        ArrayList<Courses> courses = new ArrayList<>();
       courses.add(new Courses("Engineering Physics-1","Nahid Farzana Juthi","PHY-109","4"));

        
        Student s1 = new Student("Tahameed", "15478", address, contact, department, courses);
        
        
        System.out.println(s1.toString());
    }
}