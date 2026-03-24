class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlistbase {
    Node head;

    // Insert at beginning
    void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at given position (1-based index)
    void insertAtPosition(int value, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            insertAtBeginning(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete from beginning
    void deleteFromBeginning() {
        if (head == null) return;
        head = head.next;
    }

    // Delete from end
    void deleteFromEnd() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete from given position
    void deleteFromPosition(int pos) {
        if (head == null || pos <= 0) return;

        if (pos == 1) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Position out of range");
            return;
        }

        temp.next = temp.next.next;
    }

    // Sort linked list (ascending)
    void sortList() {
        if (head == null) return;

        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.data > j.data) {
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    // Search element
    void search(int key) {
        Node temp = head;
        int pos = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found at position: " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }

        System.out.println("Element not found");
    }

    // Display (Traversal)
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class LinkedListBasic {
    public static void main(String[] args) {
        linkedlistbase list = new linkedlistbase();

        // Insert operations
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(30);
        list.insertAtPosition(20, 3);

        System.out.print("List: ");
        list.display();

        // Delete operations
        list.deleteFromBeginning();
        list.deleteFromEnd();
        list.deleteFromPosition(2);

        System.out.print("After Deletions: ");
        list.display();

        // Insert again for sorting/search
        list.insertAtEnd(25);
        list.insertAtEnd(15);
        list.insertAtEnd(40);

        System.out.print("Before Sorting: ");
        list.display();

        // Sort
        list.sortList();
        System.out.print("After Sorting: ");
        list.display();

        // Search
        list.search(25);

        // Final traversal
        System.out.print("Final List: ");
        list.display();
    }
}