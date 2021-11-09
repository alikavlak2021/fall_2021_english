package day25interfaceencapsulation;

public abstract class ElectricalVehicles implements AirCondition{

	@Override
	public void climateAc() {
		
		System.out.println("The electrical vehicle climate AC...");
		
	}

	@Override
	public void run() {
		
		System.out.println("Electrical vehicle is the best...");
		
	}


}
