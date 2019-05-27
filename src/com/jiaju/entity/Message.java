package com.jiaju.entity;

public class Message {
	       private int id;
	       private String liuyancol;
		public Message(int id, String liuyancol) {
			super();
			this.id = id;
			this.liuyancol = liuyancol;
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
		public String getLiuyancol() {
			return liuyancol;
		}
		public void setLiuyancol(String liuyancol) {
			this.liuyancol = liuyancol;
		}
		@Override
		public String toString() {
			return "Message [id=" + id + ", liuyancol=" + liuyancol + "]";
		}
	       
}
