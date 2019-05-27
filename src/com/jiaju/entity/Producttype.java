package com.jiaju.entity;

public class Producttype {
				private int id;
				private String leibie;
				public Producttype(int id, String leibie) {
					super();
					this.id = id;
					this.leibie = leibie;
				}
				public Producttype() {
					super();
				}
				public int getId() {
					return id;
				}
				public void setId(int id) {
					this.id = id;
				}
				public String getLeibie() {
					return leibie;
				}
				public void setLeibie(String leibie) {
					this.leibie = leibie;
				}
				@Override
				public String toString() {
					return "Producttype [id=" + id + ", leibie=" + leibie + "]";
				}
				
}
