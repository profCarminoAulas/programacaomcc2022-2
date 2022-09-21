/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo;

/**
 *
 * @author profj
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Personagem cacador = new 
            Personagem(10, 0, 0);
        Personagem soneca = new 
            Personagem( 1, 1, 4);
        
        cacador.setNome("jonh");
        cacador.cacar();
        Thread.sleep(2000);
        cacador.comer();
        Thread.sleep(2000);
        cacador.dormir();
        Thread.sleep(2000);
        cacador.statusVars();
        
        soneca.setNome("manuel");
        soneca.cacar();
        Thread.sleep(2000);
        soneca.comer();
        Thread.sleep(2000);
        soneca.cacar();
        Thread.sleep(2000);
        soneca.dormir();
        Thread.sleep(2000);
        soneca.statusVars();
        
        
    }
    
}
