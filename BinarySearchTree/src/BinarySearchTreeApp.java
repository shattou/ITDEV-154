package binarysearchtree;

public class BinarySearchTreeApp {

	public static void main(String[] args) {
		 int minValue, maxValue;
		 Tree theTree = new Tree();
		 theTree.insert(50, 1.5);
		 theTree.insert(25, 1.2);
		 theTree.insert(75, 1.7);
		 theTree.insert(12, 1.5);
		 theTree.insert(37, 1.2);
		 theTree.insert(43, 1.7);
		 theTree.insert(30, 1.5);
		 theTree.insert(99, 1.2);
		 theTree.insert(87, 1.7);
		 theTree.insert(93, 1.5);
		 theTree.insert(97, 1.5);
		 theTree.insert(56, 1.9);
		 theTree.insert(78, 2.2);
		 theTree.insert(33, 2.3);

		 minValue = theTree.findMinValue();
		 maxValue = theTree.findMaxValue();

		 System.out.println("The minimum value of the binary tree is " + minValue);
		 System.out.println("The maximum value of the binary tree is " + maxValue + "\n\n");

	}

}
