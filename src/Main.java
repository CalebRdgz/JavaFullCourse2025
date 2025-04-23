import java.util.Scanner;
import java.util.Random;
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

//        //MAD LIBS GAME
//        Scanner scanner = new Scanner(System.in);
//
//        String adjective1;
//        String noun1;
//        String adjective2;
//        String verb1;
//        String adjective3;
//
//        System.out.print("\nEnter an adjective (description): ");
//        adjective1 = scanner.nextLine();
//        System.out.print("Enter a noun (animal or person): ");
//        noun1 = scanner.nextLine();
//        System.out.print("Enter an adjective (description): ");
//        adjective2 = scanner.nextLine();
//        System.out.print("Enter a verb ending with -ing (action): ");
//        verb1 = scanner.nextLine();
//        System.out.print("Enter an adjective (description): ");
//        adjective3 = scanner.nextLine();
//
//        System.out.println("Today I went to a " + adjective1 + " zoo.");
//        System.out.println("In an exhibit, I saw a " + noun1 + ".");
//        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
//        System.out.println("I was " + adjective3 + "!");
//
//        scanner.close();

        //ARITHMETIC OPERATORS

//        int x = 10;
//        int y = 3;
//        int z;

//        z = x + y;
//        z = x - y;
//        z = x * y;
//        z = x / y;
//        z = x % y; //check if a number is even or odd (divisible or has a left over)

//        System.out.println(z);

        //Augmented Assignment Operators

//        int x = 10;
//        int y = 3;

//        x += y;
//        x -= y;
//        x *= y;
//        x /= y;
//        x %= y;
//
//        System.out.println(x);

        //Increment and Decrement Operators

//        int x = 1;
//
//        x--;
//        x--;
//
//        System.out.println(x);

        //ORDER OF OPERATIONS [P-E-M-D-A-S]
//        double result = 3 + 4 * (7-5) / 2.0;
//        System.out.println(result);

        //SHOPPING CART PROGRAM
//        Scanner scanner = new Scanner(System.in);
//
//        String item = "";
//        double price = 0;
//        int quantity = 0;
//        char currency = '$';
//        double total = 0;
//
//        System.out.print("What item would you like to buy?: ");
//        item = scanner.nextLine();
//        System.out.print("What is the price for each?: ");
//        price = scanner.nextDouble();
//        System.out.print("How many would you like?: ");
//        quantity = scanner.nextInt();
//
//        total = quantity * price;
//
//        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
//        System.out.println("Your total is " + currency + total);
//
//        scanner.close();

        // if statement = performs a block of code if it's condition is true

//        Scanner scanner = new Scanner(System.in);
//
//        String name;
//        int age;
//        boolean isStudent;
//
//        System.out.print("Enter your name: ");
//        name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        age = scanner.nextInt();
//
//        System.out.print("Are you a student? (true/false): ");
//        isStudent = scanner.nextBoolean();
//
//        //GROUP 1 - asking for your name
//        if(name.isEmpty()){
//            System.out.println("You didn't enter your name! 😡");
//        }else{
//            System.out.println("Hello " + name + "! 😄");
//        }
//
//        //GROUP 2 - checking your age
//        if(age >= 65){
//            System.out.println("You are a senior! 👴");
//        }
//        else if(age >= 18){
//            System.out.println("You are an adult! 👨");
//        }
//        else if(age == 0){
//            System.out.println("You are a baby! 👶");
//        }
//        else if(age < 0){
//            System.out.println("You haven't been born yet! 👼");
//        }
//        else{
//            System.out.println("You are a child! 👧");
//        }
//
//        //GROUP 3 - checking if you are a student
//        if(isStudent){
//            System.out.println("You are a student! 🧑‍🎓");
//        }else{
//            System.out.println("You are NOT a student 💼");
//        }
//
//        scanner.close();

//        Random random = new Random();
//
//        int number1;
//        int number2;
//        int number3;
//
//        // default range between -2billion and 2billion
//        number1 = random.nextInt(1, 101); // random number between 1 and 100
//        number2 = random.nextInt(1, 101);
//        number3 = random.nextInt(1, 101);
//
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);
//
//        double number;
//
//        number = random.nextDouble();
//
//        System.out.println(number);
//
//        boolean isHeads;
//
//        isHeads = random.nextBoolean();
//
//        if(isHeads){
//            System.out.println("HEADS");
//        }else{
//            System.out.println("TAILS");
//        }

//        System.out.println(Math.PI);
//        System.out.println(Math.E);

//        double result;
//        result = Math.pow(2, 5); //2 to the power of 5
//        result = Math.abs(-5); //absolute value of 5 (always positive)
//        result = Math.sqrt(9); //square root of 9 (3)
//        result = Math.round(3.14);
//        result = Math.ceil(3.14); //round up (ceiling)
//        result = Math.floor(3.99); //round down (floor)
//        result = Math.max(10, 20); //greater number (10 or 20?)
//
//        System.out.println(result);

        //HYPOTENUSE c = Math.sqrt(a^2 + b^2)

//        double a;
//        double b;
//        double c;
//
//        System.out.println("Find the hypotenuse of a Right triangle");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the length of side A: ");
//        a = scanner.nextDouble();
//
//        System.out.print("Enter the length of side B: ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//
//        System.out.println("The hypotenuse is " + c + "cm");
//
//        scanner.close();

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

//        Scanner scanner = new Scanner(System.in);
//
//        double radius;
//        double circumference;
//        double area;
//        double volume;
//
//        System.out.print("Enter the radius: ");
//        radius = scanner.nextDouble();
//
//        circumference = 2 * Math.PI * radius;
//
//        area = Math.PI * Math.pow(radius, 2);
//
//        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
//
//        System.out.printf("The circumference is: %.1fcm\n", circumference);
//        System.out.printf("The area is: %.1fcm²\n", area);
//        System.out.printf("The volume is: %.1fcm³\n", volume);
//
//        scanner.close();

        // printf

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

//        String name = "Spongebob";
//        char firstLetter = 'S';
//        int age = 30;
//        double height = 60.5;
//        boolean isEmployed = true;
//
//        System.out.printf("Hello %s\n", name); //intert a string = %s,
//        System.out.printf("Your name starts with a %c\n", firstLetter); //use \n for a new line
//        System.out.printf("You are %d years old \n", age);
//        System.out.printf("You are %.1f inches tall\n", height);
//        System.out.printf("Employed: %b\n", isEmployed);
//
//        System.out.printf("%s is %d years old", name, age);

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive (good for aligning numbers)

//        double price1 = 9.99;
//        double price2 = 100.15;
//        double price3 = -54.01;
//
//        System.out.printf("% .2f\n", price1);
//        System.out.printf("% .2f\n", price2);
//        System.out.printf("% .2f\n", price3);

        // [width]

        // 0 = zero padding
        // number - right justified padding
        // negative number - left justified padding

//        int id1 = 1;
//        int id2 = 23;
//        int id3 = 456;
//        int id4 = 7890;
//
//        System.out.printf("%-4d\n", id1);
//        System.out.printf("%-4d\n", id2);
//        System.out.printf("%-4d\n", id3);
//        System.out.printf("%-4d\n", id4);

        //COMPOUND INTEREST CALCULATOR

//        Scanner scanner = new Scanner(System.in);
//
//        double principal;
//        double rate;
//        int timesCompounded;
//        int years;
//        double amount;
//
//        System.out.print("Enter the principal amount: ");
//        principal = scanner.nextDouble();
//
//        System.out.print("Enter the interest rate (in %): ");
//        rate = scanner.nextDouble() / 100; //divide by 100 to turn 7 -> 0.07 for example
//
//        System.out.print("Enter the number of times compounded per year: ");
//        timesCompounded = scanner.nextInt();
//
//        System.out.print("Enter the number of years: ");
//        years = scanner.nextInt();
//
//        amount = principal * Math.pow(1 + (rate/timesCompounded), (timesCompounded * years));
//
//        System.out.printf("The amount after %d is $%.2f", years, amount);
//
//        scanner.close();

        //NESTED IF STATEMENTS

//        boolean isStudent = true; //is student, 10% discount
//        boolean isSenior = true; //if senior, 20% senior discount. If both, 30% discount
//        double price = 9.99;
//
//        if(isStudent){
//            if(isSenior){
//                System.out.println("You get a senior discount of %20");
//                System.out.println("You get a student discount of %10");
//                price *= 0.7;
//            }
//            else{
//                System.out.println("You get a student discount of 10%");
//                price *= 0.9;
//            }
//
//        }
//        else{
//            if(isSenior){
//                System.out.println("You get a senior discount of 20%");
//                price *= 0.8;
//            }
//            else {
//            price *= 1; //visualization
//            }
//        }
//        System.out.printf("The price of a ticket is: $%.2f", price);

        //STRING METHODS
        String name = "Password";

//        int length = name.length(); //get the length of name
//        char letter = name.charAt(0); //get the char at index 0
//        int index = name.indexOf("e"); //find FIRST occurrence of "e" in name
//        int lastIndex = name.lastIndexOf("o"); //find the LAST occurrence of "e" in name

//        name = name.toUpperCase(); //uppercase all letters in name
//        name = name.toLowerCase(); //lowercase all letters in name
//        name = name.trim(); //remove white space before or after name
//        name = name.replace("e", "o"); //replace "e" with "o"

        //methods that return boolean values:
//        System.out.println(name.isEmpty()); //check if name is empty
//
//        if (name.isEmpty()){
//            System.out.println("Your name is empty");
//        }
//        else{
//            System.out.printf("Hello %s\n", name);
//        }

        //check if name contains any spaces:
//        if (name.contains(" ")){
//            System.out.println("Your name contains a space");
//        }
//        else{
//            System.out.println("Your name DOESN'T contain any spaces");
//        }

        //check if two strings are equal:
//        if (name.equalsIgnoreCase("password")){
//            System.out.println("Your name can't be password");
//        }
//        else{
//            System.out.println("Hello " + name);
//        }


//        System.out.println(length);
//        System.out.println(letter);
//        System.out.println(index);
//        System.out.println(lastIndex);
//        System.out.println(name);



    }
}
