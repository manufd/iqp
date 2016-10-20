package devicecloud;

import java.io.IOException;
import java.io.InputStream;
import java.util.ResourceBundle;

import javax.xml.bind.JAXBException;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import pojo.Result;

public class DeviceCloudClient {

	private static final String CONFIG = "config";
	private static final String USER_NAME = "username";
	private static final String PASSWORD = "password";
	private static final String URL = "http://devicecloud.digi.com/ws/DataStream/";

	public static void main(String[] args) throws IOException, JAXBException {
		ResourceBundle resourceBundle = ResourceBundle.getBundle(CONFIG);
		CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
		credentialsProvider.setCredentials(AuthScope.ANY,
				new UsernamePasswordCredentials(resourceBundle.getString(USER_NAME), resourceBundle.getString(PASSWORD)));
		CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultCredentialsProvider(credentialsProvider).build();
		CloudConnector cloudConnector = new CloudConnector(httpClient);
		InputStream xmlStream = cloudConnector.getXml(URL);
		Converter<Result> converter = new Converter<>(Result.class);
		Result result = converter.convert(xmlStream);
		System.out.println(result);
	}
}
