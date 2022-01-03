import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ClientHeap 
{
	public static void main(String[] args) throws IOException
	{
		MaxHeap tree = new MaxHeap();
	    Integer[] numb = new Integer[100];
	    
	    File out = new File("output.txt");
		FileWriter fw = new FileWriter(out);
	    PrintWriter outputFile = new PrintWriter(fw);
	   
	   File data = new File("data.txt");
	   Scanner inputFile = new Scanner(data);  
	   
	   for(int i = 0; i < numb.length; i++)
	   {
		numb[i] = inputFile.nextInt();
	   }
	     
	   for(int x = 0; x < numb.length ; x++)
	   {
		   tree.add(numb[x]);
	   }
	   
	   System.out.println("Heap built using sequential insertions:  ");
	   outputFile.println("Heap built using sequential insertions:  ");
	   tree.printTree();
	   System.out.println("   ");
	   int [] treeABC = tree.printHeap();
	   outputFile.println(Arrays.toString(treeABC));


	   outputFile.println("Number of swaps in the heap creation:  ");
	   outputFile.println(tree.nSwaps());
	   
	   tree.removeMax();tree.removeMax();tree.removeMax();tree.removeMax();tree.removeMax();
	   tree.removeMax();tree.removeMax();tree.removeMax();tree.removeMax();tree.removeMax();
	   System.out.println("Number of swaps in the heap creation:  ");
	   tree.numSwaps();
	   
	   System.out.println("Heap after 10 removals:   ");
	   outputFile.println("Heap after 10 removals:   ");
	   tree.printTree();
	   int [] treeABCD = tree.printHeap();
	   outputFile.println(Arrays.toString(treeABCD));
	   outputFile.println("   ");
	   
	   MaxHeap treeA = new MaxHeap(numb);
	   System.out.println("   "); System.out.println("   ");
	   System.out.println("Heap built using optimal method:  ");
	   outputFile.println("Heap built using optimal method:  ");
	   treeA.printTree();
	   int [] treeAA = treeA.printHeap();
	  outputFile.println(Arrays.toString(treeAA));
	  
	   treeA.removeMax();   treeA.removeMax();   treeA.removeMax();   treeA.removeMax();   treeA.removeMax();
	   treeA.removeMax();   treeA.removeMax();   treeA.removeMax();   treeA.removeMax();   treeA.removeMax();
	   System.out.println("   ");
	   System.out.println("Number of swaps in the heap creation:  ");
	   treeA.numSwapstoo();
	   outputFile.println("Number of swaps in the heap creation:  ");
	   outputFile.println(treeA.nSwapstoo());
	   
	   System.out.println("Heap after 10 removals:   ");
	   outputFile.println("Heap after 10 removals:   ");
	   treeA.printTree();
	   int [] treeAB = treeA.printHeap();
	   outputFile.println(Arrays.toString(treeAB));
	   
	    
	  
	   
	   inputFile.close();
	   outputFile.close();
	}
}
