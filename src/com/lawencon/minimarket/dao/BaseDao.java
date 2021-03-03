package com.lawencon.minimarket.dao;

import java.sql.Connection;

import com.lawencon.minimarket.config.DBConnection;

/**
 *
 * @author Galih Dika
 *
 */

public abstract class BaseDao {
	protected Connection conn() {
		return new DBConnection().conn();
	}

	protected StringBuilder bBuilder(String... datas) {
		StringBuilder b = new StringBuilder();
		for (String string : datas) {
			b.append(string);
		}
		return b;
	}
}
