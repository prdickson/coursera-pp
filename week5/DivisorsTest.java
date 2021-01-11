import org.junit.Test;
import static org.junit.Assert.*;

public class DivisorsTest {
    @Test
    public void testGcd() {
        assertEquals(Divisors.gcd(0, 408), 408);
        assertEquals(Divisors.gcd(408, 0), 408);
        assertEquals(Divisors.gcd(1440, 408), 24);
        assertEquals(Divisors.gcd(987, 610), 1);
    }

    @Test
    public void testLcm() {
        assertEquals(Divisors.lcm(1440, 408), 24480);
        assertEquals(Divisors.lcm(987, 610), 602070);
    }

    @Test
    public void testAreRelativelyPrime() {
        assertEquals(Divisors.areRelativelyPrime(1440, 408), false);
        assertEquals(Divisors.areRelativelyPrime(987, 610), true);
    }

    @Test
    public void testTotient() {
        assertEquals(Divisors.totient(1), 1);
        assertEquals(Divisors.totient(2), 1);
        assertEquals(Divisors.totient(3), 2);
        assertEquals(Divisors.totient(1440), 384);
        assertEquals(Divisors.totient(408), 128);
        assertEquals(Divisors.totient(987), 552);
        assertEquals(Divisors.totient(610), 240);
    }
}
