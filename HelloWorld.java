import mypackage.Car;
import mypackage.Employee;
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
        
}
}









