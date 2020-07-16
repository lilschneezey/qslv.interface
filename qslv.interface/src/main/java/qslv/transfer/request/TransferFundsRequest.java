package qslv.transfer.request;

import java.util.UUID;

public class TransferFundsRequest {
	public static final String Version1_0 = "V1.0";
	
	private UUID requestUuid;
	private String fromAccountNumber;
	private String toAccountNumber;
	private long transactionAmount;
	private String transactionJsonMetaData;

	public UUID getRequestUuid() {
		return requestUuid;
	}

	public void setRequestUuid(UUID requestUuid) {
		this.requestUuid = requestUuid;
	}

	public String getFromAccountNumber() {
		return fromAccountNumber;
	}

	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}

	public String getToAccountNumber() {
		return toAccountNumber;
	}

	public void setToAccountNumber(String toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}

	public long getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionJsonMetaData() {
		return transactionJsonMetaData;
	}

	public void setTransactionJsonMetaData(String transactionJsonMetaData) {
		this.transactionJsonMetaData = transactionJsonMetaData;
	}

	public String toString() {
		return new StringBuilder()
			.append("TransferRequest: ")
			.append("request_uuid: ").append(requestUuid ==null ? "null" : requestUuid.toString())
			.append(", account_id: ").append(fromAccountNumber ==null ? "null" : fromAccountNumber)
			.append(", debitCard_id: ").append(toAccountNumber ==null ? "null" : toAccountNumber)
			.append(", transaction_am: ").append(transactionAmount)
			.append(", transactionMetaData_json: ").append(transactionJsonMetaData == null ? "null" : transactionJsonMetaData)
			.toString();
	}
}
