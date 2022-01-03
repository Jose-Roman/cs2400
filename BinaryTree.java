//Jose Roman
//CS2400

public class BinaryTree<T> 
{
  private BinaryNode<T> root;
  
  public BinaryTree()
  {
   root = null;
  }
  
  public BinaryTree(T rootData)
  {
   root = new BinaryNode<>(rootData);
  }
  
  public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
  {
   privateSetTree(rootData, leftTree, rightTree);
  }
  
  public void setTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
  {
   privateSetTree(rootData, leftTree, rightTree);
  }
  
  private void privateSetTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
  {
   root = new BinaryNode<>(rootData);
   if ((leftTree != null) && !leftTree.isEmpty())
     root.setLeftChild(leftTree.root);
   if ((rightTree != null) && !rightTree.isEmpty())
     {
     if (rightTree != leftTree)
       root.setRightChild(rightTree.root);
     else
       root.setRightChild(rightTree.root.copy());
     } 
   if ((leftTree != null) && (leftTree != this))
     leftTree.clear();
   if ((rightTree != null) && (rightTree != this))
     rightTree.clear();
  }
  
  public boolean isEmpty()
  {
   return root == null;
  }
  
  public void clear()
  {
   root = null;
  }
  
  public void setRootData(T rootData)
  {
   root.setData(rootData);
  }
  
  public int GetHeight_BTree()
  {
   return GetHeight_BTree(root); 
  }
  private int GetHeight_BTree(BinaryNode<T> node)
   {
    int height = 0;
    if (node != null)
       height = 1 + Math.max(GetHeight_BTree(node.getLeftChild()), GetHeight_BTree(node.getRightChild()));
    return height;
   }
  
  public int GetNumberOfNodes_BTree()
  {
   return GetNumberOfNodes_BTree(root);
  }
  
  private int GetNumberOfNodes_BTree(BinaryNode<T> node)
   {
    int leftNumber = 0;
    int rightNumber = 0;
    if (node.getLeftChild() != null)
     leftNumber = GetNumberOfNodes_BTree(node.getLeftChild());
    if (node.getRightChild() != null)
     rightNumber = GetNumberOfNodes_BTree(node.getRightChild());
    return 1 + leftNumber + rightNumber;
   } 
  
  public void Pre_Order_BTree()
  {
   Pre_Order_BTree(root);
  }
  
  private void Pre_Order_BTree(BinaryNode<T> node)
  {
   if(node != null)
    {
     System.out.println(node.getData());
     Pre_Order_BTree(node.getLeftChild());
     Pre_Order_BTree(node.getRightChild());
    }
  }
  
  public void In_Order_BTree()
  {
   In_Order_BTree(root);
  }
  
  private void In_Order_BTree(BinaryNode<T> node)
  {
   if(node != null)
    {
    In_Order_BTree(node.getLeftChild());
    System.out.println(node.getData());
    In_Order_BTree(node.getRightChild());
    }
  } 
  
  public void Post_Order_BTree()
  {
   Post_Order_BTree(root);
  }
  
  private void Post_Order_BTree(BinaryNode<T> node)
  {
   if(node != null)
   {
    Post_Order_BTree(node.getLeftChild());
    Post_Order_BTree(node.getRightChild());
    System.out.println(node.getData());
   }
  }
  
  public T getRootData()
  {
    return root.getData();
  }
  
  public T GetLeftmostData_BTree()
  {
   return GetLeftmostData_BTree(root);
  }
  
  private T GetLeftmostData_BTree(BinaryNode<T> node)
    {
     if (node.getLeftChild() == null)
       return node.getData();
     else
       return GetLeftmostData_BTree(node.getLeftChild());
    }
  
  public T GetRightMostData_BTree()
  {
   return GetRightMostData_BTree(root);
  }
  
  private T GetRightMostData_BTree(BinaryNode<T> node)
    {
     if (node.getRightChild() == null)
       return node.getData();
     else
       return GetRightMostData_BTree(node.getRightChild());
    }
  
  
}