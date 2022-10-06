/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversortemperatura;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author profj
 */
public class ConversorTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
    }

    public static void criarTela() {
        JFrame tela = new JFrame("Conversor");
        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("\n00B0C");
        JButton convertButton = new JButton("Converter");
        JLabel valorConvertidoLabel = new JLabel("");
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2, 2, 4, 4));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(convertButton);
        painelDeConteudo.add(valorConvertidoLabel);

        convertButton.addActionListener((e) -> {
            double celsius = Double.parseDouble(celsiusTextField.getText());
            double fahrenheit = celsius / 5 * 9 + 32;
            valorConvertidoLabel.setText(String.format("%.2f\u00B0F", fahrenheit));
        });

        //ajusta largura e altura de acordo com o conteúdo 
        tela.pack();
        //centraliza a tela 
        tela.setLocationRelativeTo(null);
        //altera comportamento padrão do botão fechar 
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //torna a tela visível 
        tela.setVisible(true);
    }
}
