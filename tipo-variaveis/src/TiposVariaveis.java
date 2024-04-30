public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal  = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;

        int numero = 5;

        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        //VALOR_DE_PI = 10.75; Variaveis que usam a palavra reservada final são constantes e não podem ser alteradas

    }
}
