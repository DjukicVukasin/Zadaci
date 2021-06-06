package domaciGrupaIX.bankaTest;

public class BankaKod {

    private String ziroRacun;
    private String ime;
    private Double iznos;

    public BankaKod(String ime, String ziroRacun){
        this.ziroRacun=ziroRacun;
        this.ime = ime;
        this.iznos=0d;
    }

    public String dohvatiZiroRacun() {
        return ziroRacun;
    }
    public String dohvatiIme() {
        return "ime";
    }
    public Double dohvatiIznos() {
        return iznos;
    }
    public void postaviIznos(Double iznos) {
        this.iznos = iznos;
    }
    @Override
    public String toString() {
        return String.format("%s %s %.2f",ziroRacun,ime,iznos);
    }
}