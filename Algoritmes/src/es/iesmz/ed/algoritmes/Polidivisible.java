package es.iesmz.ed.algoritmes;

public class Polidivisible
{
    private long numero;

    public Polidivisible(long numero)
    {
        this.numero = numero;
    }

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
