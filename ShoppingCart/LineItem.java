package com.techlabs.shoppingCart;

public class LineItem {
	private int id;
	private int quantity;
	private Product product;
	
	public LineItem() {}
	
	public LineItem(int id, int quantity, Product product) {
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double calculateLineItemCost() {
		return (double) this.quantity * this.product.getPrice() - (double) this.quantity * this.product.getDiscountPercent();
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", quantity=" + quantity + ", product=" + product + "]";
	}
}
