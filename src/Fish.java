public class Fish extends Animal{

    //unique move method only for Fish class:
    @Override //lets devs know that this move() method is being overridden
    void move(){
        System.out.println("This animal is swimming");
    }
}
