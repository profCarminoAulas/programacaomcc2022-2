public class Carro {
    private int marcha=0; 
    private boolean ligar; 

    public void setLigar(){ 
        if( this.ligar) {
            System.out.println("o carro já esta ligado");
        } else {
            this.ligar = true;
        }
    }

    public boolean getLigar(){
        return this.ligar; 
    }

    public void acelerar(){
        if( getLigar() ){
            if(this.marcha <= 0 ){
                this.marcha = 1;
            } else {
                this.marcha ++;
            }
            
        } else {
            System.out.println("o carro deve estar ligado");
        }
    }
}
