package es.iesmz.ed.algoritmes;
import java.util.ArrayList;

public class Any {
    long numero;

    public Any(long numero) {
        this.numero = numero;
    }

    public int digitsDiferents(){
        ArrayList<Character> numeros = new ArrayList<>();
       String cadena= String.valueOf(numero);


        for (int i = 0; i < cadena.length(); i++) {
            if(!numeros.contains(cadena.charAt(i))) {
                numeros.add(cadena.charAt(i));
            }
        }
        return numeros.size();
    }

}
