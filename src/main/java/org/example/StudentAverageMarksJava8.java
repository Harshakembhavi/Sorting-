package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentAverageMarksJava8 {
    public static void main(String[] args) {
        String[][] studentNameAndMarks= {{"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}};

        Map<String, List<Integer>> studentNameAndMark = Arrays.stream(studentNameAndMarks)
                .collect(Collectors.groupingBy(entry -> entry[0],
                        Collectors.mapping(entry -> Integer.parseInt(entry[1]), Collectors.toList())));

        double highestMarks = studentNameAndMark.entrySet().stream()
                .mapToDouble(entry -> entry.getValue().stream()
                .mapToInt(Integer::intValue).average().orElse(0.0)).max().orElse(0.0);
        System.out.println(highestMarks);
    }
}
