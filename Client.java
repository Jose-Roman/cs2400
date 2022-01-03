//Jose Roman
//CS2400

public class Client 
{
	public static void main(String[] args) 
	  {
	    BinaryNode<String> aNode = new BinaryNode<>("A", null, null);
	    BinaryNode<String> bNode = new BinaryNode<>("B",null, null);
	    BinaryNode<String> cNode = new BinaryNode<>("C",null,null);
	    BinaryNode<String> dNode = new BinaryNode<>("D",null,null);
	    BinaryNode<String> eNode = new BinaryNode<>("E",null,null);
	    BinaryNode<String> fNode = new BinaryNode<>("F",null,null);
	    BinaryNode<String> gNode = new BinaryNode<>("G",null,null);
	    BinaryNode<String> hNode = new BinaryNode<>("H",null,null);
	    
	    aNode.setLeftChild(bNode);
	    aNode.setRightChild(cNode);
	    
	    cNode.setLeftChild(dNode);
	    cNode.setRightChild(eNode);
	    
	    dNode.setLeftChild(fNode);
	    
	    eNode.setLeftChild(gNode);
	    eNode.setRightChild(hNode);
	    
	    System.out.println("Binary Node:");
	    
	    System.out.println("Pre-order: ");
	    aNode.Pre_Order_BNode();
	    System.out.println("In-order: ");
	    aNode.In_Order_BNode();
	    System.out.println("Post Order: ");
	    aNode.Post_Order_BNode();
	    
	    System.out.println("Height: " + aNode.GetHeight_BNode());
	    
	    System.out.println("Number of Nodes: " + aNode.GetNumberOfNodes_BNode());
	    
	    System.out.println("Left Most Data: " + aNode.GetLeftmostData_BNode());
	    System.out.println("Right Most Data: " + aNode.GetRightmostData_BNode());    
	    
	    System.out.println("---------------------------------------");    
	    
	    BinaryTree<String> bTree = new BinaryTree<>();
		   bTree.setTree("B", null, null);
		   
		   BinaryTree<String> fTree = new BinaryTree<>();
		   fTree.setTree("F", null, null);
		    
		   BinaryTree<String> gTree = new BinaryTree<>();
		   gTree.setTree("G", null, null);
		    
		   BinaryTree<String> hTree = new BinaryTree<>();
		   hTree.setTree("H", null, null);
		    
		   BinaryTree<String> eTree = new BinaryTree<>();
		   eTree.setTree("E", gTree, hTree);
		    
		   BinaryTree<String> dTree = new BinaryTree<>();
		   dTree.setTree("D", fTree, null);
		    
		   BinaryTree<String> cTree = new BinaryTree<>();
		   cTree.setTree("C", dTree, eTree);
		    
		   BinaryTree<String> aTree = new BinaryTree<>();
		   aTree.setTree("A", bTree, cTree);
		   
		   System.out.println("Binary Tree:");
		    
		   System.out.println("Pre-order: ");
		   aTree.Pre_Order_BTree();
		   
		   System.out.println("In-order: ");
		   aTree.In_Order_BTree();
		   
		   System.out.println("Post Order: ");
		   aTree.Post_Order_BTree();
		   
		   System.out.println("Height: " + aTree.GetHeight_BTree());
		   
		   System.out.println("Number of Nodes: " + aTree.GetNumberOfNodes_BTree());
		   
		   System.out.println("Left Most Data: " + aTree.GetLeftmostData_BTree());
		   
		   System.out.println("Right Most Data: " + aTree.GetRightMostData_BTree());
		   	    
	  }
}