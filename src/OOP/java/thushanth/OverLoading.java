package OOP.java.thushanth;

public class OverLoading {
//    changing number of parameters
    public void add(int a){
        System.out.println(a);
    }
    public void add(int a, int b){
        System.out.println(a + b);

    } public void add(int a, int b, int c){
        System.out.println(a + b +c);
    }

//    changing data types
    public void employee(int salary, String name){
        System.out.println(salary + name);
    }
    public void employee(String name, int salary){
        System.out.println(name + salary);
    }
    public void employee(String type, String name){
        System.out.println(type + name);
    }

}
