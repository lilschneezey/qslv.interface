package qslv.transaction.response;

import java.util.List;

import qslv.transaction.resource.TransactionResource;

public class TransferAndTransactReponse {
	// internal status codes
	public static final int SUCCESS = 0;
	public static final int ALREADY_PRESENT = 1;

	private int status = SUCCESS;
	private List<TransactionResource> transactions = null;
	
	public TransferAndTransactReponse() {
	}
	public TransferAndTransactReponse(int status, List<TransactionResource> transactions) {
		this.status = status;
		this.transactions = transactions;
	}
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
