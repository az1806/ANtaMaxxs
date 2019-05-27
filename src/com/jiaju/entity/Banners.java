package com.jiaju.entity;

public class Banners {
			private int id;
			private String images;
			public Banners(int id, String images) {
				super();
				this.id = id;
				this.images = images;
			}
			public Banners() {
				super();
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getImages() {
				return images;
			}
			public void setImages(String images) {
				this.images = images;
			}
			@Override
			public String toString() {
				return "Contact [id=" + id + ", images=" + images + "]";
			}
			
}
