package Calendar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


class Day6ComunicationDevice {

    public static void main(String args[]) throws IOException {

        File file = new File(
                "day6.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));


        String st;
        st = br.readLine();
        System.out.println(st);
        char[] t = st.toCharArray();
        System.out.println(t);
        int c = t.length;
        System.out.println(c);
        int points = 3;
        aa:
        for (int i = 0; i < c - 4; i++) {              //idzie po całym stringu
            System.out.println("===================================================");
            System.out.println("Pętla aa, badanie znaków od nr " + i + " do nr " + (i + 3));
            points++;
            bb:
            for (int j = 0; j < 4; j++) {                        //idzie po 4 znakach gdzie sie aktualnie znajduje
                System.out.println("Pętla bb, iteracja j nr: " + j);
                cc:
                for (int k = j + 1; k < 4; k++) {                  //porównyje pozostałe w czwórce do aktualnego j
                    System.out.println("Pętla cc, iteracja k nr: " + k);
                    if (t[i+j] == t[i+k]) {
                        System.out.println("Warunek t[j]=t[k] spełniony!");

                        continue aa;
                    }
                }

            }
            System.out.println("Nie powtórzyło się!! ");
            System.out.println("Characters needed: " + points);
            break aa;
        }

    }


}



