//Name: Progga Paromita Dutta
//Id : 114751436
// Homework Section:5
import java.util.ArrayList;
/**
 * This class implements as a derived class of ArrayList
 * @author Progga Paromita Dutta
 *
 */
public class RequestQueue extends ArrayList{
   ArrayList<Integer>queue=new ArrayList<Integer>();
   /**
    * This method inserts at the end of a queue in the list
    * @param n-the object that has to be added
    */
   public void enqueue(Integer n)
   {
	   queue.add(n);
	 
   }
   /**
    * This method removes an object from a specific position
    * @return the object that has been removed
    */
   public Integer dequeue()
   {
	 Integer temp=queue.get(0);
	 queue.remove(0);
	 return temp;
	   
   }
   /**
    * This method returns the size of the queue
    */
   public int size()
   {
	   return queue.size();
   }
   /**
    * This method checks whether the queue or list is empty or not
    */
   public boolean isEmpty()
   {
	   return queue.isEmpty(); // returns true if the list or queue is empty
   }
   
}
