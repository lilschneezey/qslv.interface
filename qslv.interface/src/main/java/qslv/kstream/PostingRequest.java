package qslv.kstream;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PostingRequest {
	private BaseTransactionRequest request = null;
	private String responseKey = null;
	
	public PostingRequest() {}
	public PostingRequest(BaseTransactionRequest request) {
		this.request = request;
	}
	public PostingRequest(BaseTransactionRequest request, String responseKey) {
		this.request = request;
		this.responseKey = responseKey;
	}

	public BaseTransactionRequest getRequest() {
		return request;
	}
	public void setRequest(BaseTransactionRequest request) {
		this.request = request;
	}
	public String getResponseKey() {
		return responseKey;
	}
	public void setResponseKey(String responseKey) {
		this.responseKey = responseKey;
	}
	@JsonIgnore public TransactionRequest getTransactionRequest() {
		return request instanceof TransactionRequest ? TransactionRequest.class.cast(request) : null;
	}
	@JsonIgnore public ReservationRequest getReservationRequest() {
		return request instanceof ReservationRequest ? ReservationRequest.class.cast(request) : null;
	}
	@JsonIgnore public CancelReservationRequest getCancelReservationRequest() {
		return request instanceof CancelReservationRequest ? CancelReservationRequest.class.cast(request) : null;
	}
	@JsonIgnore public CommitReservationRequest getCommitReservationRequest() {
		return request instanceof CommitReservationRequest ? CommitReservationRequest.class.cast(request) : null;
	}
	@JsonIgnore public TransferRequest getTransferRequest() {
		return request instanceof TransferRequest ? TransferRequest.class.cast(request) : null;
	}
	
	@JsonIgnore public boolean hasTransactionRequest() {
		return request instanceof TransactionRequest;
	}
	@JsonIgnore public boolean hasReservationRequest() {
		return request instanceof ReservationRequest;
	}
	@JsonIgnore public boolean hasCancelReservationRequest() {
		return request instanceof CancelReservationRequest;
	}
	@JsonIgnore public boolean hasCommitReservationRequest() {
		return request instanceof CommitReservationRequest;
	}
	@JsonIgnore public boolean hasTransferRequest() {
		return request instanceof TransferRequest;
	}
}
