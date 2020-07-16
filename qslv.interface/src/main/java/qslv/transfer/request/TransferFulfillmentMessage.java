package qslv.transfer.request;

import java.util.UUID;

public class TransferFulfillmentMessage {
	public final static String version1_0="1.0"; 

	private String version=TransferFulfillmentMessage.version1_0;
	private UUID requestUuid;
	private UUID reservationUuid;
	private String fromAccountNumber;
	private String toAccountNumber;
	private long transactionAmount = 0;
	private String transactionMetaDataJson;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
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
	public String getTransactionMetaDataJson() {
		return transactionMetaDataJson;
	}
	public void setTransactionMetaDataJson(String transactionMetaData_json) {
		this.transactionMetaDataJson = transactionMetaData_json;
	}
	
	public String toString() {
		return new StringBuilder()
			.append("TransferFullfillmentRequest ")
			.append(" Request UUID :").append(requestUuid == null ? "null" : requestUuid.toString())
			.append(" Reservation UUID :").append(reservationUuid == null ? "null" : reservationUuid.toString())
			.append(" From Account Number :").append(fromAccountNumber == null ? "null" : fromAccountNumber)
			.append(" To Accoutn Number :").append(toAccountNumber == null ? "null" : toAccountNumber)
			.append(" Transaction Amount :").append(transactionAmount)
			.append(" Meta Data Json : " ).append(transactionMetaDataJson == null ? "null" : transactionMetaDataJson)
			.toString();
	}
}
