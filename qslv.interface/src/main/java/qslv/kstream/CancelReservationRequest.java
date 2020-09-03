package qslv.kstream;

import java.util.UUID;

public class CancelReservationRequest extends BaseTransactionRequest {
	public static String VERSION_1_0="1_0";
	
	private String accountNumber;
	private UUID reservationUuid;

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

	@Override
	public String toString() {
		return new StringBuilder()
		.append("CancelReservationRequest:")
		.append(" accountNumber: ").append(accountNumber==null ? "null" : accountNumber)
		.append(" requestUuid: ").append(requestUuid==null ? "null" : requestUuid)
		.append(", reservationUuid: ").append(reservationUuid==null ? "null" : reservationUuid)
		.append(", transactionMetaDataJson: ").append(jsonMetaData == null ? "null" : jsonMetaData)
		.toString();
	}
}
