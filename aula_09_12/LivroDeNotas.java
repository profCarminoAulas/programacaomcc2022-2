public class LivroDeNotas {
    private String nomeDoCurso; 

    public LivroDeNotas(){
        setnomeDoCurso("atribuiu na construção");
    }

    public LivroDeNotas( String nome){
        setnomeDoCurso(nome);
    }

    public void exibirMensagem( String msg) {
        System.out.println(msg);
    }

    public void setnomeDoCurso( String nomeCurso ){ 
        this.nomeDoCurso = nomeCurso; 
    }

    public String getnomeDoCurso(){
        return this.nomeDoCurso;
    }
}