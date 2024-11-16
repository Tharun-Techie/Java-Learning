package Basic_Concepts;

import javax.xml.namespace.QName;

class Mobiles{
    String brand;
    int price;
    static String Name;

    public Mobiles(){
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    static {
        Name = "Phone";
        System.out.println("in static block");
    }
}


public class static_block {
    public static void main(String[] args) throws Exception{
//        Mobiles obj = new Mobiles();
//        obj.price = 1000;
//        obj.brand = "Applu";
//        Mobiles.Name = "Smart phones";
//
//        Mobiles ob2 = new Mobiles();

        Class.forName("Mobiles");

    }
}
