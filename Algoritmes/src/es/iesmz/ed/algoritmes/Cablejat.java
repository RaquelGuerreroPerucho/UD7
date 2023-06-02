package es.iesmz.ed.algoritmes;


import java.util.ArrayList;

public class Cablejat {
    private String[] conectors;
    private ArrayList<String> cables;

    int numCables;

    public Cablejat(ArrayList<String> cables) {
        this.cables = cables;
        this.numCables = cables.size();
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < cables.size(); i++) {
            result += cables.get(i);
        }
        return result;
    }

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
