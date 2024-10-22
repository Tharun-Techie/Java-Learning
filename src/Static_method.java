import java.io.PrintStream;

class Mobiles{
    String model;
    int price;
    static String name;

    void show(){
        System.out.println("Name: "+name+"\nModel: "+model+"\nPrice: "+price);
    }

   static void show1(){
        System.out.println("in static methodd ");
    }
}



public class Static_method {
    public static void main(String[] args) {
        Mobiles obj1 = new Mobiles();
        obj1.model = "S24 Ultra";
        obj1.price = 150000;
        Mobiles.name = "Smart Phones";
        obj1.show();
        Mobiles.show1();
    }
}
