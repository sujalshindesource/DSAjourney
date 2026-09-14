import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo {

    Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("Added " + data + " to the list.");
    }

    public void insert(int position, int data) {

        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;

            System.out.println("Inserted " + data + " at position 1.");
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds!");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;

            System.out.println("Inserted " + data + " at position " + position + ".");
        }
    }

    public void display() {

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        System.out.print("Current Linked List: ");

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedListDemo list = new LinkedListDemo();

        boolean running = true;

        while (running) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Add (at end)");
            System.out.println("2. Insert (at position)");
            System.out.println("3. Display List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number to add: ");
                    int addVal = scanner.nextInt();
                    list.add(addVal);
                    break;

                case 2:
                    System.out.print("Enter position: ");
                    int pos = scanner.nextInt();

                    System.out.print("Enter number to insert: ");
                    int insertVal = scanner.nextInt();

                    list.insert(pos, insertVal);
                    break;

                case 3:
                    list.display();
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}