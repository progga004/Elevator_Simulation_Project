//Name: Progga Paromita Dutta
// Id: 114751436
//Recitation section: 5
/**
 * This class contains the informations of a passenger's request when it is placed.
 * @author Progga Paromita Dutta
 *
 */
public class Request {
   private int sourceFloor;
   private int destFloor;
   private int timeEntered;
   private int numberofBuildings;
  /**
   * This is a argument constructor which generates randomly source floor and destination floor
   * @param numberofBuildings-the number of floors that has to be set
   */
   public Request(int numberofBuildings) {
	   this.numberofBuildings=numberofBuildings;
	   this.sourceFloor=1+(int)(Math.random()*numberofBuildings);
	   this.destFloor=1+(int)(Math.random()*numberofBuildings);
	   this.timeEntered=0;
   }
   /**
   * @return the source floor of the building from where a passenger is to be picked
    */
   public int getSourceFloor()
   {
	   return sourceFloor;
   }
   /**
    * @return the destination floor where a passenger wishes to go
    */
   public int getDestFloor()
   {
	   return destFloor;
   }
   /**
    * @return the entered time when the passenger requests for the elevator
    */
   public int getTimeEntered()
   {
	   return timeEntered;
   }
   /**
    * @return the number of floors
    */
   public int getNumberofBuildings()
   {
	   return numberofBuildings;
   }
   /**
    * This is a setter method which sets the source floor of the building from where a passenger is to be picked
    * @param sourceFloor-the floor that has to be set
    */
   public void setSourceFloor(int sourceFloor)
   {
	   this.sourceFloor=sourceFloor;
   }
   /**
    * This is a setter method which sets the destination floor of the building where a passenger wishes to go
    * @param destFloor-the destination floor that has to be set
    */
   public void setDestFloor(int destFloor)
   {
	   this.destFloor=destFloor;
   }
   /**
    * This is a setter method which sets the entered time when a passenger asks for the elevator
    * @param timeEntered-the entered time that has to be set
    */
   public void setTimeEntered(int timeEntered)
   {
	   this.timeEntered=timeEntered;
   }
   /**
    * This is a setter method which sets the number of buildings
    * @param numberofBuildings-the number that has to be set
    */
   public void setNumberOfBuildings(int numberofBuildings)
   {
	   this.numberofBuildings=numberofBuildings;
   }
  
   
}
