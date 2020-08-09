package qslv.transaction.response;

import java.util.Collections;
import java.util.List;

import qslv.transaction.resource.TransactionResource;

public class TransactionResponse {
	// internal status codes
	public static final int SUCCESS = 0;
	public static final int INSUFFICIENT_FUNDS = 2;

	private int status = SUCCESS;
	private List<TransactionResource> transactions = null;
	
	public TransactionResponse() {
	}
	public TransactionResponse(int status, TransactionResource transaction) {
		this.status = status;
		this.transactions = Collections.singletonList(transaction);
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
