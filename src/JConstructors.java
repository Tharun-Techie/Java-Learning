
class JStudent{
    String name;
    int rollNo;
    int std;

    JStudent(String n,int r,int s){
        name = n;
        rollNo = r;
        std = s;

    }

    void show(String name, int rollNo, int std){
        System.out.println("Name: "+name);
        System.out.println("rollNo: "+rollNo);
        System.out.println("std: "+std);
    }
}

public class JConstructors {
    public static void main(String[] args){
        JStudent s1 = new JStudent("Tharun R",41,10);

        JStudent s2 = new JStudent("rajan",10,20);


        s1.show(s1.name, s1.rollNo, s1.std);
        s2.show(s2.name, s2.rollNo, s2.std);
    }
}
