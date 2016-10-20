package devicecloud;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CloudConnectorTest {

	@Mock
	private CloseableHttpClient httpClient;
	@Mock
	private HttpGet httpGet;
	@Mock
	private CloseableHttpResponse response;
	@Mock
	private HttpEntity httpEntity;
	@Mock
	private InputStream inputStream;
	
	private static final String URL = "http://devicecloud.digi.com/ws/DataStream/";
	
	@Test
	public void getXmlTest() throws IOException
	{
		CloudConnector cloudConnector = new CloudConnector(this.httpClient);
		CloudConnector cloudConnectorSpy = Mockito.spy(cloudConnector);
		Mockito.when(cloudConnectorSpy.httpGet(URL)).thenReturn(this.httpGet);
		Mockito.when(this.httpClient.execute(this.httpGet)).thenReturn(this.response);
		Mockito.when(this.response.getEntity()).thenReturn(this.httpEntity);
		Mockito.when(this.response.getEntity().getContent()).thenReturn(this.inputStream);
		InputStream xmlStream = cloudConnectorSpy.getXml(URL);
		Assert.assertNotNull(xmlStream);
	}
}
