
public class Test 
{
  public static void main(String[] args) {
    
    LinkedBag desk = new LinkedBag();
    
    System.out.println("Is Empty: "+ desk.isEmpty());
    
    desk.add(new Book("Death of a Salesman"));
     System.out.println("Top Book: " + desk.topBook());
    
    desk.add(new Book("The Great Gatsby"));
     System.out.println("Top Book: " + desk.topBook());
    
    desk.add(new Book("The Crucible"));
     System.out.println("Top Book: " + desk.topBook());
    
    desk.add(new Book("To Kill a Mockingbird"));
     System.out.println("Top Book: " + desk.topBook());
    
    System.out.println("Number of Books: "+ desk.getCurrentSize());
    
    System.out.println("Is Empty: "+ desk.isEmpty());
    
    System.out.println("remove top book");
    desk.remove();
    
    System.out.println("Top Book: " + desk.topBook());
    
    System.out.println("remove top book");
    desk.remove();
    
    System.out.println("Top Book: " + desk.topBook());
    
    System.out.println("Number of Books: "+ desk.getCurrentSize());
    
    desk.remove();
    
    System.out.println("remove top book");
    System.out.println("Top Book: " + desk.topBook());
    
    
    desk.clear();
    
    System.out.println("Clear desk");
    System.out.println("Is Empty: "+ desk.isEmpty());
    
  }
}