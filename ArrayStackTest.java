//Jose Roman
//Task 5
public class ArrayStackTest {
  public static void main(String[] args) 
  {
    ArrayStack desk = new ArrayStack();
    
    System.out.println("Add Books:");
    
    desk.push(new Book("The Great Gatsby"));
    desk.push(new Book("The Catcher In The Rye"));
    desk.push(new Book("Julius Caesar"));
    desk.push(new Book("Of Mice and Men"));
    desk.push(new Book("Romeo and Juliet"));                //5th book means the array has to be resized
    
    System.out.println("Top Book: " + desk.peek());
    System.out.println("Is Empty: " + desk.isEmpty());
    
    System.out.println("Remove top book");
    
    desk.pop();
    
    System.out.println("Top Book: " + desk.peek());
    
    desk.pop();
    
    System.out.println("Remove top book");
    System.out.println("Top Book: " + desk.peek());
    
    System.out.println("Add new book to pile");
    
    desk.push(new Book("Mamba Mentality"));
    
    System.out.println("Top Book: " + desk.peek());
    
    System.out.println("Clear desk");
    
    desk.clear();
    
    System.out.println("Is Empty: " + desk.isEmpty());
      
  }
}
