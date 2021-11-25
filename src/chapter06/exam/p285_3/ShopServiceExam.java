package chapter06.exam.p285_3;

public class ShopServiceExam {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstans();
		ShopService obj2 = ShopService.getInstans();
	
		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("같은 ShopService 객체 입니다.");
		}
	
	}
}
