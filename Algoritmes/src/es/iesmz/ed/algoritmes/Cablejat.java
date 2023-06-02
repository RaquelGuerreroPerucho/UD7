package es.iesmz.ed.algoritmes;

/**
 * Clase con un ArrayList que guarda las cabezas de los cables
 * Una funcion @Override, una funcion para comprobar si se puede conectar, una para validar que el conector es M/H
 * y una funcion para contar un conector que se le pasa
 */

import java.util.ArrayList;

public class Cablejat {
    private ArrayList<String> cables;

    /**
     * Constructor.
     * @param cables es el cable que se tiene que unir.
     */

    public Cablejat(ArrayList<String> cables) {
        this.cables = cables;
    }

    /**
     * Funcion modificada para que aparezcan solo los cabezales de manera continuada
     * @return String
     */

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < cables.size(); i++) {
            result += cables.get(i);
        }
        return result;
    }

    /**
     * Funcion que verifica que los conectores se puedan conectar
     * @return boolean
     */

    public boolean esPotConnectar() {
        boolean seConecta = true;
        String stringConexiones;

        stringConexiones = this.toString();
        seConecta = conectoresValidos(stringConexiones);

        if (seConecta == true)
        {
            int conectoresH, conectoresM;

            conectoresH = cuentaConectores(stringConexiones, 'H');
            conectoresM = cuentaConectores(stringConexiones, 'M');

            if (conectoresM == conectoresH)
            {
                seConecta = true;
            }
            else
            {
                seConecta = false;
            }
        }
        return  seConecta;
    }

    /**
     * Funcion que verifica que el conector pasado sea H o M
     * @return boolean
     */

    public boolean conectoresValidos(String conectores)
    {
        boolean esValido = true;
        for (int i = 0; i < conectores.length(); i++) {
            if (conectores.charAt(i)!= 'H' && conectores.charAt(i) != 'M')
            {
                esValido = false;
            }
        }
        return esValido;
    }

    /**
     * Funcion utilizada como contador
     * @return int
     */

    public int cuentaConectores(String conectores, char conector)
    {
        int cuantosHay = 0;
        for (int i = 0; i < conectores.length(); i++) {
            if (conectores.charAt(i)!= conector)
            {
                cuantosHay++;
            }
        }
        return cuantosHay;
    }
}
