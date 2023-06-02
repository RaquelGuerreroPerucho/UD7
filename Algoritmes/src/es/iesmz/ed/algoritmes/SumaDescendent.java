package es.iesmz.ed.algoritmes;

public class SumaDescendent {
    static long numero=0,sumaNumero = 0;
    public SumaDescendent(long numero) {
        this.numero = numero;
    }

    public static long suma(){

        String cadenaNumeros = Long.toString(numero);
        for (int i = 0; i < cadenaNumeros.length(); i++) {
            String substringCadenaNums = cadenaNumeros.substring(i);
            long subNumero = Long.parseLong(substringCadenaNums);
            sumaNumero += subNumero;
        }
        return sumaNumero;
    }
}
