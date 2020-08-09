package qslv.transaction.response;

import java.util.List;

import qslv.transaction.resource.TransactionResource;

public class TransferAndTransactResponse {
	// internal status codes
	public static final int SUCCESS = 0;

	private int status = SUCCESS;
	private List<TransactionResource> transactions = null;
	
	public TransferAndTransactResponse() {
	}
	public TransferAndTransactResponse(int status, List<TransactionResource> transactions) {
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
