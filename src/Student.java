public class Student extends Person{

    double gpa;

    Student(String first, String last, double gpa){
        //any parameters the Parent needs, send it to them using "super" keyword:
        super(first, last); // super(first, last) = Person(first, last)
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }

}
