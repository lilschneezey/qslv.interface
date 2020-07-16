package qslv.transaction.response;

import java.util.Collections;
import java.util.List;

import qslv.transaction.resource.TransactionResource;

public class TransactionSearchResponse {
	private List<TransactionResource> transactions = null;
	
	public TransactionSearchResponse() {
	}
	public TransactionSearchResponse(TransactionResource transaction) {
		this.transactions = Collections.singletonList(transaction);
	}
	public List<TransactionResource> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<TransactionResource> transactions) {
		this.transactions = transactions;
	}
	
}
