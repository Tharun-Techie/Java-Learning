package ProjectNQT;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the size of the Array");
    int n = ob.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++){
        int a = ob.nextInt();
        arr[i] = a;
        }
    for(int aa: arr){
        System.out.print(aa+"\t");
        }
    }
}
