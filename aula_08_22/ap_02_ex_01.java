import javax.swing.JOptionPane;

/*
 * exercicio 01
 * Escreva um programa que obtém o salário de uma pessoa e diz se
 *  ela está ganhando pelo menos o salário mínimo.
 */


public class ap_02_ex_01 {
    public static void main(String[] args) {
        double valorSalario; 
        valorSalario = 
        Double.parseDouble(JOptionPane.showInputDialog(null, "digite o salario"));
        double valorSalMini = 1212;
        if(valorSalario>= valorSalMini){
            JOptionPane.showMessageDialog(null, "você ganha pelo menos um sálario");
            //System.out.println("você ganha pelo menos um salario");
        } else {
            JOptionPane.showMessageDialog(null, "você não ganha pelo menos um salario");
            //System.out.println("você não ganha pelo menos um salario");
        }
    }
}
