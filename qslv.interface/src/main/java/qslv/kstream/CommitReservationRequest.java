package qslv.kstream;

import java.util.UUID;

public class CommitReservationRequest extends BaseTransactionRequest {
	public static String VERSION_1_0="1_0";

	private String accountNumber;
	private String debitCardNumber;
	private UUID reservationUuid;
	private long transactionAmount = 0L;
	private boolean protectAgainstOverdraft = false;

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public UUID getReservationUuid() {
		return reservationUuid;
	}
	public void setReservationUuid(UUID reservationUuid) {
		this.reservationUuid = reservationUuid;
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
		return new StringBuilder ()
		.append("CommitReservationRequest: ")
		.append("requestUuid: ").append(requestUuid==null ? "null" : requestUuid)
		.append(", reservationUuid: ").append(reservationUuid==null ? "null" : reservationUuid)
		.append(", accountNumber: ").append(accountNumber==null ? "null" : accountNumber)
		.append(", debitCardNumber: ").append(debitCardNumber==null ? "null" : debitCardNumber)
		.append(", transactionAmount: ").append(transactionAmount)
		.append(", transactionMetaDataJson: ").append(jsonMetaData == null ? "null" : jsonMetaData)
		.append(", isProtectAgainstOverdraft: ").append(protectAgainstOverdraft)
		.toString();
	}
}
