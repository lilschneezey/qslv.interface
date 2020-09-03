package qslv.kstream;

public class ReservationRequest extends BaseTransactionRequest {

	private String accountNumber = null;
	private String debitCardNumber;
	private long transactionAmount = 0L;
	private boolean protectAgainstOverdraft = true;

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
	public boolean isProtectAgainstOverdraft() {
		return protectAgainstOverdraft;
	}
	public void setProtectAgainstOverdraft(boolean protectAgainstOverdraft) {
		this.protectAgainstOverdraft = protectAgainstOverdraft;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("Reservation:").append(" requestUuid: ")
				.append(requestUuid == null ? "null" : requestUuid).append(", accountNumber: ")
				.append(accountNumber == null ? "null" : accountNumber).append(", debitCardNumber: ")
				.append(debitCardNumber == null ? "null" : debitCardNumber).append(", transactionAmount: ")
				.append(transactionAmount).append(", transactionMetaDataJson: ")
				.append(jsonMetaData == null ? "null" : jsonMetaData)
				.append(", protectAgainstOverdraft: ").append(protectAgainstOverdraft).toString();
	}

}
