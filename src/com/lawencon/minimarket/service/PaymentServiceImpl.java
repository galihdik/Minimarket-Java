package com.lawencon.minimarket.service;

import java.util.List;

import com.lawencon.minimarket.dao.PaymentsDao;
import com.lawencon.minimarket.dao.PaymentsDaoImpl;
import com.lawencon.minimarket.model.Payments;

/**
 *
 * @author Galih Dika
 *
 */

public class PaymentServiceImpl implements PaymentService {
	private PaymentsDao paymentDao = new PaymentsDaoImpl();

	@Override
	public void addData(String payment) throws Exception {
		paymentDao.getPaymentsType(payment);

	}

	@Override
	public List<Payments> getPayment() throws Exception {
		return paymentDao.getListPayments();
	}

	@Override
	public void addDataa(Payments py) throws Exception {
		paymentDao.insertData(py);
	}

}
