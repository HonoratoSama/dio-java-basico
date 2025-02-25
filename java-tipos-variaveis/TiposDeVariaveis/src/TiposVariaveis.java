public class TiposVariaveis {
    
    public static void main(String[] args) {
    
        short numeroCurto = 1;
        int   numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;

        System.out.println(numeroCurto2);

        // Constantes - para transformar uma variavel em constante é preciso usar final antes do tipo da variavel
        // e o nome da, agora constante, deve ser escrito em letras maiúsculas

        final double VALOR_DE_PI = 3.14;

        // ao tentar atrivuir a constante VALOR_DE_PI um novo valor, a IDE informa o erro

        //VALOR_DE_PI = 14.75;

        System.out.println(VALOR_DE_PI);

    }

}
