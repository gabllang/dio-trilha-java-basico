public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        double salarioMinimo = 2500;

        short numeroCurto = 1; 
        int numeroNormal = numeroCurto;

        short numeroCurto2 = (short)numeroNormal;

        final double VALOR_DE_PI = 3.14;
        // final deixa a var constante (não pode ser mudada)
        // por convenção, as constantes devem ser escritas em caixa alta separadas por underline 

        System.out.println(VALOR_DE_PI);
    }
}
