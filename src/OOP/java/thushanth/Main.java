<<<<<<< HEAD
package OOP.java.thushanth;public class Main {
=======
package OOP.java.thushanth;

public class Main {
    public static void main(String[] args) {
        Father family = new Father();
        family.disply_grandfather();
        family.display_father();

//        this keyword usage output
        Student student = new Student();
        student.student_detail("Thushanth", "IIT");
        student.display_details();

//        super keyword output
        EmployeeB employee = new EmployeeB();
        employee.Employee();

//        method overloading output
        OverLoading overload = new OverLoading();
        overload.add(1);
        overload.add(1,2);
        overload.add(1,2,3);
        overload.employee("thushanth", 1000);
        overload.employee(120, "fbdshfb");
        overload.employee("w", "kj");

//        over riding
        OverRidingChild display = new OverRidingChild();
        display.display("Hi");
        OverRidingParent display1 = new OverRidingParent();
        display1.display("Hi");
    }
>>>>>>> 9e2e625 (Initial commit)
}
