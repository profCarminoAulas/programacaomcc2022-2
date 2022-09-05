/*
 * 
 * 1. Escreva um programa que exibe os primeiros 100 números naturais.
 * Faça versões usando for, while e do/while.
 *
 */

public class exercicio_01{
    public static void main(String[] args) {
        //comFor();
        //comWhile();
        comDoWhile();
    }

    public static void comFor(){
        int controle;
        System.out.println("primeiros 100 numeros naturais não considerando o zero");
        System.out.println("utilizando a estrurura de repetição for");
        for(controle = 1; controle <= 100; controle = controle + 1){
            System.out.println("numero: " + controle);
        }
    }

    public static void comWhile(){
        System.out.println("primeiros 100 numeros naturais não considerando o zero");
        System.out.println("utilizando a estrutura de repetição while");
        int controle; 
        controle = 1;
        while( controle <=100 ){
            System.out.println("numero: " + controle);
            // o incremento de um na variável controle pode ser escrito das seguintes formas
            // controle = controle + 1; 
            // controle ++; 
            // controle += 1;
            controle += 1;
        }
    }

    public static void comDoWhile(){
        System.out.println("primeiros 100 numeros naturais não considerando o zero");
        System.out.println("utilizando a estrutura de repetição do while");
        int controle; 
        controle = 0;
        do {
            if(controle > 0 ) { 
                System.out.println("numero: " + controle);
            }
            // o incremento de um na variável controle pode ser escrito das seguintes formas
            // controle = controle + 1; 
            // controle ++; 
            // controle += 1;
            controle += 1;
        }while( controle <=100 );
    }
}
