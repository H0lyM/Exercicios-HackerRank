package Algorithms.Implementation;

public class AppendAndDelete {
    //https://www.hackerrank.com/challenges/append-and-delete/problem?h_r=next-challenge&h_v=zen
    static String appendAndDelete(String s, String t, int k) {
        int sizeInputStr = s.length();
        int sizeResultStr = t.length();

        String yes = "Yes";
        String no = "No";

        String croppedInputStr;
        String croppedResultStr;
        int numExtraString = 0;


        if (sizeInputStr == sizeResultStr) {
            if (s.equals(t)) {
                return yes;
            } else {
                croppedInputStr = s.substring(0, sizeInputStr);
                croppedResultStr = t.substring(0, sizeInputStr);

                while (k > 0 && !croppedInputStr.equals(croppedResultStr)) {
                    croppedInputStr = s.substring(0, sizeInputStr - numExtraString - 1);
                    croppedResultStr = t.substring(0, sizeInputStr - numExtraString - 1);
                    numExtraString++;
                    k--;
                }
                if (croppedInputStr.equals(t)) {
                    if (k == 0) {
                        return yes;
                    } else {
                        return no;
                    }

                } else if (numExtraString > k) {
                    return no;
                }

                while (numExtraString > 0 && k > 0) {
                    croppedInputStr = croppedInputStr + t.charAt(croppedInputStr.length());
                    numExtraString--;
                    k--;
                }
                if (croppedInputStr.equals(t)) {
                    return yes;
                }
            }
        } else if (sizeInputStr < sizeResultStr) {
            croppedInputStr = s;
            croppedResultStr = t.substring(0, sizeInputStr);
            int movesNeeded = sizeResultStr - sizeInputStr;
            if (croppedInputStr.equals(croppedResultStr)) {
                int movesToEqual = sizeResultStr - sizeInputStr;
                if (movesToEqual == k) {
                    return yes;
                } else if (movesNeeded % 2 == 0 && k % 2 == 0 && movesNeeded < k) {
                    return yes;
                } else if (movesNeeded % 2 == 1 && k % 2 == 1 && movesNeeded < k) {
                    return yes;
                } else {
                    return no;
                }
            } else {
                if (k <= 0) {
                    return no;
                } else {
                    int subRange = sizeInputStr;
                    while (k > 0 && !croppedInputStr.equals(croppedResultStr)) {
                        croppedInputStr = s.substring(0, subRange);
                        croppedResultStr = t.substring(0, subRange);
                        if (croppedInputStr.equals("")) {
                            break;
                        }
                        subRange--;
                        k--;
                    }
                    if (croppedInputStr.equals("")) {
                        if (sizeResultStr <= k) {
                            return yes;
                        } else {
                            return no;
                        }
                    } else {
                        if (sizeResultStr - croppedInputStr.length() <= k) {
                            return yes;
                        } else {
                            return no;
                        }
                    }
                }

            }

        } else if (sizeResultStr < sizeInputStr) {
            int necessaryMoves = sizeInputStr - sizeResultStr;
            croppedInputStr = s.substring(0, sizeResultStr);
            if (croppedInputStr.equals(t)) {
                if (necessaryMoves <= k) {
                    return yes;
                } else {
                    return no;
                }
            } else {
                croppedResultStr = t;
                croppedInputStr = s;
                int subResulChar = 2;
                while (!croppedInputStr.equals(croppedResultStr) && k > 0) {

                    if (croppedInputStr.length() == croppedResultStr.length()) {
                        croppedResultStr = t.substring(0, subResulChar);
                        subResulChar--;
                    }
                    if (croppedInputStr.equals("")) {
                        k--;
                        break;
                    }
                    croppedInputStr = s.substring(0, sizeInputStr - numExtraString - 1);
                    numExtraString++;
                    k--;
                }
                if (croppedInputStr.equals("")) {
                    if (sizeResultStr > k) {
                        return no;
                    } else {
                        return yes;
                    }
                } else {
                    if (croppedInputStr.length() - sizeResultStr <= k) {
                        return yes;
                    } else {
                        return no;
                    }
                }

            }

        }
        return "";
    }

    public static void main(String[] args) {
        //  System.out.println(appendAndDelete("qwertyuiop", "poiuytrewq", 2));
        //System.out.println(appendAndDelete("tacker", "hac", 8));
        //System.out.println(appendAndDelete("hat", "xereta", 8));
        //System.out.println(appendAndDelete("hat", "hatatata", 4));
        System.out.println(appendAndDelete("abcd", "abcdert", 10));
    }
}
