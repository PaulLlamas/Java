package GenericLinkedList;

public class GenericNode<T> {

    //instance variables
    private T value;
    private GenericNode<T> nextNode;

    //constructor
    public GenericNode(T value) {
        this.value = value;
        nextNode = null;
    }

    //get value
    public T getValue() {
        return this.value;
    }

    //set Node
    public void setLink(GenericNode<T> newNode) {

        nextNode = newNode;
    }

    //return the node
    public GenericNode<T> getLink() {

        return nextNode;
    }

    //toString
    public String toString() {
        return "" + value;
    }


}
