import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {
	static Queue<Integer> q1=new ArrayBlockingQueue<Integer>(10);
	static Scanner in = new Scanner(System.in);
	static Boolean running=true;
	
	private static void poll() {
		
	
	if(q1.poll()==null) {
	 	System.out.println("The first item could not be deleted ,the Queue is empty");
		    	}
	else {
		System.out.println("First item deleted successfuly");
	}
	}
	
	
	private static void offer() {
	
	System.out.println("Enter the item to push");
		
	int input=in.nextInt();
		    
	if(q1.offer(input)==false) {
	 	System.out.println("The item could not be inserted");
		    	}
	else {
		System.out.println("Item inserted successfuly");
	}
	}
	
	private static void peek() {
		System.out.println("The first element after peeking operation is"+q1.peek());
			
	}

	
	private static void delete1() {
		
		
		try{
		System.out.println("Removed item is: \t"+q1.remove());
		System.out.println(q1.element());	
		}
		catch(NoSuchElementException es) {
			System.out.println("The queue is empty! cannot remove any more items");
		}
		
		
		
		
		
	}	

	private static void display1() {
		
		System.out.println(q1);
	}

	private static void insert() throws NullPointerException{
		System.out.println("Enter the item to push");
		
	int input=in.nextInt();
	    
	    
	    try {
	    	q1.add(input);
	    }
	    catch(IllegalStateException e) {
	    	System.out.println("the queue is Full! please delete some items before insert operation.");
	    }
	    
	    
				
	}

	public static void main(String[] args) {
		while(running) {
		System.out.println("\t\tQUEUE OPERATION \n __________________________________________________\n");	
			
		System.out.println("1. For inserting an element to the Queue using Add "+"\n2. For removial of an item fro the Queue using Remove"+"\n3. For displaying the items in the Queue"+"\n4. For peeking the first element in the Queue using Peek"+"\n5. For inserting an item to the Queue using Offer"+"\n6. For deleting an item from the front using poll");
		
		System.out.println("\n___________________________________________________\n");
		int answer = in.nextInt();
		
		switch(answer) {
		case 1:
			insert();
			break;
		case 2:
			delete1();
			break;
		case 3:
			display1();
			break;
		case 4:
			peek();
			break;
		case 5: 
			offer();
			break;
		case 6:poll();
			break;
		default: System.out.println("Invalid choice");	
		break;
		 }
	 }
		
   }
}

	
	



