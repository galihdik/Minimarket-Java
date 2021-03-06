package com.lawencon.minimarket.service;

import java.util.List;

import com.lawencon.minimarket.dao.CategoryDao;
import com.lawencon.minimarket.dao.CategoryDaoImpl;
import com.lawencon.minimarket.model.Category;

/**
 *
 * @author Galih Dika
 *
 */

public class CategoryServiceImpl implements CategoryService {
	private CategoryDao categoryDao = new CategoryDaoImpl();

	@Override
	public List<Category> getCategory() throws Exception {
		return categoryDao.getListCategory();
	}

	@Override
	public void addData(Category ctgry) throws Exception {
		categoryDao.insertData(ctgry);
	}

}
