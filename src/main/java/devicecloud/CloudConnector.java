package devicecloud;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;

public class CloudConnector {

	private CloseableHttpClient httpClient;

	public CloudConnector(CloseableHttpClient httpClient) {
		this.httpClient = httpClient;
	}
	
	public InputStream getXml(final String url) throws IOException {
		HttpGet httpGet = httpGet(url);
		CloseableHttpResponse response = this.httpClient.execute(httpGet);
		InputStream xmlStream = response.getEntity().getContent();
		return xmlStream;
	}

	HttpGet httpGet(final String url) {
		return new HttpGet(url);
	}
}