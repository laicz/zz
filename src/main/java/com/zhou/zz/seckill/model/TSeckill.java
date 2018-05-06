package com.zhou.zz.seckill.model;

public class TSeckill {
	private Integer id;

	private String sku;

	private Integer num;

	private Integer price;

	public TSeckill() {
		super();
	}

	public TSeckill(Integer id, String sku, Integer num, Integer price) {
		super();
		this.id = id;
		this.sku = sku;
		this.num = num;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}