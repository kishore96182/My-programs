import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {
   public static void main(String args[]) {
      String a[] = {"a","b","c"};
      String b[] = {"d","e","f"};
      List list = new ArrayList(Arrays.asList(a));
      list.addAll(Arrays.asList(b));
      Object[] c = list.toArray();
      System.out.println(Arrays.toString(c));
   }
}
