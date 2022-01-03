public class LinkedBag implements PileOfBooksInterface<Book>
{
  private Node firstNode;
  private int numOfBooks;
  
  public LinkedBag()
  {
  firstNode = null;
  numOfBooks = 0;
  }

public boolean add(Book newEntry) 
 {
   Node newNode = new Node(newEntry);
   newNode.next = firstNode; 

  firstNode = newNode; 
  numOfBooks++;
  return true;
 } 
 
 public Book remove()
   {
    Book result = null;
   if (firstNode != null)
     {
      result = firstNode.getData();
      firstNode = firstNode.getNextNode(); 
      numOfBooks--;
     } 
    return result;
}

  public boolean isEmpty()
  {
  return numOfBooks==0;
  }

  public int getCurrentSize()
  {
  return numOfBooks;
  }

  public void clear()
  {
   while(!isEmpty())
   {
   remove();
   }
  }
  
  public Book[] toArray()
  {
    @SuppressWarnings("unchecked")
     Book[] result =(Book[]) new Object[numOfBooks];
     int i = 0;
     Node currentNode = firstNode;
     while((i < numOfBooks)&&(currentNode != null))
      {
       result[i] = currentNode.getData();
       i++;
      currentNode = currentNode.getNextNode();
      }
  return result;
  }
     public Book topBook() {
        if(firstNode == null) {
            return null;
        } else {
            return firstNode.data;
        }
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
