public class App {
    public static void main(String[] args) {
        Time fla = new Time("Flamengo");
        Time flu = new Time("Fluminense");
        PartidaDetalhada flaflu = new PartidaDetalhada(fla, flu);
        flaflu.incGolsTimeA();
        flaflu.incGolsTimeA();
        Campeonato c = new Campeonato();
        c.adicionaPartida(flaflu);
        // Time vasco = new Time("Vasco", 0);
        // c.adicionaPartida(new Partida(fla, vasco));

        for(Partida p : c.getPartidas())
        {
            p.getTimeB().incNumeroTitulosMundiais();
            p.imprimePartida();
            
        }
        flaflu.addLances(new GolContra(45, new Jogador("pedrao"),fla));
        flaflu.addLances(new CartaoAmarelo(12, new Jogador("Jão"), flu));

        for(Lance l: flaflu.getLances()){
            System.out.println( l.toString());
        }
    }


}
