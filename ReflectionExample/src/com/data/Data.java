package com.data;

public class Data {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	public Data() {
		
	}

	public Data(int a) {
		System.out.println(a);
	}

	public int one() {
		int r = 12;
		return r;
	}

	private void two() {
		System.out.println("This is the output of private method");
	}
}
