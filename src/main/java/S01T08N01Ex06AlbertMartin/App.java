package S01T08N01Ex06AlbertMartin;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<String> textStrings = new ArrayList<>();
        textStrings.add("12345");
        textStrings.add("abc");
        textStrings.add("1");
        textStrings.add("123456789");
        textStrings.add("abcdefe");
        List<String> sortedStringList = new ArrayList<>();

    //Ordenem la llista de strings del més curt al més llarg

        textStrings.stream()
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.toCollection(() -> sortedStringList))
                .forEach(s -> System.out.println(s));

    }
}
