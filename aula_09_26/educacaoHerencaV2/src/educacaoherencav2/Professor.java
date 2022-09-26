/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package educacaoherencav2;

/**
 *
 * @author profj
 */
public class Professor extends Pessoa {
    private int matricula;
    
    Professor(){
        System.out.println("criando professor");
    }
    public void Lecionando(){
        System.out.println(getNome() + "Lecionando");
    }
    
}
