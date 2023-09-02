public abstract class Lance {
    float tempo;
    Jogador jogador;
    Time time;

    public Lance(float tempo, Jogador jogador, Time time){
        this.tempo = tempo;
        this.time = time;
        this.jogador = jogador;
    }

    public float getTempo() {
        return tempo;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Time getTime() {
        return time;
    }
}
