package com.china.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Shop {
   private String msg;
   private int msgcode;
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public int getMsgcode() {
	return msgcode;
}
public void setMsgcode(int msgcode) {
	this.msgcode = msgcode;
}
public Shop(String msg, int msgcode) {
	super();
	this.msg = msg;
	this.msgcode = msgcode;
}
public Shop() {
	super();
}
   
}
