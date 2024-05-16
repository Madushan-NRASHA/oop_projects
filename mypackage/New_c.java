package mypackage;

public class New_c {
    public String name;
    public int age;
    public String department;

    // Parameterized constructor
    public New_c(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
        
    }

    public New_c(){
        this.name="employee";
        this.age=25;
        this.department="IT";
    }

    public New_c(String name,int age){
        this.name=name;
        this.age=age;
    }
}
