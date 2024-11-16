package Basic_Concepts;

class Computer{
    public void playMusic(){
        System.out.println("Playing music");
    }

    public String getmepen(int cost){
        System.out.println("Hello");
        return "pen";
    }

}

public class Methods {
    public static void main(String[] args) {
    Computer cmp = new Computer();
    cmp.playMusic();
    cmp.getmepen(100);

}
}
