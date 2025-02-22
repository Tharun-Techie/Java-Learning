package HarishOOPS;

class Car{
    private double balance;
    String name;
    int model;
    double price;

    void disc(){
        System.out.println("Name: "+name);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price+" Lakhs");

    }

}



public class Main {
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.name = "BMW X7";
        bmw.model = 2007;
        bmw.price = 67.8;
        bmw.disc();
        System.out.println();
        Car tata = new Car();
        tata.name = "TATA SAFARI";
        tata.model = 2025;
        tata.price = 12.4;
        tata.disc();

    }
}
