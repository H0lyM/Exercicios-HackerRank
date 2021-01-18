<<<<<<< HEAD
package Algorithms.Warmup;

public class TimeConversion {
    //https://www.hackerrank.com/challenges/time-conversion/problem
    static String timeConversion(String s) {
        String horaConvertida = "";
        int hh = Integer.valueOf(s.substring(0, 2));
        if (s.substring(8, 9).equals("P") || s.substring(8, 9).equals("p")) {
            if (hh == 12) {
                horaConvertida = "12" + s.substring(2, 8);
            } else {
                hh += 12;
                horaConvertida = hh + s.substring(2, 8);
            }

        } else {
            if (hh == 12) {
                horaConvertida = "00" + s.substring(2, 8);
            } else {
                horaConvertida = s.substring(0, 8);
            }

        }
        return horaConvertida;
    }

    public static void main(String[] args) {
        String hora12 = "12:40:22PM";
        System.out.println(timeConversion(hora12));
    }
}
=======
package Algorithms.Warmup;

public class TimeConversion {
    //https://www.hackerrank.com/challenges/time-conversion/problem
    static String timeConversion(String s) {
        String horaConvertida = "";
        int hh = Integer.valueOf(s.substring(0, 2));
        if (s.substring(8, 9).equals("P") || s.substring(8, 9).equals("p")) {
            if (hh == 12) {
                horaConvertida = "12" + s.substring(2, 8);
            } else {
                hh += 12;
                horaConvertida = hh + s.substring(2, 8);
            }

        } else {
            if (hh == 12) {
                horaConvertida = "00" + s.substring(2, 8);
            } else {
                horaConvertida = s.substring(0, 8);
            }

        }
        return horaConvertida;
    }

    public static void main(String[] args) {
        String hora12 = "12:40:22PM";
        System.out.println(timeConversion(hora12));
    }
}
>>>>>>> 84ad88698ffa5083bb99e9ba9b4787ccc52cccfa
