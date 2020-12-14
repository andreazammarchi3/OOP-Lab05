package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private final String name;
	private final double quantity;
	
	public ProductImpl(final String name, final int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return this.name;
	}

	public double getQuantity() {
		return this.quantity;
	}
	
	public int hashCode() {
		return name.hashCode();
	}
	
	public boolean equals(final Object obj) {
		if(obj instanceof Product) {
			final var pr = (Product) obj;
			return name.equals(pr.getName());
		}
		return false;
	}
	
	public final String toString() {
		return "ProductImpl [name=" + this.name + ", quantity=" + quantity + "]";
	}
}
