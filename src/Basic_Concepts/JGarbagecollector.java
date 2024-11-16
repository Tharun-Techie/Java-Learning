package Basic_Concepts;

class BBox{
    private int length;
    private int bredth;
    private int hight;

    void setDim(int length,int bredth,int hight){
        this.bredth = bredth;
        this.length = length;
        this.hight = hight;
    }
        int volume(){
        return bredth*length*hight;
    }


}

public class JGarbagecollector {
    public static void main(String[] args) {
          BBox red = new BBox();
          BBox black = new BBox();
            red.setDim(10,58,96);
        System.out.println("Volume is "+red.volume());

        //dereferencing
        red = null;
        red  = black;
        // just give new blackboxx();
        //finalize
        System.gc();
        Runtime.getRuntime().gc();
    }


}
