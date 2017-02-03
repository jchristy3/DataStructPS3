import java.util.NoSuchElementException;

public class LinkedList<Item> {

  private int size; // size of the list
  private Node first; // beginning

  // helper Node class
  private class Node {
    private Item item;
    private Node next;
  }

  // is the list empty?
  public boolean isEmpty() {
    return first == null;
  }

  // number of elements in the list
  public int size() {
    return size;
  }
  
  public Item removeLast() throws NoSuchElementException{
	  if(first == null)
		  throw new NoSuchElementException();
	  
	  Node pos = first;
	  Item hold1 = pos.item;
	  Item hold2;
	  while(pos.next != null){
		  hold2 = pos.next.item;
		  pos.item = hold1;
		  pos = pos.next;
		  hold1 = hold2;
	  }
	  size--;
	  first = first.next;
	  return pos.item; 
  }
}