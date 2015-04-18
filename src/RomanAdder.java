import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanAdder {
   private static final String[] NUMERALS = { "M", "D", "C", "L", "X", "V", "I" };
   private static Pattern p;

   static {
      p = Pattern.compile("(" + String.join("*)(", NUMERALS) + "*)");
   }

   public String add(String a, String b) {
      Matcher mA = p.matcher(a), mB = p.matcher(b);
      if (!mA.matches() || !mB.matches())
         return null;

      String res = "";
      for (int i = 1; i <= NUMERALS.length; i++)
         res += mA.group(i) + mB.group(i);

      for (int i = NUMERALS.length - 1; i > 0; i--)
         res = res.replaceFirst(NUMERALS[i] + "{" + (i % 2 == 0 ? 5 : 2) + "}", NUMERALS[i - 1]);

      return res;
   }
}
