package com.jiaju.entity;

public class Newsin {
				private int id;
				private String zixun;
				private String xiangqing;
				private String date;
				private String fenlei;
				public Newsin(int id, String zixun, String xiangqing,
						String date, String fenlei) {
					super();
					this.id = id;
					this.zixun = zixun;
					this.xiangqing = xiangqing;
					this.date = date;
					this.fenlei = fenlei;
				}
				public Newsin() {
					super();
				}
				public int getId() {
					return id;
				}
				public void setId(int id) {
					this.id = id;
				}
				public String getZixun() {
					return zixun;
				}
				public void setZixun(String zixun) {
					this.zixun = zixun;
				}
				public String getXiangqing() {
					return xiangqing;
				}
				public void setXiangqing(String xiangqing) {
					this.xiangqing = xiangqing;
				}
				public String getDate() {
					return date;
				}
				public void setDate(String date) {
					this.date = date;
				}
				public String getFenlei() {
					return fenlei;
				}
				public void setFenlei(String fenlei) {
					this.fenlei = fenlei;
				}
				@Override
				public String toString() {
					return "Newsin [id=" + id + ", zixun=" + zixun
							+ ", xiangqing=" + xiangqing + ", date=" + date
							+ ", fenlei=" + fenlei + "]";
				}
				
				
}
