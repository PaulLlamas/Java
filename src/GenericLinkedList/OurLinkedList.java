package GenericLinkedList;



public class OurLinkedList {
    //instance variable
    private Node firstNode;


    //Constructor
    public OurLinkedList() {
        firstNode = null;
    }


    //addNode
    public void addNode(int value) {
        //create new Node and then decide where it goes
        Node newNode = new Node(value);
        //If empty create first node
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            //not first node so get to the end of the list
            Node currentNode = firstNode;
            while(currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
            }
            //At end of list
            currentNode.setLink(newNode);
        }
    }

    public int getValue(int position) {
        int currentPos=0;
        Node currentNode = firstNode;
        while (currentPos < position && currentNode != null) {
            currentNode = currentNode.getLink();
            currentPos++;
        }
        if (currentNode != null)
            return currentNode.getValue();
        else
            return -1;
    }

    public int size() {
        int count = 0;
        Node currentNode = firstNode;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getLink();
        }
        return count;
    }

    //insert
    public void insert(int position, int value) {
        Node newNode = new Node(value);
        //Put at the beginning if position <= 0
        if (position <= 0) {
            newNode.setLink(firstNode);
            firstNode = newNode;
        } else  {
            Node currentNode = firstNode;
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
        Node currentNode = firstNode;
        while (currentNode != null) {
            out = out + currentNode.getValue() + " ";
            currentNode = currentNode.getLink();
        }
        return out;
    }
}
