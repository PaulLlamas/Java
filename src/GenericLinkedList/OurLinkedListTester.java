package GenericLinkedList;

public class OurLinkedListTester {

	public static void main(String[] args) {

		Node node1 = new Node(22);
		Node node2 = new Node(10);
		node1.setLink (node2);
		Node nextNode = node1;
		while (nextNode != null) {
			System.out.print (nextNode + " ");
			nextNode = nextNode.getLink();
		}

//		System.out.println();
//		GenericNode<String> gnode1 = new GenericNode<>("one");
//		GenericNode<String> gnode2 = new GenericNode<>("two");
//		gnode1.setLink (gnode2);
//		GenericNode<String> gnextNode = gnode1;
//		while (gnextNode != null) {
//			System.out.print (gnextNode + " ");
//			gnextNode = gnextNode.getLink();
//		}

//		System.out.println();
//		GenericNode<Integer> inode1 = new GenericNode<>(1);
//		GenericNode<Integer> inode2 = new GenericNode<>(2);
//		inode1.setLink (inode2);
//		GenericNode<Integer> inextNode = inode1;
//		while (inextNode != null) {
//			System.out.print (inextNode + " ");
//			inextNode = inextNode.getLink();
//		}


        // create and test a linked list

//		OurGenericLinkedList<String> test = new OurGenericLinkedList();
//		test.addNode("Hi");
//		test.addNode("bye");
//		test.addNode("sigh");
//        System.out.println (test);
//        test.insert(1,"summer");
//		System.out.println (test);




	}

}
