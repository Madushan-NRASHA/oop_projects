package mypackage;

public class Employee {
   public String name;
   public int age;
    public void agefinder(){
        String a="adult";
        String c="child";
        if(age<=18){
           System.out.println("you are "+a);
        }else{
            System.out.println("you are "+c);
        }
    }
}
