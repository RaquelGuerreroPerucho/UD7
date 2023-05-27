package es.iesmz.ed.algoritmes;

    /**
    * Clase con dos variables, numerador y denominador; y dos funciónes para calcular la división de sus dos factoriales.
    */

public class DividirFactorial {

    long numerador;
    long denominador;

    /**
     * Constructor.
     * @param numerador primer numero para calcular la división.
     * @param denominador segundo numero para calcular la división.
     */

    public DividirFactorial(long numerador, long denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Calcula la división de los dos factoriales.
     * @return int
     */
    public static int divisio(long num1, long num2) {
        long factorial1 = calcularFactorial(num1);
        long factorial2 = calcularFactorial(num2);

        return (int) (factorial1 / factorial2);
    }

    /**
     * Calcula los factoriales de cada numero.
     * @return long
     */
    public static long calcularFactorial(long num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial = i * factorial;
        }
        return factorial;
    }
}
