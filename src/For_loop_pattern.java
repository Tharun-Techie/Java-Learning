public class For_loop_pattern {

    public static void main(String[] args) {

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
    int n = 5;
        for(int row = 1;row<=n;row++){
            for(int col = n-row+1;col>=1;col-- ){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
