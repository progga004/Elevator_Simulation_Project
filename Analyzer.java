//Name: Progga Paromita Dutta
//Id:114751436
//Recitation Section: 5

import java.util.Scanner;
public class Analyzer {
/**
 * This is the main method which makes use all of the classes
 * @param args unused
 */

	public static void main(String[] args) {
		System.out.println("Welcome to the Elevator simulator!");
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the probability of arrival for requests:");
		double n=input.nextDouble();// taking input
		//checking the ranges of the condition
		while(n<0.0|| n>1.0)
		{
			System.out.println("The probability must be between 0.0 and 1.0");
			System.out.println("Please again enter the probability of arrival for requests:");
			n=input.nextDouble();
			if(n>=0.0 && n<=1.0)
			{
				break;
			}
		}
		System.out.println("Please enter the number of floors:");
		int number=input.nextInt();// taking input
		//checking the ranges of the condition
		while(number<=1)
		{
			System.out.println("The number of buildings must be greater than 1");
			System.out.println("Please again enter the number of floors:");
			number=input.nextInt();
			if(number>1)
			{
				break;
			}
		}
		System.out.println("Please enter the number of elevators:");
		int elevator=input.nextInt();//taking input
		//checking the ranges of the condition
		while(elevator<=0)
		{
			System.out.println("The number of elevators must be greater than 0");
			System.out.println("Please again enter the number of elevators:");
			elevator=input.nextInt();
			if(elevator>0)
			{
				break;
			}
		}
		System.out.println("Please enter the length of the simulation (in time units):");
		int length=input.nextInt();// taking input
		//checking the ranges of the condition
		while(length<=0)
		{
			System.out.println("The length must be greater than 0");
			System.out.println("Please again enter the length of the simulation:");
			length=input.nextInt();
			if(length>0)
			{
				break;
			}
		}
		Simulator p=new Simulator();// creating an object
		p.simulate(n, number, elevator, length);
		
		
		
		

	}}


