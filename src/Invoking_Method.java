class Studentt {
    String Name;
    int rollNo;
    int[] marks = new int[3];

    int score() {
        return marks[0] + marks[1] + marks[2];
    }
}

public class Invoking_Method {
    int length;
    int bredth;
    int hight;

    Invoking_Method(int len,int bre,int hig){
        length = len;
        bredth = bre;
        hight = hig;
    }

    int area(){
        return length*bredth*hight;
    }

    int surfaceArea(){
        return bredth*length;
    }

    public static void main(String[] args) {
        Invoking_Method redBox = new Invoking_Method(545,345,32);


        System.out.println("Area of box: "+redBox.area());
        System.out.println("SurfaceArea of box: "+redBox.surfaceArea());

        Studentt s1 = new Studentt();
        s1.Name = "rajan";
        s1.marks[0] = 81;
        s1.marks[1] = 78;
        s1.marks[2] = 89;
        s1.rollNo = 5;
        System.out.println("Result: "+s1.score());

    }
}
