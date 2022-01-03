import java.util.Arrays;

public class MaxHeap
{
 private Integer[] heap;
 private int lastIndex;
 private boolean initialized = false;
 private static final Integer DEFAULT_CAPACITY = 105;
 private static final Integer MAX_CAPACITY = 1000;
 int swaps;
 int numSwaps;
  
 public MaxHeap()
 {
   this(DEFAULT_CAPACITY);
 }
  
 public MaxHeap(int initialCapacity)
 {
   if(initialCapacity < DEFAULT_CAPACITY)
     initialCapacity = DEFAULT_CAPACITY;
   else 
     checkCapacity(initialCapacity);
   @SuppressWarnings("unchecked")
   Integer[] tempHeap = new Integer[initialCapacity+1];
   heap = tempHeap;
   lastIndex = 0;
   swaps = 0;
   initialized = true;
 }
 
 public  MaxHeap(Integer[] entries)
 {
  this(entries.length);
  numSwaps = 0;
  assert initialized = true;
  lastIndex = entries.length;
  for(int i= 0; i < entries.length; i++)
  {
    heap[i + 1] = entries[i];
  }
  for(int rootIndex = lastIndex/2; rootIndex > 0; rootIndex--)
   reheap(rootIndex);
 }
 
 public Integer getMax()
 {
 checkInitialization();
 Integer root = null;
 if(!isEmpty())
   root = heap[1];
 return root;
 }
 
 public boolean isEmpty()
 {
  return lastIndex < 1;
 }
 
 public int getSize()
 {
 return lastIndex;
 }
 
 public void clear()
 {
  checkInitialization();
  while(lastIndex > -1)
  {
   heap[lastIndex] = null;
   lastIndex--;
  }
  lastIndex = 0;
 }
 
 public void add(Integer newEntry)
 {
   checkInitialization();
   int newIndex = lastIndex + 1;
   int parentIndex = newIndex/2;
   
   while ( (parentIndex > 0) && newEntry.compareTo(heap[parentIndex]) > 0)
    {
     heap[newIndex] = heap[parentIndex];
     newIndex = parentIndex;
     parentIndex = newIndex / 2; 
     swaps ++;
    }
    heap[newIndex] = newEntry;
    lastIndex++;
    ensureCapacity();
 }
 
 public Integer removeMax()
 {
  checkInitialization();
  Integer root = null;
  if(! isEmpty())
  {
  root = heap[1];
  heap[1] = heap[lastIndex];
  lastIndex--;
  reheap(1);
  }
  return root;
 }
 
 private void reheap(Integer rootIndex)
 {
  boolean done = false;
  Integer orphan = heap[rootIndex];
  int leftChildIndex = 2 * rootIndex;
  while (!done && (leftChildIndex <= lastIndex) )
   { 
    int largerChildIndex = leftChildIndex;
    int rightChildIndex = leftChildIndex + 1;
    if ( (rightChildIndex <= lastIndex) && heap[rightChildIndex].compareTo(heap[largerChildIndex]) > 0)
    {
        largerChildIndex = rightChildIndex;
    }
    if (orphan.compareTo(heap[largerChildIndex]) < 0)
     {
      heap[rootIndex] = heap[largerChildIndex];
      rootIndex = largerChildIndex;
      leftChildIndex = 2 * rootIndex;
     } 
    else
     done = true;
    numSwaps++;
   }
   heap[rootIndex] = orphan;
 }

 
   
  private void checkCapacity(int capacity)
    {
      if (capacity < DEFAULT_CAPACITY)
       capacity = DEFAULT_CAPACITY;
      else if (capacity > MAX_CAPACITY)
          throw new IllegalStateException("Attempt to create a heap whose capacity is larger than " + MAX_CAPACITY);
    }
  
   private void ensureCapacity()
    {
     if (lastIndex >= heap.length)
     {
      int newCapacity = 2 * heap.length;
      checkCapacity(newCapacity);
      heap = Arrays.copyOf(heap, newCapacity);
     }
    }
 
   private void checkInitialization()
    {
     if(!initialized)
        throw new SecurityException ("MaxHeap object is not initialized properly.");
    }
   
   public void printTree()
   {
	   for(int i = 1; i < 11; i++)
	   {
		   	System.out.print(heap[i] + "  ");
	   }
   }
   
   public void numSwaps()
   {
	   System.out.println(swaps);
   }
   
   public void numSwapstoo()
   {
	   System.out.println(numSwaps);
   }
   
   public int nSwaps()
   {
	   int s = swaps;
	   return s;
   }
   public int nSwapstoo()
   {
	   int sd = numSwaps;
	   return sd;
   }
   
   public int[] printHeap()
   {
	   int[] heapps = new int [11];
	   for(int i = 1; i < 11; i++)
	   {
		   heapps[i] = heap[i];
	   }
	   return heapps;
   }
   
   
}