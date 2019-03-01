import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DunavskisHelmutsTestTask3 {

    @Test
    public void testCase1() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test
    public void testCase2() {

        BigDecimal normalRate = new BigDecimal(0);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);

    }
    @Test(expected = IllegalArgumentException.class)
    public void testCase3() {

        BigDecimal normalRate = new BigDecimal(-1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test (expected = IllegalArgumentException.class)
    public void testCase4() {

        BigDecimal normalRate = new BigDecimal(0);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCase5() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(2);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test
    public void testCase6() {

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCase7() {

        BigDecimal normalRate = null;
        BigDecimal reducedRate = new BigDecimal(2);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCase8() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(-1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCase9() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = null;
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test
    public void testCase10() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test
    public void testCase11() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCase12() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,7));
        reducedPeriod.add(new Period(1,2));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test
    public void testCase13() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test
    public void testCase14() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(3,4));
        reducedPeriod.add(new Period(22,23));

       new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
        assertEquals(1, new Period(1,2));
    }
    @Test
    public void testCase15() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(0,0));
        reducedPeriod.add(new Period(22,23));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
        assertEquals(1, new Period(1,2));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCase16() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(-2,0));
        reducedPeriod.add(new Period(2,3));

        Rate r = new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
        r.calculate(normalPeriod.get(0));
    }
    @Test
    public void testCase17() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(3,4));
        reducedPeriod.add(new Period(22,23));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
        assertEquals(1, new Period(1,2));
    }
    @Test
    public void testCase18() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(3,4));
        reducedPeriod.add(new Period(0,0));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
        assertEquals(1, new Period(1,2));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCase19() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(-2,0));

        Rate r = new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
        r.calculate(reducedPeriod.get(0));
    }
    @Test(expected = IllegalArgumentException.class) // new
    public void testCase20() {

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        reducedPeriod.add(new Period(1,2));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, null);
    }
    @Test(expected = IllegalArgumentException.class) // new
    public void testCase21() {

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, null, normalPeriod);
    }
    @Test(expected = IllegalArgumentException.class) // new
    public void testCase22() {

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        normalPeriod.add(new Period(1,2));
        normalPeriod.add(new Period(1,2));
        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(null);

        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);
    }
    @Test(expected = IllegalArgumentException.class) // new
    public void testCase23() {

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(2,3));
        reducedPeriod.add(new Period(2,3));
        reducedPeriod.add(new Period(2,3));
        reducedPeriod.add(new Period(2,3));
        reducedPeriod.add(new Period(2,3));


        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);

    }
    @Test // new
    public void testCase24() {

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        normalPeriod.add(new Period(2,3));
        normalPeriod.add(new Period(3,4));
        normalPeriod.add(new Period(4,5));
        normalPeriod.add(new Period(5,6));
        reducedPeriod.add(new Period(6,7));


        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);

    }
    @Test (expected = IllegalArgumentException.class) // new
    public void testCase25() {

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,4));
        normalPeriod.add(new Period(4,5));
        normalPeriod.add(new Period(5,6));
        reducedPeriod.add(new Period(2,3));
        reducedPeriod.add(new Period(3,4));
        reducedPeriod.add(new Period(5,6));
        reducedPeriod.add(new Period(6,7));


        new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriod, normalPeriod);

    }
    @Test
    public void testCase26() {

        BigDecimal normalRate = new BigDecimal(7);
        BigDecimal reducedRate = new BigDecimal(1);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(new Period(1,2));
        reducedPeriod.add(new Period(6,7));

        Rate r = new Rate(CarParkKind.VISITOR, normalRate, reducedRate, reducedPeriod, normalPeriod);
       assertEquals(BigDecimal.valueOf(8), r.calculate(new Period(1,7)));

    }
    @Test
    public void testCase27() {

        BigDecimal normalRate = new BigDecimal(6);
        BigDecimal reducedRate = new BigDecimal(1);

        assertEquals(BigDecimal.valueOf(7), new Visitor().calculate(normalRate, reducedRate, 1, 1));

    }
    @Test
    public void testCase28() {

        BigDecimal normalRate = new BigDecimal(8);
        BigDecimal reducedRate = new BigDecimal(1);

        assertEquals(BigDecimal.valueOf(8.5), new Visitor().calculate(normalRate, reducedRate, 1, 1));

    }
    @Test
    public void testCase29() {

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);

        assertEquals(BigDecimal.valueOf(3), new Management().calculate(normalRate, reducedRate, 1, 1));

    }
    @Test
    public void testCas30() {

        BigDecimal normalRate = new BigDecimal(3);
        BigDecimal reducedRate = new BigDecimal(1);

        assertEquals(BigDecimal.valueOf(4), new Management().calculate(normalRate, reducedRate, 1, 1));

    }
    @Test
    public void testCas31() {

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(0.5);

        assertEquals(BigDecimal.valueOf(3), new Management().calculate(normalRate, reducedRate, 1, 1));

    }
    @Test
    public void testCas32() {

        BigDecimal normalRate = new BigDecimal(5.5);
        BigDecimal reducedRate = new BigDecimal(1);

        assertEquals(BigDecimal.valueOf(6.25), new Student().calculate(normalRate, reducedRate, 1, 1));

    }
    @Test
    public void testCas33() {

        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(1);

        assertEquals(BigDecimal.valueOf(5), new Student().calculate(normalRate, reducedRate, 1, 1));

    }
    @Test
    public void testCas34() {

        BigDecimal normalRate = new BigDecimal(4.5);
        BigDecimal reducedRate = new BigDecimal(1);

        assertEquals(BigDecimal.valueOf(5.5), new Student().calculate(normalRate, reducedRate, 1, 1));

    }
    @Test
    public void testCas35() {

        BigDecimal normalRate = new BigDecimal(15);
        BigDecimal reducedRate = new BigDecimal(1);

        assertEquals(BigDecimal.valueOf(16), new Staff().calculate(normalRate, reducedRate, 1, 1));

    }
    @Test
    public void testCas36() {

        BigDecimal normalRate = new BigDecimal(14);
        BigDecimal reducedRate = new BigDecimal(1);

        assertEquals(BigDecimal.valueOf(15), new Staff().calculate(normalRate, reducedRate, 1, 1));

    }
    @Test
    public void testCas37() {

        BigDecimal normalRate = new BigDecimal(16);
        BigDecimal reducedRate = new BigDecimal(1);

        assertEquals(BigDecimal.valueOf(16), new Staff().calculate(normalRate, reducedRate, 1, 1));

    }
}
