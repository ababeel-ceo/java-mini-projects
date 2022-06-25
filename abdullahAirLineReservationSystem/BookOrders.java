package abdullahAirLineReservationSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookOrders {
	String  passengerName;
	int flightNo;
	Date date;

	public boolean booking()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Your Name: ");
		passengerName=sc.next();
		System.out.print("\nEnter Flight No : ");
		flightNo=sc.nextInt();
		if(flightNo>3)
			{System.err.println("Enter Valid Flight Number");
			return false;}
		System.out.print("\nEnter Date [dd-mm-yyyy]: ");
		String getDate=null;
		getDate=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=sdf.parse(getDate);
		} catch (ParseException e1) {
			System.err.println("Invalid date format ");
			return false;
		}
		 
	   
		return true; 
		 }
	
		 
	
	
	
	public boolean isAvailable(ArrayList<Flight> flights,ArrayList<BookOrders> b)
	{
		
		int capacity=0;
		for(Flight f1: flights)
		{
			if(f1.flightNo == flightNo)
			{
				capacity=f1.capacity;
			}
		}
		
		int bookingCount=0;
		for(BookOrders b1:b)
		{
			if(b1.flightNo == flightNo && b1.date.equals(date))
			{
				bookingCount++;
			}
		}
		if(capacity == bookingCount)
		{
			return false;
		}else
		{
			return true;
		}
		
	}
	
	public void getData()
	{
		System.out.println("Passenger Name : "+ passengerName+"  Bus No : "+flightNo+" Date : "+date);
	}
	
	
}
