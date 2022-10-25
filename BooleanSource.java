//Name: Progga Paromita Dutta
// Id : 114751436
// Recitation Section : 5
/**
 * This class implements the probability of a BooleanSource object
 * @author Progga Paromita Dutta
 *
 */
public class BooleanSource {
  private double probability;
  /**
   * this is a constructor for creating an object with probability
   * @param probability-the probability that has to be set
   * @throws IllegalArgumentException when the probability is not between 0 and 1
   */
  public BooleanSource(double probability)
  {
	  try {
	  if(probability<0.0||probability>1.0)
	  {
		  throw new IllegalArgumentException("The probability of arrival time must be between 0.0 and 1.0");// throw exception
	  }
  }
	  catch(IllegalArgumentException e) {
		  System.out.println(e.getMessage());
	  }
	  if(probability>=0.0 && probability<=1.0)
	  {
		  this.probability=probability;
	  }
	  
}
  /**
   * This method implements whether a percentage of time is equal to probability or not
   * @return true or false about a percentage of time equal to probability or not
   */
public boolean requestArrived()
{
	return (Math.random()<this.probability); // checking the condition
}



}
