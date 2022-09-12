import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testSubtract(){
        Rational x = new Rational(); // 2/4
        Rational y = new Rational(); // 1/4
        x.numerator = 2;
        x.denominator = 4;
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testMultiply(){
        Rational x = new Rational(); // 1/2
        Rational y = new Rational(); // 1/3
        x.numerator = 1;
        x.denominator = 2;
        y.numerator = 1;
        y.denominator = 3;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(6, x.denominator);
    }

    @Test
    public void testDivide(){
        Rational x = new Rational(); // 1/2
        Rational y = new Rational(); // 1/3
        x.numerator = 1;
        x.denominator = 2;
        y.numerator = 1;
        y.denominator = 3;
        x.divide(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }

    @Test
    public void testEqual(){  //Case Both Equal with same value
        Rational x = new Rational(); // 1/2
        Rational y = new Rational(); // 1/2
        x.numerator = 1;
        x.denominator = 2;
        y.numerator = 2;
        y.denominator = 4;
        Assert.assertTrue(x.equals(y));
    }
    @Test
    public void testEqual2(){ //Case Equal with difference form
        Rational x = new Rational(); // 4/8
        Rational y = new Rational(); // 12/24
        x.numerator = 4;
        x.denominator = 8;
        y.numerator = 12;
        y.denominator = 24;
        Assert.assertTrue(x.equals(y));
    }
    @Test
    public void testEqual3(){ //Case Equal with negative value
        Rational x = new Rational(); // -1/2
        Rational y = new Rational(); // -1/2
        x.numerator = -1;
        x.denominator = 2;
        y.numerator = -1;
        y.denominator = 2;
        Assert.assertTrue(x.equals(y));
    }
    @Test
    public void testEqual4(){ //Case Equal with negative value and difference form
        Rational x = new Rational(); // -2/3
        Rational y = new Rational(); // -4/6
        x.numerator = -2;
        x.denominator = 3;
        y.numerator = -4;
        y.denominator = 6;
        Assert.assertTrue(x.equals(y));
    }

    @Test
    public void testCompareTo(){
        Rational x = new Rational(); // 4/8
        Rational y = new Rational(); // 3/8
        x.numerator = 4;
        x.denominator = 8;
        y.numerator = 3;
        y.denominator = 8;
        Assert.assertEquals(1, x.compareTo(y));
    }
    @Test
    public void testToString(){
        Rational x = new Rational(); // 4/8
        x.numerator = 4;
        x.denominator = 8;
        Assert.assertEquals("4/8", x.toString());
    }
}
