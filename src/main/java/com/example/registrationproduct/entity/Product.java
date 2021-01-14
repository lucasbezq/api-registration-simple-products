package com.example.registrationproduct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "tblproduct")
@SequenceGenerator(name = "seq_product", sequenceName = "seq_product", initialValue = 1, allocationSize = 1)
public class Product {

	@Id
	@GeneratedValue(generator = "seq_product")
	@Column(name = "idproduct")
	@JsonProperty("idproduct")
	private Long idProduct;

	@Column(name = "product")
	@JsonProperty("product")
	private String product;

	@Column(name = "price")
	@JsonProperty("price")
	private Double price;

	@Column(name = "quantity")
	@JsonProperty("quantity")
	private Integer quantity;

	public Product() {
	}

	public Product(Long idProduct, String product, Double price, Integer quantity) {
		super();
		this.idProduct = idProduct;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", product=" + product + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
