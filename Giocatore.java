public class Giocatore {
    private int vita;
    private String nome;
    
    public Giocatore(int vita, String nome ){
        this.vita=vita;
        this.nome=nome;
    }

    public int Perdevita(int danno){
        vita= vita-danno;
        return vita;
    }

    public int getVita(){
        return this.vita;
    }
}
