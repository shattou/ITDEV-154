package binarysearchtree;

public class Tree {
	 private Node root;

	    public Tree() {
	        root = null;
	    }
	    
	    public void insert(int id, double dd)
	      {
	      Node newNode = new Node();    // make new node
	      newNode.iData = id;           // insert data
	      newNode.dData = dd;
	      if(root==null)                // no node in root
	         root = newNode;
	      else                          // root occupied
	         {
	         Node current = root;       // start at root
	         Node parent;
	         while(true)                // (exits internally)
	            {
	            parent = current;
	            if(id < current.iData)  // go left?
	               {
	               current = current.leftChild;
	               if(current == null)  // if end of the line,
	                  {                 // insert on left
	                  parent.leftChild = newNode;
	                  return;
	                  }
	               }  // end if go left
	            else                    // or go right?
	               {
	               current = current.rightChild;
	               if(current == null)  // if end of the line
	                  {                 // insert on right
	                  parent.rightChild = newNode;
	                  return;
	                  }
	               }  // end else go right
	            }  // end while
	         }  // end else not root
	      }  // end insert()
	    
	    public int findMinValue() {
	        Node current = root;
	        while (current.leftChild != null) {
	            current = current.leftChild;
	        }
	        return current.iData;
	    }

	    public int findMaxValue() {
	        Node current = root;
	        while (current.rightChild != null) {
	            current = current.rightChild;
	        }
	        return current.iData;
	    }
	    
}
