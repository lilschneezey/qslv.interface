package qslv.kstream;

public class TransferRequest extends BaseTransactionRequest {
	private String transferFromAccountNumber = null;
	private String transferToAccountNumber = null;
	private long transferAmount = 0L;
	
	public String getTransferFromAccountNumber() {
		return transferFromAccountNumber;
	}
	public void setTransferFromAccountNumber(String transferFromAccountNumber) {
		this.transferFromAccountNumber = transferFromAccountNumber;
	}
	public String getTransferToAccountNumber() {
		return transferToAccountNumber;
	}
	public void setTransferToAccountNumber(String transferToAccountNumber) {
		this.transferToAccountNumber = transferToAccountNumber;
	}
	public long getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(long transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String toString() {
		return new StringBuilder()
		.append("TransactionRequest:")
		.append(", requestUuid: ").append(requestUuid==null ? "null" : requestUuid)
		.append(", transactionMetaDataJson: ").append(jsonMetaData == null ? "null" : jsonMetaData)
		.toString();
	}

}
