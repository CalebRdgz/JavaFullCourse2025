import java.util.Scanner;
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
        //2. VARIABLES
//        System.out.println("I like pizza!");
//        System.out.println("It's really good!");
//        System.out.println("Buy me pizza!");
//
//        //2 steps to creating a variable
//        //1. declaration
//        //2, assignment
//
//        int age = 30;
//        int year = 2025;
//        int quantity = 1;
//
//        double price = 19999.99; //double contains decimal
//        double gpa = 3.5;
//        double temperature = -12.5;
//
//        char grade = 'A';
//        char symbol = '!';
//        char currency = '$';
//
//        boolean isStudent = false;
//        boolean forSale = true;
//        boolean isOnline = true;
//
//        String name = "Caleb";
//        String food = "pizza";
//        String email = "fake123@gmail.com";
//        String car = "Mustang";
//        String color = "red";
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
//        System.out.println("Hello " + name + ", your favorite food is: " + food);
//        System.out.println("Your gpa is: " + gpa);
//        System.out.println("Your average letter grade is: " + grade);
//        System.out.println("Your choice is a " + color + " " + year + " " + car);
//        System.out.println("The price is: " + currency + price);
//
//        if (forSale){
//            System.out.println("There is a " + car + " for sale");
//        }else {
//            System.out.println("The " + car + " is not for sale");
//        }
        //3. USER INPUT
        //(Scanner name of class) (scanner name of object)
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine(); //take the user input as "name"
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true or false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old.");
//        System.out.println("Your gpa is: " + gpa);
//
//        if(isStudent){
//            System.out.println("You are enrolled as a student");
//        }else{
//            System.out.println("You are NOT enrolled");
//        }
//
//        scanner.close(); //have to close the scanner after using it

        //COMMON ISSUES - accepting an int/double, then accepting a string:
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Enter your favorite color: "); //breaks by taking in the "/n" after entering age^
//        String color = scanner.nextLine();
//
//        System.out.println("You are " + age + " years old.");
//        System.out.println("You like the color " + color);
//
//        scanner.close();

//        //Scanner exercise
//        //reassign these variables with user input:
//        double width = 0;
//        double height = 0;
//        double area = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the width: ");
//        width = scanner.nextDouble();
//
//        System.out.print("Enter the height: ");
//        height = scanner.nextDouble();
//
//        //calculate the area:
//        area = width*height;
//
//        System.out.println("The area is: " + area + "cm^2");
//
//        scanner.close();

        //MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("\nEnter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb ending with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();

    }
}
