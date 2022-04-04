package CodeForHomework12;

public class Node {

    //instance variables
    private int intValue;
    private Node nextNode;

    //constructor
    public Node(int value) {
        intValue = value;
        nextNode = null;
    }

    //set Node
    public void setLink(Node newNode) {
        nextNode = newNode;
    }

    //return the value
    public int getValue() {
        return intValue;
    }

    //return the node
    public Node getLink() {
        return nextNode;
    }

    //toString
    public String toString() {
        return "" + intValue;
    }

}
