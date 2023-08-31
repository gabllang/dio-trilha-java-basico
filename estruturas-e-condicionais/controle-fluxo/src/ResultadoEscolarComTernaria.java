public class ResultadoEscolarComTernaria {
    public static void main(String[] args) {
        int nota = 5;

        // mesma coisa que if e else 
        // ? = if
        // : = else

        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }
}
