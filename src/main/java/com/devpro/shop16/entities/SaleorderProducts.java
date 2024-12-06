package com.devpro.shop16.entities;

import javax.persistence.*;

@Entity
@Table(name="tbl_saleorder_products")
public class SaleorderProducts extends BaseEntity{
	@Column(name = "quality", nullable = false)
	private Integer quality;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private Product product;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "saleorder_id")
	private Saleorder saleOrder;

	public Integer getQuality() {
		return quality;
	}

	public void setQuality(Integer quality) {
		this.quality = quality;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Saleorder getSaleOrder() {
		return saleOrder;
	}

	public void setSaleOrder(Saleorder saleOrder) {
		this.saleOrder = saleOrder;
	}
}
