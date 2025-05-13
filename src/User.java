public class User {

    String username;
    String email;
    int age;

    //Guest user:
    User(){
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }

    User(String username){
        this.username = username; // user2.username = username we receive through the argument^
        this.email = "Not provided";
        this.age = 0;
    }
    User(String username, String email){
        this.username = username; // user2.username = the username we receive through the argument^
        this.email = email; //user2.email = the email we receive in the argument
        this.age = 0;
    }
    User(String username, String email, int age){
        this.username = username; // user2.username = the username we receive through the argument^
        this.email = email; //user2.email = the email we receive in the argument
        this.age = age; // user3.age = the age we receive in the argument
    }

}
