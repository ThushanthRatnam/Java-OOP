package OOP.java.thushanth;

public class MainOverRiding {
    public static void main(String[] args) {
        OverRidingParent display = new OverRidingChild(); // upcasting
//        reference variable(display) of  the parent class (OverRidingParent) refers to object of the child class (OverridingChild)
        display.display("Thushanth overRiding");

        OverRidingParent object;
        object = new RunTiimePoly();
        object.run();
    }

}
