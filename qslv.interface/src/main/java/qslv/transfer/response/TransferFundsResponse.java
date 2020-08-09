package qslv.transfer.response;

import qslv.transaction.resource.TransactionResource;
import qslv.transfer.request.TransferFulfillmentMessage;

public class TransferFundsResponse {
	// internal status codes
	public static final int SUCCESS = 0;
	public static final int INSUFFICIENT_FUNDS = 2;
	public static final int FAILURE = 4;

	private int status = SUCCESS;
	private TransactionResource reservation = null;
	private TransferFulfillmentMessage fulfillmentMessage = null;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public TransactionResource getReservation() {
		return reservation;
	}

	public void setReservation(TransactionResource reservation) {
		this.reservation = reservation;
	}

	public TransferFulfillmentMessage getFulfillmentMessage() {
		return fulfillmentMessage;
	}

	public void setFulfillmentMessage(TransferFulfillmentMessage fulfillmentMessage) {
		this.fulfillmentMessage = fulfillmentMessage;
	}

}
