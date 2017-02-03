import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Stack<Item> {
    private Node<Item> first;
    private int n;

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void push(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }

    public Item peek() {
        return first.item;
    }
    
    public static void main(String[] args) throws FileNotFoundException{
		Stack<String> s = new Stack<String>();
		File file = new File("C:/Users/John/Documents/InputText.txt");
		Scanner input = new Scanner(file);
		while(input.hasNext()){
				s.push(input.nextLine());
				System.out.print(s.peek() + " "); //print the item pushed
		}
		System.out.println("\n(" + s.size() + " strings in sentence / on the stack)"); //prints size of stack
	}
}