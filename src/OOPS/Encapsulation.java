package OOPS;

class Student{
    private String Name;
    private int Age;

    void setName(String Name){
        this.Name = Name;
    }

    void setAge(int Age){
        this.Age = Age;
    }

    String getName(){
        return Name;
    }

    int getAge(){
        return Age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setName("Hello");
        obj.setAge(10);

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

    }

}
