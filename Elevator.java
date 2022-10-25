//Name: Progga Paromita Dutta
// Id: 114751436
// Recitation Section:5
/**
 * This class contains information about an elevator
 * @author Progga Paromita Dutta
 *
 */

public class Elevator {
  private int currentFloor;
  private int elevatorState;
  private Request request;
  static final int IDLE=0;
  static final int To_Source=1;
  static final int To_Destination=2;
/**
 * This is a default constructor which sets the value
 */
public Elevator()
{
	this.request=null;
	this.elevatorState=0;
	this.currentFloor=1;
}
/**
 * @return the currentfloor where the elevator is at present
 */
public int getCurrentFloor()
{
	return currentFloor;
}
/**
 * @return the elevator state whether it is idle,
 */
public int getElevatorState()
{
	return elevatorState;
}
/**
 * @return the request of the passenger
 */
public Request getRequest()
{
	return request;
}
/**
 * This is a setter method which sets the current floor
 * @param currentFloor-the floor that has to be set where the elevator is at
 */
public void setCurrentFloor(int currentFloor)
{
	this.currentFloor=currentFloor;
}
/**
 * This is a setter method which sets the state of an elevator whether it is idle, to source or to destination
 * @param elevatorState-the state that has to be set
 */
public void setElevatorState(int elevatorState)
{
	/*if(elevatorState==0)
	{
		this.elevatorState=elevatorState;//idle
	}
	else if(elevatorState==1)
	{
		this.elevatorState=elevatorState;//to_source
	}
	if(elevatorState==2)
	{
		this.elevatorState=elevatorState;//to_destination
	}*/
	this.elevatorState=elevatorState;
	
}
/**
 * This is a setter method which sets the request of a passenger for the elevator
 * @param request-the request that has to be set
 */
public void setRequest(Request request)
{
	if(request==null)
	{
		System.out.println("The elevator is idle");
	}
	else
	{
		this.request=request;
	}
}
}
