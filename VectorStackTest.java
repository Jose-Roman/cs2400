//task 6
public class VectorStackTest 
{
  public static void main(String[] args) 
  {
    VectorStack pile = new VectorStack();
    
    System.out.println("Add Books to pile:");
    
    pile.push(new Book("The New 52"));
    pile.push(new Book("Fun House of Evil"));
    pile.push(new Book("Friday Nght Lights"));
    pile.push(new Book("Shoe Dog"));
    
    System.out.println("Top Book: " + pile.peek());
    System.out.println("Is Empty: " + pile.isEmpty());
    
    System.out.println("Remove the top book:");
    pile.pop();
    System.out.println("Top Book: " + pile.peek());
    
    System.out.println("Remove the top book:");
    pile.pop();
    System.out.println("Top Book: " + pile.peek());
    
    System.out.println("Add new book to pile");
    pile.push(new Book("The Fab 5"));
    System.out.println("Top Book: " + pile.peek());
    
    System.out.println("Remove the top book:");
    pile.pop();
    System.out.println("Top Book: " + pile.peek());
    
    System.out.println("Clear table");
    
    pile.clear();
    System.out.println("Is Empty: " + pile.isEmpty());
  }
}

