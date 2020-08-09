package qslv.transaction.request;

import java.util.UUID;

import qslv.transaction.resource.TransactionResource;

public class TransferAndTransactRequest {
	public static String VERSION_1_0 = "1_0";

	private UUID requestUuid;
	private TransactionResource transferReservation = null;
	private TransactionRequest transactionRequest = null;

	public UUID getRequestUuid() {
		return requestUuid;
	}

	public void setRequestUuid(UUID requestUuid) {
		this.requestUuid = requestUuid;
	}

	public TransactionResource getTransferReservation() {
		return transferReservation;
	}

	public void setTransferReservation(TransactionResource transferReservation) {
		this.transferReservation = transferReservation;
	}

	public TransactionRequest getTransactionRequest() {
		return transactionRequest;
	}

	public void setTransactionRequest(TransactionRequest transactionRequest) {
		this.transactionRequest = transactionRequest;
	}

	public String toString() {
		return new StringBuilder().append("TransactionReservation:").append(" RequestUuid: ")
				.append(requestUuid == null ? "null" : requestUuid).append(" Overdraft Reservation: ")
				.append(transferReservation == null ? "null" : transferReservation).append(", Transation Request: ")
				.append(transactionRequest == null ? "null" : transactionRequest).toString();
	}

}
