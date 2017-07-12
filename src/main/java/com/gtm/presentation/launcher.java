package com.gtm.presentation;

public class launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		classetest ctest = new classetest();
		ClientBean cbean = new ClientBean();
		System.out.println(ctest.clientList());
		System.out.println("par bean" + cbean.getListeClient());

	}

}
