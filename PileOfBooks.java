public class PileOfBooks implements PileOfBooksInterface<Book>
 {
    private Book[] books;
    private static final int DEFAULT_CAPACITY = 3;
    private int numOfBooks;

    public PileOfBooks()
    {
    books = new Book[DEFAULT_CAPACITY];
    numOfBooks = 0;
    }
    
    public boolean add(Book newEntry)
    {
      if(numOfBooks == books.length)
      {
        Book newPile[] = new Book[numOfBooks * 2];
        for(int i=0; i < numOfBooks; i++)
        {
          newPile[i] = books[i];
        }
        books = newPile;
      }
      books[numOfBooks] = newEntry;
      numOfBooks++;
      return true;
    }
    
    public Book remove()
    {
    if(numOfBooks == 0)
       return null;
    Book bag = books[numOfBooks - 1];
    numOfBooks--;
    return bag;
    }
    
    public void clear()
    {
    books = new Book[DEFAULT_CAPACITY];
    numOfBooks = 0;
    
    }
    
    public boolean isEmpty()
    {
    return numOfBooks == 0;
    }
    
    public int getCurrentSize()
    {
    return numOfBooks;
    }
    
    public Book[] toArray()
    {
     Book a[] = new Book[numOfBooks];
     for(int i = 0; i < numOfBooks; i++)
      {
        a[i] = books[i];
      }
      return a;
    }
    
    public boolean contains(Book anEntry)
    {
     for(int i = 0; i < numOfBooks; i++)
     {
       if(books[i].equals(anEntry))
        return true;
     }
     return false;
    }


 }
