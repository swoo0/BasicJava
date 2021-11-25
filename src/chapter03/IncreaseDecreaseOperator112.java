package chapter03;

public class IncreaseDecreaseOperator112 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------");
		x++; //x=x+1;
		++x; //x=x+1;
		System.out.println("x=" + x);
		
		System.out.println("-----------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("-----------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		System.out.println("x=" + x + ", y=" + y + ", z=" + z);
		System.out.printf("x=%s, y=%s, z=%s", x, y, z);
	}
}
