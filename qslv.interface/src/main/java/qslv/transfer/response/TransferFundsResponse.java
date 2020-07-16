package qslv.transfer.response;

import java.util.List;

import qslv.transaction.resource.TransactionResource;
import qslv.transfer.request.TransferFulfillmentMessage;

public class TransferFundsResponse {
	// internal status codes
	public static final int SUCCESS = 0;
	public static final int INSUFFICIENT_FUNDS = 2;
	public static final int SUCCESS_OVERDRAFT = 3;
	public static final int FAILURE = 4;

	private int status = SUCCESS;
	private List<TransactionResource> reservations = null;
	private TransferFulfillmentMessage fulfillmentMessage;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<TransactionResource> getReservations() {
		return reservations;
	}

	public void setReservations(List<TransactionResource> reservations) {
		this.reservations = reservations;
	}

	public TransferFulfillmentMessage getFulfillmentMessage() {
		return fulfillmentMessage;
	}

	public void setFulfillmentMessage(TransferFulfillmentMessage fulfillmentMessage) {
		this.fulfillmentMessage = fulfillmentMessage;
	}

}
