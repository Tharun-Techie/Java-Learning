package Dump;

class Ram{
    void ans(){
        System.out.println("Hare Rama Hare Krishna");
    }
}

class Demo{
    public static void demo(){
        System.out.println("I am from Demo 1");
    }
}

class  Demo2{
    public  void demo2(){
        System.out.println("I am From Demo 2");
    }
}


public class Test1 {


    public static void main(String[] args) {
        System.out.println("Hello java");

        Demo.demo();

        Demo2 object = new Demo2();
        object.demo2();

        Ram ram = new Ram();
            ram.ans();


    }

}



