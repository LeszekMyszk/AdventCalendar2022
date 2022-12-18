package Calendar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Day5movingContainersPart2 {

    public static void main(String args[]) throws IOException {

        File file = new File(
                "day5a.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("F");
        list1.add("H");
        list1.add("B");
        list1.add("V");
        list1.add("R");
        list1.add("Q");
        list1.add("D");
        list1.add("P");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("L");
        list2.add("D");
        list2.add("Z");
        list2.add("Q");
        list2.add("W");
        list2.add("V");

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("H");
        list3.add("L");
        list3.add("Z");
        list3.add("Q");
        list3.add("G");
        list3.add("R");
        list3.add("P");
        list3.add("C");

        ArrayList<String> list4 = new ArrayList<String>();
        list4.add("R");
        list4.add("D");
        list4.add("H");
        list4.add("F");
        list4.add("J");
        list4.add("V");
        list4.add("B");

        ArrayList<String> list5 = new ArrayList<String>();
        list5.add("Z");
        list5.add("W");
        list5.add("L");
        list5.add("C");

        ArrayList<String> list6 = new ArrayList<String>();
        list6.add("J");
        list6.add("R");
        list6.add("P");
        list6.add("N");
        list6.add("T");
        list6.add("G");
        list6.add("V");
        list6.add("M");

        ArrayList<String> list7 = new ArrayList<String>();
        list7.add("J");
        list7.add("R");
        list7.add("L");
        list7.add("V");
        list7.add("M");
        list7.add("B");
        list7.add("S");

        ArrayList<String> list8 = new ArrayList<String>();
        list8.add("D");
        list8.add("P");
        list8.add("J");

        ArrayList<String> list9 = new ArrayList<String>();
        list9.add("D");
        list9.add("C");
        list9.add("N");
        list9.add("W");
        list9.add("V");

        String st;
        List<ArrayList<String>> lista = new ArrayList<>();
        lista.add(list1);
        lista.add(list2);
        lista.add(list3);
        lista.add(list4);
        lista.add(list5);
        lista.add(list6);
        lista.add(list7);
        lista.add(list8);
        lista.add(list9);

        //st = br.readLine();
        int k=0;

        while ((st = br.readLine()) != null) {
            k++;

            st = st.replace("move ", "");
            st = st.replace("from ", "");
            st = st.replace("to ", "");

            String[] parts = st.split(" ");
            String part1 = parts[0];
            String part2 = parts[1];
            String part3 = parts[2];

            int m = Integer.parseInt(part1);
            int f = Integer.parseInt(part2);
            int t = Integer.parseInt(part3);


            System.out.println("===================================================================================");
            System.out.println("Wiersz: " +k);
            System.out.println("dane wejściowe: " + st);
            System.out.println(m);
            System.out.println(f);
            System.out.println(t);
            //int dlug = lista.get(1).size();
            //System.out.println(dlug);
            int j = lista.get(f-1).size();

            for (int i=0; i<m ; i++){

                System.out.println("================================");
                System.out.println("krok: " +(i+1));
                System.out.println("wielkość stosu skąd zabieramy: " + j);
                System.out.println("Przerzucamy literę: " + lista.get(f-1).get(j-m));
                lista.get(t-1).add(lista.get(f-1).get(j-m));
                System.out.println("Nowy stos [" + t + "] gdzie dołożyliśmy: " + lista.get(t-1));
                lista.get(f-1).remove(j-m);
                System.out.println("Nowy stos [" + f + "] skąd zabraliśmy: " + lista.get(f-1));
            }

/*
            if (((e11 <= e21) && (e12 >= e22)) || ((e11 >= e21) && (e12 <= e22))) {
                points1 += 1;
                System.out.println("Spełniony warunek części pierwszej - całkowite powtórzenie!");

            } else if (((e11 <= e21) && (e12 >= e21)) || ((e11 <= e22) && (e12 >= e22))) {
                points2 += 1;
                System.out.println("Spełniony warunek części drugiej - częściowe powtórzenie!");

            }
            System.out.println("Powtórzenia całkowite razem: " + points1);
            System.out.println("Powtórzenia częściowe razem: " + points2);

        }
        totalpoints = points1 + points2;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("==========================================");
        System.out.println("||  Powtórzenia wszystkie razem: " + totalpoints + "   ||");
        System.out.println("==========================================");

*/

        }
        System.out.println(lista);
    }


}





