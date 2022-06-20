package S01T08N01Ex05AlbertMartin;

public abstract class App implements IPiValue {

    //Fem servir una Functional Interface per retornar el valor de Pi assignat

    public static void main(String[] args) {

        IPiValue ipv = (piValue) -> piValue;
        double assignedPiValue = ipv.getPiValue(3.1415);
        System.out.println("El valor PI es: " + assignedPiValue);

    }
}