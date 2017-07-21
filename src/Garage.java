import java.util.ArrayList;

public class Garage {
//Create ArrayList
		ArrayList <Vehicle>	VehicleList = new ArrayList<Vehicle>();
		
		
//add Vehicle	
			public void addVehicle(Vehicle input) {
				
				VehicleList.add(input);
		}
//remove Vehicle
			public void removeVehicle(String id) {
				
				for (Vehicle v : VehicleList)
				{	
					if (v.vehicleId == id) {
						
					VehicleList.remove(v);
					}
				}
		}
//fix vehicle
			public void fixVehicle(String id) {
				
			for (Vehicle v : VehicleList)
					
			if (v.vehicleId == id && id == "Car")
			{
			System.out.println("This will cost you £500");
			}
			else if (v.vehicleId == id && id == "Motorbike") {
			System.out.println("This will cost £300");
			}
			else if (v.vehicleId == id && id == "Bus") {
			System.out.println("This will cost £1000");
			}
		}
//empty garage
		public void emptyGarage()
		{
			VehicleList.clear();
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}
}	
	
	



