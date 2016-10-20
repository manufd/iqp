package pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="result")
@XmlAccessorType(XmlAccessType.FIELD)
public class Result {
	private Integer resultSize;
	private Integer requestedSize;
	private String pageCursor;
	@XmlElement(name="DataStream")
	private List<DataStream> DataStream;
	
	public Integer getResultSize() {
		return resultSize;
	}
	public void setResultSize(Integer resultSize) {
		this.resultSize = resultSize;
	}
	public Integer getRequestedSize() {
		return requestedSize;
	}
	public void setRequestedSize(Integer requestedSize) {
		this.requestedSize = requestedSize;
	}
	public String getPageCursor() {
		return pageCursor;
	}
	public void setPageCursor(String pageCursor) {
		this.pageCursor = pageCursor;
	}
	public List<DataStream> getDataStream() {
		return DataStream;
	}
	public void setDataStream(List<DataStream> dataStream) {
		this.DataStream = dataStream;
	}
	@Override
	public String toString() {
		return "Result [resultSize=" + resultSize + ", requestedSize=" + requestedSize + ", pageCursor=" + pageCursor
				+ ", DataStream=" + DataStream + "]";
	}
	
	
}
