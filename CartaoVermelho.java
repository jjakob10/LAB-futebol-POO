public class CartaoVermelho extends Cartao {

    public CartaoVermelho(float tempo, Jogador jogador, Time time) {
        super(tempo, jogador, time);
    }

    @Override
    public String toString() {
        return "Cartão vermelho no tempo " + getTempo() + " marcado pelo jogador " + getJogador().getNome() + " do time " + getTime().getNome();
    }
    
}
