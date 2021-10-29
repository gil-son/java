package ex05;

import java.util.Comparator;
import java.util.Map;

public class ComparatorInts implements Comparator<Integer> {

	Map<Integer, String> base;

  public ComparatorInts(Map<Integer, String> base) {
    this.base = base;
  }

  @Override
  public int compare(Integer o1, Integer o2) {
    return base.get(o1).compareTo(base.get(o2));
  }
}
