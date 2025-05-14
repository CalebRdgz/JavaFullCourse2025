public class Person {

    //Any person object has these attributes:
    String first;
    String last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    void showName(){
        System.out.println(this.first + " " + this.last);
    }
}
