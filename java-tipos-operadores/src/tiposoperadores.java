import java.util.Date;

public class tiposoperadores {
    public static void main(String[] args) {
        // operadores de atribuição definem um valor a uma variavel

        String nome = "Jaime";
        int idade = 46;
        double peso = 91.0;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // operadores aritmeticos são: +(adição) -(subtração) /(divisão)
        // *(multiplicação)

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // informa o resto da divisão se 0 não há resto se 1 há resto
        double resultado = (10 * 7) + (20 / 4);

        // o operador + se usado com Strings faz a concatenação das palavras

        String nomeCompleto = "Jaime " + "Honorato";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "2" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "2" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // operadores em condicionais (== igual a) (!= diferente de) (> maior que) (>=
        // maior ou igual) (< menor que) (<= menor ou igual)

        int numeroCalcado1 = 41;
        int numeroCalcldo2 = 41;

        if (numeroCalcado1 != numeroCalcldo2)
            System.out.println("São diferentes");
        else
            System.out.println("São iguais");
        numeroCalcldo2++;
        System.out.println(numeroCalcldo2);

        numeroCalcldo2 = 41;

        // operador ternario para a expressão abaixo

        int a, b;

        a = 5;
        b = 6;

        String result = "";
        if (a == b)
            result = "verdadeiro";
        else
            result = "falso";

        System.out.println(result);

        // agora com operadorres ternarios "?" e ":"

        String resulte = a == b ? "SIM" : "NAO";
        System.out.println(resulte);

        int resul = a == b ? 1 : 0;
        System.out.println(resul);

        // operadores lógicos && "E", || "OU"

        if ((numeroCalcado1 == numeroCalcldo2) || (a == b))
            System.out.println("OK");
        else
            System.out.println("NOK");

        if ((numeroCalcado1 == numeroCalcldo2) && (a == b))
            System.out.println("OK TMB");
        else
            System.out.println("NOK TMB");
    }
}
