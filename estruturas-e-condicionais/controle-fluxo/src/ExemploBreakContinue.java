public class ExemploBreakContinue {
    public static void main(String[] args) {

        // break e continue é basicamente pare e continue 
        // foda

        for (int numero = 1; numero <= 5 ; numero ++){
            if(numero == 3)
        // mudou o fluxo da interação
                continue;

            System.out.println(numero);
        }
    }
}
