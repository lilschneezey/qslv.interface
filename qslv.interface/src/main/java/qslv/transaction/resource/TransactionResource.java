package qslv.transaction.resource;

import java.sql.Timestamp;
import java.util.UUID;

public class TransactionResource {
	
	private UUID requestUuid = null;
	private UUID transactionUuid = null;
	private String accountNumber = null;
	private String debitCardNumber = null;
	private long transactionAmount = 0;
	private String transactionTypeCode = null;
	private long runningBalanceAmount = 0;
	private UUID reservationUuid = null;
	private String transactionMetaDataJson = null;
	private Timestamp insertTimeStamp=null;
	private short idempotentCount;
	
	public final static String NORMAL="NM";
	public final static String RESERVATION="RS";
	public final static String RESERVATION_COMMIT="RC";
	public final static String RESERVATION_CANCEL="RX";
	public final static String REJECTED_TRANSACTION="RJ"; 

	public UUID getRequestUuid() {
		return requestUuid;
	}
	public void setRequestUuid(UUID requestUuid) {
		this.requestUuid = requestUuid;
	}
	public UUID getTransactionUuid() {
		return transactionUuid;
	}
	public void setTransactionUuid(UUID transactionUuid) {
		this.transactionUuid = transactionUuid;
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
	public String getTransactionTypeCode() {
		return transactionTypeCode;
	}
	public void setTransactionTypeCode(String transactionTypeCode) {
		this.transactionTypeCode = transactionTypeCode;
	}
	public long getRunningBalanceAmount() {
		return runningBalanceAmount;
	}
	public void setRunningBalanceAmount(long runningBalanceAmount) {
		this.runningBalanceAmount = runningBalanceAmount;
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
	public Timestamp getInsertTimestamp() {
		return insertTimeStamp;
	}
	public void setInsertTimestamp(Timestamp insertTimestamp) {
		this.insertTimeStamp = insertTimestamp;
	}
	public short getIdempotentCount() {
		return idempotentCount;
	}
	public void setIdempotentCount(short idempotentCount) {
		this.idempotentCount = idempotentCount;
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("TransactionResource: ");
		buf.append("transaction_uuid: "); buf.append(getTransactionUuid() == null ? "null" : getTransactionUuid().toString());
		buf.append(", request_uuid: "); buf.append(getRequestUuid()==null ? "null" : getRequestUuid().toString());
		buf.append(", account_id: "); buf.append(getAccountNumber()==null ? "null" : getAccountNumber());
		buf.append(", debitCard_id: "); buf.append(getDebitCardNumber()==null ? "null" : getDebitCardNumber());
		buf.append(", transaction_am: "); buf.append(getTransactionAmount());
		buf.append(", transactionType_cd: "); buf.append(getTransactionTypeCode()==null ? "null" : getTransactionTypeCode());
		buf.append(", runningBalance_am: "); buf.append(getRunningBalanceAmount());
		buf.append(", reservation_uuid: "); buf.append(getReservationUuid()==null ? "null" : getReservationUuid().toString());
		buf.append(", transactionMetaData_json: "); buf.append(getTransactionMetaDataJson() == null ? "null" : getTransactionMetaDataJson());
		buf.append(", idempotentCount: ").append(idempotentCount);
		buf.append(", insert_tsz: "); buf.append(getInsertTimestamp() == null ? "null" : getInsertTimestamp().toLocalDateTime().toString());
		return buf.toString();
	}

}
