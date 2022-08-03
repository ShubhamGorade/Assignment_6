
package collections;
import java.util.*;
/**
 *Write a Java program to get the first (lowest) key and the last (highest) key currently in a map. 
 * @author SHUBHAM
 */
public class collections28 {
    public static void main(String args[]) {

  // Create a tree map
  TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

  // Put elements to the map 
  tree_map1.put("C2", "Red");
  tree_map1.put("C1", "Green");
  tree_map1.put("C4", "Black");
  tree_map1.put("C3", "White");

  System.out.println("Orginal TreeMap content: " + tree_map1);
  System.out.println("first(lowest): " + tree_map1.firstKey());
  System.out.println("last(highest): " + tree_map1.lastKey());
 } 
}
