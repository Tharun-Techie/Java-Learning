package Basic_Concepts;

class Student{
    int usn;
    String name;
    long ph;
}


public class Array_objects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Tharun R";
        s1.usn = 041;
        s1.ph = 8431267188L;

        Student s2 = new Student();
        s2.name = "Jayanth NB";
        s2.usn = 035;
        s2.ph = 8854451188L;

        Student s3 = new Student();
        s3.name = "Suresha P";
        s3.usn = 065;
        s3.ph = 7454512115L;

        Student[] student = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

//       for(Basic_Concepts.Student st:student){
//            System.out.println(st.name);
//        }

        for(int i =0; i<student.length;i++){
            System.out.println("Name:"+student[i].name);
            System.out.println("USN:"+student[i].usn);
            System.out.println("PH:"+student[i].ph);
        }
    }
}
