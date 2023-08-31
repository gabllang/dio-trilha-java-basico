public class Operadores {
    public static void main(String[] args) {
        double resultado = (10 * 7) + (20/4);

        System.out.println(resultado);

        int modulo = 18 % 3;

        // modulo é o famoso "resto", nesse exemplo 18 é divisivel por 3 que dá 6, um numero inteiro, "sem restos"
        System.out.println(modulo);

        // agora
        modulo = 20 % 3;
        // sobrou 2 de resto, por que 20/3 | 6x3 = 18 . 18 - 20 = 2
    
        System.out.println(modulo);



        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+ 1 +"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
    }

}
