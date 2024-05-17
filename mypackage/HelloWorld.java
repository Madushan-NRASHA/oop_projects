package mypackage;
public class HelloWorld {
    public static void main(String[] args) {
        Car car=new Car(); //creation of the object
        car.color="red";//intialize attribute
        car.speed=150;
        car.weight=45.5;
        car.no=123;
        car.speed();
        car.color();
       
        Car car2=new Car();//creation new ot the obect
        car2.color="black";
        car2.speed=200;
        car2.weight=50.5;
        car2.no=321;
        car2.speed();
        car2.color();

        Employee employee=new Employee();
        employee.name="John";
        employee.age=18;
        employee.agefinder();
        employee.age=20;//overriding
        employee.agefinder();
       
        System.out.println( employee.department);

    New_c nC=new New_c();
    System.out.println(nC.name+" "+nC.age+" "+nC.department);

    New_c new_c1=new New_c("nirmal",12,"Maintance");
    System.out.println(new_c1.name+" "+new_c1.age+" "+new_c1.department);
     
    New_c new_c3=new New_c("namal",34);
    System.out.println(new_c3.name+" "+new_c3.age);    

        Rectangle rectangle=new Rectangle();
        System.out.println(Rectangle.count);
        Rectangle rectangle2=new Rectangle(7,4);
        System.out.println(Rectangle.count);
        Rectangle rectangle3=new Rectangle(10,6);
        System.out.println(Rectangle.count);
        System.out.println(rectangle.getArea()+" "+rectangle.perimeter());
        System.out.println(rectangle2.getArea()+" "+rectangle2.perimeter());
        System.out.println(rectangle3.getArea()+" "+rectangle3.perimeter());

        rectangle.length=15;
        rectangle.width=10;

        System.out.println(rectangle.getArea()+" "+rectangle.perimeter());

        Calculator calculator=new Calculator();

       calculator.add(10.7,20);
       calculator.add(10, 30);
       calculator.add(10.7, 30.5,56.5);
       calculator.add(45, 50, 100);
}
}



 





