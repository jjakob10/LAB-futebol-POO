import java.util.LinkedList;
import java.util.List;

public class PartidaDetalhada extends Partida {

    public List<Lance> lances = new LinkedList<>();

    public PartidaDetalhada(Time timeA, Time timeB) {
        super(timeA, timeB);
    }

    public List<Lance> getLances() {
        return new LinkedList<>(lances);
    }

    public void addLances(Lance lance) {
        lances.add(lance);
    }

}
