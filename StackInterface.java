//Jose Roman

public interface StackInterface<Book>
{

  public void push(Book newEntry);
  
  public Book pop();
  
  public Book peek();
  
  public boolean isEmpty();
  
  public void clear();

}