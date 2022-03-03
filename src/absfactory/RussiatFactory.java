package absfactory;

public class RussiatFactory implements ITransportFactory {

	@Override
	public ITank createTanK() {
		return new T14Armata();
	}

	@Override
	public IAircraft createAircraft() {
		return new MC21();
	}

}
