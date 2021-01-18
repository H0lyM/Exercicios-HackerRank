<<<<<<< HEAD
package Algorithms.Search;


import java.util.Arrays;

public class IceCreamParlor {
    //https://www.hackerrank.com/challenges/icecream-parlor/problem
    static int[] icecreamParlor(int m, int[] arr) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int n = i + 1; n < arr.length; n++) {
                if (arr[i] + arr[n] == m) {
                    result[0] = i + 1;
                    result[1] = n + 1;
                    return result;
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(icecreamParlor(5, new int[]{1, 4, 5, 3, 2})));
    }
}
=======
package Algorithms.Search;


import java.util.Arrays;

public class IceCreamParlor {
    //https://www.hackerrank.com/challenges/icecream-parlor/problem
    static int[] icecreamParlor(int m, int[] arr) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int n = i + 1; n < arr.length; n++) {
                if (arr[i] + arr[n] == m) {
                    result[0] = i + 1;
                    result[1] = n + 1;
                    return result;
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(icecreamParlor(5, new int[]{1, 4, 5, 3, 2})));
    }
}
>>>>>>> 84ad88698ffa5083bb99e9ba9b4787ccc52cccfa
