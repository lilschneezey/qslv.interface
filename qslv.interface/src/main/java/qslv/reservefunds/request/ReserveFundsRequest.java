package qslv.reservefunds.request;

import java.util.UUID;

public class ReserveFundsRequest {
	static public final String version1_0="1_0";
	private UUID requestUUID;
	private String accountNumber;
	private String debitCardNumber;
	private long transactionAmount;
	private String transactionMetaDataJSON;
	private boolean protectAgainstOverdraft = false;
	
	public UUID getRequestUUID() {
		return requestUUID;
	}

	public void setRequestUUID(UUID requestUUID) {
		this.requestUUID = requestUUID;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDebitCardNumber() {
		return debitCardNumber;
	}

	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}

	public long getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionMetaDataJSON() {
		return transactionMetaDataJSON;
	}

	public void setTransactionMetaDataJSON(String transactionMetaDataJSON) {
		this.transactionMetaDataJSON = transactionMetaDataJSON;
	}

	public boolean isProtectAgainstOverdraft() {
		return protectAgainstOverdraft;
	}

	public void setProtectAgainstOverdraft(boolean protectAgainstOverdraft) {
		this.protectAgainstOverdraft = protectAgainstOverdraft;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("TransactionReservation: ");
		
		buf.append("request_uuid: "); buf.append(requestUUID==null ? "null" : requestUUID.toString());
		buf.append(", account_id: "); buf.append(accountNumber==null ? "null" : accountNumber);
		buf.append(", debitCard_id: "); buf.append(debitCardNumber==null ? "null" : debitCardNumber);
		buf.append(", transaction_am: "); buf.append(transactionAmount);
		buf.append(", transactionMetaData_json: "); buf.append(transactionMetaDataJSON == null ? "null" : transactionMetaDataJSON);
		return buf.toString();
	}
}
