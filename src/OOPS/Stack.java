package OOPS;

public class Stack {
    int[] s = new int[10];
    int tos;
        Stack(){
            tos = -1;
        }

    void push(int item){
            s[++tos] = item;
    }

    void pop(){
            s[tos--] = 0;
    }
}
