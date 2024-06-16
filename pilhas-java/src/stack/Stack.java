package stack;

public class Stack {

    // variáveis da classe Stack
    private Node top;
    private int height;

    // variáveis da classe interna Node
    public class Node {
        int value;
        Node next;

        // construtor da Node
        Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    // construtor da Stack
    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    // início métodos da classe Stack
    public void getTop() {
        if (top == null) {
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Topo: " + top.value);
        }

    }

    public void getHeight() {
        System.out.println("Altura: " + height);
    }

    public void print() {
        System.out.println("###########################");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;

        }
        System.out.println("###########################");

    }

    // método para inserir elemento no topo
    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        if (height == 0)
            return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }

    // fim métodos da classe Stack

    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.push(1);

        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);

        System.out.println(myStack.pop() == null);

        /*
         * myStack.getTop();
         * myStack.getHeight();
         * 
         * myStack.print();
         * 
         * myStack.push(1);
         * 
         * myStack.print();
         * myStack.getTop();
         * myStack.getHeight();
         */
    }

}
