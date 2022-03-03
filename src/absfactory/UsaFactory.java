package absfactory;

public class UsaFactory implements ITransportFactory{

	@Override
	public ITank createTanK() {
		return new M1Abrams();
	}

	@Override
	public IAircraft createAircraft() {
		
		return new Boeing777();
	}

	
}
