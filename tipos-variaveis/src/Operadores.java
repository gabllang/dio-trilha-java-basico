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


        int numero = 5;

        // não guarda o valor de negativo
        System.out.println(- numero);
        System.out.println(numero);

        numero = 5;
        // forma correta de deixar um numero negativo
        numero = - numero;

        System.out.println(numero);

        // deixando positivo
        numero = + numero;
        
        System.out.println(numero);
        // ops... o que deu errado?
        // dessa forma iria "somar" deixando (-) + (+) = (-)
        // sinais diferentes = - sinais iguais = +
        // então seguindo a logica da matematica 
        // deixamos um numero positivo assim

        numero = - numero;
        // (-) + (-) = (+)

        System.out.println(numero);

        // tinha feito isso tudo de cabeça, o cara da aula da dio fez assim
        // ele multiplicou por -1, obviamente funciona, porque ele não ensinou da forma que eu fiz?
        // será que como eu fiz está errado???

        // só explicando, qualquer numero multiplicado por 1 da ele mesmo, e fez a regrinha lá dos sinais inversos
        numero = numero * -1;

        System.out.println(numero);

    }

}
