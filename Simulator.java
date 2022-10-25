//Name: Progga Paromita Dutta
// Id:114751436
//Recitation Section: 5
/**
 * This is a class which implements to carry out the simulation
 * @author Progga Paromita Dutta
 *
 */
public class Simulator {
/**
 * This is a static method which will take input for the simulation
 * @param probability- the arrival probability that has to be taken by the user
 * @param numberofBuildings-the number of floors that has to be set
 * @param numberofElevators-the number of elevators that has to be set
 * @param length- the length of the simulation that is carrying out
 */
 public static void simulate(double probability,int numberofBuildings,int numberofElevators,int length)
 {
	 
	 BooleanSource p=new BooleanSource(probability);
	 RequestQueue q=new RequestQueue();
	 RequestQueue m=new RequestQueue();
	 Elevator[]e=new Elevator[numberofElevators];// creating elevator object
	 int totalWaitTime=0;
	 double avgWaitTime=0;
	 int currentTime=1;
	 int k=0;
	 int request=0;
	 Request temp=new Request(numberofBuildings);
	 //creating elevator objects according to its number with the properties
	 while(k<numberofElevators)
	 {
		 e[k]=new Elevator();
		 k++;
	 }
	 //simulation starts and it will continue for each second
	 for(currentTime=1;currentTime<=length;currentTime++)
	 {
		 // has a request arrived or not
		if(p.requestArrived())
		{
			Request r=new Request(numberofBuildings);
			r.setTimeEntered(currentTime);
			q.enqueue(currentTime); // the arrival time of the request has been added to the queue
			temp=r;
		}	
			
	   for( int i=0;i<numberofElevators;i++)
		{
		   
		   // checking when an elevator will be idle, it will be given to handle a request
			if(!q.isEmpty()&& e[i].getElevatorState()==Elevator.IDLE)
			{
			    e[i].setRequest(temp);
				e[i].setElevatorState(Elevator.To_Source); 
				m.enqueue(q.dequeue());
				
				
			}
			
		}
		for(int i=0;i<numberofElevators;i++)
		{
			//  checking whether the elevator is visiting towards To_Source
			if(!m.isEmpty() && e[i].getElevatorState()==Elevator.To_Source)
			{
				//  if current floor and source floor is not same
				if(e[i].getCurrentFloor()!=e[i].getRequest().getSourceFloor())
				{
					if(e[i].getCurrentFloor()<e[i].getRequest().getSourceFloor())
					{
						e[i].setCurrentFloor(e[i].getCurrentFloor()+1);
						
					}
					else
					{
						e[i].setCurrentFloor(e[i].getCurrentFloor()-1);
						
					}
					
				}
				// checking whether they both are same, the total wait time is to be calculated
				
				else if(e[i].getCurrentFloor()==e[i].getRequest().getSourceFloor())
				{
					e[i].setCurrentFloor(e[i].getRequest().getSourceFloor());
					totalWaitTime=totalWaitTime+(currentTime-m.dequeue());
					request++;
					e[i].setElevatorState(Elevator.To_Destination);
					
				}
			}
		}
		for(int i=0;i<numberofElevators;i++)
		{
			//checking it is going to the source destination or not
			if(!m.isEmpty()&& e[i].getElevatorState()==Elevator.To_Destination)
			{
				if(e[i].getRequest().getDestFloor()!=e[i].getCurrentFloor())
				{
					if(e[i].getRequest().getDestFloor()<e[i].getCurrentFloor())
					{
						e[i].setCurrentFloor(e[i].getCurrentFloor()-1);
						
					}
					else
					{
						e[i].setCurrentFloor(e[i].getCurrentFloor()+1);
						
					}
				}	
				else if(e[i].getCurrentFloor()==e[i].getRequest().getDestFloor())
				{
					e[i].setCurrentFloor(e[i].getRequest().getDestFloor());
					e[i].setElevatorState(0);// when the elevator has reached from source to destination,it has been set to idle
					
				}
			
			}
			
		}
	 
	 
}
	 if(totalWaitTime!=0) {
	 System.out.println("Total Wait Time: "+ totalWaitTime);
	 if(request!=0) {
	 System.out.println("Total Requests: "+ request);}
	 avgWaitTime=(double)totalWaitTime/(double)request;
	 System.out.printf("Average wait time : %.02f", avgWaitTime);}
	
 }}
