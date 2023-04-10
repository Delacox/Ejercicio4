// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Ejercicio IF
       int numeroif = -2;

        if (numeroif > 0) {
            System.out.println("Numero positivo");
        } else if (numeroif < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Es 0");
        }

        //Ejercicio While
        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println("El numero es " + numeroWhile);
            numeroWhile++;

        }

        //Ejercicio Do While
        int numeroDoWhile = 0;
        do {
            System.out.println("El numero es " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile == 0 );


        //Ejercicio for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //Ejercicio Switch
        String estacion = "Verano";

        switch (estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;

            case "Invierno":
                System.out.println("Es invierno");
                break;

            case "Primavera":
                System.out.println("Es primavera");
                break;

            case "Otoño":
                System.out.println("Es otoño");

            default:
                System.out.println("La estacion esta mal");
        }


    }
}