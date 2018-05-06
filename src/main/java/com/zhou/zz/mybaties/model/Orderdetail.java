package com.zhou.zz.mybaties.model;

public class Orderdetail {
	private Integer id;

	private Integer orderid;

	private Integer itemid;

	private Integer itemsnum;

	private Order order;

	private Item item;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	public Integer getItemsnum() {
		return itemsnum;
	}

	public void setItemsnum(Integer itemsnum) {
		this.itemsnum = itemsnum;
	}
}