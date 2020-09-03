package qslv.kstream;


public class TransactionRequest extends BaseTransactionRequest {
	public static String VERSION_1_0 = "1_0";

	private String accountNumber = null;
	private String debitCardNumber;
	private long transactionAmount = 0L;
	private boolean authorizeAgainstBalance = true;
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
	public boolean isAuthorizeAgainstBalance() {
		return authorizeAgainstBalance;
	}
	public void setAuthorizeAgainstBalance(boolean authorizeAgainstBalance) {
		this.authorizeAgainstBalance = authorizeAgainstBalance;
	}
	public boolean isProtectAgainstOverdraft() {
		return protectAgainstOverdraft;
	}
	public void setProtectAgainstOverdraft(boolean protectAgainstOverdraft) {
		this.protectAgainstOverdraft = protectAgainstOverdraft;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("TransactionReservation:").append(" requestUuid: ")
				.append(requestUuid == null ? "null" : requestUuid).append(", accountNumber: ")
				.append(accountNumber == null ? "null" : accountNumber).append(", debitCardNumber: ")
				.append(debitCardNumber == null ? "null" : debitCardNumber).append(", transactionAmount: ")
				.append(transactionAmount).append(", transactionMetaDataJson: ")
				.append(jsonMetaData == null ? "null" : jsonMetaData)
				.append(", authorizeAgainstBalance: ").append(authorizeAgainstBalance)
				.append(", protectAgainstOverdraft: ").append(protectAgainstOverdraft).toString();
	}

}
