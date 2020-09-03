package qslv.kstream;

import java.util.UUID;

import org.apache.avro.reflect.Union;

@Union({CancelReservationRequest.class,
	CommitReservationRequest.class, 
	ReservationRequest.class, 
	TransactionRequest.class,
	TransferRequest.class })
public class BaseTransactionRequest {
	protected UUID requestUuid = null;
	protected String jsonMetaData = null;
	protected String version = null;
	
	public UUID getRequestUuid() {
		return requestUuid;
	}
	public void setRequestUuid(UUID requestUuid) {
		this.requestUuid = requestUuid;
	}
	public String getJsonMetaData() {
		return jsonMetaData;
	}
	public void setJsonMetaData(String jsonMetaData) {
		this.jsonMetaData = jsonMetaData;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String toString() {
		return new StringBuilder()
		.append("TransactionRequest:")
		.append(", requestUuid: ").append(requestUuid==null ? "null" : requestUuid)
		.append(", transactionMetaDataJson: ").append(jsonMetaData == null ? "null" : jsonMetaData)
		.toString();
	}

}
