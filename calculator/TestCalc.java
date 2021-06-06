package domaciGrupaIX.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc {

    @Test
    public void testPovKruga(){
        double pKruga = Calc.pKruga(3);

        Assert.assertEquals(pKruga, 28.26);
    }

    @Test
    public void testPovKvadrate(){
        double pKvadrate = Calc.pKvadrata(3);

        Assert.assertEquals(pKvadrate, 9.0);
    }

    @Test
    public void testPovPrav(){
        double pPrav = Calc.pPravougaonika(3, 4);

        Assert.assertEquals(pPrav, 12.0);
    }
}
