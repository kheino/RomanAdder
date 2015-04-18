import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanAdderTest {
   RomanAdder adder;

   @Before
   public void setup() {
      adder = new RomanAdder();
   }

   @Test // TC1
   public void testIplusIisII() {
      String res = adder.add("I", "I");
      assertEquals("II", res);
   }

   @Test // TC2
   public void testIIIIplusIisV() {
      String res = adder.add("IIII", "I");
      assertEquals("V", res);
   }

   @Test // TC3
   public void testVplusIisVI() {
      String res = adder.add("V", "I");
      assertEquals("VI", res);
   }

   @Test // TC4
   public void testIplusVisVI() {
      String res = adder.add("I", "V");
      assertEquals("VI", res);
   }

   @Test // TC5
   public void testVIIIIplusIisX() {
      String res = adder.add("VIIII", "I");
      assertEquals("X", res);
   }

   @Test // TC6
   public void testXplusIisXI() {
      String res = adder.add("X", "I");
      assertEquals("XI", res);
   }

   @Test // TC7
   public void testXXXXVIIIIplusIisL() {
      String res = adder.add("XXXXVIIII", "I");
      assertEquals("L", res);
   }

   @Test // TC8
   public void testLplusIisLI() {
      String res = adder.add("L", "I");
      assertEquals("LI", res);
   }

   @Test // TC9
   public void testLXXXXVIIIIplusIisC() {
      String res = adder.add("LXXXXVIIII", "I");
      assertEquals("C", res);
   }

   @Test // TC10
   public void testCplusIisCI() {
      String res = adder.add("C", "I");
      assertEquals("CI", res);
   }

   @Test // TC11
   public void testCCCCLXXXXVIIIIplusIisD() {
      String res = adder.add("CCCCLXXXXVIIII", "I");
      assertEquals("D", res);
   }
}
