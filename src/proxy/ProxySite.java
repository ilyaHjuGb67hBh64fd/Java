package proxy;

public class ProxySite implements IRunner{

	private String proxy;
	private RealSite site;
	
	
	
	public ProxySite(String proxy) {
		this.proxy = proxy;
	}

	@Override
	public void start() {
		if(site == null) {
			site = new RealSite(proxy);
		}
		
		site.start();
	}
	

}
