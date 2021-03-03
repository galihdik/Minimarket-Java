package com.lawencon.minimarket.view;

import java.util.Scanner;

import com.lawencon.minimarket.model.Users;
import com.lawencon.minimarket.service.UsersServices;
import com.lawencon.minimarket.service.UsersServicesImpl;
import com.lawencon.minimarket.util.CallBack;

/**
 *
 * @author Galih Dika
 *
 */

public class Login {
	private UsersServices usrServ = new UsersServicesImpl();
	private MenuAdmin menuAdmin = new MenuAdmin();
	private MenuCashier menuCashier = new MenuCashier();

	void show(CallBack cb) {
		Scanner input = new Scanner(System.in);
		System.out.println("============ Silahkan Login ==================");
		System.out.println("=== Silahkan Login ===");
		System.out.println("Masukan Username");
		String username = input.next();
		System.out.println("Masukan Password");
		String pswd = input.next();
		try {
			Users user = usrServ.loginUsernamePassword(username, pswd);
			if (user.getIdRoles().getCodeRoles().equalsIgnoreCase("1")) {
				menuAdmin.show(val -> {
					show(cb);
				});
			} else if (user.getIdRoles().getCodeRoles().equalsIgnoreCase("2")) {
				menuCashier.show(val -> {
					show(cb);
				});
			}
		} catch (Exception e) {
			System.out.println(e);
			show(cb);
		}
	}
}
