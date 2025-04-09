package Basic_Inventory_System;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		if (price < 0 || quantity < 0) {
			throw new IllegalArgumentException(" Price and quantity must be non-negative.");

		}

		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void restock(int amount) {
		if (amount > 0) {
			quantity += amount;
		}
	}
	public void setPrice(double newPrice) {
		if (newPrice >= 0) {

			price = newPrice;
		}
	}
}
