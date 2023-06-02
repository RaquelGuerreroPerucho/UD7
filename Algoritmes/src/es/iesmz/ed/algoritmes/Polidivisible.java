package es.iesmz.ed.algoritmes;

/**
 * Clase con una variable long y una función para saber si es un numero polidivisible
 */

public class Polidivisible
{
    private long numero;

    /**
     * Constructor.
     * @param numero es el numero que se va a comprobar.
     */

    public Polidivisible(long numero)
    {
        this.numero = numero;
    }

    /**
     * Funcion que devuelve true en caso de que el numero sea polidivisible..
     * @return boolean
     */

    public boolean esPolidivisible()
    {
        boolean esPolidivisible = true;

        String cadenaNumero = String.valueOf(this.numero);

        for (int i = 0; i < cadenaNumero.length(); i ++)
        {
            System.out.println(cadenaNumero.substring(0, i +1));
            if (Long.parseLong(cadenaNumero.substring(0, i + 1)) % (i + 1) != 0)
            {
                return false;
            }
        }
        return esPolidivisible;
    }

}
