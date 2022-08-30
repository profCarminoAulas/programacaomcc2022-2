import javax.swing.JOptionPane;

public class ExemploWhile {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 10) {
            System.out.println("9x" + contador + "= " + (9 * contador));
            contador++;
            System.out.println("ExemploWhile.main()");
        }
    }

    public static void Exemplo1() {
        double nota1, nota2;
        int contador = 1;
        while (contador <= 5) {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
            JOptionPane.showMessageDialog(null, "Média: " + (nota1 + nota2) / 2);
            contador = contador + 1;
        }
    }

}

public static void main(String[] args) {
    int contador =1; 
    int jose=1;
    for(contador = 2; contador <=10; jose++){
        System.out.println("9x" + contador + "= " +  (contador * 9));
        contador ++; 
    }
}
