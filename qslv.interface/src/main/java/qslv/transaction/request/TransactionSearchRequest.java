package qslv.transaction.request;

import java.util.UUID;

public class TransactionSearchRequest {
	public static String VERSION_1_0="1_0";

	private UUID transactionUuid = null;
	private UUID reservationUuid = null;
	
	public UUID getTransactionUuid() {
		return transactionUuid;
	}
	public void setTransactionUuid(UUID transactionUuid) {
		this.transactionUuid = transactionUuid;
	}
	public UUID getReservationUuid() {
		return reservationUuid;
	}
	public void setReservationUuid(UUID reservationUuid) {
		this.reservationUuid = reservationUuid;
	}
	public String toString() {
		return new StringBuilder()
		.append("TransactionSearchRequest:")
		.append(" transactionUuid: ").append(transactionUuid==null ? "null" : transactionUuid)
		.append(" reservationUuid: ").append(reservationUuid==null ? "null" : reservationUuid)
		.toString();
	}
}
