/*
 * 
 * 2. Reimplemente o exercício 1, fazendo com que os valores sejam exibidos 
 * em ordem reversa.
 * 3. Escreva um programa que calcula o fatorial de um valor natural digitado pelo usuário.
 * 4. Escreva um programa que verifica se um número natural digitado pelo usuário é primo.
 */

public class exercicio_02 {
    public static void main(String[] args) {
        comFor();
        comWhile();
        comDoWhile();
    }

    public static void comFor(){
        int controle;
        System.out.println("primeiros 100 numeros naturais não considerando o zero");
        System.out.println("utilizando a estrurura de repetição for");
        for(controle = 100; controle >= 1; controle-- ){
            System.out.println("numero: " + controle);
        }
    }

    public static void comWhile(){
        System.out.println("primeiros 100 numeros naturais não considerando o zero");
        System.out.println("utilizando a estrutura de repetição while");
        int controle; 
        controle = 100;
        while( controle >=1 ){
            System.out.println("numero: " + controle);
            // o incremento de um na variável controle pode ser escrito das seguintes formas
            // controle = controle - 1; 
            // controle --; 
            // controle -= 1;
            controle -= 1;
        }
    }

    public static void comDoWhile(){
        System.out.println("primeiros 100 numeros naturais não considerando o zero");
        System.out.println("utilizando a estrutura de repetição do while");
        int controle; 
        controle = 100;
        do {
            System.out.println("numero: " + controle);
            // o incremento de um na variável controle pode ser escrito das seguintes formas
            // controle = controle - 1; 
            // controle --; 
            // controle -= 1;
            controle -= 1;
        }while( controle >=1 );
    }
}
