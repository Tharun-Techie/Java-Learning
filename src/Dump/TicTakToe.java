package Dump;
import java.util.Scanner;


public class TicTakToe {
    static char input(){
        Scanner obj = new Scanner(System.in);
        String inp = obj.next();
        char ch = inp.charAt(0);
        return ch;
    }
    static void printGrid(char[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print("|" + grid[row][col] + "|");
            }
            System.out.println();
        }
    }

    static boolean isWinner(char[][] grid) {
        if ((grid[0][0] == (grid[0][1]) && (grid[0][1] == (grid[0][2])))) {
            if (grid[0][0] == 'x' || grid[0][0] == 'o') return true;
        }
        if ((grid[1][0] == (grid[1][1]) && (grid[1][1] == (grid[1][2])))){
            if (grid[1][0] == 'x' || grid[1][0] == 'o') return true;
        }
        if ((grid[2][0] == (grid[2][1]) && (grid[2][1] == (grid[2][2])))){
        if (grid[2][0] == 'x' || grid[2][0] == 'o') return true;
        }
        if ((grid[2][0] == (grid[1][1]) && (grid[1][1] == (grid[0][2])))){
        if (grid[2][0] == 'x' || grid[2][0] == 'o') return true;
        }
        if ((grid[0][0] == (grid[1][1]) && (grid[1][1] == (grid[2][2])))){
        if (grid[0][0] == 'x' || grid[0][0] == 'o') return true;
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        Scanner object = new Scanner(System.in);
        System.out.println("Tic Tok Toe Game: ");
        printGrid(grid);
        while(true){
        System.out.println("Start the game: x --> player 1 | o --> player 2");
        String val = object.next();
        char ans = val.charAt(0);
        switch (ans){
            case 'x':


            case 'o':





        }
        }
    }
}
