package Algorithms.Implementation;

import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {
    //https://www.hackerrank.com/challenges/migratory-birds/problem
    static int migratoryBirds(List<Integer> arr) {
        int[][] birdsCount = new int[arr.size()][2];

        for (Integer item : arr) {
            for (int i = 0; i < arr.size(); i++) {
                int id = birdsCount[i][0];
                if (id != item && id == 0) {
                    birdsCount[i][0] = item;
                    birdsCount[i][1] = 1;
                    break;
                } else if (id == item) {
                    birdsCount[i][1] += 1;
                    break;
                }
            }
        }
        int minId = Integer.MAX_VALUE;
        int maxBirdCount = 0;
        for (int i = 0; i < birdsCount.length; i++) {
            int id = birdsCount[i][0];
            int count = birdsCount[i][1];
            if (count > maxBirdCount) {
                minId = id;
                maxBirdCount = count;
            } else if (count == maxBirdCount) {
                if (id < minId) {
                    minId = id;
                    maxBirdCount = count;
                }
            }
            if (id == 0 && count == 0) {
                break;
            }
        }
        return minId;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 4, 4, 5, 3);
        System.out.println(migratoryBirds(list));
    }
}
