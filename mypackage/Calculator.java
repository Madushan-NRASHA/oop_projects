package mypackage;
//method overloading
public class Calculator {
   public void add(int a,int b){
        System.out.println("total is a:"+" "+(a+b));
   }
   public void add(double a,double b){ //differnt data types
    System.out.println("total is a:"+" "+(a+b));
}
    public void add(int a,int b,int c){ //different parameters
        System.out.println("total is a:"+" "+(a+b+c));
    }
    public void add(double a,double b,double c){
        System.out.println("total is a:"+" "+(a+b+c));
    }
}
