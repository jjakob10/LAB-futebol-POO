public abstract class Gol extends Lance {
    public Gol(float tempo, Jogador jogador, Time time) {
        super(tempo, jogador, time);
    }
    
    @Override
    public String toString() {
        return "Gol marcado no tempo " + getTempo() + " pelo jogador " + getJogador().getNome() + " do time " + getTime().getNome();
    }
}
