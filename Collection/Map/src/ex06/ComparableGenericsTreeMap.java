package ex06;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

// https://stackoverflow.com/questions/2864840/treemap-sort-by-value

public class ComparableGenericsTreeMap {

	static <K,V extends Comparable<? super V>> SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
		
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>( new Comparator<Map.Entry<K,V>>() {
        	
                @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                    int res = e1.getValue().compareTo(e2.getValue());
                    return res != 0 ? res : 1; // Special fix to preserve items with equal values
                }
            }
        );
        
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

}



class Main {

	public static void main(String[] args) {

		// now with Integer
		
		Map<String, Integer> nonSortedMap = new HashMap<String, Integer>();
		nonSortedMap.put("ape", 1);
		nonSortedMap.put("pig", 3);
		nonSortedMap.put("cow", 1);
		nonSortedMap.put("frog", 2);
		
		ComparableGenericsTreeMap comparableTreeMap = new ComparableGenericsTreeMap();
		
		
		System.out.println(comparableTreeMap.entriesSortedByValues(nonSortedMap));
		
		// now with String
		
		Map<String, String> nonSortedMap2 = new HashMap<String, String>();
		nonSortedMap2.put("ape", "a");
		nonSortedMap2.put("pig", "x");
		nonSortedMap2.put("cow", "v");
		nonSortedMap2.put("frog", "a");
		
		ComparableGenericsTreeMap comparableTreeMap2 = new ComparableGenericsTreeMap();
		
		
		System.out.println(comparableTreeMap2.entriesSortedByValues(nonSortedMap2));
		
	}

}
