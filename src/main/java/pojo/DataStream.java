package pojo;

public class DataStream {
	private String cstId;
	private String streamId;
	private String dataType;
	private String forwardTo;
	private CurrentValue currentValue;
	private String description;
	private Integer units;
	private Integer dataTtl;
	private Integer rollupTtl;
	
	public String getCstId() {
		return cstId;
	}
	public void setCstId(String cstId) {
		this.cstId = cstId;
	}
	public String getStreamId() {
		return streamId;
	}
	public void setStreamId(String streamId) {
		this.streamId = streamId;
	}
	public String getForwardTo() {
		return forwardTo;
	}
	public void setForwardTo(String forwardTo) {
		this.forwardTo = forwardTo;
	}
	public CurrentValue getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(CurrentValue currentValue) {
		this.currentValue = currentValue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getUnits() {
		return units;
	}
	public void setUnits(Integer units) {
		this.units = units;
	}
	public Integer getDataTtl() {
		return dataTtl;
	}
	public void setDataTtl(Integer dataTtl) {
		this.dataTtl = dataTtl;
	}
	public Integer getRollupTtl() {
		return rollupTtl;
	}
	public void setRollupTtl(Integer rollupTtl) {
		this.rollupTtl = rollupTtl;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	@Override
	public String toString() {
		return "DataStream [cstId=" + cstId + ", streamId=" + streamId + ", dataType=" + dataType + ", forwardTo="
				+ forwardTo + ", currentValue=" + currentValue + ", description=" + description + ", units=" + units
				+ ", dataTtl=" + dataTtl + ", rollupTtl=" + rollupTtl + "]";
	}
}
