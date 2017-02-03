import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FixedCapacityStack<Item> {
	private Item[] a;
	private int n;
	
	@SuppressWarnings("unchecked")
	public FixedCapacityStack(int capacity){
		a = (Item[]) new Object[capacity];
	}
	
	public boolean isEmpty(){
		return n == 0;
	}
	
	public int size(){
		return n;
	}
	
	public void push(Item item){
		a[n++] = item;
	}
	
	public Item pop(){
		return a[--n];
	}
	
	public Item peek(){
		return a[n-1];
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		FixedCapacityStack<String> s;
		s = new FixedCapacityStack<String>(100);
		File file = new File("C:/Users/John/Documents/InputText.txt");
		Scanner input = new Scanner(file);
		while(input.hasNext()){
				s.push(input.nextLine());
				System.out.print(s.peek() + " "); //print the item pushed
		}
		System.out.println("\n(" + s.size() + " strings in sentence / on the fixed stack)"); //prints size of stack
	}
}
