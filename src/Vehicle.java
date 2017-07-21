
public abstract class Vehicle {

	int numberOfSeats;
	String colour;
	String vehicleId;

	public Vehicle (int NumberOfSeats, String colour, String vehicleId){
	this.numberOfSeats=NumberOfSeats;
	this.colour=colour;
	this.vehicleId=vehicleId;
	}
	
	
	
		public String getNumberOfSeats(){
		if (this.numberOfSeats >1 && numberOfSeats <= 9)
	    {
	      return vehicleId = "Car";
	    }
	    else if (this.numberOfSeats == 50)
	    {
	      return vehicleId = "Bus";
	    }
	    else if (this.numberOfSeats == 1)
	    {
	      return vehicleId = "Car";
	    }
		return vehicleId = "Unknown";
		
	}
}
