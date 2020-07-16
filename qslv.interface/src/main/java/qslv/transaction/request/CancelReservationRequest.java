package qslv.transaction.request;

import java.util.UUID;

public class CancelReservationRequest {
	private String accountNumber;
	private UUID requestUuid;
	private UUID reservationUuid;
	private String transactionMetaDataJson;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

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

	public String getTransactionMetaDataJson() {
		return transactionMetaDataJson;
	}

	public void setTransactionMetaDataJson(String transactionMetaDataJson) {
		this.transactionMetaDataJson = transactionMetaDataJson;
	}

	public String toString() {
		return new StringBuilder()
		.append("ReservationRequest:")
		.append(" accountNumber: ").append(accountNumber==null ? "null" : accountNumber)
		.append(" requestUuid: ").append(requestUuid==null ? "null" : requestUuid)
		.append(", reservationUuid: ").append(reservationUuid==null ? "null" : reservationUuid)
		.append(", transactionMetaDataJson: ").append(transactionMetaDataJson == null ? "null" : transactionMetaDataJson)
		.toString();
	}
}
