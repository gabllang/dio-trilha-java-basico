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


        // INCREMENTO
        // x repetição

        int numero2 = 5;

        numero2 = numero2 + 1;

        System.out.println(numero2);

        // adicionar o ++ depois de trazer a var é a mesma coisa que isso  numero2 = numero2 + 1;
        numero2++;

        System.out.println(numero2);

        // colocando no final o ++ você deixa a prioridade dela por ultimo também
        // assim primeiro imprimindo o valor, depois adicionando o valor
        System.out.println(numero2++);

        // veja como adicionou
        System.out.println(numero2);

        // a logica funciona também para incrementar primeiro
        System.out.println(++numero2);

        // o legal é que simplifica todo o processo de chamar a var para adicionar, chama logo no sout e adiciona "permanentemente"
        System.out.println(numero2);

        // agora a subtração
        System.out.println(numero2--);

        System.out.println(numero2);

        System.out.println(--numero2);
        // funciona da mesma forma



        // do nada ele começou a falar de valor boleano
        boolean variavel = true;

        // invertendo 
        System.out.println(!variavel);
        // para inverter no sout o valor boleano colocamos o !

        // mas não fica permanentemente
        System.out.println(variavel);

        // como faço pra ficar permanente?
        // chamando a var e usando o mesmo metodo

        variavel = !variavel;

        System.out.println(variavel);

        // porque eu só não sei o valor como false?
        // por que eu queria inverter apenas, não colocar manualmente, assim se caso tivesse
        // o valor da variavel como true ficaria false, e se tivesse false ficaria true



        // agora expressão condicional

        int a, b;

        a = 5;
        b = 6;

        String resultado2 = "";

        // exemplo de condicional usando uma estrutura if/else
        if(a==b)
            resultado2 = "verdadeiro";
        else
            resultado2 = "falso";

            System.out.println(resultado2);

        
        
        // usando operador alternario (forma abreviada mas complicada)

        a = 6;
        b = 6;

        String resultado3 = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado3);


        // operadores relacionais

        // == igualdade entre dois valores
        // != diferença
        // > não preciso explicar
        // >=
        // <
        // <=


        // também é possivel verificar string
        String nomeUm = "Gabriel";
        String nomeDois = "Davi";

        System.out.println(nomeUm == nomeDois);

        // texto normalmente é usado o metodo equals

        System.out.println(nomeUm.equals(nomeDois));

        // numero

        int numer1 = 1;
        int numer2 = 2;

        boolean simNao = numer1 == numer2;

        if(numer1 < numer2){
            System.out.println("a nossa condição é verdadeira");
        }

        // não vai ser impressa pois não é verdadeira
        if(numer1 == numer2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numero um é igual a numero dois? "+ simNao);

        simNao = numer1 != numer2;

        System.out.println("numero um é diferente a numero dois? "+ simNao);

        simNao = numer1 > numer2;

        System.out.println("numero um é maior que numero dois? "+ simNao);
        
        simNao = numer1 < numer2;

        System.out.println("numero um é menor que numero dois? "+ simNao);

        
    }

}
