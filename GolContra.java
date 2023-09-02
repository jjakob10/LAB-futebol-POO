public class GolContra extends Gol {

    public GolContra(float tempo, Jogador jogador, Time time) {
        super(tempo, jogador, time);
    }

    @Override
    public String toString() {
        return "Gol contra marcado no tempo " + getTempo() + " pelo jogador " + getJogador().getNome() + " do time " + getTime().getNome();
    }
    
}
