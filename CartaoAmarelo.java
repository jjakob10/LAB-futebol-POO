public class CartaoAmarelo extends Cartao{
    public CartaoAmarelo(float tempo, Jogador jogador, Time time) {
        super(tempo, jogador, time);
    }

    @Override
    public String toString() {
        return "Cartão amarelo no tempo " + getTempo() + " marcado pelo jogador " + getJogador().getNome() + " do time " + getTime().getNome();
    }
    
}

