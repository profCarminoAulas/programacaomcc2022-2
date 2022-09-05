import javax.swing.JOptionPane;

/*
 * Escrever um algoritmo que lê 5 valores para a, 
 * um de cada vez, e conta quantos destes valores 
 * são negativos, escrevendo esta informação.
 */
public class lista_01 {
   public static void main(String[] args) {
    int entrada; // esta variavel representa o a pedido exercicio
    int contador; 
    int numeroDeNegativos=0;
    for(contador = 1; contador <=5; contador++){
        entrada = Integer.parseInt(
            JOptionPane.showInputDialog(
                null,
                "digite o " + contador )
        );
        if(entrada<0){
            numeroDeNegativos++;
        }
    }
    System.out.println("o total de numeros negativos é " + numeroDeNegativos);
   } 
}
