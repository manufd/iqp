package pojo;

public class CurrentValue {
	private String id;
	private String timestamp;
	private String timestampISO;
	private String serverTimestamp;
	private String serverTimestampISO;
	private String data;
	private String description;
	private Integer quality;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getTimestampISO() {
		return timestampISO;
	}

	public void setTimestampISO(String timestampISO) {
		this.timestampISO = timestampISO;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuality() {
		return quality;
	}

	public void setQuality(Integer quality) {
		this.quality = quality;
	}

	public String getServerTimestamp() {
		return serverTimestamp;
	}

	public void setServerTimestamp(String serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
	}

	public String getServerTimestampISO() {
		return serverTimestampISO;
	}

	public void setServerTimestampISO(String serverTimestampISO) {
		this.serverTimestampISO = serverTimestampISO;
	}
	
	@Override
	public String toString() {
		return "CurrentValue [id=" + id + ", timestamp=" + timestamp + ", timestampISO=" + timestampISO
				+ ", serverTimestamp=" + serverTimestamp + ", serverTimestampISO=" + serverTimestampISO + ", data="
				+ data + ", description=" + description + ", quality=" + quality + "]";
	}

}
