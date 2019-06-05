package com.jiaju.entity;

public class Message {
	       private int id;
	       private String name;
	       private String phone;
	       private String email;
	       private String neirong;
		public Message(int id, String name, String phone, String email,
				String neirong) {
			super();
			this.id = id;
			this.name = name;
			this.phone = phone;
			this.email = email;
			this.neirong = neirong;
		}
		public Message() {
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
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNeirong() {
			return neirong;
		}
		public void setNeirong(String neirong) {
			this.neirong = neirong;
		}
		@Override
		public String toString() {
			return "Message [id=" + id + ", name=" + name + ", phone=" + phone
					+ ", email=" + email + ", neirong=" + neirong + "]";
		}
	       
	       
		
	       
}
