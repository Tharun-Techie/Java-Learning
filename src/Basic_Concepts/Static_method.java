package Basic_Concepts;

class Phones{
    String name;
    int price;
    static String type;

     void show(){
        System.out.println("Type:"+type);
        System.out.println("Name:"+name + "\n" + "price:"+price);
    }

    void show1(){
         System.out.println("Static methods");
    }

    static void show2(Phones obj){
         System.out.println("Name:"+obj.name + "\n" + "price:"+obj.price);
    }
}
public class Static_method {
    public static void main(String[] args) {
        Phones.type = "Smartphones";
        Phones obj1 = new Phones();
        obj1.name = "Samsung S22 Ultra";
        obj1.price = 150000;
        obj1.show();

        Phones obj2 = new Phones();
        obj2.name = "iphone 15";
        obj2.price = 175000;
        obj2.show();

        Phones.show2(obj1);
        Phones.show2(obj2);

    }

}
