import javax.swing.JOptionPane;
public class exemplosif {
    public static void main(String[] args) {
        terceiroexemplo();
    }

    public static void terceiroexemplo(){
        double nota; 
        String conceito; 

        nota = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor")));
        conceito = nota >= 90 ? "A" : nota >= 80
                              ? "B" : nota >= 70
                              ? "C" : "D";
        System.out.println(" Conceito " + conceito);


    }

    public static void segundoexemplo(){
        double nota; 
        nota = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor")));
        if(nota >= 90 ){
            System.out.println("conceito A");
        } else if (nota >= 80 ){
            System.out.println("Conceito B");
        } else if(nota >= 70 ){
            System.out.println("Conceito C");
        } else {
            System.out.println("Conceito D");
        }

    }
    
    public static void primeiroexmplo(){
        double nota; 
        nota = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor")));
        if(nota >=70) {
            System.out.println("aprovado");
            System.out.println("acao dois");
            System.out.println("acao tres");

        } else {
            System.out.println("Reprovado");
        }
    }

}
