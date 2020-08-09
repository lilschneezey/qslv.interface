package qslv.transaction.response;

import qslv.transaction.resource.TransactionResource;

public class ReservationResponse {
	// internal status codes
	public static final int SUCCESS = 0;
	public static final int INSUFFICIENT_FUNDS = 2;

	private int status = SUCCESS;
	private TransactionResource resource;
	
	public ReservationResponse() {
	}
	public ReservationResponse(int status, TransactionResource resource) {
		this.status = status;
		this.resource = resource;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public TransactionResource getResource() {
		return resource;
	}
	public void setResource(TransactionResource resource) {
		this.resource = resource;
	}
	
}
