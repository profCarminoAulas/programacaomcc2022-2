import javax.swing.JOptionPane;

/*
 * Escreva um programa que obtém a idade de uma pessoa e diz 
 * se ela é maior, segundo a legislação brasileira. 
 * Escreva uma versão com if/else e outra com o operador ternário.
 * 
 */
public class ap_02_ex_02 {

    public static void main(String[] args) {
        int idade; 
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a idade"));
        if(idade >= 18 ){ 
            JOptionPane.showMessageDialog(null, "você é maior de idade");
        }

        JOptionPane.showMessageDialog
        (null, "ternario você é" + (idade >= 18 ? "maior de idade" : "menor de idade"));
        
    }
    
}
