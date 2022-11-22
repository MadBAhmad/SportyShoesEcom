package com.ecommerce.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_items")
public class PurchaseItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long ID;
	
	
	@Column(name = "purchase_id")
	private long purchaseId;
	
	@Column(name = "product_id")
	private long productId;
	
	@Column(name = "user_id")
	private long userId;
	
	@Column(name = "rate")
	private BigDecimal rate;
	
	@Column(name = "qty")
	private int qty;
	
	@Column(name = "price")
	private BigDecimal price;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PurchaseItem [ID=" + ID + ", purchaseId=" + purchaseId + ", productId=" + productId + ", userId="
				+ userId + ", rate=" + rate + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	
}
