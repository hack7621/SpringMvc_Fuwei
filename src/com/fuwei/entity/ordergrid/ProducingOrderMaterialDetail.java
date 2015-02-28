package com.fuwei.entity.ordergrid;

import java.io.Serializable;

public class ProducingOrderMaterialDetail implements Serializable {
	private String material;//材料
	private String color;//色号
	private int quantity;//数量
	private String colorsample;//标准色样
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getColorsample() {
		return colorsample;
	}
	public void setColorsample(String colorsample) {
		this.colorsample = colorsample;
	}
	
}