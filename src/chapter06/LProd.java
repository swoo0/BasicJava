package chapter06;

public class LProd {
	private int id;
	private String type;
	private String name;
	

	public LProd() {
	}
	
	public LProd(int id, String type, String name) {
		this.id = id;
		this.type = type;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {  
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public String setType(String type) {
		this.type = type;
	}
	
	
	
}