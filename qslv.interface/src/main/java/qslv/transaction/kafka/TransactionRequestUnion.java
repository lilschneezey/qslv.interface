package qslv.transaction.kafka;

import qslv.transaction.request.CancelReservationRequest;
import qslv.transaction.request.CommitReservationRequest;
import qslv.transaction.request.TransactionRequest;

public class TransactionRequestUnion {
	static public String version1_0="1.0";
	String version = TransactionRequestUnion.version1_0;
	CancelReservationRequest cancelReservationRequest = null;
	CommitReservationRequest commitReservationRequest = null;
	TransactionRequest transactionRequest = null;
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public CancelReservationRequest getCancelReservationRequest() {
		return cancelReservationRequest;
	}

	public void setCancelReservationRequest(CancelReservationRequest cancelReservationRequest) {
		this.cancelReservationRequest = cancelReservationRequest;
	}

	public CommitReservationRequest getCommitReservationRequest() {
		return commitReservationRequest;
	}

	public void setCommitReservationRequest(CommitReservationRequest commitReservationRequest) {
		this.commitReservationRequest = commitReservationRequest;
	}

	public TransactionRequest getTransactionRequest() {
		return transactionRequest;
	}

	public void setTransactionRequest(TransactionRequest transactionRequest) {
		this.transactionRequest = transactionRequest;
	}

	public String toString() {
		if (null != cancelReservationRequest) return cancelReservationRequest.toString();
		if (null != commitReservationRequest) return commitReservationRequest.toString();
		if (null != transactionRequest) return transactionRequest.toString();
		return "";
	}

}
