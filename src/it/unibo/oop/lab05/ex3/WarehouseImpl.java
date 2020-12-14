package it.unibo.oop.lab05.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	final Set<Product> warehouse = new LinkedHashSet<>();

	public void addProduct(Product p) {
		warehouse.add(p);
	}

	public Set<String> allNames() {
		final Set<String> s = new LinkedHashSet<>();
		for(Product p : this.warehouse) {
			s.add(p.getName());
		}
		return s;
	}

	public Set<Product> allProducts() {
		return new LinkedHashSet<>(this.warehouse);
	}

	public boolean containsProduct(Product p) {
		return warehouse.contains(p);
	}

	public double getQuantity(String name) {
		for(final var p : this.warehouse) {
			if(p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		return 0;
	}

}
