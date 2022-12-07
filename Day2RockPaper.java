package Calendar;

import java.io.*;

// Main class
public class Day2RockPaper {

    // main driver method
    public static void main(String[] args) throws Exception
    {

        // File path is passed as parameter
        File file = new File(
                "day2.txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        int score=0;
        int p2=0;
        int i =0;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)  {
            i++;

            if (st.equals("A X")) {score = score + 4; p2 = p2+3;}
            else if (st.equals("A Y")) {score = score + 8; p2 = p2 + 4;}
            else if (st.equals("A Z")) {score = score + 3; p2 = p2 + 8;}
            else if (st.equals("B X")) {score = score + 1; p2 = p2 + 1;}
            else if (st.equals("B Y")) {score = score + 5; p2 = p2 + 5;}
            else if (st.equals("B Z")) {score = score + 9; p2 = p2 + 9;}
            else if (st.equals("C X")) {score = score + 7; p2 = p2 + 2;}
            else if (st.equals("C Y")) {score = score + 2; p2 = p2 + 6;}
            else if (st.equals("C Z")) {score = score + 6; p2 = p2 + 7;}
            System.out.println(i);
            // Print the string
            System.out.println(st);
        }
        System.out.println(score+" score");
        System.out.println(p2+" part2");

    }

}