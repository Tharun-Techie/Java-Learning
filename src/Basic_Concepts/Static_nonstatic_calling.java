package Basic_Concepts;

class Mobile{
    String model;
    int price;
    static String name;

//    void show(){
//        System.out.println("Name: "+name+"\nModel: "+model+"\nPrice: "+price);
//    }
// a non static variables cannot be dirctly accessed by static method (indirectly can pass onjects)
   static void show1(Mobile obj){
        System.out.println("in static method "+ "Name: "+name+"\nModel: "+obj.model+"\nPrice: "+obj.price);
    }
}



public class Static_nonstatic_calling {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.model = "S24 Ultra";
        obj1.price = 150000;

        Mobile.name = "SmartPhones";

        Mobile obj2 = new Mobile();
        obj2.price = 60000;
        obj2.model = "s24";
//        obj1.show();
        Mobile.show1(obj1);
        Mobile.show1(obj2);
    }
}

