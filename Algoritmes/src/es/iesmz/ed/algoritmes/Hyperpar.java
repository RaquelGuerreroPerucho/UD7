package es.iesmz.ed.algoritmes;

public class Hyperpar {
    private long numero;

    public Hyperpar(long numero) {
        this.numero = numero;
    }

    public boolean esHyperpar(long numero){

            numero = Math.abs(numero);
            String num = String.valueOf(numero);
            for (int i = 0; i < num.length(); i++) {
                if(num.charAt(i) % 2!=0){
                    return false;
                }
            }
            return true;
    }
}
