class Calculator{
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }

    public double add(double n1, int n2){
        return n1+n2;
    }

}






public class Method_overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double results = calc.add(0.3,20);
        System.out.println(results);


    }
}
