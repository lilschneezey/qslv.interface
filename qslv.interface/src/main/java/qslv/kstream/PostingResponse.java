package qslv.kstream;

import java.util.List;

public class PostingResponse {
	private List<LoggedTransaction> transactions = null;
	
	public PostingResponse() {}
	public PostingResponse(List<LoggedTransaction> transactions) {
		this.transactions = transactions;
	}
	public List<LoggedTransaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<LoggedTransaction> transactions) {
		this.transactions = transactions;
	}	
}
