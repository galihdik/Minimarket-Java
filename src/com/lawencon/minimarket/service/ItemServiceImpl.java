package com.lawencon.minimarket.service;

import java.util.List;

import com.lawencon.minimarket.dao.ItemDao;
import com.lawencon.minimarket.dao.ItemDaoImpl;
import com.lawencon.minimarket.model.Items;

/**
 *
 * @author Galih Dika
 *
 */

public class ItemServiceImpl implements ItemService {
	ItemDao daoItem = new ItemDaoImpl();

	@Override
	public Items getItemByCode(String code) throws Exception {
		System.out.println(code);
		return daoItem.getItemByCode(code);
	}

	@Override
	public List<Items> getItem() throws Exception {
		return daoItem.getListItem();
	}

	@Override
	public void addData(Items item) throws Exception {
		daoItem.insertData(item);
	}
}