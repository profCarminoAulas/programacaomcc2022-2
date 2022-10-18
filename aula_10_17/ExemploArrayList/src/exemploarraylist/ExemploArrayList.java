/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploarraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author profj
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cli1 = new Cliente(
        "jose ", "sem end", "sem tel");
        Cliente cli2 = new Cliente(
        "jose ", "sem end", "sem tel");
        List<Cliente> clientes = 
           new ArrayList();
        clientes.add(cli1);
        clientes.add(cli2);
        
        for( Cliente cli: clientes){
            System.out.println( 
            " cliente " + 
            cli.getNome());
        }
    }
    
    public static void Exemplo1(){
        Scanner ler = new Scanner(System.in);
        ArrayList<String> agenda
                = new ArrayList();
        popular(agenda);

        int n = agenda.size();
        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.
                    println("indice " + i
                            + " nome: " + agenda.get(i));
        }
      System.out.println("Escolha o elemento a excluir");
        try {
            i = ler.nextInt();
        }catch (InputMismatchException e) {
            System.out.
                    println("Elemento não disponivel "
                            + e.getMessage());
        }
        agenda.sort(null);
        try {
            agenda.remove(i);
        } catch (IndexOutOfBoundsException e) {
            System.out.
                    println("Elemento não disponivel "
                            + e.getMessage());
        }

        i = 0;
        for (String tmpagenda : agenda) {
            System.out.
                    println("indice " + i
                            + " nome " + tmpagenda);
            i++;
        }
    }

    public static void popular(ArrayList xagenda) {
        xagenda.add("Pietro; 1111-2222");
        xagenda.add("Giovana");
        xagenda.add("Ronildo");
        xagenda.add("Pedro");
        xagenda.add("Matehus Monteiro");
        xagenda.add("Matehus matos");
        xagenda.add("Daniele");
    }
}
