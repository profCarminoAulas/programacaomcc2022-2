/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo;

/**
 *
 * @author profj
 */
public class Personagem {
    private String nome;
    private int energia;
    private int fome;
    private int sono;

    Personagem(){
        this.nome = "joaquim"; 
        this.energia = 10; 
        this.fome = 0; 
        this.sono = 0; 
        System.out.println("esta sendo construido");
    }
    
    Personagem( int energia, 
                int fome,
                int sono){
        parametros( energia, fome, sono);
        System.out.println(
                "esta sendo construido com seu nome");
    }
    
    public void setNome(String nome ){
        this.nome = nome; 
    }
    
    public void statusVars(){
        System.out.println("nome ---->" + this.nome);
        System.out.println("energia ->" + this.energia);
        System.out.println("fome ---->" + this.fome);
        System.out.println("sono ---->" + this.sono);
    }
    
    private void parametros( int energia, 
                             int fome, 
                             int sono){
        if( this.fome >= 0 && fome <= 10) {
            this.fome = fome; 
        }
        if(this.energia <= 10 ){
            this.energia = energia;
        }
        if(this.sono <=10 ){ 
            this.sono = sono;
        }
    }
    
    void cacar() {
        if (this.energia >= 2) {
            System.out.println(nome + " caçando");
            this.energia += 2;
        } else {
            System.out.println(nome + 
                    "sem energia para caçar");
        }
        this.fome = Math.min
        (this.fome+1, 10 );
        this.sono = Math.min
        (sono + 1, 10);
    }

    void comer() {
        if( this.fome >= 1){
            System.out.println(nome + " comendo");
            this.energia = Math.min(
                    this.energia + 1 , 10);
            this.fome -= 1;
        } else {
            System.out.println(this.nome + 
                    " não estou com fome");
        }
    }

    void dormir() {
        if(this.sono >=1 ){
            System.out.println(nome + " dormindo");
            this.sono -= 1; 
            this.energia = 
                    this.energia + 1 <=10 
                    ? this.energia + 1 
                    : 10;
            /*
            if( (this.energia + 1 )<= 10){
            this.energia += 1; 
            } else {
            this.energia = 10; 
            }
            */
        } else {
            System.out.println
               ( nome + " não estou com sono");
        }
        
    }
}
