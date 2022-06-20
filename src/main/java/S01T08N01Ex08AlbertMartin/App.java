package S01T08N01Ex08AlbertMartin;

public abstract class App implements IReverse{

    //Fem servir una Functional Interface per retornar un string al revés.

    public static void main(String[] args) {

        String phraseToReverse = "I amb aquest exercici finalitzem el Nivell 1.";
        IReverse ir = (phrase) -> phrase;
        String reversePhrase = ir.reverse(new StringBuilder(phraseToReverse)
                .reverse().toString());
        System.out.println(phraseToReverse);
        System.out.println(reversePhrase);

    }
}
