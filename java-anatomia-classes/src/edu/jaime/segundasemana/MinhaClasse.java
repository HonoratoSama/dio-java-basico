package edu.jaime.segundasemana;
public class MinhaClasse {

    public static void main(String [] args){
        
        int ano = 2021;
        ano = 2022;

        // variáveis do tipo final, não podem ser alteradas e devem ter
        // seu nome com letras maiusculas

        final String BR = "Brasil";
        final int ESTADOS_BRASILEIROS = 27;

        //BR = "Brail";

        String priNome = "Jaime";
        String segNome = "Honorato";
        String nomComp = nomeCompleto(priNome, segNome);

        System.out.println(nomComp);
    }

    // declarando um metodo

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
        
    }
    
}
