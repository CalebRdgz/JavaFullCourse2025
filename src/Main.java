public class Main {

    public static void main(String[] args){ //need this method so that our program can run

        //THIS IS MY FIRST JAVA PROGRAM

        /*
        This
        is
        a
        multi-line
        comment
         */

        System.out.println("I like pizza!");
        System.out.println("It's really good!");
        System.out.println("Buy me pizza!");

        //2 steps to creating a variable
        //1. declaration
        //2, assignment

        int age = 30;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99; //double contains decimal
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

        String name = "Caleb";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Hello " + name + ", your favorite food is: " + food);
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);
        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if (forSale){
            System.out.println("There is a " + car + " for sale");
        }else {
            System.out.println("The " + car + " is not for sale");
        }
    }
}
