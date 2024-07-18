package com.example.demo.Bindings;


public class Student 
{
  private int sid;
  
  private String sname;
  
  private String saddress;

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getSaddress() {
	return saddress;
}

public void setSaddress(String saddress) {
	this.saddress = saddress;
}

@Override
public String toString() {
	return "Student [saddress=" + saddress + ", sid=" + sid + ", sname=" + sname + "]";
}
}
