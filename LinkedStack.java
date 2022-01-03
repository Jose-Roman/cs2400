//task 5
//Jose Roman
//CS 2400

import java.util.EmptyStackException;
 
public class LinkedStack implements StackInterface<Book>
 {
   private Node topNode;
   
   public LinkedStack()
   {
     topNode = null;
   }
   
   public void push(Book newEntry)
   {
    Node newNode = new Node(newEntry, topNode);
    topNode = newNode;
   } 
   
   public Book pop()
   {
     Book top = peek(); 
     topNode = topNode.getNextNode();
     return top;
   } 
   
   public Book peek()
   {
    if (isEmpty())
      throw new EmptyStackException();
    else
      return topNode.getData();
   }
   
   public boolean isEmpty()
   {
    return topNode == null;
   } 
   
   public void clear()
   {
    topNode = null;
   }
    
 }
 

class Node
{
  public Book data;
  public Node next;
    
  public Node(Book dataPortion)
  {
    this(dataPortion,null);
  }
  
  public Node(Book dataPortion, Node nextNode)
  {
   data = dataPortion;
   next = nextNode;
  }
  
  public Book getData()
  {
    return data;
  }
   public void setData(Book newData)
   {
     data = newData;
   }
   public Node getNextNode()
   {
     return next;
   }
   
   public void setNextNode(Node nextNode)
   {
     next = nextNode;
   }
    
}


