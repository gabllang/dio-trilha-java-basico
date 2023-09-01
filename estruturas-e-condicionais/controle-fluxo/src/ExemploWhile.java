import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        
        double dinheiro = 50.0;

        while(dinheiro>0) {
            double valorDoce = valorAleatorio();

            if(valorDoce > dinheiro)
                valorDoce = dinheiro;

                System.out.println("Doce do valor: " + valorDoce + " Adicionando no carrinho");
                dinheiro = dinheiro - valorDoce;
        }

        System.out.println("Dinheiro: " + dinheiro);
        System.out.println("Jhullyene gastou toda sua mesada em doces");

        
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
