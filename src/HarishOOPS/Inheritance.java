package HarishOOPS;

class Animal{

    void Eating(){
        System.out.println("All Animals Will Eat to Survive");
    }
}

class Dog extends Animal{

    void Bark(){
        System.out.println("All Dogs Will Bark");
    }
}


public class Inheritance {
    public static void main(String[] args) {

    Dog dog1 = new Dog();
    Animal dog2 = new Dog();

        dog1.Bark();
        dog1.Eating();

        dog2.Eating();

        System.out.println();

    }
}
