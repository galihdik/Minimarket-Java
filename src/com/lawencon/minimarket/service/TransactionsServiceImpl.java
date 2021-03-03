package com.lawencon.minimarket.service;

import java.math.BigDecimal;
import java.util.List;

import com.lawencon.minimarket.dao.TransactionsDao;
import com.lawencon.minimarket.dao.TransactionsDaoImpl;
import com.lawencon.minimarket.model.DetailTransactions;
import com.lawencon.minimarket.model.Transactions;

/**
 *
 * @author Galih Dika
 *
 */

public class TransactionsServiceImpl implements TransactionService {
	private TransactionsDao transactionDao = new TransactionsDaoImpl();
	private DetailTransactionService detailTransactionService = new DetailTransactionServiceImpl();
	private BigDecimal tamp = BigDecimal.ZERO;
	private BigDecimal tamp2 = BigDecimal.ZERO;

	@Override
	public void addData(List<DetailTransactions> trxDetail, Transactions transaction) throws Exception {
		for (DetailTransactions detailTransactions : trxDetail) {
			tamp.add(detailTransactions.getPrice());
			tamp.multiply(new BigDecimal(detailTransactions.getQty()));
			detailTransactions.setPrice(tamp);
		}
		Transactions idTransaction = transactionDao.insertData(transaction);
		detailTransactionService.addData(trxDetail, idTransaction);
		transactionDao.updateData(transaction);
	}

	@Override
	public List<Transactions> getTransaction() throws Exception {
		return transactionDao.getListTransactions();
	}

}
