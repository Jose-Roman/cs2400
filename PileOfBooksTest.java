import java.util.Arrays;

public class PileOfBooksTest 
{
  public static void main(String[] args) 
  {
    PileOfBooks desk = new PileOfBooks();
    
    System.out.println("Is Empty: "+ desk.isEmpty());
    
    desk.add(new Book("The Outsiders"));
    
    desk.add(new Book("The Bus"));
    
    desk.add(new Book("Book of Basketball"));
    
    desk.add(new Book("Trojans"));    //4th book exceeds default capacity
    
    System.out.println("Books: "+ Arrays.toString(desk.toArray()));
    
    Book one = new Book("Lakers");
    
    
    
    System.out.println("Contains "+ one +" : "+desk.contains(one));
    
    System.out.println("Is Empty: "+ desk.isEmpty());
    
    System.out.println(desk.remove()+ " has been removed from the top of the pile");
    
    System.out.println(desk.remove()+ " has been removed from the top of the pile");
    
    desk.add(new Book("Harry Potter"));
    
    System.out.println("Harry Potter has been added to the top of the pile");
    
    System.out.println("Books: "+ Arrays.toString(desk.toArray()));

    desk.clear();  
    
    System.out.println("Books: "+ Arrays.toString(desk.toArray()));
    
    System.out.println("Is Empty: "+ desk.isEmpty());
    
  }
}
