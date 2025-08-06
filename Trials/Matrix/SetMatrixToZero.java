package Trials.Matrix;

import java.util.Arrays;

public class SetMatrixToZero {

    public static void setToZero(int[][] mat){

        int col = 1;

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 0){
                    if(j == 0){
                        col = 0;
                    } else{
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                    }
                }
            }
        }

        for(int i=1; i<mat.length; i++){
            for(int j=1; j<mat[0].length; j++){
                if(mat[i][0] == 0 || mat[0][j] == 0){
                    mat[i][j] = 0;
                }

            }
        }

            if(mat[0][0] == 0){
                for(int k=0; k<mat[0].length; k++){
                    mat[0][k] = 0;
                }
            }


            if(col == 0){
                 for(int k=0; k<mat.length; k++){
                    mat[k][0] = 0;
                }
            }

    }
    public static void main(String[] args) {
        int[][] matrix = {{0, 1}};
        System.out.println(Arrays.deepToString(matrix));
        setToZero(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
