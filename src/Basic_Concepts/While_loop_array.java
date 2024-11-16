package Basic_Concepts;

public class While_loop_array {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(a);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Index:%d Array_Value:%d",i,a[i]);;
            System.out.println();

        }
            System.out.println(a.length);
    }
}
