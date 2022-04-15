package GenericLinkedList;



public class OurGenericLinkedList <T> {
    //instance variable
    private GenericNode<T> firstNode;


    //Constructor
    public OurGenericLinkedList() {
        firstNode = null;
    }


    //addNode
    public void addNode(T value) {
        //create new Node and then decide where it goes
        GenericNode<T> newNode = new GenericNode<T>(value);
        //If empty create first node
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            //not first node so get to the end of the list
            GenericNode<T> currentNode = firstNode;
            while(currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
            }
            //At end of list
            currentNode.setLink(newNode);
        }
    }

    public T getValue(int position) {
        int currentPos=0;
        GenericNode<T> currentNode = firstNode;
        while (currentPos < position && currentNode != null) {
            currentNode = currentNode.getLink();
            currentPos++;
        }
        if (currentNode != null)
            return currentNode.getValue();
        else
            return null;
    }

    public int size() {
        int count = 0;
        GenericNode<T> currentNode = firstNode;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getLink();
        }
        return count;
    }

    //insert
    public void insert(int position, T value) {
        GenericNode<T> newNode = new GenericNode<T>(value);
        //Put at the beginning if position <= 0
        if (position <= 0) {
            newNode.setLink(firstNode);
            firstNode = newNode;
        } else  {
            GenericNode<T> currentNode = firstNode;
            int currentPos = 0;
            while (currentPos < position - 1 && currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
                currentPos++;
            }
            newNode.setLink(currentNode.getLink());
            currentNode.setLink(newNode);
        }

    }

    //toString
    public String toString() {
        String out = "";
        GenericNode<T> currentNode = firstNode;
        while (currentNode != null) {
            out = out + currentNode.getValue() + " ";
            currentNode = currentNode.getLink();
        }
        return out;
    }
}
