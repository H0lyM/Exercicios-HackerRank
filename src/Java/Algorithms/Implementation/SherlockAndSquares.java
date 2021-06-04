package Algorithms.Implementation;

import java.math.*;

public class SherlockAndSquares {
    //https://www.hackerrank.com/challenges/sherlock-and-squares/problem
    /*
    //Método que eu estava tentando antes, mas o código demora mais para rodar
        static int squares(int a, int b) {
            int squareCount = 0;
            while (a <= b) {
                double square1 = Math.sqrt(a);
                double square2 = Math.sqrt(b);
                double floor1 = Math.floor(square1);
                double floor2 = Math.floor(square2);

                if (square1 == square2) {
                    if (square1 == floor1) {
                        squareCount++;
                    }
                    break;
                }

                if (square1 == floor1) {
                    squareCount++;
                }
                if (square2 == floor2) {
                    squareCount++;
                }
                b--;
                a++;
            }
            return squareCount;
        }

     */
    static int squares(int a, int b) {
        int square = 1;
        int squareCount = 0;

        while (square * square <= b) {
            if (square * square >= a){
                squareCount++;
            }
            square++;
        }
        return squareCount;
    }

    public static void main(String[] args) {
        System.out.println(squares(2793360, 318714114));
    }
}
