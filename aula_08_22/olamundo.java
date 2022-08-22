import javax.swing.JOptionPane;




public class olamundo{
   
    /**
     * @param args
     */
    public static void main(String[] args) {
    double primeirovalor=0;
    double segundovalor=0; 
    double soma, subr, mult, divi; 
    primeirovalor = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor")));
    segundovalor = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor")));
    soma = primeirovalor+ segundovalor;
    subr = primeirovalor-segundovalor; 
    mult = primeirovalor*segundovalor; 
    divi = primeirovalor/segundovalor;
    System.out.println("soma: " + soma + " subr " + subr + "mult " + mult + " div " + divi); 

}
}