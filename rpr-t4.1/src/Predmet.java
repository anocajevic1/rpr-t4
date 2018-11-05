import java.util.List;

public abstract class Predmet {
    private String nazivPredmeta;
    private int brojKredita;
    private List upisaniStudenti;
    private int semestar;

    protected Predmet(String naziv, int krediti) {
        nazivPredmeta = naziv;
        brojKredita = krediti;
    }

    public String dajNazivPredmeta() {
        return nazivPredmeta;
    }

    public int dajBrojKredita() {
        return brojKredita;
    }

    public List dajUpisaneStudente() {
        return upisaniStudenti;
    }

    public int uKojemSemestru() {
        return semestar;
    }

}
