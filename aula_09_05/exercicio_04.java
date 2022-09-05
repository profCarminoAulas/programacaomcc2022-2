import javax.swing.JOptionPane;

/*
 * 
 * 4. Escreva um programa que verifica se um número natural digitado pelo 
 * usuário é primo.
 */

public class exercicio_04 {

    public static void main(String[] args) {
        int entrada=256; 
        int contador=entrada-1;
        int salvar = 0;
        while(contador >1){
            if((entrada%contador)==0){
                salvar ++;
                break;
            }
            contador --;
            System.out.println("contador: " + contador);
        }
        if( salvar == 0){ 
            JOptionPane.showConfirmDialog(null, "é primo");
        }
    }

    public static void ronildo(){
        int entrada;
        int salvar=0;
        int contador;

        entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o numero"));

        for(contador = 1; contador <=entrada; contador++){
            if((entrada%contador) == 0 ){
                salvar ++;
            }
        }
        if( salvar == 2){ 
            JOptionPane.showConfirmDialog(null, "é primo");
        }
    }

}
