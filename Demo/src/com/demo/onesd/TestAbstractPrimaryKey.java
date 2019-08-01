package com.demo.onesd;

public class TestAbstractPrimaryKey {

	public static void main(String[] args) {
		ClientProfile cp = new ClientProfile();
		cp.setClientKey("BP0004");
		cp.setClientVersion(-1);
		String str = cp.getPrimaryKey().toString();
		System.out.println(str);
	}
}
