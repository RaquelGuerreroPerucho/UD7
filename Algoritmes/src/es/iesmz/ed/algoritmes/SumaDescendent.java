package es.iesmz.ed.algoritmes;

public class SumaDescendent {
    static long numero=0;
    public SumaDescendent(long numero) {
        this.numero = numero;
    }

    public static long suma(long numero){
        long sumaNumero = 0;
        boolean esNegativo = false;
        if (numero < 0) {
            esNegativo = true;
            numero = Math.abs(numero);
        }
        String cadenaNumeros = Long.toString(numero);
        for (int i = 0; i < cadenaNumeros.length(); i++) {
            String substringCadenaNums = cadenaNumeros.substring(i);
            long subNumero = Long.parseLong(substringCadenaNums);
            sumaNumero += subNumero;
        }

        if (esNegativo == true) {
            sumaNumero = sumaNumero * -1;
        }
        return sumaNumero;
    }
}
