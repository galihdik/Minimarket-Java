package com.lawencon.minimarket.view;

import java.util.Scanner;

import com.lawencon.minimarket.util.CallBack;

/**
 *
 * @author Galih Dika
 *
 */

public class MenuAdmin {
	private CrudAbout crudAbout = new CrudAbout();
	private CrudCategory crudCategory = new CrudCategory();
	private CrudItem crudItem = new CrudItem();
	private CrudPayment crudPayment = new CrudPayment();
	private CrudProfile crudProfile = new CrudProfile();
	private CrudRole crudRole = new CrudRole();
	private CrudSuplier crudSuplier = new CrudSuplier();
	private CrudUser crudUser = new CrudUser();
	private History history = new History();

	void show(CallBack cb) {
		Scanner input = new Scanner(System.in);
		System.out.println("============ Menu User ==================");
		System.out.println("1. CRUD User");
		System.out.println("2. CRUD Item");
		System.out.println("3. CRUD Category");
		System.out.println("4. CRUD Payments");
		System.out.println("5. CRUD Supliers");
		System.out.println("6. History");
		System.out.println("7. CRUD About");
		System.out.println("8. CRUD Profile");
		System.out.println("9. CRUD Roles");
		System.out.println("10. Logout");
		System.out.println("Pilih Menu : ");
		byte menu = input.nextByte();
		if (menu == 1) {
			crudUser.show(val -> {
				show(cb);
			});
		} else if (menu == 2) {
			crudItem.show(val -> {
				show(cb);
			});
		} else if (menu == 3) {
			crudCategory.show(val -> {
				show(cb);
			});
		} else if (menu == 4) {
			crudPayment.show(val -> {
				show(cb);
			});
		} else if (menu == 5) {
			crudSuplier.show(val -> {
				show(cb);
			});
		} else if (menu == 6) {
			history.show(val -> {
				show(cb);
			});
		} else if (menu == 7) {
			crudAbout.show(val -> {
				show(cb);
			});
		} else if (menu == 8) {
			crudProfile.show(val -> {
				show(cb);
			});
		} else if (menu == 9) {
			crudRole.show(val -> {
				show(cb);
			});
		} else if (menu == 10) {
			cb.onDone("");
		}
	}
}
