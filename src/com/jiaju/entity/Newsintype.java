package com.jiaju.entity;

public class Newsintype {
				private int id;
				private String leibie;
				public Newsintype(int id, String leibie) {
					super();
					this.id = id;
					this.leibie = leibie;
				}
				public Newsintype() {
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
					return "Newsintype [id=" + id + ", leibie=" + leibie + "]";
				}
				
}
