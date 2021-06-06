package domaciGrupaIX.bankaTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBankaKod {


    @Test
    public void testKonstruktor(){

        String ime = "Jelena";
        String brojRacuna = "Ziro Racun";
        BankaKod objekat = new BankaKod(ime, brojRacuna);

        SoftAssert sa = new SoftAssert();

        sa.assertEquals(objekat.dohvatiIme(), ime);
        sa.assertEquals(objekat.dohvatiZiroRacun(), brojRacuna);
        sa.assertEquals(objekat.dohvatiIznos(), 0d);
        sa.assertAll();
    }

}
