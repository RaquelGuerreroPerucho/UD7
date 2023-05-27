package es.iesmz.ed.algoritmes;

public class DividirFactorial {
    long numerador;
    long denominador;

    public DividirFactorial(long numerador, long denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public static int divisio(long num1, long num2) {
        long factorial1 = calcularFactorial(num1);
        long factorial2 = calcularFactorial(num2);

        return (int) (factorial1 / factorial2);
    }

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
