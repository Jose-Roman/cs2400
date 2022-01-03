//Jose Roman
//CS2400

public class BinaryNode<T>
 {
  private T data;
  private BinaryNode<T> leftChild;
  private BinaryNode<T> rightChild;
  
  public BinaryNode()
  {
   this(null);
  }
  
  public BinaryNode(T dataPortion)
  {
  this(dataPortion, null, null);
  }
  
  public BinaryNode(T dataPortion, BinaryNode<T> left, BinaryNode<T> right)
  {
    data = dataPortion;
    leftChild = left;
    rightChild = right;
  }
  
  public T getData()
  {
    return data;
  }
  
  public void setData(T newData)
  {
   data = newData;
  }
  
  public BinaryNode<T> getLeftChild()
  {
   return leftChild;
  }
  
  public void setLeftChild(BinaryNode<T> left)
  {
   leftChild = left;
  }
  
  public boolean hasLeftChild()
  {
   return leftChild != null;
  }
  
  public BinaryNode<T> getRightChild()
  {
   return rightChild;
  }
  
  public void setRightChild(BinaryNode<T> right)
  {
   rightChild = right;
  }
  
  public boolean hasRightChild()
  {
   return rightChild != null;
  }
  
  public boolean isLeaf()
  {
    return(leftChild == null) && (rightChild == null);
  }
  
  public int GetNumberOfNodes_BNode()
   {
    int leftNumber = 0;
    int rightNumber = 0;
    if (leftChild != null)
     leftNumber = leftChild.GetNumberOfNodes_BNode();
    if (rightChild != null)
     rightNumber = rightChild.GetNumberOfNodes_BNode();
    return 1 + leftNumber + rightNumber;
   } 
   
   public int GetHeight_BNode()
    {
     return GetHeight_BNode(this); 
    }
    private int GetHeight_BNode(BinaryNode<T> node)
     {
      int height = 0;
      if (node != null)
         height = 1 + Math.max(GetHeight_BNode(node.getLeftChild()), GetHeight_BNode (node.getRightChild()));
      return height;
     }
     
   public T GetLeftmostData_BNode()
    {
     if (leftChild == null)
       return data;
     else
       return leftChild.GetLeftmostData_BNode();
    }
  
   public T GetRightmostData_BNode()
    {
     if (rightChild == null)
      return data;
     else
      return rightChild.GetRightmostData_BNode();
    }
    
  public void Pre_Order_BNode()
  {
    System.out.println(data);          //root-left-right
    if(leftChild != null)
      leftChild.Pre_Order_BNode();
    if(rightChild != null)
      rightChild.Pre_Order_BNode();
  }
  
  public void In_Order_BNode()
  {                                 //left-root-right
    if(leftChild != null)
      leftChild.In_Order_BNode();
    System.out.println(data);
     if(rightChild != null)
      rightChild.In_Order_BNode();
  }
  
  public void Post_Order_BNode()
  {                                  //left-right-root
   if(leftChild != null)
      leftChild.Post_Order_BNode();
   if(rightChild != null)
      rightChild.Post_Order_BNode();
    System.out.println(data);
  }
  
  public BinaryNode<T> copy()
  {
    BinaryNode<T> newRoot = new BinaryNode<>(data);
    if(leftChild != null)
      newRoot.setLeftChild(leftChild.copy());
    if(rightChild != null)
      newRoot.setRightChild(rightChild.copy());
    return newRoot;
  }
}