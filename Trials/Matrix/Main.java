// 🎮 Implement Tic-Tac-Toe (n x n Board)


// Design a class TicTacToe to simulate a game of tic-tac-toe on an n x n board played between two players.


// Game Rules:

// The board size is n x n.
// Each move is valid and is made on an empty cell.
// Players alternate turns. Once a player wins, no further moves are allowed.
// A player wins by placing n of their marks in a row — either horizontally, vertically, or diagonally.

package Trials.Matrix;
// import java.util.Arrays;
// import java.util.Scanner;

class TicTacToe {

    public static int n;
    
    public static int row[];
    public static int col[];
    public static int diag[];

    TicTacToe(int size){
        TicTacToe.n=size;
        row = new int[n];
        col = new int[n];
        diag = new int[n];
    }


    // public static String ticTacToe(){

        // boolean p1 = true;
        // boolean p2 = false;
        
        // int row[] = new int[n];
        // int col[] = new int[n];
        // int diag[] = new int[2];


        // for(int i=0; i<n*n; i++){

        //      if(p2 && checWin(row, col, diag, n)){
        //         return("Player 1 wins");
        //     } else if(p1 && checWin(row, col, diag, n)){
        //         return("Player 2 wins");
        //     }

        //     if(p1){

        //         String input = sc.nextLine();

        //         String positions[] = input.split(" ");

        //         int a = Integer.parseInt(positions[0]);
        //         int b = Integer.parseInt(positions[1]);

        //         row[a]+=1;
        //         col[b]+=1;

        //         if(a==b){
        //             diag[0]+=1;
        //         }
        //         if(a==n/2&&b==n/2 || a==0&&b==(n-1) || a==(n-1)&&b==0){
        //             diag[1]+=1;
        //         }

        //         p1=false;
        //         p2=true;

        //     }

        //     if(p2 && checWin(row, col, diag, n)){
        //         return("Player 1 wins");
        //     } else if(p1 && checWin(row, col, diag, n)){
        //         return("Player 2 wins");
        //     }

        //     if(p2){
        //         String input = sc.nextLine();

        //         String positions[] = input.split(" ");

                
        //         int a = Integer.parseInt(positions[0]);
        //         int b = Integer.parseInt(positions[1]);

        //         row[a]-=1;
        //         col[b]-=1;

        //         if(a==b){
        //             diag[0]-=1;
        //         }
        //         if(a==n/2&&b==n/2 || a==0&&b==(n-1) || a==(n-1)&&b==0){
        //             diag[1]-=1;
        //         }

        //         p2=false;
        //         p1=true;

        //     }
            // System.out.println(Arrays.toString(row));
            // System.out.println(Arrays.toString(col));
            // System.out.println(Arrays.toString(diag));

    //     }
    //     return("Game Draw");

    // }

    public int move(int a, int b, int p){
        if(p==1){
            row[a]+=1;
            col[b]+=1;

            if(a==b){
            diag[0]+=1;
            }
            if(a==TicTacToe.n/2&&b==TicTacToe.n/2 || a==0&&b==(TicTacToe.n-1) || a==(TicTacToe.n-1)&&b==0){
            diag[1]+=1;
            } 
            if(checWin(row, col, diag, TicTacToe.n)){
                return 1;
            }

        } else if(p==2){
            row[a]-=1;
            col[b]-=1;

            if(a==b){
                diag[0]-=1;
            }
            if(a==TicTacToe.n/2&&b==TicTacToe.n/2 || a==0&&b==(TicTacToe.n-1) || a==(TicTacToe.n-1)&&b==0){
                diag[1]-=1;
            }
            if(checWin(row, col, diag, TicTacToe.n)){
                return 2;
            }
        }
        return 0;
    }
    


    public static boolean checWin(int[] row, int[] col, int[] diag, int n){
        for(int i=0; i<row.length; i++){
            if(Math.abs(row[i])==n || Math.abs(col[i])==n){
                return true;
            }
        }
        for(int j=0; j<diag.length; j++){
            if(Math.abs(diag[j])==n){
                return true;
            }
        }
        return false;
    }
}

public class Main{
    public static void main(String[] args) {
        // System.out.println(ticTacToe());
        TicTacToe tictactoe = new TicTacToe(3);

        System.out.println(tictactoe.move(1, 1, 1));
        System.out.println(tictactoe.move(0, 0, 2));
        System.out.println(tictactoe.move(2, 0, 1));
        System.out.println(tictactoe.move(0, 2, 2));
        System.out.println(tictactoe.move(2, 1, 1));
        System.out.println(tictactoe.move(0, 1, 2));

    }
}
