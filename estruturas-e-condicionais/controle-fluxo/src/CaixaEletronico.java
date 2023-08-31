public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 22.0;
        double valorSolicitado = 17.0;

        // quando tenho mais de uma instrução, preciso criar um bloco {}
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Compra feita!");
            System.out.println("Novo saldo: " + saldo);
        }
        else 
        System.out.println("Saldo insuficiente, seu saldo é: " + saldo);

    }
}
