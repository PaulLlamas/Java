package CodeForHomework12;

public class GenericNode {

    //instance variables
    private int value;
    private GenericNode nextNode;

    //constructor
    public GenericNode(int value) {
        this.value = value;
        nextNode = null;
    }

    //get value
    public int getValue() {
        return this.value;
    }

    //set Node
    public void setLink(GenericNode newNode) {

        nextNode = newNode;
    }

    //return the node
    public GenericNode getLink() {

        return nextNode;
    }

    //toString
    public String toString() {
        return "" + value;
    }


}
