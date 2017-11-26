package store;

public class Product {

	private String id;
	private String name;
	private String image;
	private double price;
	
	public Product(String id, String name, String image, double price) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
	}
	
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getImage() {
		return image;
	}
	
	public double getPrice() {
		return price;
	}
}
