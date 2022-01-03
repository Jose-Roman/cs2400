//Jose Roman
//task 6
import java.util.Vector;
import java.util.EmptyStackException;

public class VectorStack implements StackInterface<Book>
{
  private Vector<Book> stack; 
  private boolean integrityOK;
  private static final int DEFAULT_CAPACITY = 3;
  private static final int MAX_CAPACITY = 10;
  
  public VectorStack()
   {
    this(DEFAULT_CAPACITY);
   } 
   
   public VectorStack(int initialCapacity)
    {
     integrityOK = false;
     checkCapacity(initialCapacity);
     stack = new Vector<>(initialCapacity); 
     integrityOK = true;
    }
    
    public void push(Book newEntry)
     {
     stack.add(newEntry);
     }
     
   public Book pop()
    {
     if (isEmpty())
       throw new EmptyStackException();
     else
      return stack.remove(stack.size() - 1);
    }
    
   public Book peek()
    {
     if (isEmpty())
       throw new EmptyStackException();
     else
       return stack.lastElement();
    } 
    
  public boolean isEmpty()
    {
     return stack.isEmpty();
    } 
    
  public void clear()
   {
    stack.clear();
   }
    
    
  private void checkCapacity(int capacity)
   {
     if (capacity > MAX_CAPACITY)
      throw new IllegalStateException("Attempt to create a bag whose " +
       "capacity exeeds allowed " +
       "maximum of " + MAX_CAPACITY);
   } 
}

