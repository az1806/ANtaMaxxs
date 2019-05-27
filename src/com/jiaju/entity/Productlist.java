package com.jiaju.entity;

public class Productlist {
				private int id;
				private String name;
				private String size;
				private String color;
				private String sum;
				private String jiaqian;
				private String fenlei;
				private String xilie;
				private String img;
				public Productlist(int id, String name, String size,
						String color, String sum, String jiaqian,
						String fenlei, String xilie, String img) {
					super();
					this.id = id;
					this.name = name;
					this.size = size;
					this.color = color;
					this.sum = sum;
					this.jiaqian = jiaqian;
					this.fenlei = fenlei;
					this.xilie = xilie;
					this.img = img;
				}
				public Productlist() {
					super();
				}
				public int getId() {
					return id;
				}
				public void setId(int id) {
					this.id = id;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public String getSize() {
					return size;
				}
				public void setSize(String size) {
					this.size = size;
				}
				public String getColor() {
					return color;
				}
				public void setColor(String color) {
					this.color = color;
				}
				public String getSum() {
					return sum;
				}
				public void setSum(String sum) {
					this.sum = sum;
				}
				public String getJiaqian() {
					return jiaqian;
				}
				public void setJiaqian(String jiaqian) {
					this.jiaqian = jiaqian;
				}
				public String getFenlei() {
					return fenlei;
				}
				public void setFenlei(String fenlei) {
					this.fenlei = fenlei;
				}
				public String getXilie() {
					return xilie;
				}
				public void setXilie(String xilie) {
					this.xilie = xilie;
				}
				public String getImg() {
					return img;
				}
				public void setImg(String img) {
					this.img = img;
				}
				@Override
				public String toString() {
					return "Productlist [id=" + id + ", name=" + name
							+ ", size=" + size + ", color=" + color + ", sum="
							+ sum + ", jiaqian=" + jiaqian + ", fenlei="
							+ fenlei + ", xilie=" + xilie + ", img=" + img
							+ "]";
				}
				
				
}
