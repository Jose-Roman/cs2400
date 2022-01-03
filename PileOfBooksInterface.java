public interface PileOfBooksInterface<Book> 
{
    public boolean add(Book newEntry);
  
    public Book remove();
  
    public int getCurrentSize();
  
    public boolean isEmpty();
  
    public void clear();
  
    public Book[] toArray();
  
    
}