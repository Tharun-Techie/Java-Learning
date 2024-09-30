import java.beans.PropertyEditorSupport;

class Calculactor{
    public int addition(int num1, int num2){
        return num1+num2;
    }
}

class Class_object{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;


        Calculactor calc = new Calculactor();
        int result = calc.addition(num1,num2);
        System.out.printf("Addition of %d and %d is %d",num1,num2,result);
    }
}