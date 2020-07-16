package qslv.transaction.request;

import java.util.UUID;

public class TransactionRequest {

		private UUID requestUuid;
		private String accountNumber;
		private String debitCardNumber;
		private long transactionAmount = 0L;
		private String transactionMetaDataJson;
		private boolean authorizeAgainstBalance = true;
		private boolean protectAgainstOverdraft = true;
		
		public UUID getRequestUuid() {
			return requestUuid;
		}
		public void setRequestUuid(UUID request_uuid) {
			this.requestUuid = request_uuid;
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
		public String getTransactionMetaDataJson() {
			return transactionMetaDataJson;
		}
		public void setTransactionMetaDataJson(String transactionMetaDataJson) {
			this.transactionMetaDataJson = transactionMetaDataJson;
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
		public String toString() {
			return new StringBuilder()
			.append("TransactionReservation:")
			.append(" requestUuid: ").append(requestUuid==null ? "null" : requestUuid)
			.append(", accountNumber: ").append(accountNumber==null ? "null" : accountNumber)
			.append(", debitCardNumber: ").append(debitCardNumber==null ? "null" : debitCardNumber)
			.append(", transactionAmount: ").append(transactionAmount)
			.append(", transactionMetaDataJson: ").append(transactionMetaDataJson == null ? "null" : transactionMetaDataJson)
			.append(", authorizeAgainstBalance: ").append(authorizeAgainstBalance)
			.append(", protectAgainstOverdraft: ").append(protectAgainstOverdraft)
			.toString();
		}

}
