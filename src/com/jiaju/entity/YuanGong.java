package com.jiaju.entity;

public class YuanGong {
			private int id;
			private String name;
			private String age;
			private String email;
			private String phone;
			public YuanGong(int id, String name, String age, String email,
					String phone) {
				super();
				this.id = id;
				this.name = name;
				this.age = age;
				this.email = email;
				this.phone = phone;
			}
			public YuanGong() {
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
			public String getAge() {
				return age;
			}
			public void setAge(String age) {
				this.age = age;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getPhone() {
				return phone;
			}
			public void setPhone(String phone) {
				this.phone = phone;
			}
			@Override
			public String toString() {
				return "YuanGong [id=" + id + ", name=" + name + ", age=" + age
						+ ", email=" + email + ", phone=" + phone + "]";
			}
			
			
}
