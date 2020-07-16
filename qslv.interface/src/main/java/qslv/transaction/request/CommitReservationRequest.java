package qslv.transaction.request;

import java.util.UUID;

public class CommitReservationRequest {
	private UUID requestUuid;
	private UUID reservationUuid;
	private String accountNumber;
	private String debitCardNumber;
	private long transactionAmount = 0L;
	private String transactionMetaDataJson;

	public UUID getRequestUuid() {
		return requestUuid;
	}

	public void setRequestUuid(UUID requestUuid) {
		this.requestUuid = requestUuid;
	}

	public UUID getReservationUuid() {
		return reservationUuid;
	}

	public void setReservationUuid(UUID reservationUuid) {
		this.reservationUuid = reservationUuid;
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

	public String toString() {
		return new StringBuilder ()
		.append("ReservationRequest: ")
		.append("requestUuid: ").append(requestUuid==null ? "null" : requestUuid)
		.append(", reservationUuid: ").append(reservationUuid==null ? "null" : reservationUuid)
		.append(", accountNumber: ").append(accountNumber==null ? "null" : accountNumber)
		.append(", debitCardNumber: ").append(debitCardNumber==null ? "null" : debitCardNumber)
		.append(", transactionAmount: ").append(transactionAmount)
		.append(", transactionMetaDataJson: ").append(transactionMetaDataJson == null ? "null" : transactionMetaDataJson)
		.toString();
	}
}
