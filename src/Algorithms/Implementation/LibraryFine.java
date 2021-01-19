package Algorithms.Implementation;

public class LibraryFine {
    //https://www.hackerrank.com/challenges/library-fine/problem?h_r=next-challenge&h_v=zen
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        //Same Month
        if (m1 == m2 && y1 == y2) {
            //Late in Month
            if (d1 > d2) {
                fine = (d1 - d2) * 15;
            }
        }//Late Month Same Year
        else if (m1 > m2 && y1 == y2) {
            fine = (m1 - m2) * 500;
        }//Late Year
        else if (y1 > y2) {
            fine = 10000;
        }

        return fine;
    }

    public static void main(String[] args) {

        libraryFine(9, 6, 2015, 6, 6, 2015);
    }
}
