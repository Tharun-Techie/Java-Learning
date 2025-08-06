package tamil;
import java.util.Scanner;

class User {
        String name;
    String userName;
        private String userPswd;
    String userEmail;
    Scanner sb = new Scanner(System.in);

    void registerUser(){
        System.out.println("Enter Your Name");
        name = sb.next();

        System.out.println("Enter User Name");
        userName = sb.next();

        System.out.println("Enter you Email ID");
        userEmail = sb.next();

        System.out.println("Enter Password");
        userPswd = sb.next();
    }

    boolean isRegistered(){
        return userName != null;
    }
}

class Main{
    public static void main(String[] args) {
        User ramesh = new User();
        ramesh.registerUser();
        if (ramesh.isRegistered() == true){
            System.out.println("registration Successful");
        }
        else {
            System.out.println("Registration not successful");
        }


    }
}
