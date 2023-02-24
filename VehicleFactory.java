 /** 
*factory class that is resposible for creation of vehicle objects. 
*/

class VehicleFactory{

	//method that create a vehicle object. 
	public Vehicle getVehicle(String vehType){
		
		if(vehType.equalsIgnoreCase("car")){
			return new Car();
		}
		else if(vehType.equalsIgnoreCase("Ship")){
			return new Ship();
		}
		else if(vehType.equalsIgnoreCase("aeroplane")){
			return new Aeroplane();
		}
		return null;
	}
}