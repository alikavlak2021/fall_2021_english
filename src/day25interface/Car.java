package day25interface;

public class Car implements AirCondition, HybridEngine{

	@Override
	public void electronicAc() {
		
		System.out.println("The Car AC is electronic...");
		
	}

	@Override
	public void climateAc() {
		
		System.out.println("The Car AC is climate AC...");
		
	}

	@Override
	public void bacteriaKiller() {
		
		System.out.println("The Car AC kills %99.9 bacteria...");
		
	}

	@Override
	public void havingHybridEngine() {
		
		System.out.println("The Car engine is hybrid...");
		
	}

	@Override
	public void run() {
		
		System.out.println("The Car AC runs perfectly...");
		
	}

}
