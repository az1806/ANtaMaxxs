package com.jiaju.entity;

public class Member {
			private int id;
			private String userName;
			private String userPassword;
			public Member(int id, String userName, String userPassword) {
				super();
				this.id = id;
				this.userName = userName;
				this.userPassword = userPassword;
			}
			public Member(String userName, String userPassword) {
				super();
				
				this.userName = userName;
				this.userPassword = userPassword;
			}
			public Member() {
				super();
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getUserName() {
				return userName;
			}
			public void setUserName(String userName) {
				this.userName = userName;
			}
			public String getUserPassword() {
				return userPassword;
			}
			public void setUserPassword(String userPassword) {
				this.userPassword = userPassword;
			}
			@Override
			public String toString() {
				return "Member [id=" + id + ", userName=" + userName
						+ ", userPassword=" + userPassword + "]";
			}
			
}
