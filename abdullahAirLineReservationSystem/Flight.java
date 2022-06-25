package abdullahAirLineReservationSystem;

public class Flight {

	int flightNo;
	int capacity;

	Flight(int flightNo,int capacity)
	{
		this.flightNo=flightNo;
		this.capacity=capacity;
	}
	
	void flightInfo() {
		
		System.out.println("            Flight No : "+flightNo+" Capacity : "+capacity);
		System.out.println("==================================================");
	}
}

