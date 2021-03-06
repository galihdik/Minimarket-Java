package com.lawencon.minimarket.service;

import java.util.List;

import com.lawencon.minimarket.dao.RolesDao;
import com.lawencon.minimarket.dao.RolesDaoImpl;
import com.lawencon.minimarket.model.Roles;

/**
 *
 * @author Galih Dika
 *
 */

public class RolesServiceImpl implements RolesService {
	private RolesDao rolesDao = new RolesDaoImpl();

	@Override
	public List<Roles> getRoles() throws Exception {
		return rolesDao.getListRoles();
	}

	@Override
	public void addData(Roles rl) throws Exception {
		rolesDao.insertData(rl);

	}
}
