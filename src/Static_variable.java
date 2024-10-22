
class Staticc{
    String company;
    int price;
    static String name;

    void show(){
        System.out.println(company+" "+price);
        System.out.println(name);

    }
}



public class Static_variable {

    public static void main(String[] args) {
        Staticc obj1 = new Staticc();
        Staticc obj2 = new Staticc();

        Staticc.name = "Phone";
        obj1.company = "Samsung";
        obj1.price = 100000;

        obj2.company = "Apple";
        obj2.price = 150000;

        obj1.show();
        obj2.show();
    }
}
