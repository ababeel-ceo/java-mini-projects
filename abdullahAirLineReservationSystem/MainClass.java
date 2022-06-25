package abdullahAirLineReservationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<BookOrders> bookorderlist =new ArrayList<BookOrders>();
		ArrayList<Flight> flights= new ArrayList<Flight>();
		flights.add(new Flight(1,2));
		flights.add(new Flight(2,2));
		flights.add(new Flight(3,2));
		System.out.println("------------------Flight Information-------------\n");
		for(Flight f:flights)
		{
			f.flightInfo();
		}
		Scanner sc=new Scanner(System.in);
		int userInput=1;
		while(userInput==1)
		{
			System.out.println("Enter 1 to Book 0 to Exit ");
			userInput=sc.nextInt();
			if(userInput==1)
			{
				BookOrders bookorder=new BookOrders();
				if(bookorder.booking())
				{
				if(bookorder.isAvailable(flights,bookorderlist))
				{
				bookorderlist.add(bookorder);
				System.out.println("\n!!!!Booked Succesfully!!!! ");
				}else {
					System.out.println("\n!!!Sorry!!! Try again... ");
				}
				}
				else {
					System.err.println("\nSorry!!! try again... ");
				}
			}
			else {
				System.out.println("ThankYou Visit Again!!!");
			}
		}
		
		
		for(BookOrders bo: bookorderlist )
		{
			bo.getData();
		}
	}

}
