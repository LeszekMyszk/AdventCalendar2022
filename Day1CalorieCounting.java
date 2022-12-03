package Calendar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Day1CalorieCounting {

    private static final String DATA_FILE = "day1.txt";
    private static final String EOL = "\\r\\n";

    private List<Integer> readData() throws IOException {
        var content = new String(Files.readAllBytes(Paths.get(DATA_FILE)));

        return Arrays.stream(content.split(EOL + EOL))
                .map(elf -> Arrays.stream(elf.split(EOL)).mapToInt(Integer::parseInt).sum())
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    private void solve() throws IOException {
        var dataList = readData();
        var count = dataList.size();
        System.out.println(String.format("Elves amount: " + count));
        System.out.println(String.format("First place for elf with: %d", dataList.get(0))+ " calories");
        System.out.println(String.format("Second place for elf with: %d", dataList.get(1))+ " calories");
        System.out.println(String.format("Third place for elf with: %d", dataList.get(2))+ " calories");

        var total = IntStream.range(0, count-1).map(i -> dataList.get(i)).sum();
        System.out.println(String.format("All together elves's got: %d", total )+ " calories");

        var top3 = dataList.get(0)+dataList.get(1)+dataList.get(2);
        System.out.println(String.format("Top 3 elves together have: %d", top3)+ " calories");
    }

    public static void main(String[] args) {
        var puzzle = new Day1CalorieCounting();
        try {
            puzzle.solve();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
