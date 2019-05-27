package com.jiaju.entity;

public class Company {
		private int id;
		private String Corporation;
		private String Address;
		private String jieshao;
		private String Zipcode;
		private String email;
		private String city;
		private String img;
		
		
		
		public Company(int id, String corporation, String address,
				String jieshao, String zipcode, String email, String city,
				String img) {
			super();
			this.id = id;
			Corporation = corporation;
			Address = address;
			this.jieshao = jieshao;
			Zipcode = zipcode;
			this.email = email;
			this.city = city;
			this.img = img;
		}
		
		public Company() {
			super();
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCorporation() {
			return Corporation;
		}
		public void setCorporation(String corporation) {
			Corporation = corporation;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getJieshao() {
			return jieshao;
		}
		public void setJieshao(String jieshao) {
			this.jieshao = jieshao;
		}
		public String getZipcode() {
			return Zipcode;
		}
		public void setZipcode(String zipcode) {
			Zipcode = zipcode;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getImg() {
			return img;
		}
		public void setImg(String img) {
			this.img = img;
		}

		@Override
		public String toString() {
			return "Company [id=" + id + ", Corporation=" + Corporation
					+ ", Address=" + Address + ", jieshao=" + jieshao
					+ ", Zipcode=" + Zipcode + ", email=" + email + ", city="
					+ city + ", img=" + img + "]";
		}
		
		
}
