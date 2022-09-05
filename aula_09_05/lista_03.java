import javax.swing.JOptionPane;

/*
 * 3. A prefeitura de uma cidade fez uma pesquisa entre
 * seus habitantes, coletando dados sobre o salário e número
 * de filhos. A prefeitura deseja saber:  
 * a) média do salário da população;
 * b) média do número de filhos;
 * c) maior salário;
 * d) percentual de pessoas com salário até R$100,00.
 * 
 * O final da leitura de dados se dará com a entrada de um salário negativo.
 * 
 */
public class lista_03 {
   public static void main(String[] args) {
    double m_salario=0; // media de salario
    int m_filhos=0; // media de filhos 
    double maior_salario=0; //maior salario 
    double perc_salario; // percentual de pessoas com salário até R$100,00
    double salario=0; 
    int numero_filhos;
    int numero_habitantes=0; 

    while( salario >=0  ){
        salario = Double.parseDouble(
            JOptionPane.showInputDialog(null, "digite o salario")
        );
        if(salario >0 ){
            numero_filhos = Integer.parseInt(
                JOptionPane.showInputDialog(null, "digite o numero de filhos")
            );
            numero_habitantes ++;
            m_salario = m_salario + salario; 
            m_filhos = m_filhos + numero_filhos;
            if(salario > maior_salario){
                maior_salario = salario;
            }
        }
    }

    System.out.println("média do salário da população: " + (m_salario/numero_habitantes));
    System.out.println("média do número de filhos" + (m_filhos/numero_habitantes));
    System.out.println("maior salário: " + (maior_salario));

   } 
}
