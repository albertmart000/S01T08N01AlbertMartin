package S01T08N01Ex03AlbertMartin;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> months = new ArrayList<>();

        months.add("Gener");
        months.add("Febrer");
        months.add("Mars");
        months.add("Abril");
        months.add("Maig");
        months.add("Juny");
        months.add("Juliol");
        months.add("Agost");
        months.add("Setembre");
        months.add("Octubre");
        months.add("Novembre");
        months.add("Desembre");

    //LLista mesos de l'any amb method reference.

        months.forEach(month -> System.out.println(month));

    }
}