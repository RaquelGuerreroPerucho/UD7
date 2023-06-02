package es.iesmz.ed.algoritmes;

public class SumaDescendent {
    static long numero=0,sumaNumero = 0;
    public SumaDescendent(long numero) {
        this.numero = numero;
    }

    public static long suma(long numero){
        long sumaNumero = 0;
        String cadenaNumeros = Long.toString(Math.abs(numero));

        for (int i = 0; i < cadenaNumeros.length(); i++) {
            char caracter = cadenaNumeros.charAt(i);

            if (Character.isDigit(caracter)) {
                int digit = Character.getNumericValue(caracter);
                sumaNumero += digit;
            }
        }

        if (numero < 0) {
            sumaNumero = -sumaNumero;
        }

        return sumaNumero;
    }

}
