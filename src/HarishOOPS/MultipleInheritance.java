package HarishOOPS;

class Father{

    void speak(){
        System.out.println("Talk like Father");
    }

}

class Mother{
    void speak(){
        System.out.println("Talk like Mother");
    }
}

class Child extends Father{

    void play(){
        System.out.println("Play like Child");
    }

        }

public class MultipleInheritance {

    public static void main(String[] args) {

        Child rajesh = new Child();

        rajesh.play();
        rajesh.speak();
    }

    // java does not support multiple inheritance - you have to use interface for doing this option

}
