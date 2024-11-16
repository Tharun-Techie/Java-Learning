package Basic_Concepts;

class Stud{
    String name ;
    int age;
    int rollNo;

    Stud(String n,int a, int r){
        name = n;
        age = a;
        rollNo = r;
    }

}
public class students_constructors {
    public static void main(String[] args) {

    Stud s1 = new Stud("Rajan RajKumar",29,011);
    Stud s2 = new Stud("Tharun R", 22,041);
    Stud s3 = new Stud("Anand Srinivasan",57,001);

    Stud[] Slist = new Stud[3];

    Slist[0] = s1;
    Slist[1] = s2;
    Slist[2] = s3;

        for(Stud array:Slist){
            System.out.println(array.name);
            System.out.println(array.age);
            System.out.println(array.rollNo);
        }
    }

}
