import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void delete(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "<--->");
            current = current.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
}

public class dll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        
        int length, term, termToDelete, termToAdd, ch;
        System.out.println("Enter the length of the predefined linked list: ");
        length = sc.nextInt();
        
        for(int i=0; i<length; i++)
        {
        	System.out.println("Enter element: ");
        	term = sc.nextInt();
        	list.insert(term);	
        }
        System.out.println("Original List:");
        list.display();
        
        while(true)
        {
		    System.out.print("Menu driven Application for doubly linked list\n1.) Add element\n2.) Delete Element\n3.) Display element\n4.) Quit\nEnter your choice: ");
		    ch = sc.nextInt();
		    switch(ch)
		    {
		    	case 1:
		    		System.out.println("Enter the term to be added: ");
		    		termToAdd = sc.nextInt();
		    		list.insert(termToAdd);
		    		break;
		    	case 2:
		    		System.out.println("Enter the term to be deleted: ");
		    		termToDelete = sc.nextInt();
		    		list.delete(termToDelete);
		    		break;
		    	case 3:
		    		list.display();
		    		break;
		    	case 4:
		    		System.exit(0);
		    		break;
		    	default:
		    		System.out.println("Invalid choice");

		    		
		    }
        }
    }
}

