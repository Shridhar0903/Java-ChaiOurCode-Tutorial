//Blueprint  for car design 
class Car {

    //Properties
    String Colour ;
    String Brand;

    //Method
    void drive(){
        System.out.println("Driving the car ....");
    }


}

public class ClassObject {

    public static void main(String[] args) {

        Car car1 = new Car(); //car1 is the one instance of Car Class . -- new Car () Create Object 
        car1.Brand = "BMW";
        car1.Colour="Black";

        car1.drive();
        System.out.println(car1.Brand);
         System.out.println(car1.Colour);
        
        
    }
    
}



// what is class - Class is the blueprint or template use dto create the object .
//what is OBject - Object is the Instance of class 