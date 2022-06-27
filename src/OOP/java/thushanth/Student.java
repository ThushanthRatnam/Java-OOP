<<<<<<< HEAD
package OOP.java.thushanth;public class Student {
=======
package OOP.java.thushanth;

public class Student {
    String name;
    String branch;

    public void student_detail(String name, String branch){
        this.name = name;
        this.branch = branch;
//        to invoke current class method here
        this.display_details();
    }

    public void display_details(){
        System.out.println("Student Name:- " + name);
        System.out.println("Student Branch:- " + branch);
    }
>>>>>>> 9e2e625 (Initial commit)
}
