package S01T08N01Ex02AlbertMartin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("taronja");
        colors.add("vermell");
        colors.add("groc");
        colors.add("blau");
        colors.add("negre");
        colors.add("violeta");
        colors.add("rosa");
        colors.add("blanc");
        colors.add("morat");

        List<String> filteredColorsO = new ArrayList<>();

    //Retornem una llista amb els strings que contenen la lletra 'o' i tenen
    //més de 5 lletres

        colors.stream()
                .filter(color -> color.contains ("o") && color.length()>5)
                .collect(Collectors.toCollection(() -> filteredColorsO))
                .forEach(color -> System.out.println(color));

    }
}