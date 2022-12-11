package Calendar;

import java.io.*;
import java.sql.Array;
import java.util.Arrays;

class Day3StringSplit {

    public static void main(String args[]) throws IOException {

        File file = new File(
                "day3.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));
        String st;
        String st1;
        String st2;
        String table = "1abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //int points = table.indexOf('Z');      //sprawdzanie punktacji
        //System.out.println(points);           //sprawdzanie punktacji

        char[] st1Array = null;
        char[] st2Array = null;
        int points = 0;
        System.out.println("krok1");
        int wiersz = 1;
        while ((st = br.readLine()) != null) {
            //st = "nqfVfnFQnZQfFqzMZBPtppcBPPCBptcrbF";
            st1 = st.substring(0, st.length() / 2);
            st2 = st.substring(st.length() / 2);
            st1Array = st1.toCharArray();
            st2Array = st2.toCharArray();
            System.out.println("=========================================");
            System.out.println(st1);
            System.out.println(st2);
            System.out.println("Wiersz: " + wiersz);

            aa:
            for (int i = 0; i < st.length() / 2; i++) {
                //System.out.println("i :" + i + " ; litera1: " +st1Array[i]);
                bb:
                for (int j = 0; j < st.length() / 2; j++) {
                    //System.out.println("j: " + j + " ; litera2: " +st2Array[j]);
                    if (st1Array[i] == st2Array[j]) {
                        System.out.println("warunek wew. petli spełniony");
                        System.out.println(st2Array[j]);
                        System.out.println("Za to należy się tyle: " + table.indexOf(st2Array[j]) + " pkt");
                        points = points + table.indexOf(st2Array[j]);
                        System.out.println("Razem jest już: " + points + " pkt");
                        break aa;
                    }
                }

            }
            System.out.println(points);
            wiersz++;
        }
    }
}



