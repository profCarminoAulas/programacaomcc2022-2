/*
 * 
 * 3. Escreva um programa que calcula o fatorial de um valor natural digitado pelo usuário.
 * 4. Escreva um programa que verifica se um número natural digitado pelo usuário é primo.
 */

import javax.swing.JOptionPane;

public class exercicio_03 {
    public static void main(String[] args) {

        //fatorialIteradoSemRetorno();
        int x;

        /* 
        x = Integer.parseInt(JOptionPane.
            showInputDialog("Digite o numero do fatorial a calcular"));
        JOptionPane.showMessageDialog(null, "o valor do fatorial é: " + fatorialIterado(x));
        */
        
        x = Integer.parseInt(JOptionPane.
            showInputDialog("Digite o numero do fatorial a calcular no recursivo"));
        JOptionPane.showMessageDialog(null, "o valor do fatorial é: " + fatorialRecursivo(x));

        /*

        x = Integer.parseInt(JOptionPane.
            showInputDialog("Digite o numero do fatorial a calcular no recursivo ternario"));
        JOptionPane.showMessageDialog(null, "o valor do fatorial é: " + fatorialRecursivoTernario(x));
        */
    }

    // este calculo é feito sem parametro e sem retorno
    //
    public static void fatorialIteradoSemRetorno(){
        int x =1, f;
        x = Integer.parseInt(JOptionPane.
            showInputDialog("Digite o numero do fatorial a calcular"));
        f = x; 
        while (x > 1) {
            f = f * (x - 1);
            x--;
        }
        JOptionPane.showMessageDialog(null, "o valor do fatorial é: " + f);
    }
    // este calculo é feito recebendo um parametro e retornando um valor
    //
    public static int fatorialIterado( int x ){
        int f=x;
        while (x > 1) {
            f = f * (x - 1);
            x--;
        }
        return f;
    }

    public static int fatorialRecursivo( int x){
        if( x <= 1 ){ 
            return 1;
        } else {
            return x*fatorialRecursivo(x-1);
        }
    }

    public static int fatorialRecursivoTernario( int x){
        return x<=1? 1: x*fatorialRecursivoTernario(x-1);
    }

}
