package proxy;

public class StarSite {

	public static void main(String[] args) {
//		IRunner runSite = new RealSite("https://www.outsite.ru");
//		runSite.start();

		IRunner runSite = new ProxySite("https://www.outsite.ru");
		runSite.start();
		
		
		
	}

}
