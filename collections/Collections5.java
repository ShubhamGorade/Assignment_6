
package collections;
  import java.util.LinkedList;

/**
 *1. Write a Java program to append the specified element to the end of a linked list.  
 * @author SHUBHAM
 */
public class Collections5 {
     public static void main(String args[]){
         
        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println(arrl);
        System.out.println("Adding element at last position...");
        arrl.addLast("I am last");
        System.out.println(arrl);
        System.out.println("Adding element at last position...");
        arrl.offerLast("I am last - 1");
        System.out.println(arrl);
        System.out.println("Adding element at last position...");
        arrl.offer("I am last - 2");
        System.out.println(arrl);
    }
}