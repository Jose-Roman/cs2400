//Jose Roman

public class LinkedStackTest 
{
  public static void main(String[] args) 
  {
    LinkedStack table = new LinkedStack();
    
    System.out.println("Add Books:");
    
    table.push(new Book("The Bus"));
    table.push(new Book("The Avengers"));
    table.push(new Book("War of Kings"));
    table.push(new Book("Planet Hulk"));
    
    System.out.println("Top Book: " + table.peek());
    System.out.println("Is Empty: " + table.isEmpty());
    
    System.out.println("Remove the top book:");
    table.pop();
    System.out.println("Top Book: " + table.peek());
    
    System.out.println("Remove the top book:");
    table.pop();
    System.out.println("Top Book: " + table.peek());
    
    System.out.println("Add new book to pile");
    
    table.push(new Book("Spider-Man: Life Story"));
    System.out.println("Top Book: " + table.peek());
    
    System.out.println("Remove the top book:");
    table.pop();
    System.out.println("Top Book: " + table.peek());
    
    System.out.println("Clear table");
    
    table.clear();
    System.out.println("Is Empty: " + table.isEmpty());
    
    
    
    
  }
}
