import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) { //need this method so that our program can run

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
//        String name = "Password";

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

        //SUBSTRINGS
        //.substring() = Method used to extract a portion of a string
        // string.substring(start, end)

        //email slicer program:
//        String email;
//        String username;
//        String domain;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your email: ");
//        email = scanner.nextLine();
//
//        if(email.contains("@")){
//            username = email.substring(0, email.indexOf("@")); //get everything before the @
//            domain = email.substring(email.indexOf("@") + 1); //get everything after the @
//
//            System.out.printf("Your username: %s\n", username);
//            System.out.printf("Your domain: %s\n", domain);
//        }
//        else{
//            System.out.println("Emails must contain @");
//        }
//
//        scanner.close();

        //WEIGHT CONVERSION PROGRAM

        //Declare variables
//        Scanner scanner = new Scanner(System.in);
//        double weight;
//        double newWeight;
//        int choice;
//
//        //Welcome message
//        System.out.println("Weight conversion program");
//        System.out.println("1: Convert lbs to kgs");
//        System.out.println("2: Convert kgs to lbs");
//
//        //prompt for user choice
//        System.out.print("Choose an option: ");
//        choice = scanner.nextInt();
//        //option 1: convert lbs to kgs
//        if(choice == 1){
//            System.out.print("Enter the weight in lbs: ");
//            weight = scanner.nextDouble();
//            newWeight = weight * 0.453592;
//            System.out.printf("The new weight in kgs is: %.2f\n", newWeight);
//        }
//        //option 2: convert kgs to lbs
//        else if(choice == 2){
//            System.out.print("Enter the weight in kgs: ");
//            weight = scanner.nextDouble();
//            newWeight = weight * 2.20462;
//            System.out.printf("The new weight in lbs is: %.2f\n", newWeight);
//        }
//        //else print: not a valid choice≈
//        else{
//            System.out.println("That was not a valid choice");
//        }
//
//        scanner.close();

        // TERNARY OPERATOR

        // variable = (condition) ? ifTrue : ifFalse;

//        int score = 75;
//
//        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
//
//        System.out.println(passOrFail);

//        int number = 4;
//
//        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
//
//        System.out.println(evenOrOdd);

//        int hours = 13;
//
//        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
//        System.out.println(timeOfDay);
//
//        int income = 62400;
//
//        double taxRate = (income >= 40000) ? 0.25 : 0.15;
//
//        System.out.println(taxRate);

//        if(score >= 60){
//            System.out.println("PASS");
//        }
//        else{
//            System.out.println("FAIL");
//        }

        //TEMPERATURE CONVERTER

        //declare variables
//        Scanner scanner = new Scanner(System.in);
//        double temp;
//        double newTemp;
//        String unit;
//
//        //welcome message
//        System.out.print("Enter the temperature: ");
//        temp = scanner.nextDouble();
//
//        System.out.print("Convert to celcius or Fahrenheit? (C or F): ");
//        unit = scanner.next().toUpperCase();
//
//        // (condition) ? true : false;
//
//        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
//
//        System.out.printf("%.1f°%s", newTemp, unit);
//        scanner.close();

        // Enhanced switch = A replacement to many else if statements (Java14 feature)

        //Optimize this code using a switch:
//        String day = "PizzaDay";
//
//        if(day.equals("Monday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Tuesday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Wednesday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Thursday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Friday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Saturday")){
//            System.out.println("It is a weekend");
//        }
//        else if(day.equals("Sunday")){
//            System.out.println("It is a weekend");
//        }
//        else{
//            System.out.println(day + " is not a day");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the day of the week: ");
//        String day = scanner.nextLine();
//
//        //enhanced switch:
//        switch(day){
//            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday 🤕");
//            case "Saturday", "Sunday" -> System.out.println("It is is the weekend 😄");
//            default -> System.out.println(day + " is not a day");
//        }
//
////        switch(day){
////            case "Monday" -> System.out.println("It is a weekday 🤕");//(arrow = do this code)
////            case "Tuesday" -> System.out.println("It is a weekday 🤕");
////            case "Wednesday" -> System.out.println("It is a weekday 🤕");
////            case "Thursday" -> System.out.println("It is a weekday 🤕");
////            case "Friday" -> System.out.println("It is a weekday 🤕");
////            case "Saturday" -> System.out.println("It is the weekend 😄");
////            case "Sunday" -> System.out.println("It is is the weekend 😄");
////            default -> System.out.println(day + " is not a day");
////        }
//
//        scanner.close();

        //CALCULATOR PROGRAM
//        Scanner scanner = new Scanner(System.in);
//
//        double num1;
//        double num2;
//        char operator;
//        double result = 0;
//        boolean validOperation = true;
//
//        System.out.print("Enter the first number: ");
//        num1 = scanner.nextDouble();
//
//        System.out.print("Enter an operator: (+, -, *, /, ^): ");
//
//        operator = scanner.next().charAt(0); //just get the first letter of user input, keeping it a char instead of a string
//
//        System.out.print("Enter the second number: ");
//        num2 = scanner.nextDouble();
//
//        //enhanced switch to examine user operator against our cases:
//        switch (operator){
//            case '+' -> result = num1 + num2;
//            case '-' -> result = num1 - num2;
//            case '*' -> result = num1 * num2;
//            case '/' -> {
//                if(num2 == 0){
//                    System.out.println("Cannot divide by zero!");
//                    validOperation = false;
//                }
//                else{
//                    result = num1 / num2;
//                }
//            }
//            case '^' -> result = Math.pow(num1, num2);
//            default -> {
//                System.out.println("Invalid operator!");
//                validOperation = false;
//            }
//        }
//
//        if(validOperation){
//            System.out.println(result);
//        }
//
//        scanner.close();

        // && = AND
        // !! = OR
        // ! = NOT

//        Scanner scanner = new Scanner(System.in);
//        // username must be between 4-12 characters
//        // username must NOT contain spaces, or underscores
//
//        String username = "";
//
//        System.out.print("Enter your username: ");
//        username = scanner.nextLine();
//
//        if(username.length() < 4 || username.length() > 12){
//            System.out.println("Username must be between 4-12 characters");
//        }
//        else if(username.contains(" ") || username.contains("_")){
//            System.out.println("Username must NOT contain spaces or underscores");
//        }
//        else{
//            System.out.println("Welcome " + username);
//        }
//
//        scanner.close();

//        double temp = 35;
//        boolean isSunny = true;
//
//        if(temp <= 30 && temp >= 0 && isSunny){
//            System.out.println("The weather is GOOD😄");
//            System.out.println("It is SUNNY outside ☀️");
//        }
//        else if(temp <= 30 && temp >= 0 && !isSunny){
//            System.out.println("The weather is GOOD😄");
//            System.out.println("It is CLOUDY outside ☁️");
//        }
//        else if(temp > 30 || temp < 0){
//            System.out.println("The weather is bad 😫");
//        }

        //WHILE LOOPS = repeat some code forever
        //              while some condition remains true

//        Scanner scanner = new Scanner(System.in);

//        int age = 0;
//
//        System.out.print("Enter your age: ");
//        age = scanner.nextInt();

//        while(age < 0){
//            System.out.println("Your age can't be negative");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//        }
//        System.out.println("You are " + age + " years old");

        // DO WHILE LOOP:
//        do{ //do this code first:
//            System.out.println("Your age can't be negative");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//        }while(age < 0); // check this condition at the end.
//
//        System.out.println("You are " + age + " years old");

//        int number = 0;
//
////        while(number < 1 || number > 10){
////            System.out.print("Enter a number between 1 - 10: ");
////            number = scanner.nextInt();
////        }
//
////        System.out.println("You picked " + number);
//
//        //convert to a do while loop:
//        do{
//            System.out.print("Enter a number between 1 - 10: ");
//            number = scanner.nextInt();
//        }while(number < 1 || number > 10);
//
//        System.out.println("You picked " + number);
//
//
//        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//
//        String name = "";
//
//        while(name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);
//
//        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//
//        String response = "";
//
//        while(!response.equals("Q")){
//            System.out.println("You are playing a game");
//            System.out.println("Press Q to quit");
//            response = scanner.next().toUpperCase(); //.next() for a single character
//        }
//
//        System.out.println("You have quit the game");
//
//        scanner.close();



        //WARNING: INFINITE LOOP: (always update the condition inside a while loop)
//        while(1 == 1){
//            System.out.println("HELP! I'M STUCK IN A LOOP!");
//        }

//        if(name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//
//        }

        //NUMBER GUESSING GAME

//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int guess; //guess a random number between 1 - 100
//        int attempts = 0; //amount of attempts it took the user to geuss the right nunber
//        int min = 1;
//        int max = 100;
//        int randomNumber = random.nextInt(min, max + 1); //generate a random number between range min - max
//
//        System.out.println("Number Guessing Game");
//        System.out.printf("Guess a number between %d-%d:\n", min, max);
//
//        do{
//            System.out.print("Enter a guess: ");
//            guess = scanner.nextInt();
//            attempts++;
//
//            if(guess < randomNumber){
//                System.out.println("TOO LOW! Try again");
//            }
//            else if(guess > randomNumber){
//                System.out.println("TOO HIGH! Try again");
//            }
//            else{
//                System.out.println("CORRECT! The number was " + randomNumber);
//                System.out.println("# of attempts " + attempts);
//            }
//        }while(guess != randomNumber);
//
//        scanner.close();

        //for loop = execute some code a CERTAIN amount of times
//        for(int i = 10; i > 0; i-=3){
//            System.out.println(i);
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter how many times you want to loop: ");
//        int max = scanner.nextInt();
//
//        for(int i = 1; i <= max; i++){
//            System.out.println(i);
//        }
//
//        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("How many seconds to countdown from?");
//        int start = scanner.nextInt();
//
//        scanner.close();
//
////        int start = 10;
//
//        for(int i = start; i > 0; i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//
//        System.out.println("HAPPY NEW YEAR!");

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

//        for(int i = 0; i < 10; i++){
//
//            if(i == 5){
//                continue;
//            }
//
//            System.out.print(i + " ");
//        }

        // nested loop = A loop inside another loop
        // Used often with matrices or Data Structures and Algorithms

//        for(int i = 1; i <= 9; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for(int i = 1; i <= 9; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for(int i = 1; i <= 9; i++){
//            System.out.print(i + " ");
//        }

        //DONT REPEAT CODE^^^

//        for(int i = 1; i <= 3; i++){
//
//            for(int j = 1; j <= 9; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        //create a matrix of a symbol that user types in. user sets rows and columns of matrix

//        Scanner scanner = new Scanner(System.in);
//
//        int rows;
//        int columns;
//        char symbol;
//
//        System.out.print("Enter the # of rows: ");
//        rows = scanner.nextInt();
//
//        System.out.print("Enter the # of columns: ");
//        columns = scanner.nextInt();
//
//        System.out.print("Enter the symbol to use: ");
//        symbol = scanner.next().charAt(0);
//
//        for(int i = 0; i < rows; i++){
//
//            for(int j = 0; j < columns; j++){
//                System.out.print(symbol);
//            }
//            System.out.println();
//        }
//
//
//        scanner.close();

        //method = a block of reusable code that is executed when called ()

        //methods are NOT familiar with variables inside OTHER methods

//        System.out.println("Happy Birthday to you!");
//        System.out.println("Happy Birthday dear you!");
//        System.out.println("You are x years old!");
//        System.out.println("Happy Birthday to you!");

        //methods are NOT familiar with variables inside OTHER methods, unless in arguments:
//        String name = "Patrick";
//        int age = 38;
//
//        happyBirthday(name, age);

//        double result = square(3);
//        System.out.println(result);
        //OR:
//        System.out.println(square(3));

//        System.out.println(cube(3));

        //return = send the result of the "getFullName" method back to "fullName" variable:
//        String fullName = getFullName("Spongebob", "Squarepants");
//        System.out.println(fullName);
//
//        int age = 12;
//        if(ageCheck(age)){
//            System.out.println("You may sign up!");
//        }
//        else{
//            System.out.println("You must be 18+ to sign up");
//        }


        // overloaded methods = methods that share the same name, but different parameters
        // method signature = name + parameters (no two methods can share a signature)
//        System.out.println(add(1, 2, 3, 4));

//        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
//
//        System.out.println(pizza);

        //variable scope = where a variable can be accessed
        //Local scope = Inside of a method, if you declare a variable, it has a local scope
//        int x = 1; //LOCAL VARIABLE SCOPE
//
//        System.out.println(x);
//
//        doSomething();

        // JAVA BANKING PROGRAM FOR BEGINNERS

        // DECLARE VARIABLES
//        double balance = 0;
//        boolean isRunning = true;
//        int choice; //user will make a choice to show balance, deposit, or withdraw
//
//        while(isRunning){
//            // DISPLAY MENU
//            System.out.println("***************");
//            System.out.println("BANKING PROGRAM");
//            System.out.println("***************");
//            System.out.println("1. Show Balance");
//            System.out.println("2. Deposit");
//            System.out.println("3. Withdraw");
//            System.out.println("4. Exit");
//            System.out.println("***************");
//
//
//            // GET AND PROCESS USERS CHOICE
//            System.out.print("Enter your choice: (1-4): ");
//            choice = scanner.nextInt();
//
//            switch(choice){
//                case 1 -> showBalance(balance);
//                case 2 -> balance += deposit();
//                case 3 -> balance -= withdraw(balance);
//                case 4 -> isRunning = false;
//                default -> System.out.println("Invalid choice!");
//            }
//        }
//
//        // showBalance()
//        // deposit()
//        // withdraw()
//
//        // EXIT MESSAGE
//        System.out.println("***************");
//        System.out.println("Thank you! Have a nice day!");
//        System.out.println("***************");
//        scanner.close();

        // JAVA DICE ROLLER PROGRAM

        // DECLARE VARIABLES
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        //number of dice by user:
//        int numOfDice;
//        int total = 0;
//
//        // GET # OF DICE FROM THE USER
//        System.out.print("Enter the # of dice to roll: ");
//        numOfDice = scanner.nextInt();
//
//        // CHECK IF # OF DICE IS GREATER THAN 0
//        if(numOfDice > 0){
//            // ROLL ALL THE DICE
//            for(int i = 0; i < numOfDice; i++){
//                int roll = random.nextInt(1, 7); //num between 1 and 6
//                printDie(roll);
//                System.out.println("You rolled: " + roll);
//                // GET THE TOTAL
//                total += roll;
//            }
//            System.out.println("Total: " + total);
//
//        }
//        else{
//            System.out.println("# of dice must be greater than 0");
//        }
//        // DISPLAY ASCII ART OF DICE (METHOD)
//
//        scanner.close();

        //array = a collection of values of the same data type
        // * think of it as a variable that can store more than 1 value

//        String[]  fruits = {"apple", "orange", "banana", "coconut"};

//        fruits[1] = "pineapple";
//        int numOfFruits = fruits.length;

//        System.out.println(fruits[1]);
//        System.out.println(numOfFruits);

//        for(int i = 0; i < fruits.length; i++){
//            System.out.print(fruits[i] + " ");
//        }

//        Arrays.sort(fruits);
//        Arrays.fill(fruits, "pineapple");
//
//        //enhanced for loop (for each loop):
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

        // Enter user input into array:
//        Scanner scanner = new Scanner(System.in);
//
//        String[] foods;
//        int size;
//
//        System.out.print("What number of food do you want?: ");
//        size = scanner.nextInt();
//        scanner.nextLine(); //capture that \n after a scanner
//
//        foods = new String[size];
//
////        foods[0] = "pizza";
////        foods[1] = "taco";
////        foods[2] = "hamburger";
//
//        for(int i = 0; i < foods.length; i++){
//            System.out.print("Enter a food: ");
//            foods[i] = scanner.nextLine();
//        }
//
//        for(String food : foods){
//            System.out.println(food);
//        }
//
////        System.out.println(foods.length);
//        scanner.close();

        //search an array:
//        Scanner scanner = new Scanner(System.in);
//
//
//        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
//        String[] fruits = {"apple", "orange", "banana"};
//        boolean isFound = false;
//        String target;
////        int target = 1;
//
//        while(!isFound){
//            System.out.print("Enter a fruit to search for: ");
//            target = scanner.nextLine();
//
//            //linear search:
//            for(int i = 0; i < fruits.length; i++){
//                if(fruits[i].equals(target)){
//                    System.out.println("Element found at index: " + i);
//                    isFound = true;
//                    break;
//                }
//            }
//
//            if(!isFound){
//                System.out.println("Element not found in the array");
//            }
//        }
//
//        scanner.close();

        // varargs (variable arguments) = allows a method to accept ANY # of arguments
        // makes methods more flexible, no need for overloaded methods
        // java will pack the arguments into an array
        // ,,, (ellipsis)

//        System.out.println(add(1, 2, 3, 4, 5, 6));
//
//        System.out.println(average(1, 2, 3, 4, 5, 6, 7));
//        System.out.println(average());

        // 2D ARRAYS = An array where each element is an array
        // useful for storing a matrix of data
//        String[] fruits = {"apple", "orange", "banana"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork", "beef", "fish"};
//
//        //2d array:
////        String[][] groceries = {fruits, vegetables, meats};
//        String[][] groceries = {{"apple", "orange", "banana"},
//                {"potato", "onion", "carrot"},
//                {"chicken", "pork", "beef", "fish"}};
//
//        groceries[0][0] = "pineapple"; //row 0 column 0
//        groceries[1][0] = "celery"; //row 1 column 0
//        groceries[1][2] = "broccoli"; //row 1 column 2
//        groceries[2][1] = "eggs"; //row 2 column 1
//
//
//        for(String[] foods : groceries){
//            for(String food: foods){
//                System.out.print(food + " ");
//            }
//            System.out.println();
//        }

        //TELEPHONE NUMBER PAD 2D ARRAY:
//        char[][] telephone = {{'1', '2', '3'},
//                              {'4', '5', '6'},
//                              {'7', '8', '9'},
//                              {'*', '0', '#'}};
//
//        for(char[] row : telephone){
//            for(char number : row){
//                System.out.print(number + " ");
//            }
//            System.out.println();
//        }
        //JAVA QUIZ GAME:
        // QUESTIONS array[] to ask the user
        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was Facebook launched?",
                              "Who is known as the father of computer?",
                              "What was the first programming language?"};
        // OPTIONS array[][]
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard drive", "3. RAMc", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};
        // DECLARE VARIABLES
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);
        // WELCOME MESSAGE
        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        // QUESTION (loop)
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            // OPTIONS
            for(String option : options[i]){
                System.out.println(option);
            }
            // GET GUESS FROM USER
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            // CHECK YOUR GUESS
            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            }else{
                System.out.println("********");
                System.out.println(" WRONG! ");
                System.out.println("********");
            }
        }
        //DISPLAY FINAL SCORE
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }

//    static int add(int... numbers){
//        int sum = 0;
//
//        for(int number : numbers){
//            sum += number;
//        }
//
//        return sum;
//    }
//
//    static double average(double... numbers){
//        double sum = 0;
//
//        if(numbers.length == 0){
//            return 0;
//        }
//
//        for(double number : numbers){
//            sum += number;
//        }
//
//        return sum / numbers.length;
//    }


    //DISPLAY ASCII ART OF DICE METHOD:
//    static void printDie(int roll){
//        //MULTI LINE STRING:
//        String dice1 = """
//                  -------
//                 |       |
//                 |   ●   |
//                 |       |
//                  -------
//                """;
//        String dice2 = """
//                  -------
//                 | ●     |
//                 |       |
//                 |     ● |
//                  -------
//                """;
//        String dice3 = """
//                  -------
//                 | ●     |
//                 |   ●   |
//                 |     ● |
//                  -------
//                """;
//        String dice4 = """
//                  -------
//                 | ●   ● |
//                 |       |
//                 | ●   ● |
//                  -------
//                """;
//        String dice5 = """
//                  -------
//                 | ●   ● |
//                 |   ●   |
//                 | ●   ● |
//                  -------
//                """;
//        String dice6 = """
//                  -------
//                 | ●   ● |
//                 | ●   ● |
//                 | ●   ● |
//                  -------
//                """;
//        switch(roll){
//            case 1 -> System.out.println(dice1);
//            case 2 -> System.out.println(dice2);
//            case 3 -> System.out.println(dice3);
//            case 4 -> System.out.println(dice4);
//            case 5 -> System.out.println(dice5);
//            case 6 -> System.out.println(dice6);
//            default -> System.out.println("Invalid roll");
//        }
//    }


    //CLASS SCOPE SCANNER:
//    static Scanner scanner = new Scanner(System.in);
//
//
//    //showBalance():
//    static void showBalance(double balance){
//        System.out.println("***************");
//        System.out.printf("$%.2f\n", balance);
//    }
//
//    static double deposit(){
//
//        double amount;
//
//        System.out.print("Enter an amount to be deposited: ");
//        amount = scanner.nextDouble();
//
//        if(amount < 0){
//            System.out.println("Amount can't be negative");
//            return 0;
//        }
//        else{
//            return amount;
//        }
//    }
//
//    static double withdraw(double balance){
//        double amount;
//
//        System.out.print("Enter an amount to be withdrawn: ");
//        amount = scanner.nextDouble();
//
//        if(amount > balance) {
//            System.out.println("INSUFFICIENT FUNDS");
//            return 0;
//        }
//        else if(amount < 0){
//            System.out.println("Amount can't be negative");
//            return 0;
//        }
//        else{
//            return amount;
//        }
//    }

//    static int x = 3; //CLASS VARIABLE SCOPE (NO METHOD. OUT IN THE STREET)

//    static void doSomething(){
//        int x = 2; //LOCAL VARIABLE SCOPE
//        System.out.println(x);
//    }
    // OVERLOADED METHODS:
//    static String bakePizza(String bread){
//        return bread + " pizza";
//    }
//
//    static String bakePizza(String bread, String cheese){
//        return cheese + " " + bread + " pizza";
//
//    }static String bakePizza(String bread, String cheese, String topping){
//        return topping + " " + cheese + " " + bread + " pizza";
//    }

//    static double add(double a, double b){
//        return a + b;
//    }
//
//    static double add(double a, double b, double c){
//        return a + b + c;
//    }
//
//    static double add(double a, double b, double c, double d){
//        return a + b + c + d;
//    }

    //METHODS - outside of the main method:
//    static void happyBirthday(String birthdayBoy, int age){
//        System.out.println("Happy Birthday to you!");
//        //methods are NOT familiar with variables inside OTHER methods, unless in arguments:
//        System.out.printf("Happy Birthday dear %s!\n", birthdayBoy);
//        System.out.printf("You are %d years old!\n", age);
//        System.out.println("Happy Birthday to you!\n");
//    }
//
//    static double square(double number){
//        return number * number;
//    }
//
//    static double cube(double number){
//        return number * number * number;
//    }
//
//    //method that returns a full name after being given a first name and last name:
//    static String getFullName(String first, String last){
//        return first + " " + last;
//    }
//
//    //method to check user's age:
//    static boolean ageCheck(int age){
//        if(age >= 18){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }

}
