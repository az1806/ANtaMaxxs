package com.jiaju.entity;

public class Newsin {
				private int id;
				private String zixun;
				private String xiangqing;
				private String date;
				public Newsin(int id, String zixun, String xiangqing,String date) {
					super();
					this.id = id;
					this.zixun = zixun;
					this.xiangqing = xiangqing;
					this.date = date;
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
				@Override
				public String toString() {
					return "Newsin [id=" + id + ", zixun=" + zixun
							+ ", xiangqing=" + xiangqing + ", date=" + date
							+ "]";
				}
				
				
}
