package Tamil;

import javax.swing.*;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Please enter the age: ");
        int age = obj.nextInt();

        if (age > 18 & age < 80) {
            System.out.println("You are elegible for voting!! \n Choose wisley");
        }
        else {
                System.out.println("Nope your age has to be reater than 18 or less than 100 \t for voing");
            }


    }
}
