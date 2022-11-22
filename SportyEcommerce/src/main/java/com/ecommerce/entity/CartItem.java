package com.ecommerce.entity;

import java.math.BigDecimal;

public class CartItem {

	private long productId;
	private String name;
	private BigDecimal rate;
	private BigDecimal price;
	private int qty;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "CartItem [productId=" + productId + ", name=" + name + ", rate=" + rate + ", price=" + price + ", qty="
				+ qty + "]";
	}
	
	
}
