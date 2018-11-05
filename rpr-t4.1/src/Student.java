import java.util.List;

public class Student {
    private String imeStudenta;
    private String prezimeStudenta;
    private int brojIndeksa;
    private String odsjekStudenta;
    private int trenutniSemestar;
    private List popisPredmeta;
    private int opterecenjeKreditima;

    public String getImeStudenta() {
        return imeStudenta;
    }

    public String getPrezimeStudenta() {
        return prezimeStudenta;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public String getOdsjekStudenta() {
        return odsjekStudenta;
    }

    public int getTrenutniSemestar() {
        return trenutniSemestar;
    }

    public List getPopisPredmeta() {
        return popisPredmeta;
    }

    public int getOpterecenjeKreditima() {
        return opterecenjeKreditima;
    }

    public void dodajUPopis(Predmet predmet){
        popisPredmeta.add(predmet);
    }

    public void makniSPopisa(Predmet predmet){
        popisPredmeta.remove(predmet);
    }

    public boolean daLiJeIspravan(){
        if(opterecenjeKreditima<30)
            return false;

        return  true;
    }

}
