public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    //constructor:
    Student(String name, int age, double gpa){
        this.name = name; //this.name = (student2.name = String name^) assigning student1's name to the name we receive
        this.age = age; //this.age = (student2.age = int age^) assigning student1's age to the age we receive
        this.gpa = gpa; //this.age = (student2.gpa = double gpa^) assigning student1's gpa to the gpa we receive
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying"); // this.name = student3.name is studying
    }

}
