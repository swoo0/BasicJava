package chapter06.exam.p285_3;

public class ShopService {
	
	private static ShopService Instans = new ShopService();
	private ShopService() {
	}
	
	public static ShopService getInstans() {
		return Instans;
	}
}
