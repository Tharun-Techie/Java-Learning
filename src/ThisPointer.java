class Box{
    int length;
    int bredth;
    int hight;

    void setDim(int b, int h, int l){
        this.bredth = b;
        this.length = l;
        this.hight = h;
    }
}


public class ThisPointer {
    public static void main(String[] args) {
        Box red = new Box();
        red.setDim(10,24,45);
        System.out.println(red.bredth);
        System.out.println(red.hight);
        System.out.println(red.length);

    }

}
