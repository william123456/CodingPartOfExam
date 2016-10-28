import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashStyff {
public static void main(String[] args) {
	Set<String> map = new HashSet<>();
	map.add("Hello");
	map.add("Indigo");
	map.add("Apple");
	map.add("ThisIsn'tInAlphabeticalOrder");
	map.add("The5thOne");
	List<String> l = new ArrayList<>(map);
	Collections.sort(l);
	l.stream().forEach(System.out::println);
}
	
}
