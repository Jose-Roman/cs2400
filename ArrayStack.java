//Jose Roman
//Task 5
import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack implements StackInterface<Book>
{
    private Book[] stack;
    private int topIndex;
    private boolean integrityOK = false;
    private static final int DEFAULT_CAPACITY = 4;
    private static final int MAX_CAPACITY = 10;
    
    public ArrayStack()
     {
        stack = new Book[DEFAULT_CAPACITY];
        topIndex = 0;
     }
    
    public ArrayStack(int initialCapacity)
    {
        integrityOK = false;
        checkCapacity(initialCapacity);
        
        @SuppressWarnings("unchecked")
        Book[] tempStack = (Book[])new Object[initialCapacity];
        stack = tempStack;
        topIndex = -1;
        integrityOK = true;
    }
    
    public void push(Book newEntry)
      {
        
        ensureCapacity();
        stack[topIndex + 1] = newEntry;
        topIndex++;
      }
      
    public Book pop()
       {
        
          if (isEmpty())
             throw new EmptyStackException();
          else
            {
               Book top = stack[topIndex];
               stack[topIndex] = null;
               topIndex--;
               return top;
             } 
        } 
        
     public boolean isEmpty()
       {
        return topIndex < 0;
       }
       
    public Book peek()
       {
         
         if (isEmpty())
           throw new EmptyStackException();
         else
           return stack[topIndex];
      } 
      
    public void clear()
      {
        
         while (topIndex > -1)
           {
             stack[topIndex] = null;
             topIndex--;
           }       
      }
    
   
       private void checkCapacity(int capacity)
          {
            if (capacity > MAX_CAPACITY)
            throw new IllegalStateException("Attempt to create a bag whose " +
            "capacity exeeds allowed " +
            "maximum of " + MAX_CAPACITY);
          } 
          
      private void ensureCapacity()
          {
           if (topIndex >= stack.length - 1) 
             {
               int newLength = 2 * stack.length;
               checkCapacity(newLength);
               stack = Arrays.copyOf(stack, newLength);
             } 
           } 
          
}