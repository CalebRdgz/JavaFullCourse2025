public class Car {
//    //attributes that a car may have:
//    String make = "Tesla";
//    String model = "Model 3";
//    int year = 2022;
//    double price = 50000.99;
//    boolean isRunning = false;
//
//    //define methods:
//    void start(){
//        isRunning = true;
//        System.out.println("You start the engine");
//    }
//    void stop(){
//        isRunning = false;
//        System.out.println("You stop the engine");
//    }
//
//    void drive(){
//        System.out.println("You drive the " + model);
//    }
//
//    void brake(){
//        System.out.println("You brake the " + model);
//    }
    String model;
    String color;

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
