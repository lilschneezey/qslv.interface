package qslv.transfer.response;

import qslv.transfer.request.TransferFulfillmentMessage;

public class TransferFulfillmentDeadLetter {
	private TransferFulfillmentMessage request = null;
	private String exceptionClassname = null;
	private String exceptionMessage = null;
	
	public TransferFulfillmentDeadLetter() {
	}
	
	public TransferFulfillmentDeadLetter(TransferFulfillmentMessage request, Exception exception) {
		this.request = request;
		this.exceptionClassname = exception.getClass().getCanonicalName();
		this.exceptionMessage = exception.getLocalizedMessage();
	}
	
	public TransferFulfillmentMessage getRequest() {
		return request;
	}
	public void setRequest(TransferFulfillmentMessage request) {
		this.request = request;
	}

	public String getExceptionClassname() {
		return exceptionClassname;
	}

	public void setExceptionClassname(String exceptionClassname) {
		this.exceptionClassname = exceptionClassname;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	
}
