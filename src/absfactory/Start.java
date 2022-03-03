package absfactory;

public class Start {

	public static void main(String[] args) {

		ITransportFactory transportOneRu = new RussiatFactory();
		ITank tankRU = transportOneRu.createTanK();
		tankRU.move();
		
		ITransportFactory transportTwoRu = new RussiatFactory();
		IAircraft aircraftRU = transportTwoRu.createAircraft();
		aircraftRU.flyight();
		
		ITransportFactory transOneUsa = new UsaFactory();
		ITank tankUsa = transOneUsa.createTanK();
		tankUsa.move();
		
		ITransportFactory transTwoUsa = new UsaFactory();
		IAircraft aircraftUsa = transTwoUsa.createAircraft();
		aircraftUsa.flyight();
		
	}

}
