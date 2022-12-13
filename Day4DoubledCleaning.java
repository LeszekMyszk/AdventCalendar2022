package Calendar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Day4DoubledCleaning {

    public static void main(String args[]) throws IOException {

        File file = new File(
                "day4.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));

        String st;
        int points1 = 0;
        int points2 = 0;
        int totalpoints;

        while ((st = br.readLine()) != null) {

            String[] parts = st.split(",");
            String part1 = parts[0];
            String part2 = parts[1];
            String[] elf1 = part1.split("-");
            String elf11 = elf1[0];
            String elf12 = elf1[1];
            String[] elf2 = part2.split("-");
            String elf21 = elf2[0];
            String elf22 = elf2[1];
            int e11 = Integer.parseInt(elf11);
            int e12 = Integer.parseInt(elf12);
            int e21 = Integer.parseInt(elf21);
            int e22 = Integer.parseInt(elf22);

            System.out.println("=========================================");
            System.out.println("dane wejściowe: " + st);
            System.out.println(e11);
            System.out.println(e12);
            System.out.println(e21);
            System.out.println(e22);


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
    }


}



