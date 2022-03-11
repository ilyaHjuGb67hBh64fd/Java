package proxy;

public class RealSite implements IRunner{
	
	private String url;
	

	public RealSite(String url) {
		this.url = url;
		download();
	}
	
	public void download() {;
	System.out.println("Download this site, Ok");
	}

	@Override
	public void start() {
		System.out.println("Starting our site " + url);
		
	}
	

}
