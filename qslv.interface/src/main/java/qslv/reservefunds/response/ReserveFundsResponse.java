package qslv.reservefunds.response;

import java.util.List;

import qslv.transaction.resource.TransactionResource;

public class ReserveFundsResponse {
	// internal status codes
	public static final int SUCCESS = 0;
	public static final int INSUFFICIENT_FUNDS = 2;
	public static final int SUCCESS_OVERDRAFT = 3;

	private int status = SUCCESS;
	private List<TransactionResource> transactions = null;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<TransactionResource> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionResource> transactions) {
		this.transactions = transactions;
	}

}
