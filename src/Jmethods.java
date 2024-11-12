public class Jmethods {
    //method defination
    static int boxVolume(int length, int bredth, int hight) { // method header
        int vol = length * bredth * hight;  // method body
        return vol;
    }

    static void printLine() {
        System.out.println("Hello Akka");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static boolean TwoOrNot(int a) {
        int res = (int) (Math.log10(a) + 1);
        if (res == 2) return true;
        else return false;
        }




    public static void main(String[] args) {
        System.out.println("Calculation");
        System.out.println(boxVolume(190,32,432));
        int volume = boxVolume(10,4,39); // parseing arguments

//        System.out.println("Volume is : "+volume);

        printLine();

        System.out.println("Sum is "+sum(10,67));
         System.out.println("Sum is "+sum(670,62));

        System.out.println(TwoOrNot(892));

    }
}
