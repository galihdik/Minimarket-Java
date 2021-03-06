package com.lawencon.minimarket.service;

import java.util.List;

import com.lawencon.minimarket.dao.DetailTransactionDao;
import com.lawencon.minimarket.dao.DetailTransactionDaoImpl;
import com.lawencon.minimarket.model.DetailTransactions;
import com.lawencon.minimarket.model.Transactions;

/**
 *
 * @author Galih Dika
 *
 */

public class DetailTransactionServiceImpl implements DetailTransactionService {
	private DetailTransactionDao transactionDetailDao = new DetailTransactionDaoImpl();

	@Override
	public void addData(List<DetailTransactions> trx, Transactions idTransaction) throws Exception {
		for (DetailTransactions detailTransactions : trx) {
			transactionDetailDao.insert(detailTransactions, idTransaction);
		}
	}

}
